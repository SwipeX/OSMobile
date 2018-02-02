package com.jagex.oldscape.osrenderer;

import defpackage.ei;

public class aj {
    static boolean aj = false;

    aj() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/osrenderer/aj.<init>(" + ')');
        }
    }

    public static void af() {
        if (!aj) {
            try {
                if ("The Android Project".equals(System.getProperty("java.vm.vendor"))) {
                    System.loadLibrary("osrenderer");
                } else {
                    System.loadLibrary("windows/x64/OSRenderer");
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            aj = true;
        }
    }

    public static void aj(byte b) {
        try {
            if (!aj) {
                try {
                    if ("The Android Project".equals(System.getProperty("java.vm.vendor"))) {
                        System.loadLibrary("osrenderer");
                    } else {
                        System.loadLibrary("windows/x64/OSRenderer");
                    }
                } catch (UnsatisfiedLinkError e) {
                    e.printStackTrace();
                }
                aj = true;
            }
        } catch (Throwable e2) {
            throw ei.ac(e2, "com/jagex/oldscape/osrenderer/aj.aj(" + ')');
        }
    }

    public static void ax() {
        if (!aj) {
            try {
                if ("The Android Project".equals(System.getProperty("java.vm.vendor"))) {
                    System.loadLibrary("osrenderer");
                } else {
                    System.loadLibrary("windows/x64/OSRenderer");
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            aj = true;
        }
    }

    public static void az() {
        if (!aj) {
            try {
                if ("The Android Project".equals(System.getProperty("java.vm.vendor"))) {
                    System.loadLibrary("osrenderer");
                } else {
                    System.loadLibrary("windows/x64/OSRenderer");
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            }
            aj = true;
        }
    }

    public static void ac(Object obj, int i) {
        try {
            zv.xp(obj);
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/osrenderer/aj.ac(" + ')');
        }
    }

    public static void ag(Object obj) {
        zv.xp(obj);
    }

    public static void au(Object obj) {
        zv.xp(obj);
    }

    public static void av(Object obj) {
        zv.xp(obj);
    }

    public static void ay(Object obj) {
        zv.xp(obj);
    }

    public static void ab(boolean z) {
        zv.nh(z);
    }

    public static void ad(boolean z) {
        zv.nh(z);
    }

    public static void an(boolean z, byte b) {
        try {
            zv.nh(z);
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/osrenderer/aj.an(" + ')');
        }
    }

    public static void ar(boolean z) {
        zv.nh(z);
    }

    public static void bp(boolean z) {
        zv.nh(z);
    }

    public static void aq(byte b) {
        try {
            zv.zt();
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/osrenderer/aj.aq(" + ')');
        }
    }

    public static void bh() {
        zv.zt();
    }

    public static void bm() {
        zv.zt();
    }

    public static void bt() {
        zv.zt();
    }

    public static boolean ao(byte b) {
        try {
            return zv.em();
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/osrenderer/aj.ao(" + ')');
        }
    }

    public static boolean bb() {
        return zv.em();
    }

    public static boolean bd() {
        return zv.em();
    }

    public static boolean br() {
        return zv.em();
    }

    public static boolean bu() {
        return zv.em();
    }

    public static void aa(int[] iArr, int i) {
        try {
            zv.vm(iArr);
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/osrenderer/aj.aa(" + ')');
        }
    }

    public static void bi(int[] iArr) {
        zv.vm(iArr);
    }

    public static void bx(int[] iArr) {
        zv.vm(iArr);
    }

    public static void by(int[] iArr) {
        zv.vm(iArr);
    }

    public static void ak(int i, int[] iArr, int i2) {
        try {
            zv.fc(i, iArr);
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/osrenderer/aj.ak(" + ')');
        }
    }

    public static void bo(int i, int[] iArr) {
        zv.fc(i, iArr);
    }

    public static void bs(int i, int[] iArr) {
        zv.fc(i, iArr);
    }

    public static void bz(int i, int[] iArr) {
        zv.fc(i, iArr);
    }

    public static void ap(int i) {
        try {
            zv.gc();
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/osrenderer/aj.ap(" + ')');
        }
    }

    public static void bj() {
        zv.gc();
    }

    public static void bq() {
        zv.gc();
    }

    public static void at(int i) {
        try {
            zv.sq();
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/osrenderer/aj.at(" + ')');
        }
    }

    public static void ba() {
        zv.sq();
    }

    public static void be() {
        zv.sq();
    }

    public static void bv() {
        zv.sq();
    }

    public static int ah(int i) {
        try {
            return zv.xm();
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/osrenderer/aj.ah(" + ')');
        }
    }

    public static int bw() {
        return zv.xm();
    }

    public static int ai(int i) {
        try {
            return zv.hn();
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/osrenderer/aj.ai(" + ')');
        }
    }

    public static int bn() {
        return zv.hn();
    }

    public static int aw(int i) {
        try {
            return zv.mz();
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/osrenderer/aj.aw(" + ')');
        }
    }

    public static int bc() {
        return zv.mz();
    }

    public static int bg() {
        return zv.mz();
    }

    public static int bk() {
        return zv.mz();
    }

    public static int am(int[] iArr, int i) {
        try {
            return zv.jq(iArr);
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/osrenderer/aj.am(" + ')');
        }
    }

    public static int bf(int[] iArr) {
        return zv.jq(iArr);
    }

    public static int bl(int[] iArr) {
        return zv.jq(iArr);
    }

    public static int cb(int[] iArr) {
        return zv.jq(iArr);
    }

    public static void ae(int i, int i2, int i3) {
        try {
            zv.id(i, i2);
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/osrenderer/aj.ae(" + ')');
        }
    }

    public static void cl(int i, int i2) {
        zv.id(i, i2);
    }

    public static void cy(int i, int i2) {
        zv.id(i, i2);
    }

    public static void as(int i) {
        try {
            zv.ft();
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/osrenderer/aj.as(" + ')');
        }
    }

    public static void cc() {
        zv.ft();
    }

    public static void co() {
        zv.ft();
    }

    public static int al(int i, boolean z, boolean z2, int i2, int i3, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, int[] iArr10, int[] iArr11, int[] iArr12, byte[] bArr, short[] sArr, byte[] bArr2, byte[] bArr3, int[] iArr13, int[] iArr14, int i4) {
        try {
            return zv.oh(i, z, z2, i2, i3, iArr, iArr2, iArr3, iArr4, iArr5, iArr6, iArr7, iArr8, iArr9, iArr10, iArr11, iArr12, bArr, sArr, bArr2, bArr3, iArr13, iArr14);
        } catch (Throwable e) {
            throw ei.ac(e, "com/jagex/oldscape/osrenderer/aj.al(" + ')');
        }
    }

    public static int ca(int i, boolean z, boolean z2, int i2, int i3, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, int[] iArr10, int[] iArr11, int[] iArr12, byte[] bArr, short[] sArr, byte[] bArr2, byte[] bArr3, int[] iArr13, int[] iArr14) {
        return zv.oh(i, z, z2, i2, i3, iArr, iArr2, iArr3, iArr4, iArr5, iArr6, iArr7, iArr8, iArr9, iArr10, iArr11, iArr12, bArr, sArr, bArr2, bArr3, iArr13, iArr14);
    }

    public static int cf(int i, boolean z, boolean z2, int i2, int i3, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, int[] iArr9, int[] iArr10, int[] iArr11, int[] iArr12, byte[] bArr, short[] sArr, byte[] bArr2, byte[] bArr3, int[] iArr13, int[] iArr14) {
        return zv.oh(i, z, z2, i2, i3, iArr, iArr2, iArr3, iArr4, iArr5, iArr6, iArr7, iArr8, iArr9, iArr10, iArr11, iArr12, bArr, sArr, bArr2, bArr3, iArr13, iArr14);
    }
}
