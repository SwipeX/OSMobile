package defpackage;

public class fj implements hp {
    public static final fj ac = new fj(1, 1);
    public static final fj aj = new fj(0, 0);
    public static final fj an = new fj(2, 2);
    public static final fj ao = new fj(4, 4);
    public static final fj aq = new fj(3, 3);
    static final int bb = 33;
    public static final int cd = 99;
    public final int aa;
    final int ak;

    fj(int i, int i2) {
        try {
            this.aa = -1279303433 * i;
            this.ak = 731978619 * i2;
        } catch (Throwable e) {
            throw ei.ac(e, "fj.<init>(" + ')');
        }
    }

    public static int an(int i, int i2) {
        return (i >> 11) & 63;
    }

    public static String ac(int i, int i2) {
        try {
            return "<col=" + Integer.toHexString(i) + ">";
        } catch (Throwable e) {
            throw ei.ac(e, "fj.ac(" + ')');
        }
    }

    public int aa() {
        return -756380749 * this.ak;
    }

    public int ac(byte b) {
        try {
            return -756380749 * this.ak;
        } catch (Throwable e) {
            throw ei.ac(e, "fj.ac(" + ')');
        }
    }

    public int ao() {
        return -756380749 * this.ak;
    }

    public int aq() {
        return 1303256626 * this.ak;
    }

    public static int an(CharSequence charSequence, int i, int i2, byte[] bArr, int i3, int i4) {
        int i5 = i2 - i;
        int i6 = 0;
        while (i6 < i5) {
            try {
                char charAt = charSequence.charAt(i6 + i);
                if ((charAt > '\u0000' && charAt < '') || (charAt >= ' ' && charAt <= 'ÿ')) {
                    bArr[i6 + i3] = (byte) charAt;
                } else if ('€' == charAt) {
                    bArr[i6 + i3] = Byte.MIN_VALUE;
                } else if (charAt == '‚') {
                    bArr[i3 + i6] = (byte) -126;
                } else if (charAt == 'ƒ') {
                    bArr[i6 + i3] = (byte) -125;
                } else if (charAt == '„') {
                    bArr[i6 + i3] = (byte) -124;
                } else if ('…' == charAt) {
                    bArr[i3 + i6] = (byte) -123;
                } else if ('†' == charAt) {
                    bArr[i3 + i6] = (byte) -122;
                } else if (charAt == '‡') {
                    bArr[i3 + i6] = (byte) -121;
                } else if ('ˆ' == charAt) {
                    bArr[i3 + i6] = (byte) -120;
                } else if (charAt == '‰') {
                    bArr[i3 + i6] = (byte) -119;
                } else if (charAt == 'Š') {
                    bArr[i3 + i6] = (byte) -118;
                } else if ('‹' == charAt) {
                    bArr[i6 + i3] = (byte) -117;
                } else if ('Œ' == charAt) {
                    bArr[i6 + i3] = (byte) -116;
                } else if (charAt == 'Ž') {
                    bArr[i3 + i6] = (byte) -114;
                } else if (charAt == '‘') {
                    bArr[i6 + i3] = (byte) -111;
                } else if ('’' == charAt) {
                    bArr[i6 + i3] = (byte) -110;
                } else if ('“' == charAt) {
                    bArr[i3 + i6] = (byte) -109;
                } else if (charAt == '”') {
                    bArr[i3 + i6] = (byte) -108;
                } else if ('•' == charAt) {
                    bArr[i6 + i3] = (byte) -107;
                } else if (charAt == '–') {
                    bArr[i6 + i3] = (byte) -106;
                } else if (charAt == '—') {
                    bArr[i6 + i3] = (byte) -105;
                } else if (charAt == '˜') {
                    bArr[i3 + i6] = (byte) -104;
                } else if ('™' == charAt) {
                    bArr[i6 + i3] = (byte) -103;
                } else if ('š' == charAt) {
                    bArr[i6 + i3] = (byte) -102;
                } else if ('›' == charAt) {
                    bArr[i3 + i6] = (byte) -101;
                } else if (charAt == 'œ') {
                    bArr[i6 + i3] = (byte) -100;
                } else if ('ž' == charAt) {
                    bArr[i3 + i6] = (byte) -98;
                } else if ('Ÿ' == charAt) {
                    bArr[i3 + i6] = (byte) -97;
                } else {
                    bArr[i6 + i3] = (byte) 63;
                }
                i6++;
            } catch (Throwable e) {
                throw ei.ac(e, "fj.an(" + ')');
            }
        }
        return i5;
    }

    public static boolean aa(char c, int i) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }
}
