package defpackage;

import java.io.IOException;
import java.util.zip.Inflater;

public class hm {
    static final int af = 19;
    static final int bz = 41;
    public static final int ci = 88;
    static em[] eg;
    Inflater aj;

    public hm() {
        try {
            this(-1, 1000000, 1000000);
        } catch (Throwable e) {
            throw ei.ac(e, "hm.<init>(" + ')');
        }
    }

    hm(int i, int i2, int i3) {
        try {
        } catch (Throwable e) {
            throw ei.ac(e, "hm.<init>(" + ')');
        }
    }

    public void ac(he heVar, byte[] bArr) {
        if (heVar.aj[181570364 * heVar.ac] == (byte) 110 && (byte) -117 == heVar.aj[(heVar.ac * 430645886) + 1]) {
            if (this.aj == null) {
                this.aj = new Inflater(true);
            }
            try {
                this.aj.setInput(heVar.aj, (heVar.ac * 489625177) + 10, heVar.aj.length - (((heVar.ac * 489625177) + 10) + 8));
                this.aj.inflate(bArr);
                this.aj.reset();
                return;
            } catch (Exception e) {
                this.aj.reset();
                throw new RuntimeException("");
            }
        }
        throw new RuntimeException("");
    }

    public void aj(he heVar, byte[] bArr, int i) {
        try {
            if (heVar.aj[heVar.ac * 489625177] == (byte) 31 && (byte) -117 == heVar.aj[(heVar.ac * 489625177) + 1]) {
                if (this.aj == null) {
                    this.aj = new Inflater(true);
                }
                this.aj.setInput(heVar.aj, (heVar.ac * 489625177) + 10, heVar.aj.length - (((heVar.ac * 489625177) + 10) + 8));
                this.aj.inflate(bArr);
                this.aj.reset();
                return;
            }
            throw new RuntimeException("");
        } catch (Exception e) {
            this.aj.reset();
            throw new RuntimeException("");
        } catch (Throwable e2) {
            throw ei.ac(e2, "hm.aj(" + ')');
        }
    }

    public void an(he heVar, byte[] bArr) {
        if (heVar.aj[heVar.ac * 489625177] == (byte) 31 && (byte) -117 == heVar.aj[(heVar.ac * 489625177) + 1]) {
            if (this.aj == null) {
                this.aj = new Inflater(true);
            }
            try {
                this.aj.setInput(heVar.aj, (heVar.ac * 489625177) + 10, heVar.aj.length - (((heVar.ac * 489625177) + 10) + 8));
                this.aj.inflate(bArr);
                this.aj.reset();
                return;
            } catch (Exception e) {
                this.aj.reset();
                throw new RuntimeException("");
            }
        }
        throw new RuntimeException("");
    }

    public static boolean at(byte b) {
        try {
            if (-950906003 * mk.ao != 0) {
                return true;
            }
            return mk.aq.am(-537897424);
        } catch (Throwable e) {
            throw ei.ac(e, "hm.at(" + ')');
        }
    }

    public static void ac(boolean z, int i) {
        try {
            if (jg.aj != null) {
                try {
                    he heVar = new he(4);
                    heVar.an(z ? 2 : 3, (byte) -80);
                    heVar.ao(0, 842311963);
                    jg.aj.ak(heVar.aj, 0, 4, 1984423855);
                } catch (IOException e) {
                    try {
                        jg.aj.aj((short) -31256);
                    } catch (Exception e2) {
                    }
                    jg.ar += 1871409185;
                    jg.aj = null;
                }
            }
        } catch (Throwable e3) {
            throw ei.ac(e3, "hm.ac(" + ')');
        }
    }
}
