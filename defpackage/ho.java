package defpackage;

public class ho implements hp {
    public static final ho aa = new ho("oldscape", "RuneScape 2007", 5);
    public static final ho ac = new ho("stellardawn", "Stellar Dawn", 1);
    public static boolean ai;
    public static final ho aj = new ho("runescape", "RuneScape", 0);
    public static final ho an = new ho("game3", "Game 3", 2);
    public static final ho ao = new ho("game5", "Game 5", 4);
    public static final ho aq = new ho("game4", "Game 4", 3);
    public final String ak;
    final int ap;

    ho(String str, String str2, int i) {
        try {
            this.ak = str;
            this.ap = 900387085 * i;
        } catch (Throwable e) {
            throw ei.ac(e, "ho.<init>(" + ')');
        }
    }

    public int aa() {
        return this.ap * 1486841285;
    }

    public int ac(byte b) {
        try {
            return this.ap * 1486841285;
        } catch (Throwable e) {
            throw ei.ac(e, "ho.ac(" + ')');
        }
    }

    public int ao() {
        return this.ap * 1486841285;
    }

    public int aq() {
        return this.ap * -292164724;
    }

    static void ar(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, short s) {
        int i10 = 256 - i8;
        int i11 = (((i10 * (65280 & i9)) & 16711680) | (((16711935 & i9) * i10) & -16711936)) >>> 8;
        int i12 = i3;
        int i13 = i2;
        for (int i14 = -i5; i14 < 0; i14++) {
            i10 = i13;
            i13 = i12;
            i12 = -i4;
            while (i12 < 0) {
                int i15 = i10 + 1;
                try {
                    i10 = iArr2[i10];
                    if (i10 != 0) {
                        int i16 = 16711680 & ((i10 & 65280) * i8);
                        i10 = i13 + 1;
                        iArr[i13] = (((((16711935 & i10) * i8) & -16711936) | i16) >>> 8) + i11;
                    } else {
                        i10 = i13 + 1;
                    }
                    i12++;
                    i13 = i10;
                    i10 = i15;
                } catch (Throwable e) {
                    throw ei.ac(e, "ho.ar(" + ')');
                }
            }
            i12 = i13 + i6;
            i13 = i10 + i7;
        }
    }
}
