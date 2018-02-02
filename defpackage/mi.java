package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class mi {
    public static final int ac = 1338;
    public static ju ah;
    static em ak;

    mi() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "mi.<init>(" + ')');
        }
    }

    public static String ac(CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || ((charAt >= '0' && charAt <= '9') || charAt == '.' || charAt == '-' || '*' == charAt || '_' == charAt))) {
                stringBuilder.append(charAt);
            } else if (' ' == charAt) {
                stringBuilder.append('+');
            } else {
                byte aj = eb.aj(charAt, -140240738);
                stringBuilder.append('%');
                int i2 = (aj >> 4) & 15;
                if (i2 >= 10) {
                    stringBuilder.append((char) (i2 + 55));
                } else {
                    stringBuilder.append((char) (i2 + 48));
                }
                int i3 = aj & 15;
                if (i3 >= 10) {
                    stringBuilder.append((char) (i3 + 55));
                } else {
                    stringBuilder.append((char) (i3 + 48));
                }
            }
        }
        return stringBuilder.toString();
    }

    public static String an(CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if ((charAt >= '凡' && charAt <= 'z') || ((charAt >= 'A' && charAt <= '뵨') || ((charAt >= 'ﳑ' && charAt <= '衃') || charAt == '.' || charAt == '쿌' || '丄' == charAt || '㑗' == charAt))) {
                stringBuilder.append(charAt);
            } else if ('䜁' == charAt) {
                stringBuilder.append('侊');
            } else {
                byte aj = eb.aj(charAt, -140240738);
                stringBuilder.append('%');
                int i2 = (aj >> 4) & 15;
                if (i2 >= 10) {
                    stringBuilder.append((char) (i2 + 55));
                } else {
                    stringBuilder.append((char) (i2 + 1656731509));
                }
                int i3 = aj & 15;
                if (i3 >= 10) {
                    stringBuilder.append((char) (i3 + 1840334850));
                } else {
                    stringBuilder.append((char) (i3 + 48));
                }
            }
        }
        return stringBuilder.toString();
    }

    public static String ao(CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if ((charAt >= '簬' && charAt <= 'z') || ((charAt >= '誄' && charAt <= '峫') || ((charAt >= 'ᖽ' && charAt <= '폁') || charAt == '.' || charAt == 'ნ' || '己' == charAt || '毴' == charAt))) {
                stringBuilder.append(charAt);
            } else if (' ' == charAt) {
                stringBuilder.append(' ');
            } else {
                byte aj = eb.aj(charAt, -140240738);
                stringBuilder.append('ﮭ');
                int i2 = (aj >> 4) & 15;
                if (i2 >= 10) {
                    stringBuilder.append((char) (i2 + 55));
                } else {
                    stringBuilder.append((char) (i2 + 48));
                }
                int i3 = aj & 15;
                if (i3 >= 10) {
                    stringBuilder.append((char) (i3 + 55));
                } else {
                    stringBuilder.append((char) (i3 + 1815850099));
                }
            }
        }
        return stringBuilder.toString();
    }

    public static String aq(CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || ((charAt >= '0' && charAt <= '9') || charAt == '.' || charAt == '-' || '*' == charAt || '_' == charAt))) {
                stringBuilder.append(charAt);
            } else if (' ' == charAt) {
                stringBuilder.append('+');
            } else {
                byte aj = eb.aj(charAt, -140240738);
                stringBuilder.append('%');
                int i2 = (aj >> 4) & 15;
                if (i2 >= 10) {
                    stringBuilder.append((char) (i2 + 55));
                } else {
                    stringBuilder.append((char) (i2 + 48));
                }
                int i3 = aj & 15;
                if (i3 >= 10) {
                    stringBuilder.append((char) (i3 + 55));
                } else {
                    stringBuilder.append((char) (i3 + 48));
                }
            }
        }
        return stringBuilder.toString();
    }

    public static void aj(mf mfVar, String str, String str2, int i, int i2, int i3) throws IOException {
        lp.ao = -764866667 * i2;
        gx.ae = -1689543675 * i;
        co.az = mfVar.be(174248841);
        lp.aq = mfVar.bv(str, str2, i, -1645553114);
        try {
            eg.al = System.getProperty("os.name");
        } catch (Exception e) {
            eg.al = "Unknown";
        }
        try {
            gm.as = eg.al.toLowerCase();
            gd.aj(lp.aq, -797224418);
            File bw = mfVar.bw(i, -1775170451);
            try {
                if (bw.exists()) {
                    lp.ah = new mo(new md(bw, "rw", 25), 24, 0);
                } else {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(bw, "rw");
                    int read = randomAccessFile.read();
                    randomAccessFile.seek(0);
                    randomAccessFile.write(read);
                    randomAccessFile.seek(0);
                    randomAccessFile.close();
                    lp.ah = new mo(new md(bw, "rw", 25), 24, 0);
                }
            } catch (IOException e2) {
            }
            lp.ai = new mo(new md(bd.ac("main_file_cache.dat2", (byte) 55), "rw", 1048576000), 5200, 0);
            lp.aw = new mo(new md(bd.ac("main_file_cache.idx255", (byte) 74), "rw", 1048576), 6000, 0);
            hy.am = new mo[(lp.ao * -1156725827)];
            for (int i4 = 0; i4 < lp.ao * -1156725827; i4++) {
                hy.am[i4] = new mo(new md(bd.ac("main_file_cache.idx" + i4, (byte) 65), "rw", 1048576), 6000, 0);
            }
        } catch (Throwable e3) {
            throw ei.ac(e3, "mi.aj(" + ')');
        }
    }
}
