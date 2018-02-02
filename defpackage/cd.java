package defpackage;

public class cd {
    static final cd aa = new cd("3", "3");
    static final cd ac = new cd("16", "16");
    public static final cd ae = new cd("10", "10");
    static final cd ah = new cd("12", "12");
    static final cd ai = new cd("1", "1");
    static final cd aj = new cd("13", "13");
    static final cd ak = new cd("8", "8");
    static final cd al = new cd("9", "9");
    public static final cd am = new cd("11", "11");
    static final cd an = new cd("5", "5");
    static final cd ao = new cd("7", "7");
    static final cd ap = new cd("2", "2");
    static final cd aq = new cd("6", "6");
    static final cd as = new cd("14", "14");
    static final cd at = new cd("4", "4");
    static final cd aw = new cd("15", "15");
    public final String az;

    public static cd[] ac() {
        return new cd[]{ae, at, ah, aa, ao, as, ap, ak, aj, aw, ac, an, ai, aq, al, am};
    }

    public static cd[] an() {
        return new cd[]{ae, at, ah, aa, ao, as, ap, ak, aj, aw, ac, an, ai, aq, al, am};
    }

    cd(String str, String str2) {
        try {
            this.az = str2;
        } catch (Throwable e) {
            throw ei.ac(e, "cd.<init>(" + ')');
        }
    }

    public static void am(byte b) {
        try {
            jv.aj.ae(748072134);
        } catch (Throwable e) {
            throw ei.ac(e, "cd.am(" + ')');
        }
    }

    static void cd(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        if (i11 >= 255) {
            try {
                eg.ab(iArr, iArr2, 0, i2, i3, i4, i5, i6, i7, i8, i9, i10, (byte) 2);
                return;
            } catch (Throwable e) {
                throw ei.ac(e, "cd.cd(" + ')');
            }
        }
        int i13 = 255 - i11;
        int i14 = i11 << 24;
        int i15 = -i7;
        int i16 = i4;
        int i17 = i2;
        while (i15 < 0) {
            int i18 = (i3 >> 16) * i10;
            int i19 = i17;
            i17 = i16;
            i16 = -i6;
            while (i16 < 0) {
                int i20;
                int i21 = iArr2[(i19 >> 16) + i18];
                if (i21 != 0) {
                    int i22 = iArr[i17];
                    if (i22 == 0) {
                        i20 = i17 + 1;
                        iArr[i17] = (i21 & 16777215) | i14;
                    } else {
                        i20 = i17 + 1;
                        iArr[i17] = ((((((i21 & 16711935) * i11) + ((i22 & 16711935) * i13)) & -16711936) + ((((65280 & i22) * i13) + ((65280 & i21) * i11)) & 16711680)) >>> 8) | (-16777216 & (i22 | i14));
                    }
                } else {
                    i20 = i17 + 1;
                }
                i16++;
                i19 += i8;
                i17 = i20;
            }
            i3 += i9;
            i16 = i17 + i5;
            i15++;
            i17 = i2;
        }
    }
}
