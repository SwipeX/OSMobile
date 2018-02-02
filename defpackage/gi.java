package defpackage;

public class gi extends ci {
    public static final int cp = 84;
    int aa;
    int ac;
    int aj;
    ax ak;
    int an;
    int ao;
    int ap;
    int aq;
    int at;

    gi(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, ci ciVar) {
        try {
            this.aj = -899467673 * i;
            this.ac = 1768829011 * i2;
            this.an = 602093473 * i3;
            this.aq = 1916443161 * i4;
            this.ao = 758103293 * i5;
            this.aa = 1295841389 * i6;
            if (i7 != -1) {
                this.ak = bn.aj(i7, (byte) 0);
                this.ap = 0;
                this.at = (client.af * -1246217093) - -822450771;
                if (this.ak.af * 1516569231 == 0 && ciVar != null && (ciVar instanceof gi)) {
                    gi giVar = (gi) ciVar;
                    if (giVar.ak == this.ak) {
                        this.ap = giVar.ap * 1;
                        this.at = giVar.at * 1;
                        return;
                    }
                }
                if (z && this.ak.ah * -715992495 != -1) {
                    this.ap = ((int) (Math.random() * ((double) this.ak.aa.length))) * -1907988503;
                    this.at -= ((int) (Math.random() * ((double) this.ak.ap[-1282744231 * this.ap]))) * -822450771;
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "gi.<init>(" + ')');
        }
    }

    protected final ct ar() {
        int i = 100;
        try {
            int i2;
            if (this.ak != null) {
                i2 = (client.af * 901275591) - (1649034789 * this.at);
                if (i2 <= 100 || -715992495 * this.ak.ah <= 0) {
                    i = i2;
                }
                while (i > this.ak.ap[this.ap * -1282744231]) {
                    i -= this.ak.ap[this.ap * -1282744231];
                    this.ap -= 1907988503;
                    if (this.ap * -1282744231 >= this.ak.aa.length) {
                        this.ap -= -349830471 * this.ak.ah;
                        if (this.ap * -1282744231 < 0 || this.ap * -1282744231 >= this.ak.aa.length) {
                            this.ak = null;
                            break;
                        }
                    }
                }
                this.at = ((901275591 * client.af) - i) * -822450771;
            }
            ah ac = ey.ac(this.aj * 1706263895, -224169304);
            if (ac.ba != null) {
                ac = ac.aw(2044764284);
            }
            if (ac == null) {
                return null;
            }
            int i3;
            if (1 == this.an * 359689313 || 3 == this.an * 359689313) {
                i3 = ac.ax * 1882098523;
                i2 = 1768348157 * ac.az;
            } else {
                i3 = 1768348157 * ac.az;
                i2 = 1882098523 * ac.ax;
            }
            int i4 = (this.ao * 129187925) + (i3 >> 1);
            int i5 = ((i3 + 1) >> 1) + (this.ao * 129187925);
            int i6 = (i2 >> 1) + (this.aa * -1106914971);
            int i7 = (this.aa * -1106914971) + ((i2 + 1) >> 1);
            int[][] iArr = fb.aj[-568974807 * this.aq];
            i5 = ((iArr[i4][i7] + (iArr[i4][i6] + iArr[i5][i6])) + iArr[i5][i7]) >> 2;
            return ac.ah(2003801051 * this.ac, this.an * 359689313, iArr, ((this.ao * 129187925) << 7) + (i3 << 6), i5, ((this.aa * -1106914971) << 7) + (i2 << 6), this.ak, this.ap * -1282744231, 1585472849);
        } catch (Throwable e) {
            throw ei.ac(e, "gi.ar(" + ')');
        }
    }

    protected final ct cg() {
        int i;
        int i2 = 100;
        if (this.ak != null) {
            i = (client.af * 901275591) - (1649034789 * this.at);
            if (i <= 100 || -715992495 * this.ak.ah <= 0) {
                i2 = i;
            }
            while (i2 > this.ak.ap[this.ap * -1282744231]) {
                i2 -= this.ak.ap[this.ap * -1282744231];
                this.ap -= 1907988503;
                if (this.ap * -1282744231 >= this.ak.aa.length) {
                    this.ap -= -349830471 * this.ak.ah;
                    if (this.ap * -1282744231 < 0 || this.ap * -1282744231 >= this.ak.aa.length) {
                        this.ak = null;
                        break;
                    }
                }
            }
            this.at = ((901275591 * client.af) - i2) * -822450771;
        }
        ah ac = ey.ac(this.aj * 1706263895, -151563871);
        if (ac.ba != null) {
            ac = ac.aw(-1296120240);
        }
        if (ac == null) {
            return null;
        }
        int i3;
        if (1 == this.an * 359689313 || 3 == this.an * 359689313) {
            i3 = ac.ax * 1882098523;
            i = 1768348157 * ac.az;
        } else {
            i3 = 1768348157 * ac.az;
            i = 1882098523 * ac.ax;
        }
        int i4 = (this.ao * 129187925) + (i3 >> 1);
        int i5 = ((i3 + 1) >> 1) + (this.ao * 129187925);
        int i6 = (i >> 1) + (this.aa * -1106914971);
        int i7 = (this.aa * -1106914971) + ((i + 1) >> 1);
        int[][] iArr = fb.aj[-568974807 * this.aq];
        i5 = ((iArr[i4][i7] + (iArr[i4][i6] + iArr[i5][i6])) + iArr[i5][i7]) >> 2;
        return ac.ah(2003801051 * this.ac, this.an * 359689313, iArr, ((this.ao * 129187925) << 7) + (i3 << 6), i5, ((this.aa * -1106914971) << 7) + (i << 6), this.ak, this.ap * -1282744231, 1607858877);
    }

    protected final ct cs() {
        if (this.ak != null) {
            int i = (client.af * 766776088) - (1649034789 * this.at);
            if (i > 100 && -715992495 * this.ak.ah > 0) {
                i = -121977391;
            }
            while (i > this.ak.ap[this.ap * -1282744231]) {
                i -= this.ak.ap[this.ap * -1282744231];
                this.ap -= 1907988503;
                if (this.ap * -1282744231 >= this.ak.aa.length) {
                    this.ap -= -349830471 * this.ak.ah;
                    if (this.ap * -1282744231 < 0 || this.ap * -359955054 >= this.ak.aa.length) {
                        this.ak = null;
                        break;
                    }
                }
            }
            this.at = ((-394435563 * client.af) - i) * -822450771;
        }
        ah ac = ey.ac(this.aj * 1086319242, -1110408856);
        if (ac.ba != null) {
            ac = ac.aw(1674274333);
        }
        if (ac == null) {
            return null;
        }
        int i2;
        int i3;
        if (1 == -1777649078 * this.an || 3 == 1260658864 * this.an) {
            i2 = ac.ax * 1882098523;
            i3 = -1123601080 * ac.az;
        } else {
            i2 = 1768348157 * ac.az;
            i3 = 1090168774 * ac.ax;
        }
        int i4 = (this.ao * 129187925) + (i2 >> 1);
        int i5 = ((i2 + 1) >> 1) + (this.ao * 129187925);
        int i6 = (i3 >> 1) + (this.aa * -1106914971);
        int i7 = (this.aa * -1456859363) + ((i3 + 1) >> 1);
        int[][] iArr = fb.aj[52970667 * this.aq];
        i5 = ((iArr[i4][i7] + (iArr[i4][i6] + iArr[i5][i6])) + iArr[i5][i7]) >> 2;
        return ac.ah(-1702854486 * this.ac, this.an * 737542651, iArr, ((this.ao * 129187925) << 7) + (i2 << 6), i5, ((this.aa * -2082484567) << 7) + (i3 << 6), this.ak, this.ap * -1282744231, 2050103095);
    }

    public static final void ac(int i, boolean z, int i2, byte b) {
        if (i < 8000 || i > 48000) {
            try {
                throw new IllegalArgumentException();
            } catch (Throwable e) {
                throw ei.ac(e, "gi.ac(" + ')');
            }
        }
        in.aj = 168472051 * i;
        in.ac = z;
        in.ao = 710272009 * i2;
    }

    public static void aa(int i, ju juVar, String str, String str2, int i2, boolean z, byte b) {
        try {
            int au = juVar.au(str, -1614213027);
            lt.ak(i, juVar, au, juVar.av(au, str2, (byte) -118), i2, z, -1551140325);
        } catch (Throwable e) {
            throw ei.ac(e, "gi.aa(" + ')');
        }
    }

    public static String ap(String str, int i) {
        try {
            int length = str.length();
            char[] cArr = new char[length];
            int i2 = 0;
            Object obj = 2;
            while (i2 < length) {
                char toLowerCase;
                Object obj2;
                char charAt = str.charAt(i2);
                if (obj == null) {
                    toLowerCase = Character.toLowerCase(charAt);
                } else if (obj == 2 || Character.isUpperCase(charAt)) {
                    if (!(charAt == 'µ' || '' == charAt)) {
                        charAt = Character.toTitleCase(charAt);
                    }
                    toLowerCase = charAt;
                } else {
                    toLowerCase = charAt;
                }
                if (Character.isLetter(toLowerCase)) {
                    obj2 = null;
                } else if ('.' == toLowerCase || toLowerCase == '?' || toLowerCase == '!') {
                    r0 = 2;
                } else if (!Character.isSpaceChar(toLowerCase)) {
                    r0 = 1;
                } else if (obj != 2) {
                    r0 = 1;
                } else {
                    obj2 = obj;
                }
                cArr[i2] = toLowerCase;
                i2++;
                obj = obj2;
            }
            return new String(cArr);
        } catch (Throwable e) {
            throw ei.ac(e, "gi.ap(" + ')');
        }
    }
}
