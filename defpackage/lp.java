package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class lp {
    static final String aa = "main_file_cache.dat2";
    public static mo ah = null;
    public static mo ai = null;
    static final int aj = 1048576000;
    static final String ak = "main_file_cache.idx";
    static final String an = "rw";
    public static int ao = 0;
    static File aq = null;
    public static final int at = 24;
    public static mo aw = null;

    lp() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "lp.<init>(" + ')');
        }
    }

    public static void aa(mf mfVar, String str, String str2, int i, int i2) throws IOException {
        ao = -764866667 * i2;
        gx.ae = -1689543675 * i;
        co.az = mfVar.be(174248841);
        aq = mfVar.bv(str, str2, i, -1645553114);
        try {
            eg.al = System.getProperty("os.name");
        } catch (Exception e) {
            eg.al = "Unknown";
        }
        gm.as = eg.al.toLowerCase();
        gd.aj(aq, 553710697);
        File bw = mfVar.bw(i, -1775170451);
        try {
            if (bw.exists()) {
                ah = new mo(new md(bw, an, 25), 24, 0);
            } else {
                RandomAccessFile randomAccessFile = new RandomAccessFile(bw, an);
                int read = randomAccessFile.read();
                randomAccessFile.seek(0);
                randomAccessFile.write(read);
                randomAccessFile.seek(0);
                randomAccessFile.close();
                ah = new mo(new md(bw, an, 25), 24, 0);
            }
        } catch (IOException e2) {
        }
        ai = new mo(new md(bd.ac(aa, (byte) 91), an, 1048576000), 5200, 0);
        aw = new mo(new md(bd.ac("main_file_cache.idx255", (byte) 117), an, 1048576), 6000, 0);
        hy.am = new mo[(-1156725827 * ao)];
        for (int i3 = 0; i3 < -1156725827 * ao; i3++) {
            hy.am[i3] = new mo(new md(bd.ac(ak + i3, (byte) 38), an, 1048576), 6000, 0);
        }
    }

    public static void ao(mf mfVar, String str, String str2, int i, int i2) throws IOException {
        ao = -764866667 * i2;
        gx.ae = -1689543675 * i;
        co.az = mfVar.be(174248841);
        aq = mfVar.bv(str, str2, i, -1645553114);
        try {
            eg.al = System.getProperty("os.name");
        } catch (Exception e) {
            eg.al = "Unknown";
        }
        gm.as = eg.al.toLowerCase();
        gd.aj(aq, -172274203);
        File bw = mfVar.bw(i, -1775170451);
        try {
            if (bw.exists()) {
                ah = new mo(new md(bw, an, 25), 24, 0);
            } else {
                RandomAccessFile randomAccessFile = new RandomAccessFile(bw, an);
                int read = randomAccessFile.read();
                randomAccessFile.seek(0);
                randomAccessFile.write(read);
                randomAccessFile.seek(0);
                randomAccessFile.close();
                ah = new mo(new md(bw, an, 25), 24, 0);
            }
        } catch (IOException e2) {
        }
        ai = new mo(new md(bd.ac(aa, (byte) 45), an, 1048576000), 5200, 0);
        aw = new mo(new md(bd.ac("main_file_cache.idx255", (byte) 76), an, 1048576), 6000, 0);
        hy.am = new mo[(-1156725827 * ao)];
        for (int i3 = 0; i3 < -1156725827 * ao; i3++) {
            hy.am[i3] = new mo(new md(bd.ac(ak + i3, (byte) 82), an, 1048576), 6000, 0);
        }
    }

    public static md ak(String str, String str2, boolean z) {
        File file = new File(aq, "preferences" + str + ".dat");
        if (file.exists()) {
            try {
                return new md(file, an, 10000);
            } catch (IOException e) {
            }
        }
        String str3 = "";
        if (-529571541 * gx.ae == 33) {
            str3 = "_rc";
        } else if (-765406022 == -34549555 * gx.ae) {
            str3 = "_wip";
        }
        File file2 = new File(co.az, "jagex_" + str2 + "_preferences" + str + str3 + ".dat");
        if (!z && file2.exists()) {
            try {
                return new md(file2, an, 10000);
            } catch (IOException e2) {
            }
        }
        try {
            return new md(file, an, 10000);
        } catch (IOException e3) {
            throw new RuntimeException();
        }
    }

    public static md ap(String str, String str2, boolean z) {
        File file = new File(aq, "preferences" + str + ".dat");
        if (file.exists()) {
            try {
                return new md(file, an, 10000);
            } catch (IOException e) {
            }
        }
        String str3 = "";
        if (gx.ae * -34549555 == 33) {
            str3 = "_rc";
        } else if (34 == gx.ae * -34549555) {
            str3 = "_wip";
        }
        File file2 = new File(co.az, "jagex_" + str2 + "_preferences" + str + str3 + ".dat");
        if (!z && file2.exists()) {
            try {
                return new md(file2, an, 10000);
            } catch (IOException e2) {
            }
        }
        try {
            return new md(file, an, 10000);
        } catch (IOException e3) {
            throw new RuntimeException();
        }
    }

    public static md at(String str, String str2, boolean z) {
        File file = new File(aq, "preferences" + str + ".dat");
        if (file.exists()) {
            try {
                return new md(file, an, 10000);
            } catch (IOException e) {
            }
        }
        String str3 = "";
        if (gx.ae * -34549555 == 33) {
            str3 = "_rc";
        } else if (34 == gx.ae * -34549555) {
            str3 = "_wip";
        }
        File file2 = new File(co.az, "jagex_" + str2 + "_preferences" + str + str3 + ".dat");
        if (!z && file2.exists()) {
            try {
                return new md(file2, an, 10000);
            } catch (IOException e2) {
            }
        }
        try {
            return new md(file, an, 10000);
        } catch (IOException e3) {
            throw new RuntimeException();
        }
    }

    public static byte[] ah() {
        int i = 0;
        byte[] bArr = new byte[24];
        try {
            ah.ac(0);
            ah.aq(bArr, 436711112);
            int i2 = 0;
            while (i2 < 24 && bArr[i2] == (byte) 0) {
                i2++;
            }
            if (i2 >= 24) {
                throw new IOException();
            }
        } catch (Exception e) {
            while (i < 24) {
                bArr[i] = (byte) -1;
                i++;
            }
        }
        return bArr;
    }

    public static void ae(he heVar, int i) {
        if (ah != null) {
            try {
                ah.ac(0);
                ah.ak(heVar.aj, i, 24, (byte) -90);
            } catch (Exception e) {
            }
        }
    }

    public static void ai(he heVar, int i) {
        if (ah != null) {
            try {
                ah.ac(0);
                ah.ak(heVar.aj, i, 24, (byte) -65);
            } catch (Exception e) {
            }
        }
    }

    public static void am(he heVar, int i) {
        if (ah != null) {
            try {
                ah.ac(0);
                ah.ak(heVar.aj, i, 24, (byte) -33);
            } catch (Exception e) {
            }
        }
    }

    public static void aw(he heVar, int i) {
        if (ah != null) {
            try {
                ah.ac(0);
                ah.ak(heVar.aj, i, 24, (byte) -52);
            } catch (Exception e) {
            }
        }
    }

    static void bk(ff ffVar, int i, int i2, int i3) {
        try {
            if (i == ffVar.ck * 1976380739 && -1 != i) {
                int i4 = bn.aj(i, (byte) 0).af * 1516569231;
                if (1 == i4) {
                    ffVar.ce = 0;
                    ffVar.ch = 0;
                    ffVar.ci = 1611262399 * i2;
                    ffVar.cq = 0;
                }
                if (2 == i4) {
                    ffVar.cq = 0;
                }
            } else if (-1 == i || ffVar.ck * 1976380739 == -1 || bn.aj(i, (byte) 0).am * 79095755 >= bn.aj(ffVar.ck * 1976380739, (byte) 0).am * 79095755) {
                ffVar.ck = -2042247317 * i;
                ffVar.ce = 0;
                ffVar.ch = 0;
                ffVar.ci = i2 * 1611262399;
                ffVar.cq = 0;
                ffVar.dw = ffVar.dr * 1719369689;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "lp.bk(" + ')');
        }
    }
}
