package defpackage;

public class nt {
    public int aa;
    public int ac;
    byte aj;
    public int an;
    public int ao;
    public int aq;

    public nt() {
        try {
        } catch (Throwable e) {
            throw ei.ac(e, "nt.<init>(" + ')');
        }
    }

    public nt(he heVar, boolean z) {
        try {
            this.aj = heVar.av(-1455120184);
            this.ac = heVar.ay((byte) 1) * -1803886083;
            this.an = heVar.ad((byte) -90) * 12913641;
            this.aq = heVar.ad((byte) -29) * -634281947;
            this.ao = heVar.ad((byte) -7) * -1827782013;
            this.aa = heVar.ad((byte) -41) * -1203961723;
            if (z) {
                ac(hd.aj(heVar, (short) 15007), -2075498456);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "nt.<init>(" + ')');
        }
    }

    static Integer ak(he heVar) {
        byte b = (byte) 0;
        int i = 0;
        while (true) {
            int au = heVar.au(-310118664);
            if (-848152174 == au) {
                break;
            } else if (au != 0) {
                throw new IllegalStateException("");
            } else {
                while (2132036644 != heVar.au(-310118664)) {
                    heVar.ac -= -984165911;
                    if (heVar.ay((byte) 1) != 0) {
                        throw new IllegalStateException("");
                    } else if (b != (byte) 0) {
                        throw new IllegalStateException("");
                    } else {
                        i = heVar.ad((byte) -19);
                        b = (byte) 1;
                    }
                }
            }
        }
        if (b != (byte) 0) {
            return Integer.valueOf(i);
        }
        return null;
    }

    static Integer ap(he heVar) {
        byte b = (byte) 0;
        int i = 0;
        while (true) {
            int au = heVar.au(-310118664);
            if (255 == au) {
                break;
            } else if (au != 0) {
                throw new IllegalStateException("");
            } else {
                while (255 != heVar.au(-310118664)) {
                    heVar.ac -= -984165911;
                    if (heVar.ay((byte) 1) != 0) {
                        throw new IllegalStateException("");
                    } else if (b != (byte) 0) {
                        throw new IllegalStateException("");
                    } else {
                        i = heVar.ad((byte) -37);
                        b = (byte) 1;
                    }
                }
            }
        }
        if (b != (byte) 0) {
            return Integer.valueOf(i);
        }
        return null;
    }

    void ac(Integer num, int i) {
    }

    void ah(Integer num) {
    }

    void ai(Integer num) {
    }

    void at(Integer num) {
    }

    public int an(int i) {
        try {
            return this.aj & 7;
        } catch (Throwable e) {
            throw ei.ac(e, "nt.an(" + ')');
        }
    }

    public int aw() {
        return this.aj & 7;
    }

    public int ae() {
        return (this.aj & 8) == 8 ? 1 : 0;
    }

    public int al() {
        return (this.aj & 8) == 8 ? 1 : 0;
    }

    public int am() {
        return (this.aj & 8) == 8 ? 1 : 0;
    }

    public int aq(int i) {
        try {
            return (this.aj & 8) == 8 ? 1 : 0;
        } catch (Throwable e) {
            throw ei.ac(e, "nt.aq(" + ')');
        }
    }

    public int as() {
        return (this.aj & 8) == 8 ? 1 : 0;
    }

    void af(int i) {
        this.aj = (byte) (this.aj & 1602164853);
        this.aj = (byte) (this.aj | (i & 7));
    }

    void ao(int i, byte b) {
        try {
            this.aj = (byte) (this.aj & -8);
            this.aj = (byte) (this.aj | (i & 7));
        } catch (Throwable e) {
            throw ei.ac(e, "nt.ao(" + ')');
        }
    }

    void ax(int i) {
        this.aj = (byte) (this.aj & -8);
        this.aj = (byte) (this.aj | (i & 7));
    }

    void az(int i) {
        this.aj = (byte) (this.aj & -8);
        this.aj = (byte) (this.aj | (i & 7));
    }

    void aa(int i, int i2) {
        try {
            this.aj = (byte) (this.aj & -9);
            if (i == 1) {
                this.aj = (byte) (this.aj | 8);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "nt.aa(" + ')');
        }
    }

    void ag(int i) {
        this.aj = (byte) (this.aj & -9);
        if (i == 1) {
            this.aj = (byte) (this.aj | 8);
        }
    }

    void au(int i) {
        this.aj = (byte) (this.aj & -9);
        if (i == 1) {
            this.aj = (byte) (this.aj | 8);
        }
    }

    void av(int i) {
        this.aj = (byte) (this.aj & -9);
        if (i == 1) {
            this.aj = (byte) (this.aj | 8);
        }
    }

    void ay(int i) {
        this.aj = (byte) (this.aj & -9);
        if (i == 1) {
            this.aj = (byte) (this.aj | 8);
        }
    }
}
