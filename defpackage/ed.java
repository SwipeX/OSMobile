package defpackage;

public class ed extends eb {
    static final int aa = 100;
    static final int ka = 100;
    public String ah;
    public byte ai;
    final ma ak;
    final er ap;
    public String at;
    public byte aw;

    public ed(ma maVar, er erVar) {
        try {
            super(100);
            this.at = null;
            this.ah = null;
            this.ak = maVar;
            this.ap = erVar;
        } catch (Throwable e) {
            throw ei.ac(e, "ed.<init>(" + ')');
        }
    }

    public static ai aj(int i, int i2) {
        try {
            ai aiVar = (ai) ai.ac.aj((long) i);
            if (aiVar == null) {
                byte[] an = ai.aj.an(19, i, 465799261);
                aiVar = new ai();
                if (an != null) {
                    aiVar.ac(new he(an), (byte) -59);
                }
                ai.ac.an(aiVar, (long) i);
            }
            return aiVar;
        } catch (Throwable e) {
            throw ei.ac(e, "ed.aj(" + ')');
        }
    }

    ey au(byte b) {
        try {
            return new et();
        } catch (Throwable e) {
            throw ei.ac(e, "ed.au(" + ')');
        }
    }

    ey cq() {
        return new et();
    }

    ey[] av(int i, byte b) {
        try {
            return new et[i];
        } catch (Throwable e) {
            throw ei.ac(e, "ed.av(" + ')');
        }
    }

    ey[] cu(int i) {
        return new et[i];
    }

    ey[] cv(int i) {
        return new et[i];
    }

    final void cg(String str, int i) {
        try {
            String ac = an.ac(cn.aj(str, 1255681724));
            if (ac == null) {
                ac = "";
            }
            this.at = ac;
        } catch (Throwable e) {
            throw ei.ac(e, "ed.cg(" + ')');
        }
    }

    final void cj(String str) {
        String ac = an.ac(cn.aj(str, 1703378872));
        if (ac == null) {
            ac = "";
        }
        this.at = ac;
    }

    final void cs(String str, int i) {
        try {
            String ac = an.ac(cn.aj(str, 1752531939));
            if (ac == null) {
                ac = "";
            }
            this.ah = ac;
        } catch (Throwable e) {
            throw ei.ac(e, "ed.cs(" + ')');
        }
    }

    final void da(String str) {
        String ac = an.ac(cn.aj(str, 585588574));
        if (ac == null) {
            ac = "";
        }
        this.ah = ac;
    }

    final void di(String str) {
        String ac = an.ac(cn.aj(str, 833734360));
        if (ac == null) {
            ac = "";
        }
        this.ah = ac;
    }

    public final void cx(he heVar, int i) {
        try {
            String str;
            cs(heVar.bh(-407477384), 265983714);
            long ab = heVar.ab((byte) 80);
            if (ab <= 0 || ab >= 6582952005840035281L) {
                str = null;
            } else if (0 == ab % 37) {
                str = null;
            } else {
                long j;
                int i2 = 0;
                for (j = ab; 0 != j; j /= 37) {
                    i2++;
                }
                StringBuilder stringBuilder = new StringBuilder(i2);
                while (0 != ab) {
                    j = ab / 37;
                    stringBuilder.append(ly.aj[(int) (ab - (37 * j))]);
                    ab = j;
                }
                str = stringBuilder.reverse().toString();
            }
            cg(str, 1718862346);
            this.ai = heVar.av(-1812212671);
            int au = heVar.au(-310118664);
            if (255 != au) {
                aj(-1850901960);
                for (int i3 = 0; i3 < au; i3++) {
                    et etVar = (et) ah(new ez(heVar.bh(-943145497), this.ak), -1127981564);
                    etVar.an = heVar.ay((byte) 1) * 197508263;
                    etVar.aq = heVar.av(-650197641);
                    heVar.bh(499637614);
                    cz(etVar, (byte) 8);
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ed.cx(" + ')');
        }
    }

    public final void dq(he heVar) {
        String str = null;
        int i = 0;
        cs(heVar.bh(-124036999), 1877831631);
        long ab = heVar.ab((byte) 119);
        if (ab > 0 && ab < 6582952005840035281L) {
            if (0 != ab % 37) {
                long j;
                int i2 = 0;
                for (j = ab; 0 != j; j /= 37) {
                    i2++;
                }
                StringBuilder stringBuilder = new StringBuilder(i2);
                while (0 != ab) {
                    j = ab / 37;
                    stringBuilder.append(ly.aj[(int) (ab - (j * 37))]);
                    ab = j;
                }
                str = stringBuilder.reverse().toString();
            }
        }
        cg(str, 803462828);
        this.ai = heVar.av(-1548859380);
        int au = heVar.au(-310118664);
        if (255 != au) {
            aj(-1850901960);
            while (i < au) {
                et etVar = (et) ah(new ez(heVar.bh(-1653424387), this.ak), -492605941);
                etVar.an = heVar.ay((byte) 1) * 197508263;
                etVar.aq = heVar.av(-322592784);
                heVar.bh(331266963);
                cz(etVar, (byte) 8);
                i++;
            }
        }
    }

    public final void dt(he heVar) {
        String str = null;
        int i = 0;
        cs(heVar.bh(-1279147638), 1972283863);
        long ab = heVar.ab((byte) 117);
        if (ab > 0 && ab < 6582952005840035281L && 0 != ab % 37) {
            long j;
            int i2 = 0;
            for (j = ab; 0 != j; j /= 37) {
                i2++;
            }
            StringBuilder stringBuilder = new StringBuilder(i2);
            while (0 != ab) {
                j = ab / 37;
                stringBuilder.append(ly.aj[(int) (ab - (j * 37))]);
                ab = j;
            }
            str = stringBuilder.reverse().toString();
        }
        cg(str, -1760835537);
        this.ai = heVar.av(-560686798);
        int au = heVar.au(-310118664);
        if (255 != au) {
            aj(-1850901960);
            while (i < au) {
                et etVar = (et) ah(new ez(heVar.bh(-312490575), this.ak), -665651362);
                etVar.an = heVar.ay((byte) 1) * 197508263;
                etVar.aq = heVar.av(-192613809);
                heVar.bh(-1837095389);
                cz(etVar, (byte) 8);
                i++;
            }
        }
    }

    public final void dv(he heVar) {
        String str = null;
        int i = 0;
        cs(heVar.bh(742219983), 2137081574);
        long ab = heVar.ab((byte) 6);
        if (ab > 0 && ab < 6582952005840035281L && 0 != ab % 37) {
            long j;
            int i2 = 0;
            for (j = ab; 0 != j; j /= 37) {
                i2++;
            }
            StringBuilder stringBuilder = new StringBuilder(i2);
            while (0 != ab) {
                j = ab / 37;
                stringBuilder.append(ly.aj[(int) (ab - (j * 37))]);
                ab = j;
            }
            str = stringBuilder.reverse().toString();
        }
        cg(str, 364976438);
        this.ai = heVar.av(33551230);
        int au = heVar.au(-310118664);
        if (255 != au) {
            aj(-1850901960);
            while (i < au) {
                et etVar = (et) ah(new ez(heVar.bh(-1613763437), this.ak), -1346892200);
                etVar.an = heVar.ay((byte) 1) * 408676220;
                etVar.aq = heVar.av(-213102604);
                heVar.bh(-546765092);
                cz(etVar, (byte) 8);
                i++;
            }
        }
    }

    public final void dw(he heVar) {
        String str = null;
        int i = 0;
        cs(heVar.bh(28079941), 383299737);
        long ab = heVar.ab((byte) 107);
        if (ab > 0 && ab < 6582952005840035281L) {
            if (0 != ab % 37) {
                long j;
                int i2 = 0;
                for (j = ab; 0 != j; j /= 37) {
                    i2++;
                }
                StringBuilder stringBuilder = new StringBuilder(i2);
                while (0 != ab) {
                    j = ab / 37;
                    stringBuilder.append(ly.aj[(int) (ab - (j * 37))]);
                    ab = j;
                }
                str = stringBuilder.reverse().toString();
            }
        }
        cg(str, -1464483883);
        this.ai = heVar.av(19481415);
        int au = heVar.au(-310118664);
        if (255 != au) {
            aj(-1850901960);
            while (i < au) {
                et etVar = (et) ah(new ez(heVar.bh(-295070531), this.ak), -1359054633);
                etVar.an = heVar.ay((byte) 1) * 1628390946;
                etVar.aq = heVar.av(-1340243373);
                heVar.bh(-1359262633);
                cz(etVar, (byte) 8);
                i++;
            }
        }
    }

    public final void cd(he heVar, byte b) {
        Object obj = 1;
        try {
            ez ezVar = new ez(heVar.bh(-963682827), this.ak);
            int ay = heVar.ay((byte) 1);
            byte av = heVar.av(-2003651754);
            if (av != Byte.MIN_VALUE) {
                obj = null;
            }
            et etVar;
            if (obj == null) {
                heVar.bh(-2047712106);
                etVar = (et) ao(ezVar, (byte) 48);
                if (etVar == null) {
                    if (ac((byte) -1) <= 1876854405 * this.aj) {
                        etVar = (et) ah(ezVar, -143818437);
                    } else {
                        return;
                    }
                }
                etVar.an = 197508263 * ay;
                etVar.aq = av;
                cz(etVar, (byte) 8);
            } else if (ac((byte) -1) != 0) {
                etVar = (et) aa(ezVar, -1889848858);
                if (etVar != null && etVar.an * 1184115479 == ay) {
                    at(etVar, 1624490097);
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ed.cd(" + ')');
        }
    }

    public final void dj(he heVar) {
        byte b = (byte) 1;
        ez ezVar = new ez(heVar.bh(768559328), this.ak);
        int ay = heVar.ay((byte) 1);
        byte av = heVar.av(-1489967706);
        if (av != Byte.MIN_VALUE) {
            b = (byte) 0;
        }
        et etVar;
        if (b == (byte) 0) {
            heVar.bh(-45499267);
            etVar = (et) ao(ezVar, (byte) -8);
            if (etVar == null) {
                if (ac((byte) -1) <= 1876854405 * this.aj) {
                    etVar = (et) ah(ezVar, -1958350903);
                } else {
                    return;
                }
            }
            etVar.an = 197508263 * ay;
            etVar.aq = av;
            cz(etVar, (byte) 8);
        } else if (ac((byte) -1) != 0) {
            etVar = (et) aa(ezVar, -1923071681);
            if (etVar != null && etVar.an * 1184115479 == ay) {
                at(etVar, 1624490097);
            }
        }
    }

    public final void do(he heVar) {
        byte b = (byte) 1;
        ez ezVar = new ez(heVar.bh(-84317784), this.ak);
        int ay = heVar.ay((byte) 1);
        byte av = heVar.av(-1850504042);
        if (av != Byte.MIN_VALUE) {
            b = (byte) 0;
        }
        et etVar;
        if (b == (byte) 0) {
            heVar.bh(-1919368683);
            etVar = (et) ao(ezVar, (byte) -21);
            if (etVar == null) {
                if (ac((byte) -1) <= 1876854405 * this.aj) {
                    etVar = (et) ah(ezVar, -1545564306);
                } else {
                    return;
                }
            }
            etVar.an = 1927392618 * ay;
            etVar.aq = av;
            cz(etVar, (byte) 8);
        } else if (ac((byte) -1) != 0) {
            etVar = (et) aa(ezVar, -1899591434);
            if (etVar != null && etVar.an * 1184115479 == ay) {
                at(etVar, 1624490097);
            }
        }
    }

    public final void cw(int i) {
        int i2 = 0;
        while (i2 < ac((byte) -1)) {
            try {
                ((et) aw(i2, 1958276906)).ag((byte) 69);
                i2++;
            } catch (Throwable e) {
                throw ei.ac(e, "ed.cw(" + ')');
            }
        }
    }

    public final void dz() {
        for (int i = 0; i < ac((byte) -1); i++) {
            ((et) aw(i, 1568986466)).ag((byte) 83);
        }
    }

    public final void cn(int i) {
        int i2 = 0;
        while (i2 < ac((byte) -1)) {
            try {
                ((et) aw(i2, 1908810404)).ab(-338580808);
                i2++;
            } catch (Throwable e) {
                throw ei.ac(e, "ed.cn(" + ')');
            }
        }
    }

    public final void dg() {
        for (int i = 0; i < ac((byte) -1); i++) {
            ((et) aw(i, 1464998117)).ab(87604737);
        }
    }

    public final void dm() {
        for (int i = 0; i < ac((byte) -1); i++) {
            ((et) aw(i, 1532466313)).ab(-1054316740);
        }
    }

    public final void dn() {
        for (int i = 0; i < ac((byte) -1); i++) {
            ((et) aw(i, 1656943801)).ab(1375598003);
        }
    }

    public final void du() {
        for (int i = 0; i < ac((byte) -1); i++) {
            ((et) aw(i, 1704832952)).ab(-106638258);
        }
    }

    final void cz(et etVar, byte b) {
        try {
            if (etVar.aj(-1337647374).equals(this.ap.aj((byte) 59))) {
                this.aw = etVar.aq;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ed.cz(" + ')');
        }
    }

    final void df(et etVar) {
        if (etVar.aj(-1004906546).equals(this.ap.aj((byte) 107))) {
            this.aw = etVar.aq;
        }
    }

    static final void ai(byte b) {
        try {
            ix ixVar = (ix) null;
            cw.ac(30, "", ix.gz, -1847403268);
        } catch (Throwable e) {
            throw ei.ac(e, "ed.ai(" + ')');
        }
    }

    static final int al(int i, int i2, int i3) {
        int i4 = 126;
        if (-2 == i) {
            return 12345678;
        }
        if (i != -1) {
            try {
                int i5 = ((i & 127) * i2) / cj.ak;
                if (i5 < 2) {
                    i4 = 2;
                } else if (i5 <= 126) {
                    i4 = i5;
                }
                return i4 + (65408 & i);
            } catch (Throwable e) {
                throw ei.ac(e, "ed.al(" + ')');
            }
        } else if (i2 < 2) {
            return 2;
        } else {
            if (i2 > 126) {
                return 126;
            }
            return i2;
        }
    }
}
