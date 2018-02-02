package defpackage;

public abstract class ce {
    public static boolean an = true;
    public static final int ao = 3;
    static ma ap;

    public abstract cr aa();

    public abstract cr ac(int i);

    abstract void ah(cc ccVar, bw bwVar, int i, int i2, int i3, int i4, int i5, int i6);

    public abstract bl aj(byte b);

    abstract void ak(cc ccVar, bq bqVar, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    abstract void an(cc ccVar, bq bqVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public abstract bl ao();

    abstract void ap(cc ccVar, bq bqVar, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    abstract void aq(cc ccVar, bw bwVar, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    abstract void at(cc ccVar, bw bwVar, int i, int i2, int i3, int i4, int i5, int i6);

    ce() {
        try {
        } catch (Throwable e) {
            throw ei.ac(e, "ce.<init>(" + ')');
        }
    }

    public void ae(int i) {
    }

    public void ai(int i, int i2) {
    }

    public void am(int i) {
    }

    public void aw(int i) {
    }

    static void ek(ab[] abVarArr, int i, int i2, int i3, boolean z, int i4) {
        int i5 = 0;
        while (i5 < abVarArr.length) {
            try {
                ab abVar = abVarArr[i5];
                if (abVar != null) {
                    if (i == -1228023025 * abVar.bi) {
                        af.eb(abVar, i2, i3, z, 39251123);
                        fd.ez(abVar, i2, i3, 621024642);
                        if (abVar.bo * 976779915 > (1332151095 * abVar.bq) - (1120250035 * abVar.bu)) {
                            abVar.bo = (abVar.bq * -72471675) - (abVar.bu * -140781703);
                        }
                        if (abVar.bo * 976779915 < 0) {
                            abVar.bo = 0;
                        }
                        if (abVar.bz * 707497527 > (-248255019 * abVar.bj) - (abVar.bd * -1781667913)) {
                            abVar.bz = (381206099 * abVar.bj) - (abVar.bd * 642757249);
                        }
                        if (abVar.bz * 707497527 < 0) {
                            abVar.bz = 0;
                        }
                        if (-1999477681 * abVar.au == 0) {
                            cu.ej(abVarArr, abVar, z, (byte) -100);
                        }
                    }
                }
                i5++;
            } catch (Throwable e) {
                throw ei.ac(e, "ce.ek(" + ')');
            }
        }
    }
}
