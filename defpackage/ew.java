package defpackage;

public abstract class ew {
    public static final int bo = 51;
    static int ff = 0;
    static final int ki = 1;
    public static ni ov;

    public abstract void aa(int i, int i2, int i3, int i4, int i5);

    abstract bl ac(byte b);

    public abstract void ae(int i, int i2);

    public abstract void af(int i, int i2, int i3, int i4);

    public abstract void ag();

    public abstract es ah();

    abstract bl ai();

    public abstract es aj(byte b);

    public abstract void ak(int i, int i2, byte b);

    public abstract ce am();

    public abstract ce an(byte b);

    public abstract void ap(int i);

    public abstract void aq(int i, int i2, int i3);

    public abstract void ar();

    public abstract void as(int i, int i2);

    public abstract es at();

    public abstract void au(int i, int i2);

    public abstract void av(int i, int i2);

    abstract bl aw();

    public abstract void ay();

    ew() {
        try {
        } catch (Throwable e) {
            throw ei.ac(e, "ew.<init>(" + ')');
        }
    }

    public void al() {
        ac((byte) 69).aj((byte) -103);
        aj((byte) -97).aj(-1378767004);
    }

    public void ao(int i) {
        try {
            ac((byte) -38).aj((byte) -41);
            aj((byte) -67).aj(41543275);
        } catch (Throwable e) {
            throw ei.ac(e, "ew.ao(" + ')');
        }
    }

    public void ax() {
        ac((byte) 76).aj((byte) -79);
        aj((byte) -1).aj(884684749);
    }

    public void az() {
        ac((byte) -76).aj((byte) -13);
        aj((byte) -90).aj(-5407001);
    }

    static final void an(hn hnVar, byte b) {
        int i = 0;
        try {
            int i2;
            int i3;
            byte[] bArr;
            hnVar.jl(-1427289990);
            int i4 = 0;
            for (i2 = 0; i2 < fu.aa * -2089377233; i2++) {
                i3 = fu.ak[i2];
                if ((fu.an[i3] & 1) == 0) {
                    if (i4 > 0) {
                        i4--;
                        bArr = fu.an;
                        bArr[i3] = (byte) (bArr[i3] | 2);
                    } else if (hnVar.jc(1, 2077984887) == 0) {
                        i4 = du.aq(hnVar, (byte) 11);
                        bArr = fu.an;
                        bArr[i3] = (byte) (bArr[i3] | 2);
                    } else {
                        dl.ao(hnVar, i3, Byte.MIN_VALUE);
                    }
                }
            }
            hnVar.jz((byte) 4);
            if (i4 != 0) {
                throw new RuntimeException();
            }
            hnVar.jl(430429647);
            for (i2 = 0; i2 < fu.aa * -2089377233; i2++) {
                i3 = fu.ak[i2];
                if ((fu.an[i3] & 1) != 0) {
                    if (i4 > 0) {
                        i4--;
                        bArr = fu.an;
                        bArr[i3] = (byte) (bArr[i3] | 2);
                    } else if (hnVar.jc(1, 1632162165) == 0) {
                        i4 = du.aq(hnVar, (byte) 11);
                        bArr = fu.an;
                        bArr[i3] = (byte) (bArr[i3] | 2);
                    } else {
                        dl.ao(hnVar, i3, (byte) -106);
                    }
                }
            }
            hnVar.jz((byte) 4);
            if (i4 != 0) {
                throw new RuntimeException();
            }
            hnVar.jl(-1242204576);
            for (i2 = 0; i2 < fu.ap * 862590589; i2++) {
                i3 = fu.at[i2];
                if ((fu.an[i3] & 1) != 0) {
                    if (i4 > 0) {
                        i4--;
                        bArr = fu.an;
                        bArr[i3] = (byte) (bArr[i3] | 2);
                    } else if (hnVar.jc(1, 1739268761) == 0) {
                        i4 = du.aq(hnVar, (byte) 11);
                        bArr = fu.an;
                        bArr[i3] = (byte) (bArr[i3] | 2);
                    } else if (fc.aa(hnVar, i3, (byte) 26)) {
                        bArr = fu.an;
                        bArr[i3] = (byte) (bArr[i3] | 2);
                    }
                }
            }
            hnVar.jz((byte) 4);
            if (i4 != 0) {
                throw new RuntimeException();
            }
            hnVar.jl(-1970483115);
            while (i < fu.ap * 862590589) {
                i2 = fu.at[i];
                if ((fu.an[i2] & 1) == 0) {
                    byte[] bArr2;
                    if (i4 > 0) {
                        i4--;
                        bArr2 = fu.an;
                        bArr2[i2] = (byte) (bArr2[i2] | 2);
                    } else if (hnVar.jc(1, 1892797818) == 0) {
                        i4 = du.aq(hnVar, (byte) 11);
                        bArr2 = fu.an;
                        bArr2[i2] = (byte) (bArr2[i2] | 2);
                    } else if (fc.aa(hnVar, i2, (byte) 61)) {
                        bArr2 = fu.an;
                        bArr2[i2] = (byte) (bArr2[i2] | 2);
                    }
                }
                i++;
            }
            hnVar.jz((byte) 4);
            if (i4 != 0) {
                throw new RuntimeException();
            }
            fu.aa = 0;
            fu.ap = 0;
            for (i4 = 1; i4 < bq.ai; i4++) {
                byte[] bArr3 = fu.an;
                bArr3[i4] = (byte) (bArr3[i4] >> 1);
                int[] iArr;
                if (client.hx[i4] != null) {
                    iArr = fu.ak;
                    i = fu.aa - 63970097;
                    fu.aa = i;
                    iArr[(i * -2089377233) - 1] = i4;
                } else {
                    iArr = fu.at;
                    i = fu.ap + 1409848021;
                    fu.ap = i;
                    iArr[(i * 862590589) - 1] = i4;
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ew.an(" + ')');
        }
    }
}
