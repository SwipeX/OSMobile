package defpackage;

public class bp {
    public static int[] ac = new int[2000];
    static int ah = 0;
    static int[] aj = new int[32];
    static byte[][][] ak = null;
    public static int[] an = new int[2000];
    static final int ap = 3500;
    static int at = 0;
    static final int br = 19136830;
    static jn cc;

    static {
        int i = 2;
        for (int i2 = 0; i2 < 32; i2++) {
            aj[i2] = i - 1;
            i += i;
        }
    }

    public static hp aj(hp[] hpVarArr, int i, int i2) {
        int i3 = 0;
        while (i3 < hpVarArr.length) {
            try {
                hp hpVar = hpVarArr[i3];
                if (i == hpVar.ac((byte) -31)) {
                    return hpVar;
                }
                i3++;
            } catch (Throwable e) {
                throw ei.ac(e, "bp.aj(" + ')');
            }
        }
        return null;
    }

    bp() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "bp.<init>(" + ')');
        }
    }

    public static int an(int i) {
        ao ac = ai.ac(i, -1783333661);
        int i2 = -306184639 * ac.an;
        int i3 = ac.aq * -1905563545;
        return aj[(ac.ao * 928716013) - i3] & (an[i2] >> i3);
    }

    public static int ao(int i) {
        ao ac = ai.ac(i, 582647986);
        int i2 = -306184639 * ac.an;
        int i3 = ac.aq * -1905563545;
        return aj[(ac.ao * 928716013) - i3] & (an[i2] >> i3);
    }

    public static int aq(int i) {
        ao ac = ai.ac(i, -2112969866);
        int i2 = -306184639 * ac.an;
        int i3 = ac.aq * -1905563545;
        return aj[(ac.ao * 928716013) - i3] & (an[i2] >> i3);
    }

    public static void aa(int i, int i2) {
        ao ac = ai.ac(i, -1305317041);
        int i3 = -306184639 * ac.an;
        int i4 = -1905563545 * ac.aq;
        int i5 = aj[(ac.ao * 928716013) - i4];
        if (i2 < 0 || i2 > i5) {
            i2 = 0;
        }
        i5 <<= i4;
        an[i3] = (i5 & (i2 << i4)) | (an[i3] & (i5 ^ -1));
    }

    public static void ak(int i, int i2) {
        ao ac = ai.ac(i, -1731500058);
        int i3 = -599133604 * ac.an;
        int i4 = -1905563545 * ac.aq;
        int i5 = aj[(ac.ao * 1045043005) - i4];
        if (i2 < 0 || i2 > i5) {
            i2 = 0;
        }
        i5 <<= i4;
        an[i3] = (i5 & (i2 << i4)) | (an[i3] & (i5 ^ -1));
    }

    public static void ap(int i, int i2) {
        ao ac = ai.ac(i, -1599420997);
        int i3 = 449536183 * ac.an;
        int i4 = -1905563545 * ac.aq;
        int i5 = aj[(ac.ao * 2052243751) - i4];
        if (i2 < 0 || i2 > i5) {
            i2 = 0;
        }
        i5 <<= i4;
        an[i3] = (i5 & (i2 << i4)) | (an[i3] & (i5 ^ -1));
    }

    public static final boolean an(char c, byte b) {
        return c == ' ' || ' ' == c || '_' == c || '-' == c;
    }

    static final void aq(byte[] bArr, int i, int i2, int i3, int i4, eh[] ehVarArr, int i5) {
        for (int i6 = 0; i6 < 4; i6++) {
            int i7 = 0;
            while (i7 < 64) {
                int i8 = 0;
                while (i8 < 64) {
                    if (i + i7 > 0 && i7 + i < 103 && i8 + i2 > 0 && i8 + i2 < 103) {
                        try {
                            int[] iArr = ehVarArr[i6].bs[i + i7];
                            int i9 = i8 + i2;
                            iArr[i9] = iArr[i9] & -16777217;
                        } catch (Throwable e) {
                            throw ei.ac(e, "bp.aq(" + ')');
                        }
                    }
                    i8++;
                }
                i7++;
            }
        }
        he heVar = new he(bArr);
        for (i7 = 0; i7 < 4; i7++) {
            for (int i10 = 0; i10 < 64; i10++) {
                for (int i11 = 0; i11 < 64; i11++) {
                    lo.aa(heVar, i7, i + i10, i11 + i2, i3, i4, 0, 499732039);
                }
            }
        }
    }

    static void af(jn jnVar, String str, int i) {
        try {
            gk gkVar = new gk(jnVar, str);
            client.od.add(gkVar);
            client.oe = (gkVar.an * -1053455497) + client.oe;
        } catch (Throwable e) {
            throw ei.ac(e, "bp.af(" + ')');
        }
    }

    static int au(int i, fs fsVar, boolean z, byte b) {
        boolean z2 = false;
        int[] iArr;
        int i2;
        int i3;
        int[] iArr2;
        int i4;
        if (3903 == i) {
            try {
                iArr = gr.ak;
                i2 = dy.ap - -401924967;
                dy.ap = i2;
                i3 = iArr[i2 * -38307927];
                iArr2 = gr.ak;
                i4 = dy.ap - 401924967;
                dy.ap = i4;
                iArr2[(i4 * -38307927) - 1] = client.nq[i3].aq(1981189731);
                return 1;
            } catch (Throwable e) {
                throw ei.ac(e, "bp.au(" + ')');
            }
        } else if (3904 == i) {
            iArr = gr.ak;
            i2 = dy.ap - -401924967;
            dy.ap = i2;
            i3 = iArr[i2 * -38307927];
            iArr2 = gr.ak;
            i4 = dy.ap - 401924967;
            dy.ap = i4;
            iArr2[(i4 * -38307927) - 1] = client.nq[i3].ac * -1076821163;
            return 1;
        } else if (i == 3905) {
            iArr = gr.ak;
            i2 = dy.ap - -401924967;
            dy.ap = i2;
            i3 = iArr[i2 * -38307927];
            iArr2 = gr.ak;
            i4 = dy.ap - 401924967;
            dy.ap = i4;
            iArr2[(i4 * -38307927) - 1] = client.nq[i3].an * -1180009383;
            return 1;
        } else if (i == 3906) {
            iArr = gr.ak;
            i2 = dy.ap - -401924967;
            dy.ap = i2;
            i3 = iArr[i2 * -38307927];
            iArr2 = gr.ak;
            i4 = dy.ap - 401924967;
            dy.ap = i4;
            iArr2[(i4 * -38307927) - 1] = client.nq[i3].aq * -454984787;
            return 1;
        } else if (3907 == i) {
            iArr = gr.ak;
            i2 = dy.ap - -401924967;
            dy.ap = i2;
            i3 = iArr[i2 * -38307927];
            iArr2 = gr.ak;
            i4 = dy.ap - 401924967;
            dy.ap = i4;
            iArr2[(i4 * -38307927) - 1] = client.nq[i3].ao * -885941205;
            return 1;
        } else if (3908 == i) {
            iArr = gr.ak;
            i2 = dy.ap - -401924967;
            dy.ap = i2;
            i3 = iArr[i2 * -38307927];
            iArr2 = gr.ak;
            i4 = dy.ap - 401924967;
            dy.ap = i4;
            iArr2[(i4 * -38307927) - 1] = client.nq[i3].aa * 1953429581;
            return 1;
        } else if (i == 3910) {
            iArr2 = gr.ak;
            i4 = dy.ap - -401924967;
            dy.ap = i4;
            i2 = client.nq[iArr2[i4 * -38307927]].an(-973005523);
            r3 = gr.ak;
            r4 = dy.ap - 401924967;
            dy.ap = r4;
            r4 = (r4 * -38307927) - 1;
            if (i2 == 0) {
                z2 = true;
            }
            r3[r4] = z2;
            return 1;
        } else if (3911 == i) {
            iArr2 = gr.ak;
            i4 = dy.ap - -401924967;
            dy.ap = i4;
            i2 = client.nq[iArr2[i4 * -38307927]].an(216584698);
            r3 = gr.ak;
            r4 = dy.ap - 401924967;
            dy.ap = r4;
            r4 = (r4 * -38307927) - 1;
            if (i2 == 2) {
                z2 = true;
            }
            r3[r4] = z2;
            return 1;
        } else if (3912 == i) {
            iArr2 = gr.ak;
            i4 = dy.ap - -401924967;
            dy.ap = i4;
            i2 = client.nq[iArr2[i4 * -38307927]].an(1007153941);
            r3 = gr.ak;
            r4 = dy.ap - 401924967;
            dy.ap = r4;
            r4 = (r4 * -38307927) - 1;
            if (5 == i2) {
                z2 = true;
            }
            r3[r4] = z2;
            return 1;
        } else if (i == 3913) {
            iArr2 = gr.ak;
            i4 = dy.ap - -401924967;
            dy.ap = i4;
            i2 = client.nq[iArr2[i4 * -38307927]].an(2052689865);
            r3 = gr.ak;
            r4 = dy.ap - 401924967;
            dy.ap = r4;
            r4 = (r4 * -38307927) - 1;
            if (1 == i2) {
                z2 = true;
            }
            r3[r4] = z2;
            return 1;
        } else if (3914 == i) {
            iArr2 = gr.ak;
            i4 = dy.ap - -401924967;
            dy.ap = i4;
            if (iArr2[i4 * -38307927] == 1) {
                z2 = true;
            }
            if (dv.oy == null) {
                return 1;
            }
            dv.oy.aj(nc.aq, z2, (byte) -91);
            return 1;
        } else if (i == 3915) {
            iArr2 = gr.ak;
            i4 = dy.ap - -401924967;
            dy.ap = i4;
            if (iArr2[i4 * -38307927] == 1) {
                z2 = true;
            }
            if (dv.oy == null) {
                return 1;
            }
            dv.oy.aj(nc.an, z2, (byte) -51);
            return 1;
        } else if (i == 3916) {
            boolean z3;
            dy.ap -= -803849934;
            if (gr.ak[dy.ap * -38307927] == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (1 == gr.ak[(dy.ap * -38307927) + 1]) {
                z2 = true;
            }
            if (dv.oy == null) {
                return 1;
            }
            client.op.aj = z2;
            dv.oy.aj(client.op, z3, (byte) -70);
            return 1;
        } else if (i == 3917) {
            iArr2 = gr.ak;
            i4 = dy.ap - -401924967;
            dy.ap = i4;
            if (iArr2[i4 * -38307927] == 1) {
                z2 = true;
            }
            if (dv.oy == null) {
                return 1;
            }
            dv.oy.aj(nc.ac, z2, (byte) -86);
            return 1;
        } else if (i == 3918) {
            iArr2 = gr.ak;
            i4 = dy.ap - -401924967;
            dy.ap = i4;
            if (iArr2[i4 * -38307927] == 1) {
                z2 = true;
            }
            if (dv.oy == null) {
                return 1;
            }
            dv.oy.aj(nc.ao, z2, (byte) -110);
            return 1;
        } else if (3919 == i) {
            iArr2 = gr.ak;
            i4 = dy.ap - 401924967;
            dy.ap = i4;
            i4 = (i4 * -38307927) - 1;
            if (dv.oy != null) {
                z2 = dv.oy.aj.size();
            }
            iArr2[i4] = z2;
            return 1;
        } else if (3920 == i) {
            iArr = gr.ak;
            i2 = dy.ap - -401924967;
            dy.ap = i2;
            r0 = (ml) dv.oy.aj.get(iArr[i2 * -38307927]);
            iArr2 = gr.ak;
            i4 = dy.ap - 401924967;
            dy.ap = i4;
            iArr2[(i4 * -38307927) - 1] = r0.aj * -2098656171;
            return 1;
        } else if (i == 3921) {
            iArr = gr.ak;
            i2 = dy.ap - -401924967;
            dy.ap = i2;
            r0 = (ml) dv.oy.aj.get(iArr[i2 * -38307927]);
            r2 = gr.at;
            i4 = di.ah + 436804489;
            di.ah = i4;
            r2[(i4 * 1894369977) - 1] = r0.aj((byte) 119);
            return 1;
        } else if (i == 3922) {
            iArr = gr.ak;
            i2 = dy.ap - -401924967;
            dy.ap = i2;
            r0 = (ml) dv.oy.aj.get(iArr[i2 * -38307927]);
            r2 = gr.at;
            i4 = di.ah + 436804489;
            di.ah = i4;
            r2[(i4 * 1894369977) - 1] = r0.ac((byte) 116);
            return 1;
        } else if (i == 3923) {
            iArr = gr.ak;
            i2 = dy.ap - -401924967;
            dy.ap = i2;
            long aj = (aw.aj((byte) -61) - (dy.or * -2619718517477709753L)) - (((ml) dv.oy.aj.get(iArr[i2 * -38307927])).ac * 5760870169085771817L);
            i3 = (int) (aj / 3600000);
            r4 = (int) ((aj - ((long) (3600000 * i3))) / 60000);
            i2 = (int) (((aj - ((long) (3600000 * i3))) - ((long) (60000 * r4))) / 1000);
            String str = i3 + ":" + (r4 / 10) + (r4 % 10) + ":" + (i2 / 10) + (i2 % 10);
            r2 = gr.at;
            i4 = di.ah + 436804489;
            di.ah = i4;
            r2[(i4 * 1894369977) - 1] = str;
            return 1;
        } else if (3924 == i) {
            iArr = gr.ak;
            i2 = dy.ap - -401924967;
            dy.ap = i2;
            r0 = (ml) dv.oy.aj.get(iArr[i2 * -38307927]);
            iArr2 = gr.ak;
            i4 = dy.ap - 401924967;
            dy.ap = i4;
            iArr2[(i4 * -38307927) - 1] = r0.an.aq * -454984787;
            return 1;
        } else if (3925 == i) {
            iArr = gr.ak;
            i2 = dy.ap - -401924967;
            dy.ap = i2;
            r0 = (ml) dv.oy.aj.get(iArr[i2 * -38307927]);
            iArr2 = gr.ak;
            i4 = dy.ap - 401924967;
            dy.ap = i4;
            iArr2[(i4 * -38307927) - 1] = r0.an.an * -1180009383;
            return 1;
        } else if (3926 != i) {
            return 2;
        } else {
            iArr = gr.ak;
            i2 = dy.ap - -401924967;
            dy.ap = i2;
            r0 = (ml) dv.oy.aj.get(iArr[i2 * -38307927]);
            iArr2 = gr.ak;
            i4 = dy.ap - 401924967;
            dy.ap = i4;
            iArr2[(i4 * -38307927) - 1] = r0.an.ac * -1076821163;
            return 1;
        }
    }
}
