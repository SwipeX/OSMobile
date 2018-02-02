package defpackage;

import java.util.Random;

public class kh extends je {
    static int ae = -1;
    static int af = 255;
    static String[] ag = new String[100];
    public static fl[] ai;
    static int al = -1;
    static int am = -1;
    static int as = -1;
    static int au = 0;
    static int av = 0;
    static int ax = 0;
    static Random ay = new Random();
    static int az = 0;
    int[] aa;
    int[] ac;
    public int ah;
    byte[][] aj;
    public int ak;
    int[] an;
    int[] ao;
    public int ap;
    int[] aq;
    public int at;
    byte[] aw;

    public kh(byte[] bArr, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, byte[][] bArr2) {
        this.aj = new byte[bq.ah][];
        this.ak = 0;
        this.ao = iArr;
        this.aa = iArr2;
        this.an = iArr3;
        this.aq = iArr4;
        aj(bArr);
        this.aj = bArr2;
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        while (i3 < bq.ah) {
            if (this.aa[i3] < i2 && this.aq[i3] != 0) {
                i2 = this.aa[i3];
            }
            if (this.aa[i3] + this.aq[i3] > i) {
                i = this.aa[i3] + this.aq[i3];
            }
            i3++;
        }
        this.ap = this.ak - i2;
        this.at = i - this.ak;
        this.ah = this.ak - this.aa[120];
    }

    public kh(byte[] bArr) {
        this.aj = new byte[bq.ah][];
        this.ak = 0;
        aj(bArr);
    }

    void aj(byte[] bArr) {
        this.ac = new int[bq.ah];
        int i;
        if (bArr.length == 257) {
            for (i = 0; i < this.ac.length; i++) {
                this.ac[i] = bArr[i] & 255;
            }
            this.ak = bArr[bq.ah] & 255;
            return;
        }
        int i2;
        i = 0;
        int i3 = 0;
        while (i < bq.ah) {
            int i4 = i3 + 1;
            this.ac[i] = bArr[i3] & 255;
            i++;
            i3 = i4;
        }
        int[] iArr = new int[bq.ah];
        int[] iArr2 = new int[bq.ah];
        i = 0;
        while (i < bq.ah) {
            i4 = i3 + 1;
            iArr[i] = bArr[i3] & 255;
            i++;
            i3 = i4;
        }
        i = 0;
        while (i < bq.ah) {
            i4 = i3 + 1;
            iArr2[i] = bArr[i3] & 255;
            i++;
            i3 = i4;
        }
        byte[][] bArr2 = new byte[bq.ah][];
        int i5 = 0;
        while (i5 < bq.ah) {
            bArr2[i5] = new byte[iArr[i5]];
            i4 = 0;
            i2 = i3;
            i3 = 0;
            while (i4 < bArr2[i5].length) {
                int i6 = i2 + 1;
                i3 = (byte) (i3 + bArr[i2]);
                bArr2[i5][i4] = i3;
                i4++;
                i2 = i6;
            }
            i5++;
            i3 = i2;
        }
        byte[][] bArr3 = new byte[bq.ah][];
        int i7 = 0;
        while (i7 < bq.ah) {
            bArr3[i7] = new byte[iArr[i7]];
            i2 = 0;
            i6 = i3;
            i3 = 0;
            while (i3 < bArr3[i7].length) {
                i5 = i6 + 1;
                i2 = (byte) (i2 + bArr[i6]);
                bArr3[i7][i3] = i2;
                i3++;
                i6 = i5;
            }
            i7++;
            i3 = i6;
        }
        this.aw = new byte[65536];
        i2 = 0;
        while (i2 < bq.ah) {
            if (!(i2 == 32 || i2 == 160)) {
                i6 = 0;
                while (i6 < bq.ah) {
                    if (!(i6 == 32 || i6 == 160)) {
                        this.aw[(i2 << 8) + i6] = (byte) kh.ac(bArr2, bArr3, iArr2, this.ac, iArr, i2, i6);
                    }
                    i6++;
                }
            }
            i2++;
        }
        this.ak = iArr2[32] + iArr[32];
    }

    void bh(byte[] bArr) {
        this.ac = new int[bq.ah];
        int i;
        if (bArr.length == 257) {
            for (i = 0; i < this.ac.length; i++) {
                this.ac[i] = bArr[i] & 255;
            }
            this.ak = bArr[bq.ah] & 255;
            return;
        }
        int i2;
        i = 0;
        int i3 = 0;
        while (i < bq.ah) {
            int i4 = i3 + 1;
            this.ac[i] = bArr[i3] & 255;
            i++;
            i3 = i4;
        }
        int[] iArr = new int[bq.ah];
        int[] iArr2 = new int[bq.ah];
        i = 0;
        while (i < bq.ah) {
            i4 = i3 + 1;
            iArr[i] = bArr[i3] & 255;
            i++;
            i3 = i4;
        }
        i = 0;
        while (i < bq.ah) {
            i4 = i3 + 1;
            iArr2[i] = bArr[i3] & 255;
            i++;
            i3 = i4;
        }
        byte[][] bArr2 = new byte[bq.ah][];
        int i5 = 0;
        while (i5 < bq.ah) {
            bArr2[i5] = new byte[iArr[i5]];
            i4 = 0;
            i2 = i3;
            i3 = 0;
            while (i4 < bArr2[i5].length) {
                int i6 = i2 + 1;
                i3 = (byte) (i3 + bArr[i2]);
                bArr2[i5][i4] = i3;
                i4++;
                i2 = i6;
            }
            i5++;
            i3 = i2;
        }
        byte[][] bArr3 = new byte[bq.ah][];
        int i7 = 0;
        while (i7 < bq.ah) {
            bArr3[i7] = new byte[iArr[i7]];
            i2 = 0;
            i6 = i3;
            i3 = 0;
            while (i3 < bArr3[i7].length) {
                i5 = i6 + 1;
                i2 = (byte) (i2 + bArr[i6]);
                bArr3[i7][i3] = i2;
                i3++;
                i6 = i5;
            }
            i7++;
            i3 = i6;
        }
        this.aw = new byte[65536];
        i2 = 0;
        while (i2 < bq.ah) {
            if (!(i2 == 32 || i2 == 160)) {
                i6 = 0;
                while (i6 < bq.ah) {
                    if (!(i6 == 32 || i6 == 160)) {
                        this.aw[(i2 << 8) + i6] = (byte) kh.ac(bArr2, bArr3, iArr2, this.ac, iArr, i2, i6);
                    }
                    i6++;
                }
            }
            i2++;
        }
        this.ak = iArr2[32] + iArr[32];
    }

    void bm(byte[] bArr) {
        this.ac = new int[bq.ah];
        int i;
        if (bArr.length == 257) {
            for (i = 0; i < this.ac.length; i++) {
                this.ac[i] = bArr[i] & 255;
            }
            this.ak = bArr[bq.ah] & 255;
            return;
        }
        int i2;
        i = 0;
        int i3 = 0;
        while (i < bq.ah) {
            int i4 = i3 + 1;
            this.ac[i] = bArr[i3] & 255;
            i++;
            i3 = i4;
        }
        int[] iArr = new int[bq.ah];
        int[] iArr2 = new int[bq.ah];
        i = 0;
        while (i < bq.ah) {
            i4 = i3 + 1;
            iArr[i] = bArr[i3] & 255;
            i++;
            i3 = i4;
        }
        i = 0;
        while (i < bq.ah) {
            i4 = i3 + 1;
            iArr2[i] = bArr[i3] & 255;
            i++;
            i3 = i4;
        }
        byte[][] bArr2 = new byte[bq.ah][];
        int i5 = 0;
        while (i5 < bq.ah) {
            bArr2[i5] = new byte[iArr[i5]];
            i4 = 0;
            i2 = i3;
            i3 = 0;
            while (i4 < bArr2[i5].length) {
                int i6 = i2 + 1;
                i3 = (byte) (i3 + bArr[i2]);
                bArr2[i5][i4] = i3;
                i4++;
                i2 = i6;
            }
            i5++;
            i3 = i2;
        }
        byte[][] bArr3 = new byte[bq.ah][];
        int i7 = 0;
        while (i7 < bq.ah) {
            bArr3[i7] = new byte[iArr[i7]];
            i2 = 0;
            i6 = i3;
            i3 = 0;
            while (i3 < bArr3[i7].length) {
                i5 = i6 + 1;
                i2 = (byte) (i2 + bArr[i6]);
                bArr3[i7][i3] = i2;
                i3++;
                i6 = i5;
            }
            i7++;
            i3 = i6;
        }
        this.aw = new byte[65536];
        i2 = 0;
        while (i2 < bq.ah) {
            if (!(i2 == 32 || i2 == 160)) {
                i6 = 0;
                while (i6 < bq.ah) {
                    if (!(i6 == 32 || i6 == 160)) {
                        this.aw[(i2 << 8) + i6] = (byte) kh.ac(bArr2, bArr3, iArr2, this.ac, iArr, i2, i6);
                    }
                    i6++;
                }
            }
            i2++;
        }
        this.ak = iArr2[32] + iArr[32];
    }

    void bp(byte[] bArr) {
        int i = 0;
        this.ac = new int[1592553461];
        if (bArr.length == 257) {
            while (i < this.ac.length) {
                this.ac[i] = bArr[i] & 255;
                i++;
            }
            this.ak = bArr[533621049] & 255;
            return;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < bq.ah) {
            int i4 = i3 + 1;
            this.ac[i2] = bArr[i3] & 255;
            i2++;
            i3 = i4;
        }
        int[] iArr = new int[-1543450265];
        int[] iArr2 = new int[bq.ah];
        i2 = 0;
        while (i2 < 1747058772) {
            i4 = i3 + 1;
            iArr[i2] = bArr[i3] & -978399740;
            i2++;
            i3 = i4;
        }
        byte[][] bArr2 = new byte[bq.ah][];
        int i5 = 0;
        while (i5 < bq.ah) {
            bArr2[i5] = new byte[iArr[i5]];
            i2 = 0;
            i4 = i3;
            i3 = 0;
            while (i3 < bArr2[i5].length) {
                int i6 = i4 + 1;
                i2 = (byte) (i2 + bArr[i4]);
                bArr2[i5][i3] = i2;
                i3++;
                i4 = i6;
            }
            i5++;
            i3 = i4;
        }
        bArr2 = new byte[bq.ah][];
        i5 = 0;
        while (i5 < 311169311) {
            bArr2[i5] = new byte[iArr[i5]];
            i2 = 0;
            i4 = i3;
            i3 = 0;
            while (i3 < bArr2[i5].length) {
                i6 = i4 + 1;
                i2 = (byte) (i2 + bArr[i4]);
                bArr2[i5][i3] = i2;
                i3++;
                i4 = i6;
            }
            i5++;
            i3 = i4;
        }
        this.aw = new byte[327438065];
        this.ak = iArr2[1313818850] + iArr[-2077808867];
    }

    void br(byte[] bArr) {
        this.ac = new int[bq.ah];
        int i;
        if (bArr.length == 257) {
            for (i = 0; i < this.ac.length; i++) {
                this.ac[i] = bArr[i] & 255;
            }
            this.ak = bArr[bq.ah] & 255;
            return;
        }
        int i2;
        i = 0;
        int i3 = 0;
        while (i < bq.ah) {
            int i4 = i3 + 1;
            this.ac[i] = bArr[i3] & 255;
            i++;
            i3 = i4;
        }
        int[] iArr = new int[bq.ah];
        int[] iArr2 = new int[bq.ah];
        i = 0;
        while (i < bq.ah) {
            i4 = i3 + 1;
            iArr[i] = bArr[i3] & 255;
            i++;
            i3 = i4;
        }
        i = 0;
        while (i < bq.ah) {
            i4 = i3 + 1;
            iArr2[i] = bArr[i3] & 255;
            i++;
            i3 = i4;
        }
        byte[][] bArr2 = new byte[bq.ah][];
        int i5 = 0;
        while (i5 < bq.ah) {
            bArr2[i5] = new byte[iArr[i5]];
            i4 = 0;
            i2 = i3;
            i3 = 0;
            while (i4 < bArr2[i5].length) {
                int i6 = i2 + 1;
                i3 = (byte) (i3 + bArr[i2]);
                bArr2[i5][i4] = i3;
                i4++;
                i2 = i6;
            }
            i5++;
            i3 = i2;
        }
        byte[][] bArr3 = new byte[bq.ah][];
        int i7 = 0;
        while (i7 < bq.ah) {
            bArr3[i7] = new byte[iArr[i7]];
            i2 = 0;
            i6 = i3;
            i3 = 0;
            while (i3 < bArr3[i7].length) {
                i5 = i6 + 1;
                i2 = (byte) (i2 + bArr[i6]);
                bArr3[i7][i3] = i2;
                i3++;
                i6 = i5;
            }
            i7++;
            i3 = i6;
        }
        this.aw = new byte[65536];
        i2 = 0;
        while (i2 < bq.ah) {
            if (!(i2 == 32 || i2 == 160)) {
                for (i6 = 0; i6 < bq.ah; i6++) {
                    if (i6 != 32) {
                        if (i6 != 160) {
                            this.aw[(i2 << 8) + i6] = (byte) kh.ac(bArr2, bArr3, iArr2, this.ac, iArr, i2, i6);
                        }
                    }
                }
            }
            i2++;
        }
        this.ak = iArr2[32] + iArr[32];
    }

    void bt(byte[] bArr) {
        int i = 0;
        this.ac = new int[-1508219824];
        if (bArr.length == 174479724) {
            while (i < this.ac.length) {
                this.ac[i] = bArr[i] & 255;
                i++;
            }
            this.ak = bArr[bq.ah] & 1565683987;
            return;
        }
        int[] iArr = new int[bq.ah];
        int[] iArr2 = new int[-1999370440];
        int i2 = 0;
        int i3 = 0;
        while (i2 < bq.ah) {
            int i4 = i3 + 1;
            iArr[i2] = bArr[i3] & -952120762;
            i2++;
            i3 = i4;
        }
        i2 = 0;
        while (i2 < bq.ah) {
            i4 = i3 + 1;
            iArr2[i2] = bArr[i3] & 634407934;
            i2++;
            i3 = i4;
        }
        byte[][] bArr2 = new byte[-453508401][];
        int i5 = 0;
        while (i5 < bq.ah) {
            bArr2[i5] = new byte[iArr[i5]];
            i2 = 0;
            i4 = i3;
            i3 = 0;
            while (i3 < bArr2[i5].length) {
                int i6 = i4 + 1;
                i2 = (byte) (i2 + bArr[i4]);
                bArr2[i5][i3] = i2;
                i3++;
                i4 = i6;
            }
            i5++;
            i3 = i4;
        }
        bArr2 = new byte[-538376887][];
        i5 = 0;
        while (i5 < 512526250) {
            bArr2[i5] = new byte[iArr[i5]];
            i2 = 0;
            i4 = i3;
            i3 = 0;
            while (i3 < bArr2[i5].length) {
                i6 = i4 + 1;
                i2 = (byte) (i2 + bArr[i4]);
                bArr2[i5][i3] = i2;
                i3++;
                i4 = i6;
            }
            i5++;
            i3 = i4;
        }
        this.aw = new byte[65536];
        this.ak = iArr2[-1745813703] + iArr[32];
    }

    static int ac(byte[][] bArr, byte[][] bArr2, int[] iArr, int[] iArr2, int[] iArr3, int i, int i2) {
        int i3;
        int i4 = iArr[i];
        int i5 = i4 + iArr3[i];
        int i6 = iArr[i2];
        int i7 = i6 + iArr3[i2];
        if (i6 > i4) {
            i3 = i6;
        } else {
            i3 = i4;
        }
        if (i7 >= i5) {
            i7 = i5;
        }
        i5 = iArr2[i];
        if (iArr2[i2] < i5) {
            i5 = iArr2[i2];
        }
        byte[] bArr3 = bArr2[i];
        byte[] bArr4 = bArr[i2];
        i4 = i3 - i4;
        int i8 = i3;
        i3 -= i6;
        i6 = i5;
        i5 = i4;
        i4 = i8;
        while (i4 < i7) {
            int i9 = i5 + 1;
            byte b = bArr3[i5];
            i5 = i3 + 1;
            i3 = bArr4[i3] + b;
            if (i3 >= i6) {
                i3 = i6;
            }
            i4++;
            i6 = i3;
            i3 = i5;
            i5 = i9;
        }
        return -i6;
    }

    static int bb(byte[][] bArr, byte[][] bArr2, int[] iArr, int[] iArr2, int[] iArr3, int i, int i2) {
        int i3;
        int i4 = iArr[i];
        int i5 = i4 + iArr3[i];
        int i6 = iArr[i2];
        int i7 = i6 + iArr3[i2];
        if (i6 > i4) {
            i3 = i6;
        } else {
            i3 = i4;
        }
        if (i7 >= i5) {
            i7 = i5;
        }
        i5 = iArr2[i];
        if (iArr2[i2] < i5) {
            i5 = iArr2[i2];
        }
        byte[] bArr3 = bArr2[i];
        byte[] bArr4 = bArr[i2];
        i4 = i3 - i4;
        int i8 = i3;
        i3 -= i6;
        i6 = i5;
        i5 = i4;
        i4 = i8;
        while (i4 < i7) {
            int i9 = i5 + 1;
            byte b = bArr3[i5];
            i5 = i3 + 1;
            i3 = bArr4[i3] + b;
            if (i3 >= i6) {
                i3 = i6;
            }
            i4++;
            i6 = i3;
            i3 = i5;
            i5 = i9;
        }
        return -i6;
    }

    int an(char c) {
        if (c == ' ') {
            c = ' ';
        }
        return this.ac[eb.aj(c, -140240738) & 255];
    }

    int bd(char c) {
        if (c == ' ') {
            c = ' ';
        }
        return this.ac[eb.aj(c, -140240738) & 255];
    }

    int bu(char c) {
        if (c == '檥') {
            c = ' ';
        }
        return this.ac[eb.aj(c, -140240738) & 255];
    }

    int by(char c) {
        if (c == ' ') {
            c = ' ';
        }
        return this.ac[eb.aj(c, -140240738) & 1604555549];
    }

    public int aq(String str) {
        int i = 0;
        if (str == null) {
            return 0;
        }
        int i2 = 0;
        char c = '￿';
        int i3 = -1;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == '<') {
                i3 = i;
            } else {
                int i4;
                char c2;
                if (charAt != '>' || i3 == -1) {
                    char c3 = charAt;
                    i4 = i3;
                    c2 = c3;
                } else {
                    String substring = str.substring(i3 + 1, i);
                    if (substring.equals("lt")) {
                        c2 = '<';
                        i4 = -1;
                    } else if (substring.equals("gt")) {
                        c2 = '>';
                        i4 = -1;
                    } else if (substring.startsWith("img=")) {
                        try {
                            i2 += ai[fm.ac(substring.substring(4), 1895878824)].ak;
                            c = '￿';
                            i3 = -1;
                        } catch (Exception e) {
                            i3 = -1;
                        }
                    } else {
                        i3 = -1;
                    }
                }
                if (c2 == ' ') {
                    c2 = ' ';
                }
                if (i4 == -1) {
                    i2 += this.ac[(char) (eb.aj(c2, -140240738) & 255)];
                    if (!(this.aw == null || c == '￿')) {
                        i2 += this.aw[(c << 8) + c2];
                    }
                    c = c2;
                    i3 = i4;
                } else {
                    i3 = i4;
                }
            }
            i++;
        }
        return i2;
    }

    public int bx(String str) {
        int i = 0;
        if (str == null) {
            return 0;
        }
        int i2 = 0;
        char c = '￿';
        int i3 = -1;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == '<') {
                i3 = i;
            } else {
                int i4;
                char c2;
                if (charAt != '>' || i3 == -1) {
                    char c3 = charAt;
                    i4 = i3;
                    c2 = c3;
                } else {
                    String substring = str.substring(i3 + 1, i);
                    if (substring.equals("lt")) {
                        c2 = '<';
                        i4 = -1;
                    } else if (substring.equals("gt")) {
                        c2 = '>';
                        i4 = -1;
                    } else if (substring.startsWith("img=")) {
                        try {
                            i2 += ai[fm.ac(substring.substring(4), 125490513)].ak;
                            c = '￿';
                            i3 = -1;
                        } catch (Exception e) {
                            i3 = -1;
                        }
                    } else {
                        i3 = -1;
                    }
                }
                if (c2 == ' ') {
                    c2 = ' ';
                }
                if (i4 == -1) {
                    i2 += this.ac[(char) (eb.aj(c2, -140240738) & 255)];
                    if (!(this.aw == null || c == '￿')) {
                        i2 += this.aw[(c << 8) + c2];
                    }
                    c = c2;
                    i3 = i4;
                } else {
                    i3 = i4;
                }
            }
            i++;
        }
        return i2;
    }

    public int ao(String str, int[] iArr, String[] strArr) {
        int i;
        if (str == null) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        StringBuilder stringBuilder = new StringBuilder(100);
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        int i7 = -1;
        int i8 = 0;
        int i9 = 0;
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11;
            char charAt = str.charAt(i10);
            if (charAt == '<') {
                i7 = i2;
                i2 = i10;
                i = i5;
                i5 = i3;
                i3 = i;
                i11 = i4;
                i4 = i6;
                i6 = i11;
            } else {
                if (charAt != '>' || i7 == -1) {
                    i = i7;
                    i7 = i3;
                    i3 = i4;
                    i4 = i;
                } else {
                    String substring = str.substring(i7 + 1, i10);
                    stringBuilder.append('<');
                    stringBuilder.append(substring);
                    stringBuilder.append('>');
                    if (substring.equals("br")) {
                        strArr[i9] = stringBuilder.toString().substring(i3, stringBuilder.length());
                        i2 = i9 + 1;
                        i4 = stringBuilder.length();
                        i3 = 0;
                        i8 = -1;
                        i9 = 0;
                    } else if (substring.equals("lt")) {
                        i2 += an('<');
                        if (!(this.aw == null || i8 == -1)) {
                            i2 += this.aw[(i8 << 8) + 60];
                        }
                        i = i9;
                        i9 = 60;
                        i8 = i4;
                        i4 = i3;
                        i3 = i2;
                        i2 = i;
                    } else if (substring.equals("gt")) {
                        i2 += an('>');
                        if (!(this.aw == null || i8 == -1)) {
                            i2 += this.aw[(i8 << 8) + 62];
                        }
                        i = i9;
                        i9 = 62;
                        i8 = i4;
                        i4 = i3;
                        i3 = i2;
                        i2 = i;
                    } else if (substring.startsWith("img=")) {
                        try {
                            i8 = ai[fm.ac(substring.substring(4), -1605411581)].ak + i2;
                            i = i9;
                            i9 = 0;
                            i2 = i;
                            i11 = i4;
                            i4 = i3;
                            i3 = i8;
                            i8 = i11;
                        } catch (Exception e) {
                            i = i9;
                            i9 = i8;
                            i8 = i4;
                            i4 = i3;
                            i3 = i2;
                            i2 = i;
                        }
                    } else {
                        i = i9;
                        i9 = i8;
                        i8 = i4;
                        i4 = i3;
                        i3 = i2;
                        i2 = i;
                    }
                    charAt = '\u0000';
                    i = i2;
                    i2 = i3;
                    i3 = i8;
                    i8 = i9;
                    i9 = i;
                    i11 = i4;
                    i4 = -1;
                    i7 = i11;
                }
                if (i4 == -1) {
                    int i12;
                    if (charAt != '\u0000') {
                        stringBuilder.append(charAt);
                        i2 += an(charAt);
                        if (!(this.aw == null || i8 == -1)) {
                            i2 += this.aw[(i8 << 8) + charAt];
                        }
                        i8 = charAt;
                        i12 = i2;
                    } else {
                        i12 = i2;
                    }
                    if (charAt == ' ') {
                        i6 = stringBuilder.length();
                        i3 = 1;
                        i5 = i12;
                    } else {
                        i = i6;
                        i6 = i3;
                        i3 = i;
                    }
                    if (iArr != null) {
                        if (i9 < iArr.length) {
                            i2 = i9;
                        } else {
                            i2 = iArr.length - 1;
                        }
                        if (i12 > iArr[i2] && i6 >= 0) {
                            strArr[i9] = stringBuilder.toString().substring(i7, i6 - i3);
                            i9++;
                            i2 = -1;
                            i8 = 0;
                            i = i6;
                            i6 = i12 - i5;
                            i7 = i;
                            if (charAt != '-') {
                                i5 = i7;
                                i7 = i6;
                                i = i6;
                                i6 = stringBuilder.length();
                                i3 = i;
                                i11 = i4;
                                i4 = 0;
                                i2 = i11;
                            } else {
                                i = i4;
                                i4 = i3;
                                i3 = i5;
                                i5 = i7;
                                i7 = i6;
                                i6 = i2;
                                i2 = i;
                            }
                        }
                    }
                    i2 = i6;
                    i6 = i12;
                    if (charAt != '-') {
                        i = i4;
                        i4 = i3;
                        i3 = i5;
                        i5 = i7;
                        i7 = i6;
                        i6 = i2;
                        i2 = i;
                    } else {
                        i5 = i7;
                        i7 = i6;
                        i = i6;
                        i6 = stringBuilder.length();
                        i3 = i;
                        i11 = i4;
                        i4 = 0;
                        i2 = i11;
                    }
                } else {
                    i = i4;
                    i4 = i6;
                    i6 = i3;
                    i3 = i5;
                    i5 = i7;
                    i7 = i2;
                    i2 = i;
                }
            }
            i10++;
            i = i2;
            i2 = i7;
            i7 = i;
            i11 = i3;
            i3 = i5;
            i5 = i11;
            int i13 = i6;
            i6 = i4;
            i4 = i13;
        }
        String stringBuilder2 = stringBuilder.toString();
        if (stringBuilder2.length() <= i3) {
            return i9;
        }
        i2 = i9 + 1;
        strArr[i9] = stringBuilder2.substring(i3, stringBuilder2.length());
        return i2;
    }

    public int bi(String str, int[] iArr, String[] strArr) {
        if (str == null) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        StringBuilder stringBuilder = new StringBuilder(100);
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        int i7 = 0;
        int i8 = 0;
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            int i10;
            int i11;
            char charAt = str.charAt(i9);
            if (charAt == '') {
                i6 = i;
                i = i9;
                i10 = i4;
                i4 = i2;
                i2 = i10;
                i11 = i3;
                i3 = i5;
                i5 = i11;
            } else {
                if (charAt != '>' || i6 == -1) {
                    i10 = i6;
                    i6 = i2;
                    i2 = i3;
                    i3 = i10;
                } else {
                    String substring = str.substring(i6 + 1, i9);
                    stringBuilder.append('');
                    stringBuilder.append(substring);
                    stringBuilder.append('>');
                    if (substring.equals("br")) {
                        strArr[i8] = stringBuilder.toString().substring(i2, stringBuilder.length());
                        i = i8 + 1;
                        i3 = stringBuilder.length();
                        i2 = 0;
                        i7 = -1;
                        i8 = 0;
                    } else if (substring.equals("lt")) {
                        i += an('⍂');
                        if (!(this.aw == null || i7 == -1)) {
                            i += this.aw[(i7 << 8) - 1430306595];
                        }
                        i10 = i8;
                        i8 = 60;
                        i7 = i3;
                        i3 = i2;
                        i2 = i;
                        i = i10;
                    } else if (substring.equals("gt")) {
                        i += an('>');
                        if (!(this.aw == null || i7 == -1)) {
                            i += this.aw[(i7 << 8) + 1191671438];
                        }
                        i10 = i8;
                        i8 = -1906175723;
                        i7 = i3;
                        i3 = i2;
                        i2 = i;
                        i = i10;
                    } else if (substring.startsWith("img=")) {
                        try {
                            i7 = ai[fm.ac(substring.substring(4), 1509868414)].ak + i;
                            i10 = i8;
                            i8 = 0;
                            i = i10;
                            i11 = i3;
                            i3 = i2;
                            i2 = i7;
                            i7 = i11;
                        } catch (Exception e) {
                            i10 = i8;
                            i8 = i7;
                            i7 = i3;
                            i3 = i2;
                            i2 = i;
                            i = i10;
                        }
                    } else {
                        i10 = i8;
                        i8 = i7;
                        i7 = i3;
                        i3 = i2;
                        i2 = i;
                        i = i10;
                    }
                    charAt = '\u0000';
                    i10 = i;
                    i = i2;
                    i2 = i7;
                    i7 = i8;
                    i8 = i10;
                    i11 = i3;
                    i3 = -1;
                    i6 = i11;
                }
                if (i3 == -1) {
                    int i12;
                    if (charAt != '\u0000') {
                        stringBuilder.append(charAt);
                        i += an(charAt);
                        if (!(this.aw == null || i7 == -1)) {
                            i += this.aw[(i7 << 8) + charAt];
                        }
                        i7 = charAt;
                        i12 = i;
                    } else {
                        i12 = i;
                    }
                    if (charAt == '䇛') {
                        i5 = stringBuilder.length();
                        i2 = 1;
                        i4 = i12;
                    } else {
                        i10 = i5;
                        i5 = i2;
                        i2 = i10;
                    }
                    if (iArr != null) {
                        if (i8 < iArr.length) {
                            i = i8;
                        } else {
                            i = iArr.length - 1;
                        }
                        if (i12 > iArr[i] && i5 >= 0) {
                            strArr[i8] = stringBuilder.toString().substring(i6, i5 - i2);
                            i8++;
                            i = -1;
                            i7 = 0;
                            i10 = i5;
                            i5 = i12 - i4;
                            i6 = i10;
                            if (charAt != '殅') {
                                i4 = i6;
                                i6 = i5;
                                i10 = i5;
                                i5 = stringBuilder.length();
                                i2 = i10;
                                i11 = i3;
                                i3 = 0;
                                i = i11;
                            } else {
                                i10 = i3;
                                i3 = i2;
                                i2 = i4;
                                i4 = i6;
                                i6 = i5;
                                i5 = i;
                                i = i10;
                            }
                        }
                    }
                    i = i5;
                    i5 = i12;
                    if (charAt != '殅') {
                        i10 = i3;
                        i3 = i2;
                        i2 = i4;
                        i4 = i6;
                        i6 = i5;
                        i5 = i;
                        i = i10;
                    } else {
                        i4 = i6;
                        i6 = i5;
                        i10 = i5;
                        i5 = stringBuilder.length();
                        i2 = i10;
                        i11 = i3;
                        i3 = 0;
                        i = i11;
                    }
                } else {
                    i10 = i3;
                    i3 = i5;
                    i5 = i2;
                    i2 = i4;
                    i4 = i6;
                    i6 = i;
                    i = i10;
                }
            }
            i9++;
            i10 = i;
            i = i6;
            i6 = i10;
            i11 = i2;
            i2 = i4;
            i4 = i11;
            int i13 = i5;
            i5 = i3;
            i3 = i13;
        }
        String stringBuilder2 = stringBuilder.toString();
        if (stringBuilder2.length() <= i2) {
            return i8;
        }
        i = i8 + 1;
        strArr[i8] = stringBuilder2.substring(i2, stringBuilder2.length());
        return i;
    }

    public int bo(String str, int[] iArr, String[] strArr) {
        if (str == null) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        StringBuilder stringBuilder = new StringBuilder(-1225679769);
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        int i7 = 0;
        int i8 = 0;
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            int i10;
            int i11;
            char charAt = str.charAt(i9);
            if (charAt == '雩') {
                i6 = i;
                i = i9;
                i10 = i4;
                i4 = i2;
                i2 = i10;
                i11 = i3;
                i3 = i5;
                i5 = i11;
            } else {
                if (charAt != '>' || i6 == -1) {
                    i10 = i6;
                    i6 = i2;
                    i2 = i3;
                    i3 = i10;
                } else {
                    String substring = str.substring(i6 + 1, i9);
                    stringBuilder.append('<');
                    stringBuilder.append(substring);
                    stringBuilder.append('>');
                    if (substring.equals("br")) {
                        strArr[i8] = stringBuilder.toString().substring(i2, stringBuilder.length());
                        i = i8 + 1;
                        i3 = stringBuilder.length();
                        i2 = 0;
                        i7 = -1;
                        i8 = 0;
                    } else if (substring.equals("lt")) {
                        i += an('<');
                        if (!(this.aw == null || i7 == -1)) {
                            i += this.aw[(i7 << 8) - 962229934];
                        }
                        i10 = i8;
                        i8 = 60;
                        i7 = i3;
                        i3 = i2;
                        i2 = i;
                        i = i10;
                    } else if (substring.equals("gt")) {
                        i += an('ﲶ');
                        if (!(this.aw == null || i7 == -1)) {
                            i += this.aw[(i7 << 8) + 62];
                        }
                        i10 = i8;
                        i8 = 62;
                        i7 = i3;
                        i3 = i2;
                        i2 = i;
                        i = i10;
                    } else if (substring.startsWith("img=")) {
                        try {
                            i7 = ai[fm.ac(substring.substring(4), -1285701930)].ak + i;
                            i10 = i8;
                            i8 = 0;
                            i = i10;
                            i11 = i3;
                            i3 = i2;
                            i2 = i7;
                            i7 = i11;
                        } catch (Exception e) {
                            i10 = i8;
                            i8 = i7;
                            i7 = i3;
                            i3 = i2;
                            i2 = i;
                            i = i10;
                        }
                    } else {
                        i10 = i8;
                        i8 = i7;
                        i7 = i3;
                        i3 = i2;
                        i2 = i;
                        i = i10;
                    }
                    charAt = '\u0000';
                    i10 = i;
                    i = i2;
                    i2 = i7;
                    i7 = i8;
                    i8 = i10;
                    i11 = i3;
                    i3 = -1;
                    i6 = i11;
                }
                if (i3 == -1) {
                    int i12;
                    if (charAt != '\u0000') {
                        stringBuilder.append(charAt);
                        i += an(charAt);
                        if (!(this.aw == null || i7 == -1)) {
                            i += this.aw[(i7 << 8) + charAt];
                        }
                        i7 = charAt;
                        i12 = i;
                    } else {
                        i12 = i;
                    }
                    if (charAt == ' ') {
                        i5 = stringBuilder.length();
                        i2 = 1;
                        i4 = i12;
                    } else {
                        i10 = i5;
                        i5 = i2;
                        i2 = i10;
                    }
                    if (iArr != null) {
                        if (i8 < iArr.length) {
                            i = i8;
                        } else {
                            i = iArr.length - 1;
                        }
                        if (i12 > iArr[i] && i5 >= 0) {
                            strArr[i8] = stringBuilder.toString().substring(i6, i5 - i2);
                            i8++;
                            i = -1;
                            i7 = 0;
                            i10 = i5;
                            i5 = i12 - i4;
                            i6 = i10;
                            if (charAt != '-') {
                                i4 = i6;
                                i6 = i5;
                                i10 = i5;
                                i5 = stringBuilder.length();
                                i2 = i10;
                                i11 = i3;
                                i3 = 0;
                                i = i11;
                            } else {
                                i10 = i3;
                                i3 = i2;
                                i2 = i4;
                                i4 = i6;
                                i6 = i5;
                                i5 = i;
                                i = i10;
                            }
                        }
                    }
                    i = i5;
                    i5 = i12;
                    if (charAt != '-') {
                        i10 = i3;
                        i3 = i2;
                        i2 = i4;
                        i4 = i6;
                        i6 = i5;
                        i5 = i;
                        i = i10;
                    } else {
                        i4 = i6;
                        i6 = i5;
                        i10 = i5;
                        i5 = stringBuilder.length();
                        i2 = i10;
                        i11 = i3;
                        i3 = 0;
                        i = i11;
                    }
                } else {
                    i10 = i3;
                    i3 = i5;
                    i5 = i2;
                    i2 = i4;
                    i4 = i6;
                    i6 = i;
                    i = i10;
                }
            }
            i9++;
            i10 = i;
            i = i6;
            i6 = i10;
            i11 = i2;
            i2 = i4;
            i4 = i11;
            int i13 = i5;
            i5 = i3;
            i3 = i13;
        }
        String stringBuilder2 = stringBuilder.toString();
        if (stringBuilder2.length() <= i2) {
            return i8;
        }
        i = i8 + 1;
        strArr[i8] = stringBuilder2.substring(i2, stringBuilder2.length());
        return i;
    }

    public int bs(String str, int[] iArr, String[] strArr) {
        if (str == null) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        StringBuilder stringBuilder = new StringBuilder(100);
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        int i7 = 0;
        int i8 = 0;
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            int i10;
            int i11;
            char charAt = str.charAt(i9);
            if (charAt == '<') {
                i6 = i;
                i = i9;
                i10 = i4;
                i4 = i2;
                i2 = i10;
                i11 = i3;
                i3 = i5;
                i5 = i11;
            } else {
                if (charAt != '>' || i6 == -1) {
                    i10 = i6;
                    i6 = i2;
                    i2 = i3;
                    i3 = i10;
                } else {
                    String substring = str.substring(i6 + 1, i9);
                    stringBuilder.append('<');
                    stringBuilder.append(substring);
                    stringBuilder.append('>');
                    if (substring.equals("br")) {
                        strArr[i8] = stringBuilder.toString().substring(i2, stringBuilder.length());
                        i = i8 + 1;
                        i3 = stringBuilder.length();
                        i2 = 0;
                        i7 = -1;
                        i8 = 0;
                    } else if (substring.equals("lt")) {
                        i += an('<');
                        if (!(this.aw == null || i7 == -1)) {
                            i += this.aw[(i7 << 8) + 60];
                        }
                        i10 = i8;
                        i8 = 60;
                        i7 = i3;
                        i3 = i2;
                        i2 = i;
                        i = i10;
                    } else if (substring.equals("gt")) {
                        i += an('>');
                        if (!(this.aw == null || i7 == -1)) {
                            i += this.aw[(i7 << 8) + 62];
                        }
                        i10 = i8;
                        i8 = 62;
                        i7 = i3;
                        i3 = i2;
                        i2 = i;
                        i = i10;
                    } else if (substring.startsWith("img=")) {
                        try {
                            i7 = ai[fm.ac(substring.substring(4), 1544618679)].ak + i;
                            i10 = i8;
                            i8 = 0;
                            i = i10;
                            i11 = i3;
                            i3 = i2;
                            i2 = i7;
                            i7 = i11;
                        } catch (Exception e) {
                            i10 = i8;
                            i8 = i7;
                            i7 = i3;
                            i3 = i2;
                            i2 = i;
                            i = i10;
                        }
                    } else {
                        i10 = i8;
                        i8 = i7;
                        i7 = i3;
                        i3 = i2;
                        i2 = i;
                        i = i10;
                    }
                    charAt = '\u0000';
                    i10 = i;
                    i = i2;
                    i2 = i7;
                    i7 = i8;
                    i8 = i10;
                    i11 = i3;
                    i3 = -1;
                    i6 = i11;
                }
                if (i3 == -1) {
                    int i12;
                    if (charAt != '\u0000') {
                        stringBuilder.append(charAt);
                        i += an(charAt);
                        if (!(this.aw == null || i7 == -1)) {
                            i += this.aw[(i7 << 8) + charAt];
                        }
                        i7 = charAt;
                        i12 = i;
                    } else {
                        i12 = i;
                    }
                    if (charAt == ' ') {
                        i5 = stringBuilder.length();
                        i2 = 1;
                        i4 = i12;
                    } else {
                        i10 = i5;
                        i5 = i2;
                        i2 = i10;
                    }
                    if (iArr != null) {
                        if (i8 < iArr.length) {
                            i = i8;
                        } else {
                            i = iArr.length - 1;
                        }
                        if (i12 > iArr[i] && i5 >= 0) {
                            strArr[i8] = stringBuilder.toString().substring(i6, i5 - i2);
                            i8++;
                            i = -1;
                            i7 = 0;
                            i10 = i5;
                            i5 = i12 - i4;
                            i6 = i10;
                            if (charAt != '-') {
                                i4 = i6;
                                i6 = i5;
                                i10 = i5;
                                i5 = stringBuilder.length();
                                i2 = i10;
                                i11 = i3;
                                i3 = 0;
                                i = i11;
                            } else {
                                i10 = i3;
                                i3 = i2;
                                i2 = i4;
                                i4 = i6;
                                i6 = i5;
                                i5 = i;
                                i = i10;
                            }
                        }
                    }
                    i = i5;
                    i5 = i12;
                    if (charAt != '-') {
                        i10 = i3;
                        i3 = i2;
                        i2 = i4;
                        i4 = i6;
                        i6 = i5;
                        i5 = i;
                        i = i10;
                    } else {
                        i4 = i6;
                        i6 = i5;
                        i10 = i5;
                        i5 = stringBuilder.length();
                        i2 = i10;
                        i11 = i3;
                        i3 = 0;
                        i = i11;
                    }
                } else {
                    i10 = i3;
                    i3 = i5;
                    i5 = i2;
                    i2 = i4;
                    i4 = i6;
                    i6 = i;
                    i = i10;
                }
            }
            i9++;
            i10 = i;
            i = i6;
            i6 = i10;
            i11 = i2;
            i2 = i4;
            i4 = i11;
            int i13 = i5;
            i5 = i3;
            i3 = i13;
        }
        String stringBuilder2 = stringBuilder.toString();
        if (stringBuilder2.length() <= i2) {
            return i8;
        }
        i = i8 + 1;
        strArr[i8] = stringBuilder2.substring(i2, stringBuilder2.length());
        return i;
    }

    public int aa(String str, int i) {
        int ao = ao(str, new int[]{i}, ag);
        int i2 = 0;
        int i3 = 0;
        while (i2 < ao) {
            int aq = aq(ag[i2]);
            if (aq <= i3) {
                aq = i3;
            }
            i2++;
            i3 = aq;
        }
        return i3;
    }

    public int bq(String str, int i) {
        int ao = ao(str, new int[]{i}, ag);
        int i2 = 0;
        int i3 = 0;
        while (i2 < ao) {
            int aq = aq(ag[i2]);
            if (aq <= i3) {
                aq = i3;
            }
            i2++;
            i3 = aq;
        }
        return i3;
    }

    public int bz(String str, int i) {
        int ao = ao(str, new int[]{i}, ag);
        int i2 = 0;
        int i3 = 0;
        while (i2 < ao) {
            int aq = aq(ag[i2]);
            if (aq <= i3) {
                aq = i3;
            }
            i2++;
            i3 = aq;
        }
        return i3;
    }

    public int ak(String str, int i) {
        return ao(str, new int[]{i}, ag);
    }

    public int ba(String str, int i) {
        return ao(str, new int[]{i}, ag);
    }

    public int bj(String str, int i) {
        return ao(str, new int[]{i}, ag);
    }

    public static String ap(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '<' || charAt == '>') {
                i += 3;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(i + length);
        for (i = 0; i < length; i++) {
            char charAt2 = str.charAt(i);
            if (charAt2 == '<') {
                stringBuilder.append("<lt>");
            } else if (charAt2 == '>') {
                stringBuilder.append("<gt>");
            } else {
                stringBuilder.append(charAt2);
            }
        }
        return stringBuilder.toString();
    }

    public static String be(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '<' || charAt == '>') {
                i += 3;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(i + length);
        for (i = 0; i < length; i++) {
            char charAt2 = str.charAt(i);
            if (charAt2 == '<') {
                stringBuilder.append("<lt>");
            } else if (charAt2 == '>') {
                stringBuilder.append("<gt>");
            } else {
                stringBuilder.append(charAt2);
            }
        }
        return stringBuilder.toString();
    }

    public static String bn(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '<' || charAt == '>') {
                i += 3;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(i + length);
        for (i = 0; i < length; i++) {
            char charAt2 = str.charAt(i);
            if (charAt2 == '<') {
                stringBuilder.append("<lt>");
            } else if (charAt2 == '>') {
                stringBuilder.append("<gt>");
            } else {
                stringBuilder.append(charAt2);
            }
        }
        return stringBuilder.toString();
    }

    public static String bv(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '<' || charAt == '>') {
                i += 3;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(i + length);
        for (i = 0; i < length; i++) {
            char charAt2 = str.charAt(i);
            if (charAt2 == '<') {
                stringBuilder.append("<lt>");
            } else if (charAt2 == '>') {
                stringBuilder.append("<gt>");
            } else {
                stringBuilder.append(charAt2);
            }
        }
        return stringBuilder.toString();
    }

    public static String bw(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '<' || charAt == '?') {
                i += 3;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(i + length);
        for (i = 0; i < length; i++) {
            char charAt2 = str.charAt(i);
            if (charAt2 == 'প') {
                stringBuilder.append("<lt>");
            } else if (charAt2 == '') {
                stringBuilder.append("<gt>");
            } else {
                stringBuilder.append(charAt2);
            }
        }
        return stringBuilder.toString();
    }

    public void at(String str, int i, int i2, int i3, int i4, es esVar) {
        if (str != null) {
            ax(i3, i4);
            av(str, i, i2, esVar);
        }
    }

    public void bc(String str, int i, int i2, int i3, int i4, es esVar) {
        if (str != null) {
            ax(i3, i4);
            av(str, i, i2, esVar);
        }
    }

    public void bg(String str, int i, int i2, int i3, int i4, es esVar) {
        if (str != null) {
            ax(i3, i4);
            av(str, i, i2, esVar);
        }
    }

    public void ah(String str, int i, int i2, int i3, int i4, int i5, es esVar) {
        if (str != null) {
            ax(i3, i4);
            af = i5;
            av(str, i, i2, esVar);
        }
    }

    public void bk(String str, int i, int i2, int i3, int i4, int i5, es esVar) {
        if (str != null) {
            ax(i3, i4);
            af = i5;
            av(str, i, i2, esVar);
        }
    }

    public void ai(String str, int i, int i2, int i3, int i4, es esVar) {
        if (str != null) {
            ax(i3, i4);
            av(str, i - aq(str), i2, esVar);
        }
    }

    public void bf(String str, int i, int i2, int i3, int i4, es esVar) {
        if (str != null) {
            ax(i3, i4);
            av(str, i - aq(str), i2, esVar);
        }
    }

    public void bl(String str, int i, int i2, int i3, int i4, es esVar) {
        if (str != null) {
            ax(i3, i4);
            av(str, i - aq(str), i2, esVar);
        }
    }

    public void aw(String str, int i, int i2, int i3, int i4, es esVar) {
        if (str != null) {
            ax(i3, i4);
            av(str, i - (aq(str) / 2), i2, esVar);
        }
    }

    public void cb(String str, int i, int i2, int i3, int i4, es esVar) {
        if (str != null) {
            ax(i3, i4);
            av(str, i - (aq(str) / 2), i2, esVar);
        }
    }

    public void cy(String str, int i, int i2, int i3, int i4, es esVar) {
        if (str != null) {
            ax(i3, i4);
            av(str, i - (aq(str) / 2), i2, esVar);
        }
    }

    public int am(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, es esVar) {
        if (str == null) {
            return 0;
        }
        int i10;
        int i11;
        ax(i5, i6);
        if (i9 == 0) {
            i9 = this.ak;
        }
        int[] iArr = new int[]{i3};
        if (i4 < (this.ap + this.at) + i9 && i4 < i9 + i9) {
            iArr = null;
        }
        int ao = ao(str, iArr, ag);
        if (i8 == 3 && ao == 1) {
            i8 = 1;
        }
        if (i8 == 0) {
            i10 = this.ap + i2;
        } else if (i8 == 1) {
            i10 = (this.ap + i2) + ((((i4 - this.ap) - this.at) - ((ao - 1) * i9)) / 2);
        } else if (i8 == 2) {
            i10 = ((i2 + i4) - this.at) - ((ao - 1) * i9);
        } else {
            i10 = (((i4 - this.ap) - this.at) - ((ao - 1) * i9)) / (ao + 1);
            if (i10 < 0) {
                i11 = 0;
            } else {
                i11 = i10;
            }
            i10 = (this.ap + i2) + i11;
            i9 += i11;
        }
        i11 = i10;
        for (i10 = 0; i10 < ao; i10++) {
            if (i7 == 0) {
                av(ag[i10], i, i11, esVar);
            } else if (i7 == 1) {
                av(ag[i10], ((i3 - aq(ag[i10])) / 2) + i, i11, esVar);
            } else if (i7 == 2) {
                av(ag[i10], (i + i3) - aq(ag[i10]), i11, esVar);
            } else if (i10 == ao - 1) {
                av(ag[i10], i, i11, esVar);
            } else {
                au(ag[i10], i3);
                av(ag[i10], i, i11, esVar);
                au = 0;
            }
            i11 += i9;
        }
        return ao;
    }

    public int cl(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, es esVar) {
        if (str == null) {
            return 0;
        }
        int i10;
        int i11;
        ax(i5, i6);
        if (i9 == 0) {
            i9 = this.ak;
        }
        int[] iArr = new int[]{i3};
        if (i4 < (this.ap + this.at) + i9 && i4 < i9 + i9) {
            iArr = null;
        }
        int ao = ao(str, iArr, ag);
        if (i8 == 3 && ao == 1) {
            i8 = 1;
        }
        if (i8 == 0) {
            i10 = this.ap + i2;
        } else if (i8 == 1) {
            i10 = (this.ap + i2) + ((((i4 - this.ap) - this.at) - ((ao - 1) * i9)) / 2);
        } else if (i8 == 2) {
            i10 = ((i2 + i4) - this.at) - ((ao - 1) * i9);
        } else {
            i10 = (((i4 - this.ap) - this.at) - ((ao - 1) * i9)) / (ao + 1);
            if (i10 < 0) {
                i11 = 0;
            } else {
                i11 = i10;
            }
            i10 = (this.ap + i2) + i11;
            i9 += i11;
        }
        i11 = i10;
        for (i10 = 0; i10 < ao; i10++) {
            if (i7 == 0) {
                av(ag[i10], i, i11, esVar);
            } else if (i7 == 1) {
                av(ag[i10], ((i3 - aq(ag[i10])) / 2) + i, i11, esVar);
            } else if (i7 == 2) {
                av(ag[i10], (i + i3) - aq(ag[i10]), i11, esVar);
            } else if (i10 == ao - 1) {
                av(ag[i10], i, i11, esVar);
            } else {
                au(ag[i10], i3);
                av(ag[i10], i, i11, esVar);
                au = 0;
            }
            i11 += i9;
        }
        return ao;
    }

    public int co(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, es esVar) {
        if (str == null) {
            return 0;
        }
        int i10;
        ax(i5, i6);
        if (i9 == 0) {
            i9 = this.ak;
        }
        int[] iArr = new int[]{i3};
        if (i4 < (this.ap + this.at) + i9 && i4 < i9 + i9) {
            iArr = null;
        }
        int ao = ao(str, iArr, ag);
        if (i8 == 3 && ao == 1) {
            i8 = 1;
        }
        if (i8 == 0) {
            i10 = this.ap + i2;
        } else if (i8 == 1) {
            i10 = (this.ap + i2) + ((((i4 - this.ap) - this.at) - ((ao - 1) * i9)) / 2);
        } else if (i8 == 2) {
            i10 = ((i2 + i4) - this.at) - ((ao - 1) * i9);
        } else {
            i10 = (((i4 - this.ap) - this.at) - ((ao - 1) * i9)) / (ao + 1);
            if (i10 < 0) {
                i10 = 0;
            }
            i9 += i10;
            i10 = (this.ap + i2) + i10;
        }
        int i11 = i10;
        for (i10 = 0; i10 < ao; i10++) {
            if (i7 == 0) {
                av(ag[i10], i, i11, esVar);
            } else if (i7 == 1) {
                av(ag[i10], ((i3 - aq(ag[i10])) / 2) + i, i11, esVar);
            } else if (i7 == 2) {
                av(ag[i10], (i + i3) - aq(ag[i10]), i11, esVar);
            } else if (i10 == ao - 1) {
                av(ag[i10], i, i11, esVar);
            } else {
                au(ag[i10], i3);
                av(ag[i10], i, i11, esVar);
                au = 0;
            }
            i11 += i9;
        }
        return ao;
    }

    public void ae(String str, int i, int i2, int i3, int i4, int i5, es esVar) {
        if (str != null) {
            ax(i3, i4);
            int[] iArr = new int[str.length()];
            for (int i6 = 0; i6 < str.length(); i6++) {
                iArr[i6] = (int) (Math.sin((((double) i6) / 2.0d) + (((double) i5) / 5.0d)) * 5.0d);
            }
            ay(str, i - (aq(str) / 2), i2, null, iArr, esVar);
        }
    }

    public void cc(String str, int i, int i2, int i3, int i4, int i5, es esVar) {
        if (str != null) {
            ax(i3, i4);
            int[] iArr = new int[str.length()];
            for (int i6 = 0; i6 < str.length(); i6++) {
                iArr[i6] = (int) (Math.sin((((double) i6) / 2.0d) + (((double) i5) / 5.0d)) * 5.0d);
            }
            ay(str, i - (aq(str) / 2), i2, null, iArr, esVar);
        }
    }

    public void cf(String str, int i, int i2, int i3, int i4, int i5, es esVar) {
        if (str != null) {
            ax(i3, i4);
            int[] iArr = new int[str.length()];
            for (int i6 = 0; i6 < str.length(); i6++) {
                iArr[i6] = (int) (Math.sin((((double) i6) / 2.0d) + (((double) i5) / 5.0d)) * 5.0d);
            }
            ay(str, i - (aq(str) / 2), i2, null, iArr, esVar);
        }
    }

    public void as(String str, int i, int i2, int i3, int i4, int i5, es esVar) {
        if (str != null) {
            ax(i3, i4);
            int[] iArr = new int[str.length()];
            int[] iArr2 = new int[str.length()];
            for (int i6 = 0; i6 < str.length(); i6++) {
                iArr[i6] = (int) (Math.sin((((double) i6) / 5.0d) + (((double) i5) / 5.0d)) * 5.0d);
                iArr2[i6] = (int) (Math.sin((((double) i6) / 3.0d) + (((double) i5) / 5.0d)) * 5.0d);
            }
            ay(str, i - (aq(str) / 2), i2, iArr, iArr2, esVar);
        }
    }

    public void ca(String str, int i, int i2, int i3, int i4, int i5, es esVar) {
        if (str != null) {
            ax(i3, i4);
            int[] iArr = new int[str.length()];
            int[] iArr2 = new int[str.length()];
            for (int i6 = 0; i6 < str.length(); i6++) {
                iArr[i6] = (int) (Math.sin((((double) i6) / 5.0d) + (((double) i5) / 5.0d)) * 5.0d);
                iArr2[i6] = (int) (Math.sin((((double) i6) / 3.0d) + (((double) i5) / 5.0d)) * 5.0d);
            }
            ay(str, i - (aq(str) / 2), i2, iArr, iArr2, esVar);
        }
    }

    public void cr(String str, int i, int i2, int i3, int i4, int i5, es esVar) {
        if (str != null) {
            ax(i3, i4);
            int[] iArr = new int[str.length()];
            int[] iArr2 = new int[str.length()];
            for (int i6 = 0; i6 < str.length(); i6++) {
                iArr[i6] = (int) (Math.sin((((double) i6) / 5.0d) + (((double) i5) / 5.0d)) * 5.0d);
                iArr2[i6] = (int) (Math.sin((((double) i6) / 3.0d) + (((double) i5) / 5.0d)) * 5.0d);
            }
            ay(str, i - (aq(str) / 2), i2, iArr, iArr2, esVar);
        }
    }

    public void al(String str, int i, int i2, int i3, int i4, int i5, int i6, es esVar) {
        if (str != null) {
            ax(i3, i4);
            double d = 7.0d - (((double) i6) / 8.0d);
            if (d < 0.0d) {
                d = 0.0d;
            }
            int[] iArr = new int[str.length()];
            for (int i7 = 0; i7 < str.length(); i7++) {
                iArr[i7] = (int) (Math.sin((((double) i7) / 1.5d) + (((double) i5) / 1.0d)) * d);
            }
            ay(str, i - (aq(str) / 2), i2, null, iArr, esVar);
        }
    }

    public void cp(String str, int i, int i2, int i3, int i4, int i5, int i6, es esVar) {
        if (str != null) {
            ax(i3, i4);
            double d = 7.0d - (((double) i6) / 8.0d);
            if (d < 0.0d) {
                d = 0.0d;
            }
            int[] iArr = new int[str.length()];
            for (int i7 = 0; i7 < str.length(); i7++) {
                iArr[i7] = (int) (Math.sin((((double) i7) / 1.5d) + (((double) i5) / 1.0d)) * d);
            }
            ay(str, i - (aq(str) / 2), i2, null, iArr, esVar);
        }
    }

    public void az(String str, int i, int i2, int i3, int i4, int i5, es esVar) {
        int i6 = 0;
        if (str != null) {
            ax(i3, i4);
            ay.setSeed((long) i5);
            af = (ay.nextInt() & 31) + 192;
            int[] iArr = new int[str.length()];
            int i7 = 0;
            while (i6 < str.length()) {
                iArr[i6] = i7;
                if ((ay.nextInt() & 3) == 0) {
                    i7++;
                }
                i6++;
            }
            ay(str, i, i2, iArr, null, esVar);
        }
    }

    public void ct(String str, int i, int i2, int i3, int i4, int i5, es esVar) {
        int i6 = 0;
        if (str != null) {
            ax(i3, i4);
            ay.setSeed((long) i5);
            af = (ay.nextInt() & -1365128321) + 192;
            int[] iArr = new int[str.length()];
            int i7 = 0;
            while (i6 < str.length()) {
                iArr[i6] = i7;
                if ((ay.nextInt() & 3) == 0) {
                    i7++;
                }
                i6++;
            }
            ay(str, i, i2, iArr, null, esVar);
        }
    }

    void ax(int i, int i2) {
        am = -1;
        ae = -1;
        as = i2;
        al = i2;
        az = i;
        ax = i;
        af = 255;
        au = 0;
        av = 0;
    }

    void ce(int i, int i2) {
        am = -1;
        ae = -1;
        as = i2;
        al = i2;
        az = i;
        ax = i;
        af = 255;
        au = 0;
        av = 0;
    }

    void ck(int i, int i2) {
        am = -1;
        ae = -1;
        as = i2;
        al = i2;
        az = i;
        ax = i;
        af = 255;
        au = 0;
        av = 0;
    }

    void cm(int i, int i2) {
        am = -1;
        ae = -1;
        as = i2;
        al = i2;
        az = i;
        ax = i;
        af = 255;
        au = 0;
        av = 0;
    }

    void af(String str) {
        try {
            if (str.startsWith("col=")) {
                ax = dm.an(str.substring(4), 16, true, 2017558044);
            } else if (str.equals("/col")) {
                ax = az;
            } else if (str.startsWith("str=")) {
                am = dm.an(str.substring(4), 16, true, 1912676199);
            } else if (str.equals("str")) {
                am = 8388608;
            } else if (str.equals("/str")) {
                am = -1;
            } else if (str.startsWith("u=")) {
                ae = dm.an(str.substring(2), 16, true, 1907363398);
            } else if (str.equals("u")) {
                ae = 0;
            } else if (str.equals("/u")) {
                ae = -1;
            } else if (str.startsWith("shad=")) {
                al = dm.an(str.substring(5), 16, true, 2049972700);
            } else if (str.equals("shad")) {
                al = 0;
            } else if (str.equals("/shad")) {
                al = as;
            } else if (str.equals("br")) {
                ax(az, as);
            }
        } catch (Exception e) {
        }
    }

    void au(String str, int i) {
        Object obj = null;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '<') {
                obj = 1;
            } else if (charAt == '>') {
                obj = null;
            } else if (obj == null && charAt == ' ') {
                i2++;
            }
        }
        if (i2 > 0) {
            au = ((i - aq(str)) << 8) / i2;
        }
    }

    void ch(String str, int i) {
        Object obj = null;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (charAt == 'ྩ') {
                obj = 1;
            } else if (charAt == '>') {
                obj = null;
            } else if (obj == null && charAt == '멣') {
                i2++;
            }
        }
        if (i2 > 0) {
            au = ((i - aq(str)) << 8) / i2;
        }
    }

    void ci(String str, int i) {
        Object obj = null;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '<') {
                obj = 1;
            } else if (charAt == '>') {
                obj = null;
            } else if (obj == null && charAt == ' ') {
                i2++;
            }
        }
        if (i2 > 0) {
            au = ((i - aq(str)) << 8) / i2;
        }
    }

    void cq(String str, int i) {
        Object obj = null;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '<') {
                obj = 1;
            } else if (charAt == 'ꜷ') {
                obj = null;
            } else if (obj == null && charAt == ' ') {
                i2++;
            }
        }
        if (i2 > 0) {
            au = ((i - aq(str)) << 8) / i2;
        }
    }

    void cv(String str, int i) {
        Object obj = null;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (charAt == 'ﾀ') {
                obj = 1;
            } else if (charAt == '斶') {
                obj = null;
            } else if (obj == null && charAt == '䐶') {
                i2++;
            }
        }
        if (i2 > 0) {
            au = ((i - aq(str)) << 8) / i2;
        }
    }

    void av(String str, int i, int i2, es esVar) {
        int i3 = i2 - this.ak;
        int i4 = 0;
        int i5 = -1;
        int i6 = -1;
        while (i4 < str.length()) {
            int i7;
            if (str.charAt(i4) == '\u0000') {
                i7 = i6;
                i6 = i5;
            } else {
                int aj = (char) (eb.aj(str.charAt(i4), -140240738) & 255);
                if (aj == '<') {
                    i6 = i5;
                    i7 = i4;
                } else {
                    int i8;
                    if (aj != '>' || i6 == -1) {
                        i8 = i6;
                    } else {
                        String substring = str.substring(i6 + 1, i4);
                        i7 = -1;
                        if (substring.equals("lt")) {
                            aj = '<';
                            i8 = -1;
                        } else if (substring.equals("gt")) {
                            aj = '>';
                            i8 = -1;
                        } else if (substring.startsWith("img=")) {
                            try {
                                fl flVar = ai[fm.ac(substring.substring(4), 150432864)];
                                esVar.au(flVar, i, (this.ak + i3) - flVar.ap, 1474577260);
                                i += flVar.ak;
                                i6 = -1;
                            } catch (Exception e) {
                                i6 = i5;
                            }
                        } else {
                            af(substring);
                            i6 = i5;
                        }
                    }
                    if (aj == 160) {
                        aj = 32;
                    }
                    if (i8 == -1) {
                        if (!(this.aw == null || i5 == -1)) {
                            i += this.aw[(i5 << 8) + aj];
                        }
                        int i9 = this.an[aj];
                        int i10 = this.aq[aj];
                        if (aj == 32) {
                            if (au > 0) {
                                av += au;
                                i += av >> 8;
                                av &= 255;
                            }
                            i6 = i;
                        } else if (af >= 255) {
                            if (al != -1) {
                                ag(this.aj[aj], (this.ao[aj] + i) + 1, (this.aa[aj] + i3) + 1, i9, i10, al, esVar);
                            }
                            ag(this.aj[aj], i + this.ao[aj], i3 + this.aa[aj], i9, i10, ax, esVar);
                            i6 = i;
                        } else {
                            if (al != -1) {
                                ad(this.aj[aj], (this.ao[aj] + i) + 1, (this.aa[aj] + i3) + 1, i9, i10, al, af, esVar);
                            }
                            ad(this.aj[aj], i + this.ao[aj], i3 + this.aa[aj], i9, i10, ax, af, esVar);
                            i6 = i;
                        }
                        int i11 = this.ac[aj];
                        if (am != -1) {
                            esVar.ai(i6, i3 + ((int) (((double) this.ak) * 0.7d)), i11, am, -1077011726);
                        }
                        if (ae != -1) {
                            esVar.ai(i6, (this.ak + i3) + 1, i11, ae, -1814987243);
                        }
                        i = i6 + i11;
                        i6 = aj;
                        i7 = i8;
                    } else {
                        i6 = i5;
                        i7 = i8;
                    }
                }
            }
            i4++;
            i5 = i6;
            i6 = i7;
        }
    }

    void cg(String str, int i, int i2, es esVar) {
        int i3 = i2 - this.ak;
        int i4 = 0;
        int i5 = -1;
        int i6 = -1;
        while (i4 < str.length()) {
            int i7;
            if (str.charAt(i4) == '\u0000') {
                i7 = i6;
                i6 = i5;
            } else {
                int aj = (char) (eb.aj(str.charAt(i4), -140240738) & 255);
                if (aj == '<') {
                    i6 = i5;
                    i7 = i4;
                } else {
                    int i8;
                    if (aj != '>' || i6 == -1) {
                        i8 = i6;
                    } else {
                        String substring = str.substring(i6 + 1, i4);
                        i7 = -1;
                        if (substring.equals("lt")) {
                            aj = '<';
                            i8 = -1;
                        } else if (substring.equals("gt")) {
                            aj = '>';
                            i8 = -1;
                        } else if (substring.startsWith("img=")) {
                            try {
                                fl flVar = ai[fm.ac(substring.substring(4), 287202138)];
                                esVar.au(flVar, i, (this.ak + i3) - flVar.ap, 716658021);
                                i += flVar.ak;
                                i6 = -1;
                            } catch (Exception e) {
                                i6 = i5;
                            }
                        } else {
                            af(substring);
                            i6 = i5;
                        }
                    }
                    if (aj == 160) {
                        aj = 32;
                    }
                    if (i8 == -1) {
                        if (!(this.aw == null || i5 == -1)) {
                            i += this.aw[(i5 << 8) + aj];
                        }
                        int i9 = this.an[aj];
                        int i10 = this.aq[aj];
                        if (aj == 32) {
                            if (au > 0) {
                                av += au;
                                i += av >> 8;
                                av &= 255;
                            }
                            i6 = i;
                        } else if (af >= 255) {
                            if (al != -1) {
                                ag(this.aj[aj], (this.ao[aj] + i) + 1, (this.aa[aj] + i3) + 1, i9, i10, al, esVar);
                            }
                            ag(this.aj[aj], i + this.ao[aj], i3 + this.aa[aj], i9, i10, ax, esVar);
                            i6 = i;
                        } else {
                            if (al != -1) {
                                ad(this.aj[aj], (this.ao[aj] + i) + 1, (this.aa[aj] + i3) + 1, i9, i10, al, af, esVar);
                            }
                            ad(this.aj[aj], i + this.ao[aj], i3 + this.aa[aj], i9, i10, ax, af, esVar);
                            i6 = i;
                        }
                        int i11 = this.ac[aj];
                        if (am != -1) {
                            esVar.ai(i6, i3 + ((int) (((double) this.ak) * 0.7d)), i11, am, -1344489206);
                        }
                        if (ae != -1) {
                            esVar.ai(i6, (this.ak + i3) + 1, i11, ae, -1437863098);
                        }
                        i = i6 + i11;
                        i6 = aj;
                        i7 = i8;
                    } else {
                        i6 = i5;
                        i7 = i8;
                    }
                }
            }
            i4++;
            i5 = i6;
            i6 = i7;
        }
    }

    void cs(String str, int i, int i2, es esVar) {
        int i3 = i2 - this.ak;
        int i4 = 0;
        int i5 = -1;
        int i6 = -1;
        while (i4 < str.length()) {
            int i7;
            if (str.charAt(i4) == '\u0000') {
                i7 = i6;
                i6 = i5;
            } else {
                int aj = (char) (eb.aj(str.charAt(i4), -140240738) & 255);
                if (aj == '<') {
                    i6 = i5;
                    i7 = i4;
                } else {
                    int i8;
                    if (aj != '>' || i6 == -1) {
                        i8 = i6;
                    } else {
                        String substring = str.substring(i6 + 1, i4);
                        i7 = -1;
                        if (substring.equals("lt")) {
                            aj = '<';
                            i8 = -1;
                        } else if (substring.equals("gt")) {
                            aj = '>';
                            i8 = -1;
                        } else if (substring.startsWith("img=")) {
                            try {
                                fl flVar = ai[fm.ac(substring.substring(4), -575803349)];
                                esVar.au(flVar, i, (this.ak + i3) - flVar.ap, -18197110);
                                i += flVar.ak;
                                i6 = -1;
                            } catch (Exception e) {
                                i6 = i5;
                            }
                        } else {
                            af(substring);
                            i6 = i5;
                        }
                    }
                    if (aj == 160) {
                        aj = 32;
                    }
                    if (i8 == -1) {
                        if (!(this.aw == null || i5 == -1)) {
                            i += this.aw[(i5 << 8) + aj];
                        }
                        int i9 = this.an[aj];
                        int i10 = this.aq[aj];
                        if (aj == 32) {
                            if (au > 0) {
                                av += au;
                                i += av >> 8;
                                av &= 255;
                            }
                            i6 = i;
                        } else if (af >= 255) {
                            if (al != -1) {
                                ag(this.aj[aj], (this.ao[aj] + i) + 1, (this.aa[aj] + i3) + 1, i9, i10, al, esVar);
                            }
                            ag(this.aj[aj], i + this.ao[aj], i3 + this.aa[aj], i9, i10, ax, esVar);
                            i6 = i;
                        } else {
                            if (al != -1) {
                                ad(this.aj[aj], (this.ao[aj] + i) + 1, (this.aa[aj] + i3) + 1, i9, i10, al, af, esVar);
                            }
                            ad(this.aj[aj], i + this.ao[aj], i3 + this.aa[aj], i9, i10, ax, af, esVar);
                            i6 = i;
                        }
                        int i11 = this.ac[aj];
                        if (am != -1) {
                            esVar.ai(i6, i3 + ((int) (((double) this.ak) * 0.7d)), i11, am, -1009730088);
                        }
                        if (ae != -1) {
                            esVar.ai(i6, (this.ak + i3) + 1, i11, ae, -1605325313);
                        }
                        i = i6 + i11;
                        i6 = aj;
                        i7 = i8;
                    } else {
                        i6 = i5;
                        i7 = i8;
                    }
                }
            }
            i4++;
            i5 = i6;
            i6 = i7;
        }
    }

    void cu(String str, int i, int i2, es esVar) {
        int i3 = i2 - this.ak;
        int i4 = 0;
        int i5 = -1;
        int i6 = -1;
        while (i4 < str.length()) {
            int i7;
            if (str.charAt(i4) == '\u0000') {
                i7 = i6;
                i6 = i5;
            } else {
                int aj = (char) (eb.aj(str.charAt(i4), -140240738) & -313149585);
                if (aj == '<') {
                    i6 = i5;
                    i7 = i4;
                } else {
                    int i8;
                    if (aj != '>' || i6 == -1) {
                        i8 = i6;
                    } else {
                        String substring = str.substring(i6 + 1, i4);
                        i7 = -1;
                        if (substring.equals("lt")) {
                            aj = '';
                            i8 = -1;
                        } else if (substring.equals("gt")) {
                            aj = 'ꆆ';
                            i8 = -1;
                        } else if (substring.startsWith("img=")) {
                            try {
                                fl flVar = ai[fm.ac(substring.substring(4), 67922928)];
                                esVar.au(flVar, i, (this.ak + i3) - flVar.ap, 273733338);
                                i += flVar.ak;
                                i6 = -1;
                            } catch (Exception e) {
                                i6 = i5;
                            }
                        } else {
                            af(substring);
                            i6 = i5;
                        }
                    }
                    if (aj == 160) {
                        aj = 32;
                    }
                    if (i8 == -1) {
                        if (!(this.aw == null || i5 == -1)) {
                            i += this.aw[(i5 << 8) + aj];
                        }
                        int i9 = this.an[aj];
                        int i10 = this.aq[aj];
                        if (aj == 65620249) {
                            if (au > 0) {
                                av += au;
                                i += av >> 8;
                                av &= -192274816;
                            }
                            i6 = i;
                        } else if (af >= 1430338579) {
                            if (al != -1) {
                                ag(this.aj[aj], (this.ao[aj] + i) + 1, (this.aa[aj] + i3) + 1, i9, i10, al, esVar);
                            }
                            ag(this.aj[aj], i + this.ao[aj], i3 + this.aa[aj], i9, i10, ax, esVar);
                            i6 = i;
                        } else {
                            if (al != -1) {
                                ad(this.aj[aj], (this.ao[aj] + i) + 1, (this.aa[aj] + i3) + 1, i9, i10, al, af, esVar);
                            }
                            ad(this.aj[aj], i + this.ao[aj], i3 + this.aa[aj], i9, i10, ax, af, esVar);
                            i6 = i;
                        }
                        int i11 = this.ac[aj];
                        if (am != -1) {
                            esVar.ai(i6, i3 + ((int) (((double) this.ak) * 0.7d)), i11, am, -1197565921);
                        }
                        if (ae != -1) {
                            esVar.ai(i6, (this.ak + i3) + 1, i11, ae, -2084877117);
                        }
                        i = i6 + i11;
                        i6 = aj;
                        i7 = i8;
                    } else {
                        i6 = i5;
                        i7 = i8;
                    }
                }
            }
            i4++;
            i5 = i6;
            i6 = i7;
        }
    }

    void cx(String str, int i, int i2, es esVar) {
        int i3 = i2 - this.ak;
        int i4 = 0;
        int i5 = -1;
        int i6 = -1;
        while (i4 < str.length()) {
            int i7;
            if (str.charAt(i4) == '\u0000') {
                i7 = i6;
                i6 = i5;
            } else {
                int aj = (char) (eb.aj(str.charAt(i4), -140240738) & 204096672);
                if (aj == '<') {
                    i6 = i5;
                    i7 = i4;
                } else {
                    int i8;
                    if (aj != '>' || i6 == -1) {
                        i8 = i6;
                    } else {
                        String substring = str.substring(i6 + 1, i4);
                        i7 = -1;
                        if (substring.equals("lt")) {
                            aj = '<';
                            i8 = -1;
                        } else if (substring.equals("gt")) {
                            aj = '訹';
                            i8 = -1;
                        } else if (substring.startsWith("img=")) {
                            try {
                                fl flVar = ai[fm.ac(substring.substring(4), 175281890)];
                                esVar.au(flVar, i, (this.ak + i3) - flVar.ap, -385697097);
                                i += flVar.ak;
                                i6 = -1;
                            } catch (Exception e) {
                                i6 = i5;
                            }
                        } else {
                            af(substring);
                            i6 = i5;
                        }
                    }
                    if (aj == 160) {
                        aj = 32;
                    }
                    if (i8 == -1) {
                        if (!(this.aw == null || i5 == -1)) {
                            i += this.aw[(i5 << 8) + aj];
                        }
                        int i9 = this.an[aj];
                        int i10 = this.aq[aj];
                        if (aj == 32) {
                            if (au > 0) {
                                av += au;
                                i += av >> 8;
                                av &= 255;
                            }
                            i6 = i;
                        } else if (af >= 255) {
                            if (al != -1) {
                                ag(this.aj[aj], (this.ao[aj] + i) + 1, (this.aa[aj] + i3) + 1, i9, i10, al, esVar);
                            }
                            ag(this.aj[aj], i + this.ao[aj], i3 + this.aa[aj], i9, i10, ax, esVar);
                            i6 = i;
                        } else {
                            if (al != -1) {
                                ad(this.aj[aj], (this.ao[aj] + i) + 1, (this.aa[aj] + i3) + 1, i9, i10, al, af, esVar);
                            }
                            ad(this.aj[aj], i + this.ao[aj], i3 + this.aa[aj], i9, i10, ax, af, esVar);
                            i6 = i;
                        }
                        int i11 = this.ac[aj];
                        if (am != -1) {
                            esVar.ai(i6, i3 + ((int) (((double) this.ak) * 0.7d)), i11, am, -1647099625);
                        }
                        if (ae != -1) {
                            esVar.ai(i6, (this.ak + i3) + 1, i11, ae, -1017079458);
                        }
                        i = i6 + i11;
                        i6 = aj;
                        i7 = i8;
                    } else {
                        i6 = i5;
                        i7 = i8;
                    }
                }
            }
            i4++;
            i5 = i6;
            i6 = i7;
        }
    }

    void ay(String str, int i, int i2, int[] iArr, int[] iArr2, es esVar) {
        int i3 = i2 - this.ak;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        while (i4 < str.length()) {
            int i8;
            if (str.charAt(i4) == '\u0000') {
                i8 = i7;
                i7 = i6;
                i6 = i5;
            } else {
                int aj = (char) (eb.aj(str.charAt(i4), -140240738) & 255);
                if (aj == '<') {
                    i7 = i6;
                    i8 = i4;
                    i6 = i5;
                } else {
                    int i9;
                    int i10;
                    if (aj != '>' || i7 == -1) {
                        i9 = i7;
                    } else {
                        String substring = str.substring(i7 + 1, i4);
                        i8 = -1;
                        if (substring.equals("lt")) {
                            aj = '<';
                            i9 = -1;
                        } else if (substring.equals("gt")) {
                            aj = '>';
                            i9 = -1;
                        } else if (substring.startsWith("img=")) {
                            if (iArr != null) {
                                try {
                                    i10 = iArr[i5];
                                } catch (Exception e) {
                                    i7 = i6;
                                    i6 = i5;
                                }
                            } else {
                                i10 = 0;
                            }
                            if (iArr2 != null) {
                                i7 = iArr2[i5];
                            } else {
                                i7 = 0;
                            }
                            i5++;
                            fl flVar = ai[fm.ac(substring.substring(4), 322338902)];
                            esVar.au(flVar, i10 + i, i7 + ((this.ak + i3) - flVar.ap), 1604526473);
                            i += flVar.ak;
                            i7 = -1;
                            i6 = i5;
                        } else {
                            af(substring);
                            i7 = i6;
                            i6 = i5;
                        }
                    }
                    if (aj == 160) {
                        aj = 32;
                    }
                    if (i9 == -1) {
                        int i11;
                        int i12;
                        if (!(this.aw == null || i6 == -1)) {
                            i += this.aw[(i6 << 8) + aj];
                        }
                        i10 = this.an[aj];
                        int i13 = this.aq[aj];
                        if (iArr != null) {
                            i11 = iArr[i5];
                        } else {
                            i11 = 0;
                        }
                        if (iArr2 != null) {
                            i12 = iArr2[i5];
                        } else {
                            i12 = 0;
                        }
                        int i14 = i5 + 1;
                        if (aj == 32) {
                            if (au > 0) {
                                av += au;
                                i += av >> 8;
                                av &= 255;
                            }
                            i6 = i;
                        } else if (af >= 255) {
                            if (al != -1) {
                                ag(this.aj[aj], ((this.ao[aj] + i) + 1) + i11, ((this.aa[aj] + i3) + 1) + i12, i10, i13, al, esVar);
                            }
                            ag(this.aj[aj], (this.ao[aj] + i) + i11, (this.aa[aj] + i3) + i12, i10, i13, ax, esVar);
                            i6 = i;
                        } else {
                            if (al != -1) {
                                ad(this.aj[aj], ((this.ao[aj] + i) + 1) + i11, ((this.aa[aj] + i3) + 1) + i12, i10, i13, al, af, esVar);
                            }
                            ad(this.aj[aj], (this.ao[aj] + i) + i11, (this.aa[aj] + i3) + i12, i10, i13, ax, af, esVar);
                            i6 = i;
                        }
                        i8 = this.ac[aj];
                        if (am != -1) {
                            esVar.ai(i6, i3 + ((int) (((double) this.ak) * 0.7d)), i8, am, -1895665788);
                        }
                        if (ae != -1) {
                            esVar.ai(i6, i3 + this.ak, i8, ae, -1138674433);
                        }
                        i = i6 + i8;
                        i6 = i14;
                        i7 = aj;
                        i8 = i9;
                    } else {
                        i7 = i6;
                        i8 = i9;
                        i6 = i5;
                    }
                }
            }
            i4++;
            i5 = i6;
            i6 = i7;
            i7 = i8;
        }
    }

    void cd(String str, int i, int i2, int[] iArr, int[] iArr2, es esVar) {
        int i3 = i2 - this.ak;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        while (i4 < str.length()) {
            int i8;
            if (str.charAt(i4) == '\u0000') {
                i8 = i7;
                i7 = i6;
                i6 = i5;
            } else {
                int aj = (char) (eb.aj(str.charAt(i4), -140240738) & 255);
                if (aj == '<') {
                    i7 = i6;
                    i8 = i4;
                    i6 = i5;
                } else {
                    int i9;
                    int i10;
                    if (aj != '蝈' || i7 == -1) {
                        i9 = i7;
                    } else {
                        String substring = str.substring(i7 + 1, i4);
                        i8 = -1;
                        if (substring.equals("lt")) {
                            aj = '<';
                            i9 = -1;
                        } else if (substring.equals("gt")) {
                            aj = '鋰';
                            i9 = -1;
                        } else if (substring.startsWith("img=")) {
                            if (iArr != null) {
                                try {
                                    i10 = iArr[i5];
                                } catch (Exception e) {
                                    i7 = i6;
                                    i6 = i5;
                                }
                            } else {
                                i10 = 0;
                            }
                            if (iArr2 != null) {
                                i7 = iArr2[i5];
                            } else {
                                i7 = 0;
                            }
                            i5++;
                            fl flVar = ai[fm.ac(substring.substring(4), -1470051789)];
                            esVar.au(flVar, i10 + i, i7 + ((this.ak + i3) - flVar.ap), -50068600);
                            i += flVar.ak;
                            i7 = -1;
                            i6 = i5;
                        } else {
                            af(substring);
                            i7 = i6;
                            i6 = i5;
                        }
                    }
                    if (aj == 160) {
                        aj = 32;
                    }
                    if (i9 == -1) {
                        int i11;
                        int i12;
                        if (!(this.aw == null || i6 == -1)) {
                            i += this.aw[(i6 << 8) + aj];
                        }
                        i10 = this.an[aj];
                        int i13 = this.aq[aj];
                        if (iArr != null) {
                            i11 = iArr[i5];
                        } else {
                            i11 = 0;
                        }
                        if (iArr2 != null) {
                            i12 = iArr2[i5];
                        } else {
                            i12 = 0;
                        }
                        int i14 = i5 + 1;
                        if (aj == 32) {
                            if (au > 0) {
                                av += au;
                                i += av >> 8;
                                av &= 255;
                            }
                            i6 = i;
                        } else if (af >= 255) {
                            if (al != -1) {
                                ag(this.aj[aj], ((this.ao[aj] + i) + 1) + i11, ((this.aa[aj] + i3) + 1) + i12, i10, i13, al, esVar);
                            }
                            ag(this.aj[aj], (this.ao[aj] + i) + i11, (this.aa[aj] + i3) + i12, i10, i13, ax, esVar);
                            i6 = i;
                        } else {
                            if (al != -1) {
                                ad(this.aj[aj], ((this.ao[aj] + i) + 1) + i11, ((this.aa[aj] + i3) + 1) + i12, i10, i13, al, af, esVar);
                            }
                            ad(this.aj[aj], (this.ao[aj] + i) + i11, (this.aa[aj] + i3) + i12, i10, i13, ax, af, esVar);
                            i6 = i;
                        }
                        i8 = this.ac[aj];
                        if (am != -1) {
                            esVar.ai(i6, i3 + ((int) (((double) this.ak) * 0.7d)), i8, am, -1710347500);
                        }
                        if (ae != -1) {
                            esVar.ai(i6, i3 + this.ak, i8, ae, -1939697889);
                        }
                        i = i6 + i8;
                        i6 = i14;
                        i7 = aj;
                        i8 = i9;
                    } else {
                        i7 = i6;
                        i8 = i9;
                        i6 = i5;
                    }
                }
            }
            i4++;
            i5 = i6;
            i6 = i7;
            i7 = i8;
        }
    }

    void cw(String str, int i, int i2, int[] iArr, int[] iArr2, es esVar) {
        int i3 = i2 - this.ak;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        while (i4 < str.length()) {
            int i8;
            if (str.charAt(i4) == '\u0000') {
                i8 = i7;
                i7 = i6;
                i6 = i5;
            } else {
                int aj = (char) (eb.aj(str.charAt(i4), -140240738) & 255);
                if (aj == '<') {
                    i7 = i6;
                    i8 = i4;
                    i6 = i5;
                } else {
                    int i9;
                    int i10;
                    if (aj != '>' || i7 == -1) {
                        i9 = i7;
                    } else {
                        String substring = str.substring(i7 + 1, i4);
                        i8 = -1;
                        if (substring.equals("lt")) {
                            aj = '<';
                            i9 = -1;
                        } else if (substring.equals("gt")) {
                            aj = '>';
                            i9 = -1;
                        } else if (substring.startsWith("img=")) {
                            if (iArr != null) {
                                try {
                                    i10 = iArr[i5];
                                } catch (Exception e) {
                                    i7 = i6;
                                    i6 = i5;
                                }
                            } else {
                                i10 = 0;
                            }
                            if (iArr2 != null) {
                                i7 = iArr2[i5];
                            } else {
                                i7 = 0;
                            }
                            i5++;
                            fl flVar = ai[fm.ac(substring.substring(4), -1491261809)];
                            esVar.au(flVar, i10 + i, i7 + ((this.ak + i3) - flVar.ap), 1955890054);
                            i += flVar.ak;
                            i7 = -1;
                            i6 = i5;
                        } else {
                            af(substring);
                            i7 = i6;
                            i6 = i5;
                        }
                    }
                    if (aj == 160) {
                        aj = 32;
                    }
                    if (i9 == -1) {
                        int i11;
                        int i12;
                        if (!(this.aw == null || i6 == -1)) {
                            i += this.aw[(i6 << 8) + aj];
                        }
                        i10 = this.an[aj];
                        int i13 = this.aq[aj];
                        if (iArr != null) {
                            i11 = iArr[i5];
                        } else {
                            i11 = 0;
                        }
                        if (iArr2 != null) {
                            i12 = iArr2[i5];
                        } else {
                            i12 = 0;
                        }
                        int i14 = i5 + 1;
                        if (aj == 32) {
                            if (au > 0) {
                                av += au;
                                i += av >> 8;
                                av &= 255;
                            }
                            i6 = i;
                        } else if (af >= 255) {
                            if (al != -1) {
                                ag(this.aj[aj], ((this.ao[aj] + i) + 1) + i11, ((this.aa[aj] + i3) + 1) + i12, i10, i13, al, esVar);
                            }
                            ag(this.aj[aj], (this.ao[aj] + i) + i11, (this.aa[aj] + i3) + i12, i10, i13, ax, esVar);
                            i6 = i;
                        } else {
                            if (al != -1) {
                                ad(this.aj[aj], ((this.ao[aj] + i) + 1) + i11, ((this.aa[aj] + i3) + 1) + i12, i10, i13, al, af, esVar);
                            }
                            ad(this.aj[aj], (this.ao[aj] + i) + i11, (this.aa[aj] + i3) + i12, i10, i13, ax, af, esVar);
                            i6 = i;
                        }
                        i8 = this.ac[aj];
                        if (am != -1) {
                            esVar.ai(i6, i3 + ((int) (((double) this.ak) * 0.7d)), i8, am, -1529020138);
                        }
                        if (ae != -1) {
                            esVar.ai(i6, i3 + this.ak, i8, ae, -2107658594);
                        }
                        i = i6 + i8;
                        i6 = i14;
                        i7 = aj;
                        i8 = i9;
                    } else {
                        i7 = i6;
                        i8 = i9;
                        i6 = i5;
                    }
                }
            }
            i4++;
            i5 = i6;
            i6 = i7;
            i7 = i8;
        }
    }

    void ag(byte[] bArr, int i, int i2, int i3, int i4, int i5, es esVar) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i + ((esVar.ac * 1075116703) * i2);
        int i11 = (esVar.ac * 1075116703) - i3;
        int i12 = 0;
        if (i2 < esVar.aq * -1857728003) {
            int i13 = (esVar.aq * -1857728003) - i2;
            i4 -= i13;
            i2 = esVar.aq * -1857728003;
            i12 = 0 + (i13 * i3);
            i10 += i13 * (esVar.ac * 1075116703);
        }
        if (i2 + i4 > esVar.ao * -90244733) {
            i6 = i4 - ((i2 + i4) - (esVar.ao * -90244733));
        } else {
            i6 = i4;
        }
        if (i < esVar.aa * 889727047) {
            int i14 = (esVar.aa * 889727047) - i;
            i3 -= i14;
            i = esVar.aa * 889727047;
            i13 = i12 + i14;
            i7 = i10 + i14;
            i12 = 0 + i14;
            i10 = i11 + i14;
        } else {
            i13 = i12;
            i7 = i10;
            i10 = i11;
            i12 = 0;
        }
        if (i + i3 > esVar.ak * 579810681) {
            int i15 = (i + i3) - (esVar.ak * 579810681);
            i14 = i3 - i15;
            i8 = i12 + i15;
            i9 = i10 + i15;
        } else {
            i8 = i12;
            i9 = i10;
            i14 = i3;
        }
        if (i14 > 0 && i6 > 0) {
            ar(esVar.aj, bArr, i5, i13, i7, i14, i6, i9, i8);
        }
    }

    void cj(byte[] bArr, int i, int i2, int i3, int i4, int i5, es esVar) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i + ((esVar.ac * 1312260752) * i2);
        int i11 = (esVar.ac * 1077958982) - i3;
        int i12 = 0;
        if (i2 < esVar.aq * 505265) {
            int i13 = (esVar.aq * 270321222) - i2;
            i4 -= i13;
            i2 = esVar.aq * 297033898;
            i12 = 0 + (i13 * i3);
            i10 += i13 * (esVar.ac * 765516696);
        }
        if (i2 + i4 > esVar.ao * -1836308462) {
            i6 = i4 - ((i2 + i4) - (esVar.ao * -274666013));
        } else {
            i6 = i4;
        }
        if (i < esVar.aa * -458139985) {
            int i14 = (esVar.aa * -490092936) - i;
            i3 -= i14;
            i = esVar.aa * 889727047;
            i13 = i12 + i14;
            i7 = i10 + i14;
            i12 = 0 + i14;
            i10 = i11 + i14;
        } else {
            i13 = i12;
            i7 = i10;
            i10 = i11;
            i12 = 0;
        }
        if (i + i3 > esVar.ak * 579810681) {
            int i15 = (i + i3) - (esVar.ak * 579810681);
            i14 = i3 - i15;
            i8 = i12 + i15;
            i9 = i10 + i15;
        } else {
            i8 = i12;
            i9 = i10;
            i14 = i3;
        }
        if (i14 > 0 && i6 > 0) {
            ar(esVar.aj, bArr, i5, i13, i7, i14, i6, i9, i8);
        }
    }

    void cn(byte[] bArr, int i, int i2, int i3, int i4, int i5, es esVar) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i + ((esVar.ac * 1123025611) * i2);
        int i11 = (esVar.ac * 1075116703) - i3;
        int i12 = 0;
        if (i2 < esVar.aq * -1857728003) {
            int i13 = (esVar.aq * 134856277) - i2;
            i4 -= i13;
            i2 = esVar.aq * -1857728003;
            i12 = 0 + (i13 * i3);
            i10 += i13 * (esVar.ac * 1075116703);
        }
        if (i2 + i4 > esVar.ao * -90244733) {
            i6 = i4 - ((i2 + i4) - (esVar.ao * -740057631));
        } else {
            i6 = i4;
        }
        if (i < esVar.aa * 889727047) {
            int i14 = (esVar.aa * -825909223) - i;
            i3 -= i14;
            i = esVar.aa * 1326131337;
            i13 = i12 + i14;
            i7 = i10 + i14;
            i12 = 0 + i14;
            i10 = i11 + i14;
        } else {
            i13 = i12;
            i7 = i10;
            i10 = i11;
            i12 = 0;
        }
        if (i + i3 > esVar.ak * 1473348510) {
            int i15 = (i + i3) - (esVar.ak * 579810681);
            i14 = i3 - i15;
            i8 = i12 + i15;
            i9 = i10 + i15;
        } else {
            i8 = i12;
            i9 = i10;
            i14 = i3;
        }
        if (i14 > 0 && i6 > 0) {
            ar(esVar.aj, bArr, i5, i13, i7, i14, i6, i9, i8);
        }
    }

    void cz(byte[] bArr, int i, int i2, int i3, int i4, int i5, es esVar) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i + ((esVar.ac * 1075116703) * i2);
        int i11 = (esVar.ac * 1075116703) - i3;
        int i12 = 0;
        if (i2 < esVar.aq * 1343110156) {
            int i13 = (esVar.aq * -1857728003) - i2;
            i4 -= i13;
            i2 = esVar.aq * -1857728003;
            i12 = 0 + (i13 * i3);
            i10 += i13 * (esVar.ac * 80680151);
        }
        if (i2 + i4 > esVar.ao * -90244733) {
            i6 = i4 - ((i2 + i4) - (esVar.ao * -90244733));
        } else {
            i6 = i4;
        }
        if (i < esVar.aa * 889727047) {
            int i14 = (esVar.aa * 889727047) - i;
            i3 -= i14;
            i = esVar.aa * 361967243;
            i13 = i12 + i14;
            i7 = i10 + i14;
            i12 = 0 + i14;
            i10 = i11 + i14;
        } else {
            i13 = i12;
            i7 = i10;
            i10 = i11;
            i12 = 0;
        }
        if (i + i3 > esVar.ak * -1684164275) {
            int i15 = (i + i3) - (esVar.ak * 579810681);
            i14 = i3 - i15;
            i8 = i12 + i15;
            i9 = i10 + i15;
        } else {
            i8 = i12;
            i9 = i10;
            i14 = i3;
        }
        if (i14 > 0 && i6 > 0) {
            ar(esVar.aj, bArr, i5, i13, i7, i14, i6, i9, i8);
        }
    }

    void ar(int[] iArr, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = -(i4 >> 2);
        int i9 = -(i4 & 3);
        int i10 = i | -16777216;
        int i11 = -i5;
        int i12 = i3;
        int i13 = i2;
        while (i11 < 0) {
            int i14 = i8;
            while (i14 < 0) {
                int i15 = i13 + 1;
                if (bArr[i13] != (byte) 0) {
                    i13 = i12 + 1;
                    iArr[i12] = i10;
                } else {
                    i13 = i12 + 1;
                }
                int i16 = i15 + 1;
                if (bArr[i15] != (byte) 0) {
                    i12 = i13 + 1;
                    iArr[i13] = i10;
                    i13 = i12;
                } else {
                    i13++;
                }
                int i17 = i16 + 1;
                if (bArr[i16] != (byte) 0) {
                    i12 = i13 + 1;
                    iArr[i13] = i10;
                    i13 = i12;
                } else {
                    i13++;
                }
                i15 = i17 + 1;
                if (bArr[i17] != (byte) 0) {
                    i12 = i13 + 1;
                    iArr[i13] = i10;
                    i13 = i12;
                } else {
                    i13++;
                }
                i14++;
                i12 = i13;
                i13 = i15;
            }
            i14 = i12;
            i12 = i9;
            while (i12 < 0) {
                i15 = i13 + 1;
                if (bArr[i13] != (byte) 0) {
                    i13 = i14 + 1;
                    iArr[i14] = i10;
                } else {
                    i13 = i14 + 1;
                }
                i12++;
                i14 = i13;
                i13 = i15;
            }
            i12 = i14 + i6;
            i11++;
            i13 += i7;
        }
    }

    void dj(int[] iArr, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = -(i4 >> 2);
        int i9 = -(i4 & 3);
        int i10 = i | 642116615;
        int i11 = -i5;
        int i12 = i3;
        int i13 = i2;
        while (i11 < 0) {
            int i14 = i8;
            while (i14 < 0) {
                int i15 = i13 + 1;
                if (bArr[i13] != (byte) 0) {
                    i13 = i12 + 1;
                    iArr[i12] = i10;
                } else {
                    i13 = i12 + 1;
                }
                int i16 = i15 + 1;
                if (bArr[i15] != (byte) 0) {
                    i12 = i13 + 1;
                    iArr[i13] = i10;
                    i13 = i12;
                } else {
                    i13++;
                }
                int i17 = i16 + 1;
                if (bArr[i16] != (byte) 0) {
                    i12 = i13 + 1;
                    iArr[i13] = i10;
                    i13 = i12;
                } else {
                    i13++;
                }
                i15 = i17 + 1;
                if (bArr[i17] != (byte) 0) {
                    i12 = i13 + 1;
                    iArr[i13] = i10;
                    i13 = i12;
                } else {
                    i13++;
                }
                i14++;
                i12 = i13;
                i13 = i15;
            }
            i14 = i12;
            i12 = i9;
            while (i12 < 0) {
                i15 = i13 + 1;
                if (bArr[i13] != (byte) 0) {
                    i13 = i14 + 1;
                    iArr[i14] = i10;
                } else {
                    i13 = i14 + 1;
                }
                i12++;
                i14 = i13;
                i13 = i15;
            }
            i12 = i14 + i6;
            i11++;
            i13 += i7;
        }
    }

    void do(int[] iArr, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = -(i4 >> 2);
        int i9 = -(i4 & 3);
        int i10 = i | -16777216;
        int i11 = -i5;
        int i12 = i3;
        int i13 = i2;
        while (i11 < 0) {
            int i14 = i8;
            while (i14 < 0) {
                int i15 = i13 + 1;
                if (bArr[i13] != (byte) 0) {
                    i13 = i12 + 1;
                    iArr[i12] = i10;
                } else {
                    i13 = i12 + 1;
                }
                int i16 = i15 + 1;
                if (bArr[i15] != (byte) 0) {
                    i12 = i13 + 1;
                    iArr[i13] = i10;
                    i13 = i12;
                } else {
                    i13++;
                }
                int i17 = i16 + 1;
                if (bArr[i16] != (byte) 0) {
                    i12 = i13 + 1;
                    iArr[i13] = i10;
                    i13 = i12;
                } else {
                    i13++;
                }
                i15 = i17 + 1;
                if (bArr[i17] != (byte) 0) {
                    i12 = i13 + 1;
                    iArr[i13] = i10;
                    i13 = i12;
                } else {
                    i13++;
                }
                i14++;
                i12 = i13;
                i13 = i15;
            }
            i14 = i12;
            i12 = i9;
            while (i12 < 0) {
                i15 = i13 + 1;
                if (bArr[i13] != (byte) 0) {
                    i13 = i14 + 1;
                    iArr[i14] = i10;
                } else {
                    i13 = i14 + 1;
                }
                i12++;
                i14 = i13;
                i13 = i15;
            }
            i12 = i14 + i6;
            i11++;
            i13 += i7;
        }
    }

    void ad(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, es esVar) {
        if (i6 >= 255) {
            ag(bArr, i, i2, i3, i4, i5, esVar);
            return;
        }
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = i + ((esVar.ac * 1075116703) * i2);
        int i12 = (esVar.ac * 1075116703) - i3;
        int i13 = 0;
        if (i2 < esVar.aq * -1857728003) {
            int i14 = (esVar.aq * -1857728003) - i2;
            i4 -= i14;
            i2 = esVar.aq * -1857728003;
            i13 = 0 + (i14 * i3);
            i11 += i14 * (esVar.ac * 1075116703);
        }
        if (i2 + i4 > esVar.ao * -90244733) {
            i7 = i4 - ((i2 + i4) - (esVar.ao * -90244733));
        } else {
            i7 = i4;
        }
        if (i < esVar.aa * 889727047) {
            int i15 = (esVar.aa * 889727047) - i;
            i3 -= i15;
            i = esVar.aa * 889727047;
            i14 = i13 + i15;
            i8 = i11 + i15;
            i13 = 0 + i15;
            i11 = i12 + i15;
        } else {
            i14 = i13;
            i8 = i11;
            i11 = i12;
            i13 = 0;
        }
        if (i + i3 > esVar.ak * 579810681) {
            int i16 = (i + i3) - (esVar.ak * 579810681);
            i15 = i3 - i16;
            i9 = i13 + i16;
            i10 = i11 + i16;
        } else {
            i9 = i13;
            i10 = i11;
            i15 = i3;
        }
        if (i15 > 0 && i7 > 0) {
            ab(esVar.aj, bArr, i5, i14, i8, i15, i7, i10, i9, i6);
        }
    }

    void dm(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, es esVar) {
        if (i6 >= 255) {
            ag(bArr, i, i2, i3, i4, i5, esVar);
            return;
        }
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = i + ((esVar.ac * 1031019012) * i2);
        int i12 = (esVar.ac * 2147158409) - i3;
        int i13 = 0;
        if (i2 < esVar.aq * -1857728003) {
            int i14 = (esVar.aq * -1295740817) - i2;
            i4 -= i14;
            i2 = esVar.aq * -1857728003;
            i13 = 0 + (i14 * i3);
            i11 += i14 * (esVar.ac * 1623206970);
        }
        if (i2 + i4 > esVar.ao * -90244733) {
            i7 = i4 - ((i2 + i4) - (esVar.ao * -1111543946));
        } else {
            i7 = i4;
        }
        if (i < esVar.aa * 1877928327) {
            int i15 = (esVar.aa * -1704502434) - i;
            i3 -= i15;
            i = esVar.aa * 2074254844;
            i14 = i13 + i15;
            i8 = i11 + i15;
            i13 = 0 + i15;
            i11 = i12 + i15;
        } else {
            i14 = i13;
            i8 = i11;
            i11 = i12;
            i13 = 0;
        }
        if (i + i3 > esVar.ak * 579810681) {
            int i16 = (i + i3) - (esVar.ak * 579810681);
            i15 = i3 - i16;
            i9 = i13 + i16;
            i10 = i11 + i16;
        } else {
            i9 = i13;
            i10 = i11;
            i15 = i3;
        }
        if (i15 > 0 && i7 > 0) {
            ab(esVar.aj, bArr, i5, i14, i8, i15, i7, i10, i9, i6);
        }
    }

    void du(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, es esVar) {
        if (i6 >= 255) {
            ag(bArr, i, i2, i3, i4, i5, esVar);
            return;
        }
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = i + ((esVar.ac * 1075116703) * i2);
        int i12 = (esVar.ac * 1075116703) - i3;
        int i13 = 0;
        if (i2 < esVar.aq * -1857728003) {
            int i14 = (esVar.aq * -1857728003) - i2;
            i4 -= i14;
            i2 = esVar.aq * -1857728003;
            i13 = 0 + (i14 * i3);
            i11 += i14 * (esVar.ac * 1075116703);
        }
        if (i2 + i4 > esVar.ao * -90244733) {
            i7 = i4 - ((i2 + i4) - (esVar.ao * -90244733));
        } else {
            i7 = i4;
        }
        if (i < esVar.aa * 889727047) {
            int i15 = (esVar.aa * 889727047) - i;
            i3 -= i15;
            i = esVar.aa * 889727047;
            i14 = i13 + i15;
            i8 = i11 + i15;
            i13 = 0 + i15;
            i11 = i12 + i15;
        } else {
            i14 = i13;
            i8 = i11;
            i11 = i12;
            i13 = 0;
        }
        if (i + i3 > esVar.ak * 579810681) {
            int i16 = (i + i3) - (esVar.ak * 579810681);
            i15 = i3 - i16;
            i9 = i13 + i16;
            i10 = i11 + i16;
        } else {
            i9 = i13;
            i10 = i11;
            i15 = i3;
        }
        if (i15 > 0 && i7 > 0) {
            ab(esVar.aj, bArr, i5, i14, i8, i15, i7, i10, i9, i6);
        }
    }

    void dz(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, es esVar) {
        if (i6 >= 255) {
            ag(bArr, i, i2, i3, i4, i5, esVar);
            return;
        }
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = i + ((esVar.ac * 1075116703) * i2);
        int i12 = (esVar.ac * 1075116703) - i3;
        int i13 = 0;
        if (i2 < esVar.aq * -1857728003) {
            int i14 = (esVar.aq * -1857728003) - i2;
            i4 -= i14;
            i2 = esVar.aq * -1857728003;
            i13 = 0 + (i14 * i3);
            i11 += i14 * (esVar.ac * 1075116703);
        }
        if (i2 + i4 > esVar.ao * -90244733) {
            i7 = i4 - ((i2 + i4) - (esVar.ao * -90244733));
        } else {
            i7 = i4;
        }
        if (i < esVar.aa * 889727047) {
            int i15 = (esVar.aa * 889727047) - i;
            i3 -= i15;
            i = esVar.aa * 889727047;
            i14 = i13 + i15;
            i8 = i11 + i15;
            i13 = 0 + i15;
            i11 = i12 + i15;
        } else {
            i14 = i13;
            i8 = i11;
            i11 = i12;
            i13 = 0;
        }
        if (i + i3 > esVar.ak * 579810681) {
            int i16 = (i + i3) - (esVar.ak * 579810681);
            i15 = i3 - i16;
            i9 = i13 + i16;
            i10 = i11 + i16;
        } else {
            i9 = i13;
            i10 = i11;
            i15 = i3;
        }
        if (i15 > 0 && i7 > 0) {
            ab(esVar.aj, bArr, i5, i14, i8, i15, i7, i10, i9, i6);
        }
    }

    void ab(int[] iArr, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = (i8 << 24) | i;
        int i10 = ((((16711935 & i) * i8) & -16711936) + (((65280 & i) * i8) & 16711680)) >> 8;
        int i11 = 255 - i8;
        int i12 = i3;
        int i13 = i2;
        for (int i14 = -i5; i14 < 0; i14++) {
            int i15 = i13;
            i13 = i12;
            i12 = -i4;
            while (i12 < 0) {
                int i16 = i15 + 1;
                if (bArr[i15] != (byte) 0) {
                    int i17 = iArr[i13];
                    if (i17 == 0) {
                        i15 = i13 + 1;
                        iArr[i13] = i9;
                    } else {
                        int max = Math.max(i17 >>> 24, i8);
                        i15 = i13 + 1;
                        iArr[i13] = ((((((i17 & 65280) * i11) & 16711680) + (((16711935 & i17) * i11) & -16711936)) >> 8) + i10) | (max << 24);
                    }
                } else {
                    i15 = i13 + 1;
                }
                i12++;
                i13 = i15;
                i15 = i16;
            }
            i12 = i13 + i6;
            i13 = i15 + i7;
        }
    }

    void dg(int[] iArr, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = (i8 << 24) | i;
        int i10 = ((((-350140624 & i) * i8) & -458449555) + (((-695755281 & i) * i8) & 16711680)) >> 8;
        int i11 = 255 - i8;
        int i12 = i3;
        int i13 = i2;
        for (int i14 = -i5; i14 < 0; i14++) {
            int i15 = i13;
            i13 = i12;
            i12 = -i4;
            while (i12 < 0) {
                int i16 = i15 + 1;
                if (bArr[i15] != (byte) 0) {
                    int i17 = iArr[i13];
                    if (i17 == 0) {
                        i15 = i13 + 1;
                        iArr[i13] = i9;
                    } else {
                        int max = Math.max(i17 >>> 24, i8);
                        i15 = i13 + 1;
                        iArr[i13] = ((((((i17 & 65280) * i11) & -649930328) + (((-198006889 & i17) * i11) & -16711936)) >> 8) + i10) | (max << 24);
                    }
                } else {
                    i15 = i13 + 1;
                }
                i12++;
                i13 = i15;
                i15 = i16;
            }
            i12 = i13 + i6;
            i13 = i15 + i7;
        }
    }

    void dn(int[] iArr, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = (i8 << 24) | i;
        int i10 = ((((16711935 & i) * i8) & -16711936) + (((65280 & i) * i8) & 16711680)) >> 8;
        int i11 = 255 - i8;
        int i12 = i3;
        int i13 = i2;
        for (int i14 = -i5; i14 < 0; i14++) {
            int i15 = i13;
            i13 = i12;
            i12 = -i4;
            while (i12 < 0) {
                int i16 = i15 + 1;
                if (bArr[i15] != (byte) 0) {
                    int i17 = iArr[i13];
                    if (i17 == 0) {
                        i15 = i13 + 1;
                        iArr[i13] = i9;
                    } else {
                        int max = Math.max(i17 >>> 24, i8);
                        i15 = i13 + 1;
                        iArr[i13] = ((((((i17 & 65280) * i11) & 16711680) + (((16711935 & i17) * i11) & -16711936)) >> 8) + i10) | (max << 24);
                    }
                } else {
                    i15 = i13 + 1;
                }
                i12++;
                i13 = i15;
                i15 = i16;
            }
            i12 = i13 + i6;
            i13 = i15 + i7;
        }
    }
}
