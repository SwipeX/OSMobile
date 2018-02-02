package defpackage;

public class el extends ey {
    public static int an = 0;
    public static final int ao = 4;
    static final int at = 9;
    static final int db = 8;
    static final int dx = 16777215;

    el() {
        try {
        } catch (Throwable e) {
            throw ei.ac(e, "el.<init>(" + ')');
        }
    }

    public static void ac(int i, int i2, int i3) {
        try {
            ao ac = ai.ac(i, -1666669000);
            int i4 = -306184639 * ac.an;
            int i5 = -1905563545 * ac.aq;
            int i6 = bp.aj[(ac.ao * 928716013) - i5];
            if (i2 < 0 || i2 > i6) {
                i2 = 0;
            }
            i6 <<= i5;
            bp.an[i4] = (i6 & (i2 << i5)) | (bp.an[i4] & (i6 ^ -1));
        } catch (Throwable e) {
            throw ei.ac(e, "el.ac(" + ')');
        }
    }

    static final void ao(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, eh[] ehVarArr, int i8) {
        int i9 = 0;
        while (i9 < 8) {
            int i10 = 0;
            while (i10 < 8) {
                if (i2 + i9 > 0 && i9 + i2 < 103 && i3 + i10 > 0 && i10 + i3 < 103) {
                    try {
                        int[] iArr = ehVarArr[i].bs[i2 + i9];
                        int i11 = i10 + i3;
                        iArr[i11] = iArr[i11] & -16777217;
                    } catch (Throwable e) {
                        throw ei.ac(e, "el.ao(" + ')');
                    }
                }
                i10++;
            }
            i9++;
        }
        he heVar = new he(bArr);
        for (int i12 = 0; i12 < 4; i12++) {
            int i13 = 0;
            while (i13 < 64) {
                int i14 = 0;
                while (i14 < 64) {
                    if (i4 != i12 || i13 < i5 || i13 >= i5 + 8 || i14 < i6 || i14 >= i6 + 8) {
                        lo.aa(heVar, 0, -1, -1, 0, 0, 0, -633666486);
                    } else {
                        int aj = i2 + bx.aj(i13 & 7, i14 & 7, i7, (short) 17164);
                        i11 = i13 & 7;
                        i9 = i14 & 7;
                        int i15 = i7 & 3;
                        if (i15 != 0) {
                            if (1 == i15) {
                                i9 = 7 - i11;
                            } else if (2 == i15) {
                                i9 = 7 - i9;
                            } else {
                                i9 = i11;
                            }
                        }
                        lo.aa(heVar, i, aj, i9 + i3, 0, 0, i7, 2017781831);
                    }
                    i14++;
                }
                i13++;
            }
        }
    }

    static final void az(String str, int i) {
        try {
            mg ac = hd.ac(mr.dl, client.dp.ao, (byte) 43);
            ac.an.an(cx.ah(str, -161109213), (byte) -122);
            ac.an.ai(str, 887719121);
            client.dp.an(ac, -80438652);
        } catch (Throwable e) {
            throw ei.ac(e, "el.az(" + ')');
        }
    }
}
