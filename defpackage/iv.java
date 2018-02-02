package defpackage;

public class iv extends jt {
    static float[] ab;
    static float[] ad;
    static jq[] ae;
    static float[] ag;
    static int ah;
    static int ai;
    static byte[] ak;
    static boolean[] al;
    static iy[] am;
    static int ap;
    static float[] ar;
    static ib[] as;
    static int at;
    static io[] aw;
    static boolean ax = false;
    static int[] az;
    static float[] bh;
    static float[] bm;
    static float[] bp;
    static int[] br;
    static int[] bt;
    boolean aa;
    int ac;
    float[] af;
    byte[][] aj;
    int an;
    int ao;
    int aq;
    int au;
    int av;
    boolean ay;
    byte[] bb;
    int bd;
    int bu;

    static float ai(int i) {
        int i2 = 2097151 & i;
        int i3 = (2145386496 & i) >> 21;
        if ((Integer.MIN_VALUE & i) != 0) {
            i2 = -i2;
        }
        return (float) (((double) i2) * Math.pow(2.0d, (double) (i3 - 788)));
    }

    static float aj(int i) {
        int i2 = 2097151 & i;
        int i3 = (2145386496 & i) >> 21;
        if ((Integer.MIN_VALUE & i) != 0) {
            i2 = -i2;
        }
        return (float) (((double) i2) * Math.pow(2.0d, (double) (i3 - 788)));
    }

    static float am(int i) {
        int i2 = 2097151 & i;
        int i3 = (-1697279599 & i) >> 21;
        if ((Integer.MIN_VALUE & i) != 0) {
            i2 = -i2;
        }
        return (float) (((double) i2) * Math.pow(2.0d, (double) (i3 - 841136161)));
    }

    static float aw(int i) {
        int i2 = 2097151 & i;
        int i3 = (2145386496 & i) >> 21;
        if ((Integer.MIN_VALUE & i) != 0) {
            i2 = -i2;
        }
        return (float) (((double) i2) * Math.pow(2.0d, (double) (i3 - 788)));
    }

    static void ac(byte[] bArr, int i) {
        ak = bArr;
        ap = i;
        at = 0;
    }

    static void ae(byte[] bArr, int i) {
        ak = bArr;
        ap = i;
        at = 0;
    }

    static void as(byte[] bArr, int i) {
        ak = bArr;
        ap = i;
        at = 0;
    }

    static int al() {
        int i = (ak[ap] >> at) & 1;
        at++;
        ap += at >> 3;
        at &= 7;
        return i;
    }

    static int an() {
        int i = (ak[ap] >> at) & 1;
        at++;
        ap += at >> 3;
        at &= 7;
        return i;
    }

    static int az() {
        int i = (ak[ap] >> at) & 1;
        at++;
        ap += at >> 3;
        at &= 7;
        return i;
    }

    static int af(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i >= 8 - at) {
            int i4 = 8 - at;
            i3 += (((1 << i4) - 1) & (ak[ap] >> at)) << i2;
            at = 0;
            ap++;
            i2 += i4;
            i -= i4;
        }
        if (i <= 0) {
            return i3;
        }
        i3 += (((1 << i) - 1) & (ak[ap] >> at)) << i2;
        at += i;
        return i3;
    }

    static int aq(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i >= 8 - at) {
            int i4 = 8 - at;
            i3 += (((1 << i4) - 1) & (ak[ap] >> at)) << i2;
            at = 0;
            ap++;
            i2 += i4;
            i -= i4;
        }
        if (i <= 0) {
            return i3;
        }
        i3 += (((1 << i) - 1) & (ak[ap] >> at)) << i2;
        at += i;
        return i3;
    }

    static int ax(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i >= 8 - at) {
            int i4 = 8 - at;
            i3 += (((1 << i4) - 1) & (ak[ap] >> at)) << i2;
            at = 0;
            ap++;
            i2 += i4;
            i -= i4;
        }
        if (i <= 0) {
            return i3;
        }
        i3 += (((1 << i) - 1) & (ak[ap] >> at)) << i2;
        at += i;
        return i3;
    }

    void ag(byte[] bArr) {
        he heVar = new he(bArr);
        this.ac = heVar.ad((byte) -40);
        this.an = heVar.ad((byte) -73);
        this.aq = heVar.ad((byte) -64);
        this.ao = heVar.ad((byte) -40);
        if (this.ao < 0) {
            this.ao ^= -1;
            this.aa = true;
        }
        int ad = heVar.ad((byte) -25);
        this.aj = new byte[ad][];
        for (int i = 0; i < ad; i++) {
            int i2 = 0;
            int au;
            do {
                au = heVar.au(-310118664);
                i2 += au;
            } while (au >= -602344798);
            byte[] bArr2 = new byte[i2];
            heVar.br(bArr2, 0, i2, -1107240122);
            this.aj[i] = bArr2;
        }
    }

    void ao(byte[] bArr) {
        he heVar = new he(bArr);
        this.ac = heVar.ad((byte) -52);
        this.an = heVar.ad((byte) -28);
        this.aq = heVar.ad((byte) -51);
        this.ao = heVar.ad((byte) -62);
        if (this.ao < 0) {
            this.ao ^= -1;
            this.aa = true;
        }
        int ad = heVar.ad((byte) -75);
        this.aj = new byte[ad][];
        for (int i = 0; i < ad; i++) {
            int i2 = 0;
            int au;
            do {
                au = heVar.au(-310118664);
                i2 += au;
            } while (au >= 255);
            byte[] bArr2 = new byte[i2];
            heVar.br(bArr2, 0, i2, 20994656);
            this.aj[i] = bArr2;
        }
    }

    void au(byte[] bArr) {
        he heVar = new he(bArr);
        this.ac = heVar.ad((byte) -17);
        this.an = heVar.ad((byte) -33);
        this.aq = heVar.ad((byte) -110);
        this.ao = heVar.ad((byte) -49);
        if (this.ao < 0) {
            this.ao ^= -1;
            this.aa = true;
        }
        int ad = heVar.ad((byte) -110);
        this.aj = new byte[ad][];
        for (int i = 0; i < ad; i++) {
            int i2 = 0;
            int au;
            do {
                au = heVar.au(-310118664);
                i2 += au;
            } while (au >= 255);
            byte[] bArr2 = new byte[i2];
            heVar.br(bArr2, 0, i2, -1138424247);
            this.aj[i] = bArr2;
        }
    }

    void av(byte[] bArr) {
        he heVar = new he(bArr);
        this.ac = heVar.ad((byte) -64);
        this.an = heVar.ad((byte) -127);
        this.aq = heVar.ad((byte) -108);
        this.ao = heVar.ad((byte) -65);
        if (this.ao < 0) {
            this.ao ^= -1;
            this.aa = true;
        }
        int ad = heVar.ad((byte) -77);
        this.aj = new byte[ad][];
        for (int i = 0; i < ad; i++) {
            int i2 = 0;
            int au;
            do {
                au = heVar.au(-310118664);
                i2 += au;
            } while (au >= 255);
            byte[] bArr2 = new byte[i2];
            heVar.br(bArr2, 0, i2, -149947508);
            this.aj[i] = bArr2;
        }
    }

    void ay(byte[] bArr) {
        he heVar = new he(bArr);
        this.ac = heVar.ad((byte) -102);
        this.an = heVar.ad((byte) -87);
        this.aq = heVar.ad((byte) -82);
        this.ao = heVar.ad((byte) -95);
        if (this.ao < 0) {
            this.ao ^= -1;
            this.aa = true;
        }
        int ad = heVar.ad((byte) -68);
        this.aj = new byte[ad][];
        for (int i = 0; i < ad; i++) {
            int i2 = 0;
            int au;
            do {
                au = heVar.au(-310118664);
                i2 += au;
            } while (au >= 255);
            byte[] bArr2 = new byte[i2];
            heVar.br(bArr2, 0, i2, -70811564);
            this.aj[i] = bArr2;
        }
    }

    static void aa(byte[] bArr) {
        int i;
        int i2;
        iv.ac(bArr, 0);
        ah = 1 << iv.aq(4);
        ai = 1 << iv.aq(4);
        ag = new float[ai];
        for (i = 0; i < 2; i++) {
            int i3;
            if (i != 0) {
                i3 = ai;
            } else {
                i3 = ah;
            }
            int i4 = i3 >> 1;
            int i5 = i3 >> 2;
            int i6 = i3 >> 3;
            float[] fArr = new float[i4];
            for (i2 = 0; i2 < i5; i2++) {
                fArr[i2 * 2] = (float) Math.cos((((double) (i2 * 4)) * 3.141592653589793d) / ((double) i3));
                fArr[(i2 * 2) + 1] = -((float) Math.sin((((double) (i2 * 4)) * 3.141592653589793d) / ((double) i3)));
            }
            float[] fArr2 = new float[i4];
            for (i2 = 0; i2 < i5; i2++) {
                fArr2[i2 * 2] = (float) Math.cos((((double) ((i2 * 2) + 1)) * 3.141592653589793d) / ((double) (i3 * 2)));
                fArr2[(i2 * 2) + 1] = (float) Math.sin((((double) ((i2 * 2) + 1)) * 3.141592653589793d) / ((double) (i3 * 2)));
            }
            float[] fArr3 = new float[i5];
            for (i2 = 0; i2 < i6; i2++) {
                fArr3[i2 * 2] = (float) Math.cos((((double) ((i2 * 4) + 2)) * 3.141592653589793d) / ((double) i3));
                fArr3[(i2 * 2) + 1] = -((float) Math.sin((((double) ((i2 * 4) + 2)) * 3.141592653589793d) / ((double) i3)));
            }
            int[] iArr = new int[i6];
            int aq = as.aq(i6 - 1, -1028056210);
            for (i3 = 0; i3 < i6; i3++) {
                iArr[i3] = en.ao(i3, aq, 239927761);
            }
            if (i != 0) {
                bp = fArr;
                bm = fArr2;
                bh = fArr3;
                br = iArr;
            } else {
                ar = fArr;
                ad = fArr2;
                ab = fArr3;
                bt = iArr;
            }
        }
        i2 = iv.aq(8) + 1;
        aw = new io[i2];
        for (i3 = 0; i3 < i2; i3++) {
            aw[i3] = new io();
        }
        i2 = iv.aq(6) + 1;
        for (i3 = 0; i3 < i2; i3++) {
            iv.aq(16);
        }
        i2 = iv.aq(6) + 1;
        am = new iy[i2];
        for (i3 = 0; i3 < i2; i3++) {
            am[i3] = new iy();
        }
        i2 = iv.aq(6) + 1;
        ae = new jq[i2];
        for (i3 = 0; i3 < i2; i3++) {
            ae[i3] = new jq();
        }
        i2 = iv.aq(6) + 1;
        as = new ib[i2];
        for (i3 = 0; i3 < i2; i3++) {
            as[i3] = new ib();
        }
        i = iv.aq(6) + 1;
        al = new boolean[i];
        az = new int[i];
        for (i2 = 0; i2 < i; i2++) {
            al[i2] = iv.an() != 0;
            iv.aq(16);
            iv.aq(16);
            az[i2] = iv.aq(8);
        }
    }

    static void ar(byte[] bArr) {
        int i;
        int i2;
        int i3;
        iv.ac(bArr, 0);
        ah = 1 << iv.aq(4);
        ai = 1 << iv.aq(4);
        ag = new float[ai];
        for (i = 0; i < 2; i++) {
            if (i != 0) {
                i2 = ai;
            } else {
                i2 = ah;
            }
            int i4 = i2 >> 1;
            int i5 = i2 >> 2;
            int i6 = i2 >> 3;
            float[] fArr = new float[i4];
            for (i3 = 0; i3 < i5; i3++) {
                fArr[i3 * 2] = (float) Math.cos((((double) (i3 * 4)) * 3.141592653589793d) / ((double) i2));
                fArr[(i3 * 2) + 1] = -((float) Math.sin((((double) (i3 * 4)) * 3.141592653589793d) / ((double) i2)));
            }
            float[] fArr2 = new float[i4];
            for (i3 = 0; i3 < i5; i3++) {
                fArr2[i3 * 2] = (float) Math.cos((((double) ((i3 * 2) + 1)) * 3.141592653589793d) / ((double) (i2 * 2)));
                fArr2[(i3 * 2) + 1] = (float) Math.sin((((double) ((i3 * 2) + 1)) * 3.141592653589793d) / ((double) (i2 * 2)));
            }
            float[] fArr3 = new float[i5];
            for (i3 = 0; i3 < i6; i3++) {
                fArr3[i3 * 2] = (float) Math.cos((((double) ((i3 * 4) + 2)) * 3.141592653589793d) / ((double) i2));
                fArr3[(i3 * 2) + 1] = -((float) Math.sin((((double) ((i3 * 4) + 2)) * 3.141592653589793d) / ((double) i2)));
            }
            int[] iArr = new int[i6];
            int aq = as.aq(i6 - 1, -639856351);
            for (i2 = 0; i2 < i6; i2++) {
                iArr[i2] = en.ao(i2, aq, -1919925539);
            }
            if (i != 0) {
                bp = fArr;
                bm = fArr2;
                bh = fArr3;
                br = iArr;
            } else {
                ar = fArr;
                ad = fArr2;
                ab = fArr3;
                bt = iArr;
            }
        }
        i3 = iv.aq(8) + 1;
        aw = new io[i3];
        for (i2 = 0; i2 < i3; i2++) {
            aw[i2] = new io();
        }
        i3 = iv.aq(6) + 1;
        for (i2 = 0; i2 < i3; i2++) {
            iv.aq(16);
        }
        i3 = iv.aq(6) + 1;
        am = new iy[i3];
        for (i2 = 0; i2 < i3; i2++) {
            am[i2] = new iy();
        }
        i3 = iv.aq(6) + 1;
        ae = new jq[i3];
        for (i2 = 0; i2 < i3; i2++) {
            ae[i2] = new jq();
        }
        i3 = iv.aq(6) + 1;
        as = new ib[i3];
        for (i2 = 0; i2 < i3; i2++) {
            as[i2] = new ib();
        }
        i = iv.aq(6) + 1;
        al = new boolean[i];
        az = new int[i];
        for (i3 = 0; i3 < i; i3++) {
            al[i3] = iv.an() != 0;
            iv.aq(16);
            iv.aq(16);
            az[i3] = iv.aq(8);
        }
    }

    float[] ab(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float[] fArr;
        iv.ac(this.aj[i], 0);
        iv.an();
        int aq = iv.aq(as.aq(az.length - 1, -1494784907));
        boolean z = al[aq];
        if (z) {
            i2 = ai;
        } else {
            i2 = ah;
        }
        Object obj = null;
        Object obj2 = null;
        if (z) {
            if (iv.an() != 0) {
                obj = 1;
            } else {
                obj = null;
            }
            obj2 = iv.an() != 0 ? 1 : null;
        }
        int i8 = i2 >> 1;
        if (z && r3 == null) {
            i3 = (i2 >> 2) - (ah >> 2);
            i4 = ah >> 1;
            i5 = (ah >> 2) + (i2 >> 2);
        } else {
            i3 = 0;
            i4 = i2 >> 1;
            i5 = i8;
        }
        if (z && r2 == null) {
            i8 = (i2 - (i2 >> 2)) - (ah >> 2);
            i6 = (ah >> 2) + (i2 - (i2 >> 2));
            i7 = ah >> 1;
        } else {
            i7 = i2 >> 1;
            i6 = i2;
        }
        ib ibVar = as[az[aq]];
        boolean z2 = !am[ibVar.an[ibVar.ac]].aa();
        for (aq = 0; aq < ibVar.aj; aq++) {
            ae[ibVar.aq[aq]].aj(ag, i2 >> 1, z2);
        }
        if (!z2) {
            am[ibVar.an[ibVar.ac]].ak(ag, i2 >> 1);
        }
        if (z2) {
            for (i7 = i2 >> 1; i7 < i2; i7++) {
                ag[i7] = 0.0f;
            }
        } else {
            float[] fArr2;
            float[] fArr3;
            int[] iArr;
            int i9;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            int i10;
            float f6;
            float[] fArr4;
            int i11 = i2 >> 1;
            int i12 = i2 >> 2;
            int i13 = i2 >> 3;
            float[] fArr5 = ag;
            for (aq = 0; aq < i11; aq++) {
                fArr5[aq] = fArr5[aq] * 0.5f;
            }
            for (aq = i11; aq < i2; aq++) {
                fArr5[aq] = -fArr5[(i2 - aq) - 1];
            }
            if (z) {
                fArr2 = bp;
            } else {
                fArr2 = ar;
            }
            if (z) {
                fArr3 = bm;
            } else {
                fArr3 = ad;
            }
            float[] fArr6 = z ? bh : ab;
            if (z) {
                iArr = br;
            } else {
                iArr = bt;
            }
            for (i9 = 0; i9 < i12; i9++) {
                f = fArr5[i9 * 4] - fArr5[(i2 - (i9 * 4)) - 1];
                f2 = fArr5[(i9 * 4) + 2] - fArr5[(i2 - (i9 * 4)) - 3];
                f3 = fArr2[i9 * 2];
                f4 = fArr2[(i9 * 2) + 1];
                fArr5[(i2 - (i9 * 4)) - 1] = (f * f3) - (f2 * f4);
                fArr5[(i2 - (i9 * 4)) - 3] = (f * f4) + (f2 * f3);
            }
            for (i9 = 0; i9 < i13; i9++) {
                f = fArr5[(i11 + 3) + (i9 * 4)];
                f2 = fArr5[(i11 + 1) + (i9 * 4)];
                f3 = fArr5[(i9 * 4) + 3];
                f4 = fArr5[(i9 * 4) + 1];
                fArr5[(i11 + 3) + (i9 * 4)] = f + f3;
                fArr5[(i11 + 1) + (i9 * 4)] = f2 + f4;
                f5 = fArr2[(i11 - 4) - (i9 * 4)];
                float f7 = fArr2[(i11 - 3) - (i9 * 4)];
                fArr5[(i9 * 4) + 3] = ((f - f3) * f5) - ((f2 - f4) * f7);
                fArr5[(i9 * 4) + 1] = ((f - f3) * f7) + ((f2 - f4) * f5);
            }
            int aq2 = as.aq(i2 - 1, -1689963992);
            for (int i14 = 0; i14 < aq2 - 3; i14++) {
                int i15 = i2 >> (i14 + 2);
                int i16 = 8 << i14;
                for (i10 = 0; i10 < (2 << i14); i10++) {
                    int i17 = i2 - ((i15 * 2) * i10);
                    int i18 = i2 - (((i10 * 2) + 1) * i15);
                    for (i9 = 0; i9 < (i2 >> (i14 + 4)); i9++) {
                        int i19 = i9 * 4;
                        float f8 = fArr5[(i17 - 1) - i19];
                        float f9 = fArr5[(i17 - 3) - i19];
                        float f10 = fArr5[(i18 - 1) - i19];
                        float f11 = fArr5[(i18 - 3) - i19];
                        fArr5[(i17 - 1) - i19] = f8 + f10;
                        fArr5[(i17 - 3) - i19] = f9 + f11;
                        float f12 = fArr2[i9 * i16];
                        float f13 = fArr2[(i9 * i16) + 1];
                        fArr5[(i18 - 1) - i19] = ((f8 - f10) * f12) - ((f9 - f11) * f13);
                        fArr5[(i18 - 3) - i19] = ((f8 - f10) * f13) + ((f9 - f11) * f12);
                    }
                }
            }
            for (aq = 1; aq < i13 - 1; aq++) {
                i9 = iArr[aq];
                if (aq < i9) {
                    i10 = aq * 8;
                    i9 *= 8;
                    f2 = fArr5[i10 + 1];
                    fArr5[i10 + 1] = fArr5[i9 + 1];
                    fArr5[i9 + 1] = f2;
                    f2 = fArr5[i10 + 3];
                    fArr5[i10 + 3] = fArr5[i9 + 3];
                    fArr5[i9 + 3] = f2;
                    f2 = fArr5[i10 + 5];
                    fArr5[i10 + 5] = fArr5[i9 + 5];
                    fArr5[i9 + 5] = f2;
                    f2 = fArr5[i10 + 7];
                    fArr5[i10 + 7] = fArr5[i9 + 7];
                    fArr5[i9 + 7] = f2;
                }
            }
            for (aq = 0; aq < i11; aq++) {
                fArr5[aq] = fArr5[(aq * 2) + 1];
            }
            for (aq = 0; aq < i13; aq++) {
                fArr5[(i2 - 1) - (aq * 2)] = fArr5[aq * 4];
                fArr5[(i2 - 2) - (aq * 2)] = fArr5[(aq * 4) + 1];
                fArr5[((i2 - i12) - 1) - (aq * 2)] = fArr5[(aq * 4) + 2];
                fArr5[((i2 - i12) - 2) - (aq * 2)] = fArr5[(aq * 4) + 3];
            }
            for (aq = 0; aq < i13; aq++) {
                f6 = fArr6[aq * 2];
                float f14 = fArr6[(aq * 2) + 1];
                f = fArr5[(aq * 2) + i11];
                f2 = fArr5[((aq * 2) + i11) + 1];
                f3 = fArr5[(i2 - 2) - (aq * 2)];
                f4 = fArr5[(i2 - 1) - (aq * 2)];
                f5 = ((f - f3) * f14) + ((f2 + f4) * f6);
                fArr5[(aq * 2) + i11] = ((f + f3) + f5) * 0.5f;
                fArr5[(i2 - 2) - (aq * 2)] = ((f + f3) - f5) * 0.5f;
                f6 = (f14 * (f2 + f4)) - (f6 * (f - f3));
                fArr5[((aq * 2) + i11) + 1] = ((f2 - f4) + f6) * 0.5f;
                fArr5[(i2 - 1) - (aq * 2)] = (f6 + ((-f2) + f4)) * 0.5f;
            }
            for (aq = 0; aq < i12; aq++) {
                fArr5[aq] = (fArr5[(aq * 2) + i11] * fArr3[aq * 2]) + (fArr5[((aq * 2) + 1) + i11] * fArr3[(aq * 2) + 1]);
                fArr5[(i11 - 1) - aq] = (fArr5[(aq * 2) + i11] * fArr3[(aq * 2) + 1]) - (fArr5[((aq * 2) + 1) + i11] * fArr3[aq * 2]);
            }
            for (aq = 0; aq < i12; aq++) {
                fArr5[(i2 - i12) + aq] = -fArr5[aq];
            }
            for (aq = 0; aq < i12; aq++) {
                fArr5[aq] = fArr5[i12 + aq];
            }
            for (aq = 0; aq < i12; aq++) {
                fArr5[i12 + aq] = -fArr5[(i12 - aq) - 1];
            }
            for (aq = 0; aq < i12; aq++) {
                fArr5[i11 + aq] = fArr5[(i2 - aq) - 1];
            }
            for (aq = i3; aq < i5; aq++) {
                f6 = (float) Math.sin((((((double) (aq - i3)) + 0.5d) / ((double) i4)) * 0.5d) * 3.141592653589793d);
                fArr4 = ag;
                fArr4[aq] = ((float) Math.sin((1.5707963267948966d * ((double) f6)) * ((double) f6))) * fArr4[aq];
            }
            for (aq = i8; aq < i6; aq++) {
                f6 = (float) Math.sin(((((((double) (aq - i8)) + 0.5d) / ((double) i7)) * 0.5d) * 3.141592653589793d) + 1.5707963267948966d);
                fArr4 = ag;
                fArr4[aq] = ((float) Math.sin((1.5707963267948966d * ((double) f6)) * ((double) f6))) * fArr4[aq];
            }
        }
        float[] fArr7 = null;
        if (this.au > 0) {
            fArr = new float[((this.au + i2) >> 2)];
            if (!this.ay) {
                for (i7 = 0; i7 < this.av; i7++) {
                    fArr[i7] = this.af[(this.au >> 1) + i7] + fArr[i7];
                }
            }
            if (!z2) {
                while (i3 < (i2 >> 1)) {
                    i7 = (fArr.length - (i2 >> 1)) + i3;
                    fArr[i7] = fArr[i7] + ag[i3];
                    i3++;
                }
            }
            fArr7 = fArr;
        }
        fArr = this.af;
        this.af = ag;
        ag = fArr;
        this.au = i2;
        this.av = i6 - (i2 >> 1);
        this.ay = z2;
        return fArr7;
    }

    float[] ad(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        iv.ac(this.aj[i], 0);
        iv.an();
        int aq = iv.aq(as.aq(az.length - 1, -714637342));
        boolean z2 = al[aq];
        int i8 = z2 ? ai : ah;
        Object obj = null;
        Object obj2 = null;
        if (z2) {
            obj = iv.an() != 0 ? 1 : null;
            obj2 = iv.an() != 0 ? 1 : null;
        }
        int i9 = i8 >> 1;
        if (z2 && r4 == null) {
            i2 = (i8 >> 2) - (ah >> 2);
            i3 = ah >> 1;
            i4 = (ah >> 2) + (i8 >> 2);
        } else {
            i2 = 0;
            i3 = i8 >> 1;
            i4 = i9;
        }
        if (z2 && r3 == null) {
            i9 = (i8 - (i8 >> 2)) - (ah >> 2);
            i5 = (ah >> 2) + (i8 - (i8 >> 2));
            i6 = ah >> 1;
        } else {
            i6 = i8 >> 1;
            i5 = i8;
        }
        ib ibVar = as[az[aq]];
        if (am[ibVar.an[ibVar.ac]].aa()) {
            z = false;
        } else {
            z = true;
        }
        for (i7 = 0; i7 < ibVar.aj; i7++) {
            ae[ibVar.aq[i7]].aj(ag, i8 >> 1, z);
        }
        if (!z) {
            am[ibVar.an[ibVar.ac]].ak(ag, i8 >> 1);
        }
        if (z) {
            for (i6 = i8 >> 1; i6 < i8; i6++) {
                ag[i6] = 0.0f;
            }
        } else {
            float[] fArr;
            float[] fArr2;
            int i10;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            int i11;
            float sin;
            float[] fArr3;
            int i12 = i8 >> 1;
            int i13 = i8 >> 2;
            int i14 = i8 >> 3;
            float[] fArr4 = ag;
            for (i7 = 0; i7 < i12; i7++) {
                fArr4[i7] = fArr4[i7] * 0.5f;
            }
            for (i7 = i12; i7 < i8; i7++) {
                fArr4[i7] = -fArr4[(i8 - i7) - 1];
            }
            float[] fArr5 = z2 ? bp : ar;
            if (z2) {
                fArr = bm;
            } else {
                fArr = ad;
            }
            if (z2) {
                fArr2 = bh;
            } else {
                fArr2 = ab;
            }
            int[] iArr = z2 ? br : bt;
            for (i10 = 0; i10 < i13; i10++) {
                f = fArr4[i10 * 4] - fArr4[(i8 - (i10 * 4)) - 1];
                f2 = fArr4[(i10 * 4) + 2] - fArr4[(i8 - (i10 * 4)) - 3];
                f3 = fArr5[i10 * 2];
                f4 = fArr5[(i10 * 2) + 1];
                fArr4[(i8 - (i10 * 4)) - 1] = (f * f3) - (f2 * f4);
                fArr4[(i8 - (i10 * 4)) - 3] = (f * f4) + (f2 * f3);
            }
            for (i10 = 0; i10 < i14; i10++) {
                f = fArr4[(i12 + 3) + (i10 * 4)];
                f2 = fArr4[(i12 + 1) + (i10 * 4)];
                f3 = fArr4[(i10 * 4) + 3];
                f4 = fArr4[(i10 * 4) + 1];
                fArr4[(i12 + 3) + (i10 * 4)] = f + f3;
                fArr4[(i12 + 1) + (i10 * 4)] = f2 + f4;
                f5 = fArr5[(i12 - 4) - (i10 * 4)];
                float f6 = fArr5[(i12 - 3) - (i10 * 4)];
                fArr4[(i10 * 4) + 3] = ((f - f3) * f5) - ((f2 - f4) * f6);
                fArr4[(i10 * 4) + 1] = ((f - f3) * f6) + ((f2 - f4) * f5);
            }
            int aq2 = as.aq(i8 - 1, -1587502316);
            for (int i15 = 0; i15 < aq2 - 3; i15++) {
                int i16 = i8 >> (i15 + 2);
                int i17 = 8 << i15;
                for (i11 = 0; i11 < (2 << i15); i11++) {
                    int i18 = i8 - ((i16 * 2) * i11);
                    int i19 = i8 - (((i11 * 2) + 1) * i16);
                    for (i10 = 0; i10 < (i8 >> (i15 + 4)); i10++) {
                        int i20 = i10 * 4;
                        float f7 = fArr4[(i18 - 1) - i20];
                        float f8 = fArr4[(i18 - 3) - i20];
                        float f9 = fArr4[(i19 - 1) - i20];
                        float f10 = fArr4[(i19 - 3) - i20];
                        fArr4[(i18 - 1) - i20] = f7 + f9;
                        fArr4[(i18 - 3) - i20] = f8 + f10;
                        float f11 = fArr5[i10 * i17];
                        float f12 = fArr5[(i10 * i17) + 1];
                        fArr4[(i19 - 1) - i20] = ((f7 - f9) * f11) - ((f8 - f10) * f12);
                        fArr4[(i19 - 3) - i20] = ((f7 - f9) * f12) + ((f8 - f10) * f11);
                    }
                }
            }
            for (i7 = 1; i7 < i14 - 1; i7++) {
                i10 = iArr[i7];
                if (i7 < i10) {
                    i11 = i7 * 8;
                    i10 *= 8;
                    f2 = fArr4[i11 + 1];
                    fArr4[i11 + 1] = fArr4[i10 + 1];
                    fArr4[i10 + 1] = f2;
                    f2 = fArr4[i11 + 3];
                    fArr4[i11 + 3] = fArr4[i10 + 3];
                    fArr4[i10 + 3] = f2;
                    f2 = fArr4[i11 + 5];
                    fArr4[i11 + 5] = fArr4[i10 + 5];
                    fArr4[i10 + 5] = f2;
                    f2 = fArr4[i11 + 7];
                    fArr4[i11 + 7] = fArr4[i10 + 7];
                    fArr4[i10 + 7] = f2;
                }
            }
            for (i7 = 0; i7 < i12; i7++) {
                fArr4[i7] = fArr4[(i7 * 2) + 1];
            }
            for (i7 = 0; i7 < i14; i7++) {
                fArr4[(i8 - 1) - (i7 * 2)] = fArr4[i7 * 4];
                fArr4[(i8 - 2) - (i7 * 2)] = fArr4[(i7 * 4) + 1];
                fArr4[((i8 - i13) - 1) - (i7 * 2)] = fArr4[(i7 * 4) + 2];
                fArr4[((i8 - i13) - 2) - (i7 * 2)] = fArr4[(i7 * 4) + 3];
            }
            for (i7 = 0; i7 < i14; i7++) {
                float f13 = fArr2[i7 * 2];
                float f14 = fArr2[(i7 * 2) + 1];
                f = fArr4[(i7 * 2) + i12];
                f2 = fArr4[((i7 * 2) + i12) + 1];
                f3 = fArr4[(i8 - 2) - (i7 * 2)];
                f4 = fArr4[(i8 - 1) - (i7 * 2)];
                f5 = ((f - f3) * f14) + ((f2 + f4) * f13);
                fArr4[(i7 * 2) + i12] = ((f + f3) + f5) * 0.5f;
                fArr4[(i8 - 2) - (i7 * 2)] = ((f + f3) - f5) * 0.5f;
                f13 = (f14 * (f2 + f4)) - (f13 * (f - f3));
                fArr4[((i7 * 2) + i12) + 1] = ((f2 - f4) + f13) * 0.5f;
                fArr4[(i8 - 1) - (i7 * 2)] = (f13 + ((-f2) + f4)) * 0.5f;
            }
            for (i7 = 0; i7 < i13; i7++) {
                fArr4[i7] = (fArr4[(i7 * 2) + i12] * fArr[i7 * 2]) + (fArr4[((i7 * 2) + 1) + i12] * fArr[(i7 * 2) + 1]);
                fArr4[(i12 - 1) - i7] = (fArr4[(i7 * 2) + i12] * fArr[(i7 * 2) + 1]) - (fArr4[((i7 * 2) + 1) + i12] * fArr[i7 * 2]);
            }
            for (i7 = 0; i7 < i13; i7++) {
                fArr4[(i8 - i13) + i7] = -fArr4[i7];
            }
            for (i7 = 0; i7 < i13; i7++) {
                fArr4[i7] = fArr4[i13 + i7];
            }
            for (i7 = 0; i7 < i13; i7++) {
                fArr4[i13 + i7] = -fArr4[(i13 - i7) - 1];
            }
            for (i7 = 0; i7 < i13; i7++) {
                fArr4[i12 + i7] = fArr4[(i8 - i7) - 1];
            }
            for (i7 = i2; i7 < i4; i7++) {
                sin = (float) Math.sin((((((double) (i7 - i2)) + 0.5d) / ((double) i3)) * 0.5d) * 3.141592653589793d);
                fArr3 = ag;
                fArr3[i7] = ((float) Math.sin((1.5707963267948966d * ((double) sin)) * ((double) sin))) * fArr3[i7];
            }
            for (i7 = i9; i7 < i5; i7++) {
                sin = (float) Math.sin(((((((double) (i7 - i9)) + 0.5d) / ((double) i6)) * 0.5d) * 3.141592653589793d) + 1.5707963267948966d);
                fArr3 = ag;
                fArr3[i7] = ((float) Math.sin((1.5707963267948966d * ((double) sin)) * ((double) sin))) * fArr3[i7];
            }
        }
        float[] fArr6 = null;
        if (this.au > 0) {
            fArr6 = new float[((this.au + i8) >> 2)];
            if (!this.ay) {
                for (i9 = 0; i9 < this.av; i9++) {
                    fArr6[i9] = this.af[(this.au >> 1) + i9] + fArr6[i9];
                }
            }
            if (!z) {
                for (i9 = i2; i9 < (i8 >> 1); i9++) {
                    i7 = (fArr6.length - (i8 >> 1)) + i9;
                    fArr6[i7] = fArr6[i7] + ag[i9];
                }
            }
        }
        float[] fArr7 = this.af;
        this.af = ag;
        ag = fArr7;
        this.au = i8;
        this.av = i5 - (i8 >> 1);
        this.ay = z;
        return fArr6;
    }

    float[] ak(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float[] fArr;
        iv.ac(this.aj[i], 0);
        iv.an();
        int aq = iv.aq(as.aq(az.length - 1, -943972626));
        boolean z = al[aq];
        if (z) {
            i2 = ai;
        } else {
            i2 = ah;
        }
        Object obj = null;
        Object obj2 = null;
        if (z) {
            obj = iv.an() != 0 ? 1 : null;
            obj2 = iv.an() != 0 ? 1 : null;
        }
        int i8 = i2 >> 1;
        if (z && r4 == null) {
            i3 = (i2 >> 2) - (ah >> 2);
            i4 = ah >> 1;
            i5 = (ah >> 2) + (i2 >> 2);
        } else {
            i3 = 0;
            i4 = i2 >> 1;
            i5 = i8;
        }
        if (z && r3 == null) {
            i8 = (i2 - (i2 >> 2)) - (ah >> 2);
            i6 = (ah >> 2) + (i2 - (i2 >> 2));
            i7 = ah >> 1;
        } else {
            i7 = i2 >> 1;
            i6 = i2;
        }
        ib ibVar = as[az[aq]];
        boolean z2 = !am[ibVar.an[ibVar.ac]].aa();
        for (aq = 0; aq < ibVar.aj; aq++) {
            ae[ibVar.aq[aq]].aj(ag, i2 >> 1, z2);
        }
        if (!z2) {
            am[ibVar.an[ibVar.ac]].ak(ag, i2 >> 1);
        }
        if (z2) {
            for (i7 = i2 >> 1; i7 < i2; i7++) {
                ag[i7] = 0.0f;
            }
        } else {
            float[] fArr2;
            int[] iArr;
            int i9;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            int i10;
            float sin;
            float[] fArr3;
            int i11 = i2 >> 1;
            int i12 = i2 >> 2;
            int i13 = i2 >> 3;
            float[] fArr4 = ag;
            for (aq = 0; aq < i11; aq++) {
                fArr4[aq] = fArr4[aq] * 0.5f;
            }
            for (aq = i11; aq < i2; aq++) {
                fArr4[aq] = -fArr4[(i2 - aq) - 1];
            }
            float[] fArr5 = z ? bp : ar;
            if (z) {
                fArr2 = bm;
            } else {
                fArr2 = ad;
            }
            float[] fArr6 = z ? bh : ab;
            if (z) {
                iArr = br;
            } else {
                iArr = bt;
            }
            for (i9 = 0; i9 < i12; i9++) {
                f = fArr4[i9 * 4] - fArr4[(i2 - (i9 * 4)) - 1];
                f2 = fArr4[(i9 * 4) + 2] - fArr4[(i2 - (i9 * 4)) - 3];
                f3 = fArr5[i9 * 2];
                f4 = fArr5[(i9 * 2) + 1];
                fArr4[(i2 - (i9 * 4)) - 1] = (f * f3) - (f2 * f4);
                fArr4[(i2 - (i9 * 4)) - 3] = (f * f4) + (f2 * f3);
            }
            for (i9 = 0; i9 < i13; i9++) {
                f = fArr4[(i11 + 3) + (i9 * 4)];
                f2 = fArr4[(i11 + 1) + (i9 * 4)];
                f3 = fArr4[(i9 * 4) + 3];
                f4 = fArr4[(i9 * 4) + 1];
                fArr4[(i11 + 3) + (i9 * 4)] = f + f3;
                fArr4[(i11 + 1) + (i9 * 4)] = f2 + f4;
                f5 = fArr5[(i11 - 4) - (i9 * 4)];
                float f6 = fArr5[(i11 - 3) - (i9 * 4)];
                fArr4[(i9 * 4) + 3] = ((f - f3) * f5) - ((f2 - f4) * f6);
                fArr4[(i9 * 4) + 1] = ((f - f3) * f6) + ((f2 - f4) * f5);
            }
            int aq2 = as.aq(i2 - 1, -593383077);
            for (int i14 = 0; i14 < aq2 - 3; i14++) {
                int i15 = i2 >> (i14 + 2);
                int i16 = 8 << i14;
                for (i10 = 0; i10 < (2 << i14); i10++) {
                    int i17 = i2 - ((i15 * 2) * i10);
                    int i18 = i2 - (((i10 * 2) + 1) * i15);
                    for (i9 = 0; i9 < (i2 >> (i14 + 4)); i9++) {
                        int i19 = i9 * 4;
                        float f7 = fArr4[(i17 - 1) - i19];
                        float f8 = fArr4[(i17 - 3) - i19];
                        float f9 = fArr4[(i18 - 1) - i19];
                        float f10 = fArr4[(i18 - 3) - i19];
                        fArr4[(i17 - 1) - i19] = f7 + f9;
                        fArr4[(i17 - 3) - i19] = f8 + f10;
                        float f11 = fArr5[i9 * i16];
                        float f12 = fArr5[(i9 * i16) + 1];
                        fArr4[(i18 - 1) - i19] = ((f7 - f9) * f11) - ((f8 - f10) * f12);
                        fArr4[(i18 - 3) - i19] = ((f7 - f9) * f12) + ((f8 - f10) * f11);
                    }
                }
            }
            for (aq = 1; aq < i13 - 1; aq++) {
                i9 = iArr[aq];
                if (aq < i9) {
                    i10 = aq * 8;
                    i9 *= 8;
                    f2 = fArr4[i10 + 1];
                    fArr4[i10 + 1] = fArr4[i9 + 1];
                    fArr4[i9 + 1] = f2;
                    f2 = fArr4[i10 + 3];
                    fArr4[i10 + 3] = fArr4[i9 + 3];
                    fArr4[i9 + 3] = f2;
                    f2 = fArr4[i10 + 5];
                    fArr4[i10 + 5] = fArr4[i9 + 5];
                    fArr4[i9 + 5] = f2;
                    f2 = fArr4[i10 + 7];
                    fArr4[i10 + 7] = fArr4[i9 + 7];
                    fArr4[i9 + 7] = f2;
                }
            }
            for (aq = 0; aq < i11; aq++) {
                fArr4[aq] = fArr4[(aq * 2) + 1];
            }
            for (aq = 0; aq < i13; aq++) {
                fArr4[(i2 - 1) - (aq * 2)] = fArr4[aq * 4];
                fArr4[(i2 - 2) - (aq * 2)] = fArr4[(aq * 4) + 1];
                fArr4[((i2 - i12) - 1) - (aq * 2)] = fArr4[(aq * 4) + 2];
                fArr4[((i2 - i12) - 2) - (aq * 2)] = fArr4[(aq * 4) + 3];
            }
            for (aq = 0; aq < i13; aq++) {
                float f13 = fArr6[aq * 2];
                float f14 = fArr6[(aq * 2) + 1];
                f = fArr4[(aq * 2) + i11];
                f2 = fArr4[((aq * 2) + i11) + 1];
                f3 = fArr4[(i2 - 2) - (aq * 2)];
                f4 = fArr4[(i2 - 1) - (aq * 2)];
                f5 = ((f - f3) * f14) + ((f2 + f4) * f13);
                fArr4[(aq * 2) + i11] = ((f + f3) + f5) * 0.5f;
                fArr4[(i2 - 2) - (aq * 2)] = ((f + f3) - f5) * 0.5f;
                f13 = (f14 * (f2 + f4)) - (f13 * (f - f3));
                fArr4[((aq * 2) + i11) + 1] = ((f2 - f4) + f13) * 0.5f;
                fArr4[(i2 - 1) - (aq * 2)] = (f13 + ((-f2) + f4)) * 0.5f;
            }
            for (aq = 0; aq < i12; aq++) {
                fArr4[aq] = (fArr4[(aq * 2) + i11] * fArr2[aq * 2]) + (fArr4[((aq * 2) + 1) + i11] * fArr2[(aq * 2) + 1]);
                fArr4[(i11 - 1) - aq] = (fArr4[(aq * 2) + i11] * fArr2[(aq * 2) + 1]) - (fArr4[((aq * 2) + 1) + i11] * fArr2[aq * 2]);
            }
            for (aq = 0; aq < i12; aq++) {
                fArr4[(i2 - i12) + aq] = -fArr4[aq];
            }
            for (aq = 0; aq < i12; aq++) {
                fArr4[aq] = fArr4[i12 + aq];
            }
            for (aq = 0; aq < i12; aq++) {
                fArr4[i12 + aq] = -fArr4[(i12 - aq) - 1];
            }
            for (aq = 0; aq < i12; aq++) {
                fArr4[i11 + aq] = fArr4[(i2 - aq) - 1];
            }
            for (aq = i3; aq < i5; aq++) {
                sin = (float) Math.sin((((((double) (aq - i3)) + 0.5d) / ((double) i4)) * 0.5d) * 3.141592653589793d);
                fArr3 = ag;
                fArr3[aq] = ((float) Math.sin((1.5707963267948966d * ((double) sin)) * ((double) sin))) * fArr3[aq];
            }
            for (aq = i8; aq < i6; aq++) {
                sin = (float) Math.sin(((((((double) (aq - i8)) + 0.5d) / ((double) i7)) * 0.5d) * 3.141592653589793d) + 1.5707963267948966d);
                fArr3 = ag;
                fArr3[aq] = ((float) Math.sin((1.5707963267948966d * ((double) sin)) * ((double) sin))) * fArr3[aq];
            }
        }
        float[] fArr7 = null;
        if (this.au > 0) {
            fArr = new float[((this.au + i2) >> 2)];
            if (!this.ay) {
                for (i7 = 0; i7 < this.av; i7++) {
                    fArr[i7] = this.af[(this.au >> 1) + i7] + fArr[i7];
                }
            }
            if (!z2) {
                while (i3 < (i2 >> 1)) {
                    i7 = (fArr.length - (i2 >> 1)) + i3;
                    fArr[i7] = fArr[i7] + ag[i3];
                    i3++;
                }
            }
            fArr7 = fArr;
        }
        fArr = this.af;
        this.af = ag;
        ag = fArr;
        this.au = i2;
        this.av = i6 - (i2 >> 1);
        this.ay = z2;
        return fArr7;
    }

    static boolean ap(ju juVar) {
        if (!ax) {
            byte[] an = juVar.an(0, 0, -1264157535);
            if (an == null) {
                return false;
            }
            iv.aa(an);
            ax = true;
        }
        return true;
    }

    static boolean bh(ju juVar) {
        if (!ax) {
            byte[] an = juVar.an(0, 0, -2068694110);
            if (an == null) {
                return false;
            }
            iv.aa(an);
            ax = true;
        }
        return true;
    }

    static boolean bm(ju juVar) {
        if (!ax) {
            byte[] an = juVar.an(0, 0, -411659630);
            if (an == null) {
                return false;
            }
            iv.aa(an);
            ax = true;
        }
        return true;
    }

    static boolean bp(ju juVar) {
        if (!ax) {
            byte[] an = juVar.an(0, 0, -1458882930);
            if (an == null) {
                return false;
            }
            iv.aa(an);
            ax = true;
        }
        return true;
    }

    static iv at(ju juVar, int i, int i2) {
        if (iv.ap(juVar)) {
            byte[] an = juVar.an(i, i2, -789499798);
            if (an != null) {
                return new iv(an);
            }
            return null;
        }
        juVar.ao(i, i2, -2108856497);
        return null;
    }

    static iv br(ju juVar, int i, int i2) {
        if (iv.ap(juVar)) {
            byte[] an = juVar.an(i, i2, -1934540884);
            if (an != null) {
                return new iv(an);
            }
            return null;
        }
        juVar.ao(i, i2, 10040547);
        return null;
    }

    static iv bt(ju juVar, int i, int i2) {
        if (iv.ap(juVar)) {
            byte[] an = juVar.an(i, i2, -2015327322);
            if (an != null) {
                return new iv(an);
            }
            return null;
        }
        juVar.ao(i, i2, -1197827155);
        return null;
    }

    iv(byte[] bArr) {
        ao(bArr);
    }

    ij ah(int[] iArr) {
        if (iArr != null && iArr[0] <= 0) {
            return null;
        }
        if (this.bb == null) {
            this.au = 0;
            this.af = new float[ai];
            this.bb = new byte[this.an];
            this.bu = 0;
            this.bd = 0;
        }
        while (this.bd < this.aj.length) {
            if (iArr != null && iArr[0] <= 0) {
                return null;
            }
            float[] ak = ak(this.bd);
            if (ak != null) {
                int i = this.bu;
                int length = ak.length;
                if (length > this.an - i) {
                    length = this.an - i;
                }
                int i2 = 0;
                int i3 = i;
                while (i2 < length) {
                    i = (int) ((ak[i2] * 128.0f) + 128.0f);
                    if ((i & -256) != 0) {
                        i = (i ^ -1) >> 31;
                    }
                    int i4 = i3 + 1;
                    this.bb[i3] = (byte) (i - 128);
                    i2++;
                    i3 = i4;
                }
                if (iArr != null) {
                    iArr[0] = iArr[0] - (i3 - this.bu);
                }
                this.bu = i3;
            }
            this.bd++;
        }
        this.af = null;
        byte[] bArr = this.bb;
        this.bb = null;
        return new ij(this.ac, bArr, this.aq, this.ao, this.aa);
    }

    ij bb(int[] iArr) {
        if (iArr != null && iArr[0] <= 0) {
            return null;
        }
        if (this.bb == null) {
            this.au = 0;
            this.af = new float[ai];
            this.bb = new byte[this.an];
            this.bu = 0;
            this.bd = 0;
        }
        while (this.bd < this.aj.length) {
            if (iArr != null && iArr[0] <= 0) {
                return null;
            }
            float[] ak = ak(this.bd);
            if (ak != null) {
                int i = this.bu;
                int length = ak.length;
                if (length > this.an - i) {
                    length = this.an - i;
                }
                int i2 = 0;
                int i3 = i;
                while (i2 < length) {
                    i = (int) ((ak[i2] * 128.0f) + 128.0f);
                    if ((-1647895982 & i) != 0) {
                        i = (i ^ -1) >> 31;
                    }
                    int i4 = i3 + 1;
                    this.bb[i3] = (byte) (i - 117539442);
                    i2++;
                    i3 = i4;
                }
                if (iArr != null) {
                    iArr[0] = iArr[0] - (i3 - this.bu);
                }
                this.bu = i3;
            }
            this.bd++;
        }
        this.af = null;
        byte[] bArr = this.bb;
        this.bb = null;
        return new ij(this.ac, bArr, this.aq, this.ao, this.aa);
    }

    ij bd(int[] iArr) {
        if (iArr != null && iArr[0] <= 0) {
            return null;
        }
        if (this.bb == null) {
            this.au = 0;
            this.af = new float[ai];
            this.bb = new byte[this.an];
            this.bu = 0;
            this.bd = 0;
        }
        while (this.bd < this.aj.length) {
            if (iArr != null && iArr[0] <= 0) {
                return null;
            }
            float[] ak = ak(this.bd);
            if (ak != null) {
                int i = this.bu;
                int length = ak.length;
                if (length > this.an - i) {
                    length = this.an - i;
                }
                int i2 = 0;
                int i3 = i;
                while (i2 < length) {
                    i = (int) ((ak[i2] * 128.0f) + 128.0f);
                    if ((i & -256) != 0) {
                        i = (i ^ -1) >> -694165759;
                    }
                    int i4 = i3 + 1;
                    this.bb[i3] = (byte) (i - 1593287345);
                    i2++;
                    i3 = i4;
                }
                if (iArr != null) {
                    iArr[0] = iArr[0] - (i3 - this.bu);
                }
                this.bu = i3;
            }
            this.bd++;
        }
        this.af = null;
        byte[] bArr = this.bb;
        this.bb = null;
        return new ij(this.ac, bArr, this.aq, this.ao, this.aa);
    }

    ij bu(int[] iArr) {
        if (iArr != null && iArr[0] <= 0) {
            return null;
        }
        if (this.bb == null) {
            this.au = 0;
            this.af = new float[ai];
            this.bb = new byte[this.an];
            this.bu = 0;
            this.bd = 0;
        }
        while (this.bd < this.aj.length) {
            if (iArr != null && iArr[0] <= 0) {
                return null;
            }
            float[] ak = ak(this.bd);
            if (ak != null) {
                int i = this.bu;
                int length = ak.length;
                if (length > this.an - i) {
                    length = this.an - i;
                }
                int i2 = 0;
                int i3 = i;
                while (i2 < length) {
                    i = (int) ((ak[i2] * 128.0f) + 128.0f);
                    if ((i & -256) != 0) {
                        i = (i ^ -1) >> 31;
                    }
                    int i4 = i3 + 1;
                    this.bb[i3] = (byte) (i - 128);
                    i2++;
                    i3 = i4;
                }
                if (iArr != null) {
                    iArr[0] = iArr[0] - (i3 - this.bu);
                }
                this.bu = i3;
            }
            this.bd++;
        }
        this.af = null;
        byte[] bArr = this.bb;
        this.bb = null;
        return new ij(this.ac, bArr, this.aq, this.ao, this.aa);
    }
}
