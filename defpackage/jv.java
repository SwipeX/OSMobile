package defpackage;

public class jv implements Runnable {
    static int aa = 0;
    public static final int ag = 25;
    static final jv aj = new jv();
    final jm ac;
    final jm an;
    Thread ao;
    int aq;

    jv() {
        try {
            this.ac = new jm();
            this.an = new jm();
            this.aq = 0;
        } catch (Throwable e) {
            throw ei.ac(e, "jv.<init>(" + ')');
        }
    }

    static void as(int i, le leVar, jn jnVar) {
        jd jdVar = new jd();
        jdVar.aj = -1124246311;
        jdVar.fy = (long) i;
        jdVar.an = leVar;
        jdVar.aq = jnVar;
        aj.ai(jdVar, 1838398342);
        aj.ac(1003474059);
    }

    synchronized void ac(int i) {
        try {
            if (-802001021 * this.aq == 0) {
                this.ao = new Thread(aj);
                this.ao.setDaemon(true);
                this.ao.start();
                this.ao.setPriority(5);
            }
            this.aq = 1546276040;
        } catch (Throwable e) {
            throw ei.ac(e, "jv.ac(" + ')');
        }
    }

    synchronized void al() {
        if (-802001021 * this.aq == 0) {
            this.ao = new Thread(aj);
            this.ao.setDaemon(true);
            this.ao.start();
            this.ao.setPriority(5);
        }
        this.aq = 1546276040;
    }

    synchronized void ax() {
        if (-802001021 * this.aq == 0) {
            this.ao = new Thread(aj);
            this.ao.setDaemon(true);
            this.ao.start();
            this.ao.setPriority(5);
        }
        this.aq = 1546276040;
    }

    synchronized void az() {
        if (-802001021 * this.aq == 0) {
            this.ao = new Thread(aj);
            this.ao.setDaemon(true);
            this.ao.start();
            this.ao.setPriority(5);
        }
        this.aq = 1546276040;
    }

    static void af(int i, le leVar, jn jnVar) {
        byte[] aq = aj.aq(i, leVar, -1970159243);
        if (aq != null) {
            jnVar.ek(leVar, i, aq, true, (byte) -68);
            return;
        }
        jnVar.ek(leVar, i, leVar.aj(i, 2030839227), true, (byte) -105);
    }

    static void au(int i, le leVar, jn jnVar) {
        byte[] aq = aj.aq(i, leVar, -222870139);
        if (aq != null) {
            jnVar.ek(leVar, i, aq, true, (byte) -37);
            return;
        }
        jnVar.ek(leVar, i, leVar.aj(i, 2086488170), true, (byte) -59);
    }

    synchronized byte[] aq(int i, le leVar, int i2) {
        byte[] bArr;
        try {
            jd jdVar = (jd) this.ac.ak();
            while (jdVar != null) {
                if (jdVar.fy == ((long) i) && leVar == jdVar.an && 1651860329 * jdVar.aj == 0) {
                    bArr = jdVar.ac;
                    break;
                }
                jdVar = (jd) this.ac.at();
            }
            bArr = null;
        } catch (Throwable e) {
            try {
                hq.aj(null, e, (byte) 43);
                bArr = null;
            } catch (Throwable e2) {
                throw ei.ac(e2, "jv.aq(" + ')');
            }
        }
        return bArr;
    }

    synchronized byte[] av(int i, le leVar) {
        byte[] bArr;
        try {
            jd jdVar = (jd) this.ac.ak();
            while (jdVar != null) {
                if (jdVar.fy == ((long) i) && leVar == jdVar.an && 1651860329 * jdVar.aj == 0) {
                    bArr = jdVar.ac;
                    break;
                }
                jdVar = (jd) this.ac.at();
            }
            bArr = null;
        } catch (Throwable e) {
            hq.aj(null, e, (byte) -37);
            bArr = null;
        }
        return bArr;
    }

    public static void ag() {
        while (true) {
            jd aa = aj.aa(-2065295666);
            if (aa != null) {
                aa.aq.ek(aa.an, (int) aa.fy, aa.ac, false, (byte) -47);
            } else {
                return;
            }
        }
    }

    public static void ay() {
        while (true) {
            jd aa = aj.aa(-396278618);
            if (aa != null) {
                aa.aq.ek(aa.an, (int) aa.fy, aa.ac, false, (byte) -92);
            } else {
                return;
            }
        }
    }

    synchronized jd aa(int i) {
        jd jdVar;
        try {
            jdVar = (jd) this.an.ao();
        } catch (Throwable e) {
            try {
                hq.aj(null, e, (byte) 21);
                jdVar = null;
            } catch (Throwable e2) {
                throw ei.ac(e2, "jv.aa(" + ')');
            }
        }
        return jdVar;
    }

    synchronized jd ad() {
        jd jdVar;
        try {
            jdVar = (jd) this.an.ao();
        } catch (Throwable e) {
            hq.aj(null, e, (byte) 42);
            jdVar = null;
        }
        return jdVar;
    }

    synchronized jd ar() {
        jd jdVar;
        try {
            jdVar = (jd) this.an.ao();
        } catch (Throwable e) {
            hq.aj(null, e, (byte) 18);
            jdVar = null;
        }
        return jdVar;
    }

    synchronized jd ab() {
        jd jdVar;
        try {
            jdVar = (jd) this.ac.ak();
        } catch (Throwable e) {
            hq.aj(null, e, (byte) 11);
            jdVar = null;
        }
        if (jdVar == null) {
            jdVar = null;
        } else {
            jdVar.kn();
        }
        return jdVar;
    }

    synchronized jd ak(int i) {
        jd jdVar;
        try {
            jdVar = (jd) this.ac.ak();
        } catch (Throwable e) {
            try {
                hq.aj(null, e, (byte) 10);
                jdVar = null;
            } catch (Throwable e2) {
                throw ei.ac(e2, "jv.ak(" + ')');
            }
        }
        if (jdVar == null) {
            jdVar = null;
        } else {
            jdVar.kn();
        }
        return jdVar;
    }

    synchronized jd bh() {
        jd jdVar;
        try {
            jdVar = (jd) this.ac.ak();
        } catch (Throwable e) {
            hq.aj(null, e, (byte) 69);
            jdVar = null;
        }
        if (jdVar == null) {
            jdVar = null;
        } else {
            jdVar.kn();
        }
        return jdVar;
    }

    synchronized jd bm() {
        jd jdVar;
        try {
            jdVar = (jd) this.ac.ak();
        } catch (Throwable e) {
            hq.aj(null, e, (byte) 63);
            jdVar = null;
        }
        if (jdVar == null) {
            jdVar = null;
        } else {
            jdVar.kn();
        }
        return jdVar;
    }

    synchronized jd bp() {
        jd jdVar;
        try {
            jdVar = (jd) this.ac.ak();
        } catch (Throwable e) {
            hq.aj(null, e, (byte) -94);
            jdVar = null;
        }
        if (jdVar == null) {
            jdVar = null;
        } else {
            jdVar.kn();
        }
        return jdVar;
    }

    synchronized jd br() {
        jd jdVar;
        try {
            jdVar = (jd) this.ac.ak();
        } catch (Throwable e) {
            hq.aj(null, e, (byte) 47);
            jdVar = null;
        }
        if (jdVar == null) {
            jdVar = null;
        } else {
            jdVar.kn();
        }
        return jdVar;
    }

    synchronized jd bt() {
        jd jdVar;
        try {
            jdVar = (jd) this.ac.ak();
        } catch (Throwable e) {
            hq.aj(null, e, (byte) 57);
            jdVar = null;
        }
        if (jdVar == null) {
            jdVar = null;
        } else {
            jdVar.kn();
        }
        return jdVar;
    }

    synchronized boolean ap(int i) {
        boolean z = true;
        synchronized (this) {
            try {
                if (this.aq * -802001021 <= 1) {
                    this.aq = 0;
                    notifyAll();
                } else {
                    z = false;
                }
            } catch (Throwable e) {
                throw ei.ac(e, "jv.ap(" + ')');
            }
        }
        return z;
    }

    synchronized boolean bb() {
        boolean z = true;
        synchronized (this) {
            if (this.aq * 780470956 <= 1) {
                this.aq = 0;
                notifyAll();
            } else {
                z = false;
            }
        }
        return z;
    }

    synchronized boolean bu() {
        boolean z = true;
        synchronized (this) {
            if (this.aq * -802001021 <= 1) {
                this.aq = 0;
                notifyAll();
            } else {
                z = false;
            }
        }
        return z;
    }

    synchronized void at(int i) {
        try {
            this.aq = 1546276040;
        } catch (Throwable e) {
            throw ei.ac(e, "jv.at(" + ')');
        }
    }

    synchronized void bd() {
        this.aq = 1546276040;
    }

    synchronized void bx() {
        this.aq = 1546276040;
    }

    synchronized void by() {
        this.aq = 1546276040;
    }

    synchronized void ah(int i) {
        try {
            this.aq -= -462710997;
        } catch (Throwable e) {
            throw ei.ac(e, "jv.ah(" + ')');
        }
    }

    synchronized void bi() {
        this.aq -= -462710997;
    }

    synchronized void bo() {
        this.aq -= -462710997;
    }

    synchronized void bs() {
        this.aq -= -462710997;
    }

    synchronized void ai(jd jdVar, int i) {
        try {
            this.ac.ac(jdVar);
        } catch (Throwable e) {
            throw ei.ac(e, "jv.ai(" + ')');
        }
    }

    synchronized void bq(jd jdVar) {
        this.ac.ac(jdVar);
    }

    synchronized void bz(jd jdVar) {
        this.ac.ac(jdVar);
    }

    synchronized void aw(jd jdVar, int i) {
        try {
            this.an.ac(jdVar);
        } catch (Throwable e) {
            throw ei.ac(e, "jv.aw(" + ')');
        }
    }

    synchronized void ba(jd jdVar) {
        this.an.ac(jdVar);
    }

    synchronized void bj(jd jdVar) {
        this.an.ac(jdVar);
    }

    public static String aq(byte[] bArr, int i, int i2, int i3) {
        try {
            char[] cArr = new char[i2];
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                int i6 = bArr[i + i4] & 255;
                if (i6 == 0) {
                    i6 = i5;
                } else {
                    int i7;
                    if (i6 < cj.ak || i6 >= 160) {
                        i7 = i6;
                    } else {
                        char c = lk.aj[i6 - 128];
                        if (c == '\u0000') {
                            c = '?';
                        }
                        i7 = c;
                    }
                    i6 = i5 + 1;
                    cArr[i5] = (char) i7;
                }
                i4++;
                i5 = i6;
            }
            return new String(cArr, 0, i5);
        } catch (Throwable e) {
            throw ei.ac(e, "jv.aq(" + ')');
        }
    }

    public void cs() {
        while (true) {
            try {
                jd ak = ak(-344206863);
                if (ak == null) {
                    da.aj(100);
                    if (!ap(1161456018)) {
                        ah(-1437729762);
                    } else {
                        return;
                    }
                }
                if (ak.aj * 1651860329 == 0) {
                    ak.an.ac((int) ak.fy, ak.ac, ak.ac.length, (byte) 97);
                } else if (ak.aj * 1651860329 == 1) {
                    ak.ac = ak.an.aj((int) ak.fy, 1974519811);
                    aw(ak, 1285074734);
                }
                if (!ap(-1452207893)) {
                    at(1778907725);
                } else {
                    return;
                }
            } catch (Throwable e) {
                hq.aj(null, e, (byte) -11);
                return;
            }
        }
    }

    public void run() {
        while (true) {
            jd ak = ak(-344206863);
            if (ak == null) {
                da.aj(100);
                if (!ap(988672553)) {
                    ah(-1154843762);
                } else {
                    return;
                }
            }
            try {
                if (ak.aj * 1651860329 == 0) {
                    ak.an.ac((int) ak.fy, ak.ac, ak.ac.length, (byte) 90);
                } else if (ak.aj * 1651860329 == 1) {
                    ak.ac = ak.an.aj((int) ak.fy, 2034720236);
                    aw(ak, 188726842);
                }
                if (!ap(197309831)) {
                    at(1591602775);
                } else {
                    return;
                }
            } catch (Throwable e) {
                try {
                    hq.aj(null, e, (byte) 16);
                    return;
                } catch (Throwable e2) {
                    throw ei.ac(e2, "jv.run(" + ')');
                }
            }
        }
    }

    public static void be() {
        aj.ae(-1876821648);
    }

    public static void bn() {
        aj.ae(-1272301135);
    }

    public static void bv() {
        aj.ae(-276241787);
    }

    public static void bw() {
        aj.ae(1649271575);
    }

    synchronized void ae(int i) {
        try {
            if (this.aq * -802001021 != 0) {
                this.aq = -462710997;
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
        } catch (Throwable e2) {
            throw ei.ac(e2, "jv.ae(" + ')');
        }
    }

    synchronized void bc() {
        if (this.aq * -802001021 != 0) {
            this.aq = -462710997;
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
    }

    synchronized void bg() {
        if (this.aq * -1415498456 != 0) {
            this.aq = -462710997;
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
    }
}
