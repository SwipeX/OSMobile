package defpackage;

public class an extends je {
    static js ac = new js(64, null);
    static ju aj = null;
    public static final int aq = 8;
    static final int as = 4;
    static ab hg;
    public boolean an;

    an() {
        try {
            this.an = false;
        } catch (Throwable e) {
            throw ei.ac(e, "an.<init>(" + ')');
        }
    }

    public static void aa(ju juVar) {
        aj = juVar;
    }

    public static void ak(ju juVar) {
        aj = juVar;
    }

    public static void ao(ju juVar) {
        aj = juVar;
    }

    public static void ap(ju juVar) {
        aj = juVar;
    }

    public static an ah(int i) {
        an anVar = (an) ac.aj((long) i);
        if (anVar == null) {
            byte[] an = aj.an(15, i, -1524393287);
            anVar = new an();
            if (an != null) {
                anVar.an(new he(an), 942702654);
            }
            ac.an(anVar, (long) i);
        }
        return anVar;
    }

    public static an at(int i) {
        an anVar = (an) ac.aj((long) i);
        if (anVar == null) {
            byte[] an = aj.an(15, i, 461628454);
            anVar = new an();
            if (an != null) {
                anVar.an(new he(an), 1440815133);
            }
            ac.an(anVar, (long) i);
        }
        return anVar;
    }

    public static String ac(long j) {
        if (j <= 0 || j >= 6582952005840035281L) {
            return null;
        }
        if (0 == j % 37) {
            return null;
        }
        int i = 0;
        long j2 = j;
        while (j2 != 0) {
            i++;
            try {
                j2 /= 37;
            } catch (Throwable e) {
                throw ei.ac(e, "an.ac(" + ')');
            }
        }
        StringBuilder stringBuilder = new StringBuilder(i);
        while (j != 0) {
            long j3 = j / 37;
            char c = ly.aj[(int) (j - (37 * j3))];
            if (c == '_') {
                int length = stringBuilder.length() - 1;
                stringBuilder.setCharAt(length, Character.toUpperCase(stringBuilder.charAt(length)));
                c = ' ';
            }
            stringBuilder.append(c);
            j = j3;
        }
        stringBuilder.reverse();
        stringBuilder.setCharAt(0, Character.toUpperCase(stringBuilder.charAt(0)));
        return stringBuilder.toString();
    }

    void ai(he heVar) {
        while (true) {
            int au = heVar.au(-310118664);
            if (au != 0) {
                aq(heVar, au, (byte) 61);
            } else {
                return;
            }
        }
    }

    void an(he heVar, int i) {
        while (true) {
            try {
                int au = heVar.au(-310118664);
                if (au != 0) {
                    aq(heVar, au, (byte) 16);
                } else {
                    return;
                }
            } catch (Throwable e) {
                throw ei.ac(e, "an.an(" + ')');
            }
        }
    }

    static gu aq(int i, int i2, byte b) {
        try {
            return ((gj) gt.aj.get(Integer.valueOf(i))).ac(i2, -355504655);
        } catch (Throwable e) {
            throw ei.ac(e, "an.aq(" + ')');
        }
    }

    void aq(he heVar, int i, byte b) {
        if (i == 2) {
            try {
                this.an = true;
            } catch (Throwable e) {
                throw ei.ac(e, "an.aq(" + ')');
            }
        }
    }

    void aw(he heVar, int i) {
        if (i == 2) {
            this.an = true;
        }
    }

    static void ac(ju juVar, ju juVar2, boolean z, int i, es esVar, short s) {
        boolean z2 = true;
        int i2 = 0;
        try {
            if (!fw.aj) {
                int i3;
                client.ac.um(fw.dt, -226835033);
                fp fpVar = fw.dt;
                if (client.ac.al) {
                    z2 = false;
                }
                fpVar.aj = z2;
                fw.bc = -187329259 * i;
                esVar.ac((byte) 14);
                mi.ak = ej.aj(juVar.ag("title.jpg", "", -1098896880), -821555352);
                fw.ap = mi.ak.aj();
                if (((-827123157 * client.aq) & dd.ak) != 0) {
                    eu.at = dq.aa(juVar2, "logo_deadman_mode", "", (byte) -65);
                } else {
                    eu.at = dq.aa(juVar2, "logo", "", (byte) -112);
                }
                fw.an = dq.aa(juVar2, "titlebox", "", (byte) -99);
                fw.ao = fw.an.aq * 1491963997;
                fw.aq = dq.aa(juVar2, "titlebutton", "", (byte) -72);
                fw.aa = fc.ao(juVar2, "runes", "", (byte) -38);
                bh.ah = fc.ao(juVar2, "title_mute", "", (byte) -41);
                ke.ai = dq.aa(juVar2, "options_radio_buttons,0", "", (byte) -27);
                ac.aw = dq.aa(juVar2, "options_radio_buttons,4", "", (byte) -103);
                eu.am = dq.aa(juVar2, "options_radio_buttons,2", "", (byte) -125);
                fw.ae = dq.aa(juVar2, "options_radio_buttons,6", "", (byte) -17);
                gt.cp = ke.ai.an * 143527369;
                bg.ct = 1563276307 * ke.ai.aq;
                lm.bp = new int[bq.ah];
                for (i3 = 0; i3 < 64; i3++) {
                    lm.bp[i3] = 262144 * i3;
                }
                for (i3 = 0; i3 < 64; i3++) {
                    lm.bp[i3 + 64] = 16711680 + (i3 * 1024);
                }
                for (i3 = 0; i3 < 64; i3++) {
                    lm.bp[i3 + cj.ak] = 16776960 + (i3 * 4);
                }
                for (i3 = 0; i3 < 64; i3++) {
                    lm.bp[i3 + 192] = 16777215;
                }
                dc.bm = new int[bq.ah];
                for (i3 = 0; i3 < 64; i3++) {
                    dc.bm[i3] = i3 * 1024;
                }
                for (i3 = 0; i3 < 64; i3++) {
                    dc.bm[i3 + 64] = (i3 * 4) + 65280;
                }
                for (i3 = 0; i3 < 64; i3++) {
                    dc.bm[i3 + cj.ak] = (262144 * i3) + 65535;
                }
                for (i3 = 0; i3 < 64; i3++) {
                    dc.bm[i3 + 192] = 16777215;
                }
                gs.bh = new int[bq.ah];
                for (i3 = 0; i3 < 64; i3++) {
                    gs.bh[i3] = i3 * 4;
                }
                for (i3 = 0; i3 < 64; i3++) {
                    gs.bh[i3 + 64] = (262144 * i3) + 255;
                }
                for (i3 = 0; i3 < 64; i3++) {
                    gs.bh[i3 + cj.ak] = (i3 * 1024) + 16711935;
                }
                while (i2 < 64) {
                    gs.bh[i2 + 192] = 16777215;
                    i2++;
                }
                lt.ab = new int[bq.ah];
                aw.bb = new int[32768];
                ch.bu = new int[32768];
                az.ae(null, (short) 1702);
                dm.bd = new int[32768];
                ch.by = new int[32768];
                if (z) {
                    fw.cy = "";
                    fw.cl = "";
                }
                bi.ce = 0;
                cv.ch = "";
                fw.ci = true;
                fw.cs = false;
                fw.av = 395435175;
                fw.af = -1469451437;
                fw.au = (float) (1525295689 * fw.af);
                if (ae.nv.aq) {
                    cb.ap(2, 1870552051);
                } else {
                    gi.aa(2, ae.bl, "scape main", "", 255, false, (byte) -3);
                }
                hm.ac(false, 1652345369);
                fw.aj = true;
                fw.ac = 1461509477 * (((gf.pz * 647702547) - 765) / 2);
                fw.ay = -1143940794 + (fw.ac * -1034165285);
                kb.ag = (fw.ay * 1632636439) - 488220236;
            } else if (i == 4) {
                fw.bc = -187329259 * i;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "an.ac(" + ')');
        }
    }
}
