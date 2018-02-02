package defpackage;

import java.util.Collection;

public class ea extends eb {
    static final int aa = 400;
    static final int av = 2;
    public static int id;
    static Collection om;
    final ma ap;

    public ea(ma maVar) {
        try {
            super(aa);
            this.ap = maVar;
        } catch (Throwable e) {
            throw ei.ac(e, "ea.<init>(" + ')');
        }
    }

    ey au(byte b) {
        try {
            return new el();
        } catch (Throwable e) {
            throw ei.ac(e, "ea.au(" + ')');
        }
    }

    ey cq() {
        return new el();
    }

    ey[] av(int i, byte b) {
        try {
            return new el[i];
        } catch (Throwable e) {
            throw ei.ac(e, "ea.av(" + ')');
        }
    }

    ey[] cu(int i) {
        return new el[i];
    }

    ey[] cv(int i) {
        return new el[i];
    }

    public void cg(he heVar, int i, byte b) {
        while (heVar.ac * 489625177 < i) {
            try {
                Object obj;
                if (1 == (heVar.au(-310118664) & 1)) {
                    obj = 1;
                } else {
                    obj = null;
                }
                ez ezVar = new ez(heVar.bh(233135194), this.ap);
                ez ezVar2 = new ez(heVar.bh(-578244597), this.ap);
                heVar.bh(-1069685267);
                if (ezVar == null || !ezVar.ac((byte) 118)) {
                    throw new IllegalStateException();
                }
                ez ezVar3;
                if (obj != null) {
                    ezVar3 = ezVar2;
                } else {
                    ezVar3 = ezVar;
                }
                el elVar = (el) aa(ezVar3, -1965932118);
                if (elVar != null) {
                    ae(elVar, ezVar, ezVar2, (byte) 121);
                } else if (ac((byte) -1) < aa) {
                    elVar = (el) ai(ezVar, ezVar2, (byte) 71);
                }
            } catch (Throwable e) {
                throw ei.ac(e, "ea.cg(" + ')');
            }
        }
    }

    public void cs(he heVar, int i) {
        while (heVar.ac * 489625177 < i) {
            Object obj;
            if (1 == (heVar.au(-310118664) & 1)) {
                obj = 1;
            } else {
                obj = null;
            }
            ez ezVar = new ez(heVar.bh(-561365372), this.ap);
            ez ezVar2 = new ez(heVar.bh(-1420767307), this.ap);
            heVar.bh(31538878);
            if (ezVar == null || !ezVar.ac((byte) 28)) {
                throw new IllegalStateException();
            }
            ez ezVar3;
            if (obj != null) {
                ezVar3 = ezVar2;
            } else {
                ezVar3 = ezVar;
            }
            el elVar = (el) aa(ezVar3, -1772088272);
            if (elVar != null) {
                ae(elVar, ezVar, ezVar2, (byte) 6);
            } else if (ac((byte) -1) < -1338031877) {
                elVar = (el) ai(ezVar, ezVar2, (byte) 96);
            }
        }
    }

    public void cx(he heVar, int i) {
        while (heVar.ac * -1444603201 < i) {
            Object obj = 1 == (heVar.au(-310118664) & 1) ? 1 : null;
            ez ezVar = new ez(heVar.bh(-853239632), this.ap);
            ez ezVar2 = new ez(heVar.bh(-1499056085), this.ap);
            heVar.bh(-890963030);
            if (ezVar == null || !ezVar.ac((byte) 70)) {
                throw new IllegalStateException();
            }
            el elVar = (el) aa(obj != null ? ezVar2 : ezVar, -2107653988);
            if (elVar != null) {
                ae(elVar, ezVar, ezVar2, (byte) 3);
            } else if (ac((byte) -1) < 639274697) {
                elVar = (el) ai(ezVar, ezVar2, (byte) 32);
            }
        }
    }

    static void af(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = -(i4 >> 2);
        int i10 = -(i4 & 3);
        int i11 = -i5;
        int i12 = i3;
        int i13 = i2;
        while (i11 < 0) {
            int i14 = i9;
            while (i14 < 0) {
                int i15;
                int i16 = i13 + 1;
                try {
                    i15 = iArr2[i13];
                    if (i15 != 0) {
                        i13 = i12 + 1;
                        iArr[i12] = i15;
                        i12 = i13;
                    } else {
                        i12++;
                    }
                    i15 = i16 + 1;
                    i16 = iArr2[i16];
                    if (i16 != 0) {
                        i13 = i12 + 1;
                        iArr[i12] = i16;
                        i12 = i13;
                    } else {
                        i12++;
                    }
                    int i17 = i15 + 1;
                    i16 = iArr2[i15];
                    if (i16 != 0) {
                        i13 = i12 + 1;
                        iArr[i12] = i16;
                        i12 = i13;
                    } else {
                        i12++;
                    }
                    i16 = i17 + 1;
                    i15 = iArr2[i17];
                    if (i15 != 0) {
                        i13 = i12 + 1;
                        iArr[i12] = i15;
                    } else {
                        i13 = i12 + 1;
                    }
                    i14++;
                    i12 = i13;
                    i13 = i16;
                } catch (Throwable e) {
                    throw ei.ac(e, "ea.af(" + ')');
                }
            }
            i14 = i12;
            i12 = i10;
            while (i12 < 0) {
                i16 = i13 + 1;
                i15 = iArr2[i13];
                if (i15 != 0) {
                    i13 = i14 + 1;
                    iArr[i14] = i15;
                } else {
                    i13 = i14 + 1;
                }
                i12++;
                i14 = i13;
                i13 = i16;
            }
            i12 = i14 + i6;
            i11++;
            i13 += i7;
        }
    }
}
