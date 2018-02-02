package defpackage;

import java.text.DecimalFormat;

public class fw {
    static fl[] aa = null;
    static int ac = 0;
    static int[] ad = new int[bq.ah];
    static fl ae = null;
    static int af = -1469451437;
    static boolean aj = false;
    static fl an = null;
    static int ao = 0;
    static em ap = null;
    static fl aq = null;
    static float au = ((float) (1525295689 * af));
    static int av = (1809726173 * af);
    static int ay = (-1143940794 + (ac * -1034165285));
    static final int az = 200;
    static final int ba = 1;
    static int bc = 0;
    static String bf = "";
    static int bi = 0;
    static final int bj = 0;
    static String bk = "";
    static String bl = "";
    static int bo = 0;
    static String bq = "";
    static int br = 0;
    static int bs = 0;
    static int bt = 0;
    static int bx = 0;
    static int bz = -871043594;
    static String cb = "";
    static boolean ci = true;
    static int cj = -576720127;
    static boolean ck = false;
    static String cl = "";
    static boolean cm = false;
    static boolean co = false;
    static int cq = 0;
    static boolean cs = false;
    static String cu = "1234567890";
    static String cv = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
    static String cy = "";
    static final gl de = new gn();
    static int dh = 203418403;
    static long dj = 607912057828415363L;
    static final DecimalFormat dl = new DecimalFormat("##0.00");
    static final int[] dm = new int[4];
    static final gl do = new gq();
    static long dq = 1010664779252457049L;
    static final int ds = 128;
    static fp dt = new fp();
    static long dv = 4995597375227751213L;
    static long dz = 7767872980296034431L;
    static em[] ef;

    fw() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "fw.<init>(" + ')');
        }
    }

    static int ag(ju juVar, ju juVar2) {
        int i = 0;
        if (juVar.ar("title.jpg", "", (byte) 118)) {
            i = 1;
        }
        if (juVar2.ar("logo", "", (byte) 110)) {
            i++;
        }
        if (juVar2.ar("logo_deadman_mode", "", (byte) 99)) {
            i++;
        }
        if (juVar2.ar("titlebox", "", (byte) 76)) {
            i++;
        }
        if (juVar2.ar("titlebutton", "", (byte) 111)) {
            i++;
        }
        if (juVar2.ar("runes", "", (byte) 118)) {
            i++;
        }
        if (juVar2.ar("title_mute", "", (byte) 83)) {
            i++;
        }
        if (juVar2.ar("options_radio_buttons,0", "", (byte) 120)) {
            i++;
        }
        if (juVar2.ar("options_radio_buttons,2", "", (byte) 66)) {
            i++;
        }
        if (juVar2.ar("options_radio_buttons,4", "", (byte) 88)) {
            i++;
        }
        if (juVar2.ar("options_radio_buttons,6", "", (byte) 98)) {
            i++;
        }
        juVar2.ar("sl_back", "", (byte) 120);
        juVar2.ar("sl_flags", "", (byte) 124);
        juVar2.ar("sl_arrows", "", (byte) 86);
        juVar2.ar("sl_stars", "", (byte) 91);
        juVar2.ar("sl_button", "", (byte) 106);
        return i;
    }

    static int ay(ju juVar, ju juVar2) {
        int i = 0;
        if (juVar.ar("title.jpg", "", (byte) 78)) {
            i = 1;
        }
        if (juVar2.ar("logo", "", (byte) 94)) {
            i++;
        }
        if (juVar2.ar("logo_deadman_mode", "", (byte) 122)) {
            i++;
        }
        if (juVar2.ar("titlebox", "", Byte.MAX_VALUE)) {
            i++;
        }
        if (juVar2.ar("titlebutton", "", (byte) 117)) {
            i++;
        }
        if (juVar2.ar("runes", "", (byte) 126)) {
            i++;
        }
        if (juVar2.ar("title_mute", "", (byte) 69)) {
            i++;
        }
        if (juVar2.ar("options_radio_buttons,0", "", (byte) 119)) {
            i++;
        }
        if (juVar2.ar("options_radio_buttons,2", "", (byte) 120)) {
            i++;
        }
        if (juVar2.ar("options_radio_buttons,4", "", (byte) 117)) {
            i++;
        }
        if (juVar2.ar("options_radio_buttons,6", "", (byte) 96)) {
            i++;
        }
        juVar2.ar("sl_back", "", (byte) 106);
        juVar2.ar("sl_flags", "", (byte) 110);
        juVar2.ar("sl_arrows", "", (byte) 125);
        juVar2.ar("sl_stars", "", (byte) 102);
        juVar2.ar("sl_button", "", (byte) 75);
        return i;
    }

    static void ar(ju juVar, ju juVar2, boolean z, int i, es esVar) {
        if (!aj) {
            boolean z2;
            int i2;
            client.ac.um(dt, 187968866);
            fp fpVar = dt;
            if (client.ac.al) {
                z2 = false;
            } else {
                z2 = true;
            }
            fpVar.aj = z2;
            bc = -187329259 * i;
            esVar.ac((byte) 14);
            mi.ak = ej.aj(juVar.ag("title.jpg", "", -1337190339), -1575075922);
            ap = mi.ak.aj();
            if (((-827123157 * client.aq) & dd.ak) != 0) {
                eu.at = dq.aa(juVar2, "logo_deadman_mode", "", (byte) -95);
            } else {
                eu.at = dq.aa(juVar2, "logo", "", (byte) -17);
            }
            an = dq.aa(juVar2, "titlebox", "", (byte) -80);
            ao = an.aq * 1491963997;
            aq = dq.aa(juVar2, "titlebutton", "", (byte) -82);
            aa = fc.ao(juVar2, "runes", "", (byte) -99);
            bh.ah = fc.ao(juVar2, "title_mute", "", (byte) -83);
            ke.ai = dq.aa(juVar2, "options_radio_buttons,0", "", (byte) -15);
            ac.aw = dq.aa(juVar2, "options_radio_buttons,4", "", (byte) -73);
            eu.am = dq.aa(juVar2, "options_radio_buttons,2", "", (byte) -8);
            ae = dq.aa(juVar2, "options_radio_buttons,6", "", (byte) -25);
            gt.cp = ke.ai.an * 143527369;
            bg.ct = 1563276307 * ke.ai.aq;
            lm.bp = new int[bq.ah];
            for (i2 = 0; i2 < 64; i2++) {
                lm.bp[i2] = 262144 * i2;
            }
            for (i2 = 0; i2 < 64; i2++) {
                lm.bp[i2 + 64] = 16711680 + (i2 * 1024);
            }
            for (i2 = 0; i2 < 64; i2++) {
                lm.bp[i2 + 128] = 16776960 + (i2 * 4);
            }
            for (i2 = 0; i2 < 64; i2++) {
                lm.bp[i2 + 192] = 16777215;
            }
            dc.bm = new int[bq.ah];
            for (i2 = 0; i2 < 64; i2++) {
                dc.bm[i2] = i2 * 1024;
            }
            for (i2 = 0; i2 < 64; i2++) {
                dc.bm[i2 + 64] = (i2 * 4) + 65280;
            }
            for (i2 = 0; i2 < 64; i2++) {
                dc.bm[i2 + 128] = (262144 * i2) + 65535;
            }
            for (i2 = 0; i2 < 64; i2++) {
                dc.bm[i2 + 192] = 16777215;
            }
            gs.bh = new int[bq.ah];
            for (i2 = 0; i2 < 64; i2++) {
                gs.bh[i2] = i2 * 4;
            }
            for (i2 = 0; i2 < 64; i2++) {
                gs.bh[i2 + 64] = (262144 * i2) + 255;
            }
            for (i2 = 0; i2 < 64; i2++) {
                gs.bh[i2 + 128] = (i2 * 1024) + 16711935;
            }
            for (i2 = 0; i2 < 64; i2++) {
                gs.bh[i2 + 192] = 16777215;
            }
            lt.ab = new int[bq.ah];
            aw.bb = new int[32768];
            ch.bu = new int[32768];
            az.ae(null, (short) 1702);
            dm.bd = new int[32768];
            ch.by = new int[32768];
            if (z) {
                cy = "";
                cl = "";
            }
            bi.ce = 0;
            cv.ch = "";
            ci = true;
            cs = false;
            av = 395435175;
            af = -1469451437;
            au = (float) (1525295689 * af);
            if (ae.nv.aq) {
                cb.ap(2, 2040336582);
            } else {
                gi.aa(2, ae.bl, "scape main", "", 255, false, (byte) -15);
            }
            hm.ac(false, -221876484);
            aj = true;
            ac = 1461509477 * (((gf.pz * 647702547) - 765) / 2);
            ay = -1143940794 + (ac * -1034165285);
            kb.ag = (ay * 1632636439) - 488220236;
        } else if (i == 4) {
            bc = -187329259 * i;
        }
    }

    static fl ad(boolean z, boolean z2) {
        return z ? z2 ? ae : eu.am : z2 ? ac.aw : ke.ai;
    }

    static String ab() {
        if (ae.nv.ak) {
            return kx.at('*', cy.length(), -756493744);
        }
        return cy;
    }

    static String bh() {
        if (ae.nv.ak) {
            return kx.at('*', cy.length(), -796679312);
        }
        return cy;
    }

    static String bm() {
        if (ae.nv.ak) {
            return kx.at('荝', cy.length(), -179421900);
        }
        return cy;
    }

    static String bp() {
        if (ae.nv.ak) {
            return kx.at('*', cy.length(), -353477005);
        }
        return cy;
    }

    static void bt() {
        if (cy != null && cy.length() > 0) {
            return;
        }
        if (ae.nv.aa != null) {
            cy = ae.nv.aa;
            co = true;
            return;
        }
        co = false;
    }

    static void bb() {
        if (!co || cy == null || cy.length() <= 0) {
            cq = 0;
        } else {
            cq = -301925717;
        }
    }

    static void br() {
        if (!co || cy == null || cy.length() <= 0) {
            cq = 0;
        } else {
            cq = -1100403687;
        }
    }

    static void bu() {
        if (!co || cy == null || cy.length() <= 0) {
            cq = 0;
        } else {
            cq = 44071960;
        }
    }

    static void bd(char c) {
        Object obj = 1;
        Object obj2 = null;
        int i;
        if (bc * 2048922173 == 2) {
            for (i = 0; i < cv.length(); i++) {
                if (c == cv.charAt(i)) {
                    obj2 = 1;
                    break;
                }
            }
            if (obj2 == null) {
                return;
            }
            if (cq * -2064175101 == 0) {
                if (cy.length() < 320) {
                    cy += c;
                }
            } else if (cq * -2064175101 == 1 && cl.length() < 20) {
                cl += c;
            }
        } else if (bc * 2048922173 == 4) {
            for (i = 0; i < cu.length(); i++) {
                if (c == cu.charAt(i)) {
                    break;
                }
            }
            obj = null;
            if (obj != null && cv.ch.length() < 6) {
                cv.ch += c;
            }
        } else if (bc * 2048922173 == 5) {
            for (i = 0; i < cv.length(); i++) {
                if (c == cv.charAt(i)) {
                    obj2 = 1;
                    break;
                }
            }
            if (obj2 != null && cy.length() < 320) {
                cy += c;
            }
        }
    }

    static void bx(char c) {
        Object obj = 1;
        Object obj2 = null;
        int i;
        if (bc * 2048922173 == 2) {
            for (i = 0; i < cv.length(); i++) {
                if (c == cv.charAt(i)) {
                    obj2 = 1;
                    break;
                }
            }
            if (obj2 == null) {
                return;
            }
            if (cq * -2064175101 == 0) {
                if (cy.length() < 320) {
                    cy += c;
                }
            } else if (cq * -2064175101 == 1 && cl.length() < 20) {
                cl += c;
            }
        } else if (bc * 2048922173 == 4) {
            for (i = 0; i < cu.length(); i++) {
                if (c == cu.charAt(i)) {
                    break;
                }
            }
            obj = null;
            if (obj != null && cv.ch.length() < 6) {
                cv.ch += c;
            }
        } else if (bc * 2048922173 == 5) {
            for (i = 0; i < cv.length(); i++) {
                if (c == cv.charAt(i)) {
                    break;
                }
            }
            obj = null;
            if (obj != null && cy.length() < 320) {
                cy += c;
            }
        }
    }

    static void by(char c) {
        Object obj = 1;
        Object obj2 = null;
        int i;
        if (1197096161 * bc == 2) {
            for (i = 0; i < cv.length(); i++) {
                if (c == cv.charAt(i)) {
                    obj2 = 1;
                    break;
                }
            }
            if (obj2 == null) {
                return;
            }
            if (97244194 * cq == 0) {
                if (cy.length() < 320) {
                    cy += c;
                }
            } else if (cq * -1422050267 == 1 && cl.length() < 20) {
                cl += c;
            }
        } else if (bc * 2048922173 == 4) {
            for (i = 0; i < cu.length(); i++) {
                if (c == cu.charAt(i)) {
                    break;
                }
            }
            obj = null;
            if (obj != null && cv.ch.length() < 6) {
                cv.ch += c;
            }
        } else if (-548640297 * bc == 5) {
            for (i = 0; i < cv.length(); i++) {
                if (c == cv.charAt(i)) {
                    obj2 = 1;
                    break;
                }
            }
            if (obj2 != null && cy.length() < 320) {
                cy += c;
            }
        }
    }

    static void bi(ks ksVar, es esVar) {
        if (cs) {
            ar.ax(ksVar, esVar, -92721472);
            return;
        }
        int i = -124114311 * dt.an;
        int i2 = 142688287 * dt.aq;
        boolean z = dt.ao;
        boolean z2 = dt.aa;
        boolean z3 = dt.ak;
        boolean z4 = dt.ap;
        dt.an(-185368015);
        if (z && i >= ((ac * 1255532454) + 765) - -1515184588 && i < (ac * -1086486213) + 765 && i2 >= -889687158 && i2 < dy.ks) {
            ae.nv.aq = !ae.nv.aq;
            et.an(381994439);
            if (ae.nv.aq) {
                hn.ao(602278887);
            } else {
                ga.ac(ae.bl, "scape main", "", 255, false, 65280);
            }
        }
        if (client.az * 1827781011 != 5) {
            if (-1 == dv * -8545241206418545829L) {
                dv = (aw.aj((byte) -4) + 1000) * -4995597375227751213L;
            }
            long aj = aw.aj((byte) -72);
            if (bj.au(570784513) && -1 == -7979269953817283049L * dq) {
                dq = aj * -1010664779252457049L;
                if (dq * -7979269953817283049L > dv * -8545241206418545829L) {
                    dv = dq * -7276231893158289163L;
                }
            }
            bs += 1070802643;
            if (899561128 * client.az == 10 || 11 == 975523277 * client.az) {
                int i3;
                if (1605167210 * client.ai == 0) {
                    if (z) {
                        i3 = (-1775170451 * ac) + 5;
                        if (i >= i3 && i <= i3 + 100 && i2 >= 463 && i2 <= 498) {
                            be.au(2137217090);
                            return;
                        }
                    }
                    if (gh.ah != null) {
                        be.au(2100328772);
                    }
                }
                i3 = client.ac.to(-401924967);
                if (i3 != dh * -171351179) {
                    dh = 1865395081 * i3;
                    dt.dk = -75878353 * client.af;
                }
                if (1524510953 * client.af >= (-487093271 * dt.dk) + 8) {
                    if (-1 == dh * -171351179 || i3 >= (ao * -343489547) + 171) {
                        av = -593213011;
                    } else {
                        av = ((i3 - (ao * -288098724)) / 2) * -1956795403;
                        if (av * 1065969757 < 0) {
                            av = 0;
                        }
                    }
                }
                if (-204616877 * av != af * -1946929075) {
                    float f = 0.25f * (((float) (av * 1065969757)) - au);
                    if (f > -0.5f && f < 0.5f) {
                        f = (float) ((av * -2083406475) - (af * -1489019751));
                    }
                    au = f + au;
                    af = ((int) au) * 1162705317;
                }
                int i4;
                String str;
                if (bc * 2048922173 == 0) {
                    i3 = (1694902984 * kb.ag) - 80;
                    i4 = ((1525295689 * af) + 100) + 20;
                    if (z && i >= i3 - 75 && i <= i3 + 75 && i2 >= i4 - 20 && i2 <= i4 + 20) {
                        str = dl.fu("secure", true, -1362338281) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                        if (ki.aj.startsWith("win")) {
                            jg.aj(str, 0, 1867680690);
                        } else if (ki.aj.startsWith("mac")) {
                            cx.ac(str, 1, "openjs", (byte) 0);
                        } else {
                            jg.aj(str, 2, 2092959627);
                        }
                    }
                    i3 = (-229836607 * kb.ag) - 1507767602;
                    if ((z && i >= i3 - 75 && i <= i3 + 75 && i2 >= i4 - 20 && i2 <= i4 + 20) || z2) {
                        if (((client.aq * 173200833) & -1776042062) != 0) {
                            bk = "";
                            bf = ix.ia;
                            bl = ix.iu;
                            cb = ix.ig;
                            bc = -187329259;
                            ab.aa((byte) -18);
                        } else if (((client.aq * 1292614788) & 4) != 0) {
                            if (((client.aq * 2121354707) & 1049310124) != 0) {
                                bf = ix.iz;
                                bl = ix.in;
                                cb = ix.iw;
                            } else {
                                bf = ix.id;
                                bl = ix.it;
                                cb = ix.iy;
                            }
                            bk = ix.il;
                            bc = -187329259;
                            ab.aa((byte) 41);
                        } else if (((client.aq * -827123157) & -425911077) != 0) {
                            bf = ix.ic;
                            bl = ix.ib;
                            cb = ix.io;
                            bk = ix.il;
                            bc = -187329259;
                            ab.aa((byte) -79);
                        } else {
                            fn.ah(false, -2143350688);
                        }
                    }
                } else if (bc * 2048922173 == 1) {
                    if (z3) {
                        fd.at(false, (byte) 77);
                    } else if (z2) {
                        fn.ah(false, -1414041981);
                    }
                    i3 = (-265790713 * kb.ag) - -1560862430;
                    i4 = ((1525295689 * af) + 100) + 50;
                    if (z && i >= i3 - 75 && i <= i3 + 1394247048 && i2 >= i4 - 20 && i2 <= i4 + 20) {
                        fn.ah(false, -945227905);
                    }
                    i3 = (-229836607 * kb.ag) + 80;
                    if (z && i >= i3 - 1061588666 && i <= i3 - 966290269 && i2 >= i4 - 20 && i2 <= i4 + 20) {
                        fd.at(false, (byte) -73);
                    }
                } else if (2112016669 * bc == 2) {
                    i3 = (((af * -356550513) + 100) - 753590114) + 52;
                    if (z && i2 >= i3 - 12 && i2 < i3 + 2) {
                        cq = 0;
                    }
                    i3 += 15;
                    if (z && i2 >= i3 - 12 && i2 < i3 + 2) {
                        cq = -1441113887;
                    }
                    i3 += 15;
                    i3 = ((af * -1864295284) + 1652700755) + 90;
                    if (!z || i2 < i3 - 15 || i2 >= i3) {
                        i3 = (kb.ag * 1284854) - -1288245367;
                        i4 = ((-524580702 * af) + 100) + 50;
                        if (!z || i < i3 - 75 || i > i3 - 2074551942 || i2 < i4 - 20 || i2 > i4 + 20) {
                            boolean z5;
                            i3 = ((-673913001 * ay) + 180) + 80;
                            if (z && i >= i3 - 75 && i <= i3 + 75 && i2 >= i4 - 20 && i2 <= i4 + 20) {
                                fd.at(true, (byte) -69);
                                ci = true;
                            }
                            i3 = (kb.ag * -1293030755) - 1388245845;
                            i4 = 796507070 + (1525295689 * af);
                            if (i < i3 || i >= i3 + (gt.cp * -951214983) || i2 < i4 || i2 >= (bg.ct * -381274597) + i4) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            cm = z5;
                            if (z && cm) {
                                if (co) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                                co = z5;
                                if (!(co || ae.nv.aa == null)) {
                                    ae.nv.aa = null;
                                    et.an(143752918);
                                }
                            }
                            i3 = (1469019393 * kb.ag) + 24;
                            i4 = 512112979 + (1525295689 * af);
                            if (i < i3 || i >= i3 + (gt.cp * -951214983) || i2 < i4 || i2 >= (-1769642783 * bg.ct) + i4) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            ck = z5;
                            if (z && ck) {
                                fk fkVar = ae.nv;
                                if (ae.nv.ak) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                                fkVar.ak = z5;
                                if (!ae.nv.ak) {
                                    cy = "";
                                    ae.nv.aa = null;
                                    ab.aa((byte) -26);
                                }
                                et.an(1190273129);
                            }
                            if (z3) {
                                fd.at(true, (byte) 42);
                                ci = true;
                                return;
                            } else if (z2) {
                                if (cq * 186472288 == 0) {
                                    cq = -301925717;
                                    return;
                                }
                                cq = 0;
                                cy = cy.trim();
                                if (cy.length() == 0) {
                                    dk.am(ix.ed, ix.et, ix.ec, 163642253);
                                    return;
                                } else if (cl.length() == 0) {
                                    dk.am(ix.ea, ix.er, ix.ee, 63583474);
                                    return;
                                } else {
                                    dk.am(ix.ir, ix.ip, ix.ii, -921292167);
                                    fv.bt(false, -457245046);
                                    gx.as(20, (short) -4343);
                                    return;
                                }
                            } else if (!z4) {
                                return;
                            } else {
                                if (-2064175101 * cq == 0) {
                                    cq = -452678497;
                                    return;
                                } else {
                                    cq = 0;
                                    return;
                                }
                            }
                        }
                        cy = cy.trim();
                        if (cy.length() == 0) {
                            dk.am(ix.ed, ix.et, ix.ec, -2044263909);
                            return;
                        } else if (cl.length() == 0) {
                            dk.am(ix.ea, ix.er, ix.ee, -507641174);
                            return;
                        } else {
                            dk.am(ix.ir, ix.ip, ix.ii, 605687133);
                            fv.bt(false, 370886407);
                            gx.as(20, (short) -4857);
                            return;
                        }
                    }
                    dk.am(ix.jc, ix.jz, ix.ja, 366139488);
                    bc = -936646295;
                } else if (bc * 553682322 == 3) {
                    i3 = 2111587521 + (ay * -1163091066);
                    i4 = ((1525295689 * af) + 1525629509) + 5;
                    if (z2 || z3 || (z && i >= i3 - 75 && i <= i3 + 75 && i2 >= i4 - 20 && i2 <= i4 + 20)) {
                        fn.ah(false, -1240418730);
                    }
                    i3 = (713061345 * ay) + 180;
                    i4 = ((af * 1525295689) + 100) + 55;
                    if (z && i >= i3 - 75 && i <= i3 + 75 && i2 >= i4 - 20 && i2 <= i4 + 20) {
                        dk.am(ix.jc, ix.jz, ix.ja, -207648452);
                        bc = -2117908277;
                    }
                } else if (-1600270060 * bc == 4) {
                    i3 = ((-315369879 * ay) + 1113075080) - 80;
                    i4 = ((-1365509793 * af) + 100) + 50;
                    if (!z || i < i3 - 75 || i > i3 + 75 || i2 < i4 - 20 || i2 > i4 + 20) {
                        if (z && i >= ((ay * -673913001) + 180) - 9 && i <= (1487578449 + (1920879883 * ay)) + 716671246 && i2 >= ((af * 1525295689) + 100) - 8 && i2 <= ((1525295689 * af) + 1673879344) + 25) {
                            ci = !ci;
                        }
                        if (z && i >= ((-765735435 * ay) + 180) - -1375964482 && i <= ((-673913001 * ay) + 180) + 34 && i2 >= ((277667855 * af) + 956004079) - 821322057 && i2 <= ((af * 1525295689) + 100) + 92) {
                            str = dl.fu("secure", true, -1273998664) + "m=totp-authenticator/disableTOTPRequest";
                            if (ki.aj.startsWith("win")) {
                                jg.aj(str, 0, 2018522932);
                            } else if (ki.aj.startsWith("mac")) {
                                cx.ac(str, 1, "openjs", (byte) 0);
                            } else {
                                jg.aj(str, 2, 2046972517);
                            }
                        }
                        i3 = (-1206400027 + (-673913001 * ay)) + 80;
                        if (z && i >= i3 - 75 && i <= i3 + 75 && i2 >= i4 - 20 && i2 <= i4 + 20) {
                            fd.at(true, (byte) -9);
                        }
                        if (z3) {
                            fd.at(true, (byte) -22);
                            return;
                        } else if (z2) {
                            cv.ch.trim();
                            if (cv.ch.length() != 6) {
                                dk.am(ix.bx, ix.bi, ix.bs, 1427077319);
                                return;
                            }
                            bi.ce = Integer.parseInt(cv.ch) * -697175580;
                            cv.ch = "";
                            fv.bt(true, -642587589);
                            dk.am(ix.ir, ix.ip, ix.ii, 1128643550);
                            gx.as(20, (short) 18611);
                            return;
                        } else {
                            return;
                        }
                    }
                    cv.ch.trim();
                    if (cv.ch.length() != 6) {
                        dk.am(ix.bx, ix.bi, ix.bs, -250203066);
                        return;
                    }
                    bi.ce = Integer.parseInt(cv.ch) * -622464537;
                    cv.ch = "";
                    fv.bt(true, 124274612);
                    dk.am(ix.ir, ix.ip, ix.ii, 1558332592);
                    gx.as(20, (short) -4469);
                } else if (bc * 609392477 == 5) {
                    i3 = ((ay * -673913001) - 952798789) - 80;
                    i4 = (-1826531333 + (af * -1162367735)) + 50;
                    if (!z || i < i3 - 388458052 || i > i3 + 75 || i2 < i4 - 20 || i2 > i4 + 20) {
                        i3 = ((1244822089 * ay) + 180) + 80;
                        if (z && i >= i3 - 75 && i <= i3 + 75 && i2 >= i4 - 20 && i2 <= i4 + 20) {
                            fn.ah(true, -270453059);
                        }
                        if (z3) {
                            fn.ah(true, -1474770552);
                            return;
                        } else if (z2) {
                            hi.ai((byte) 0);
                            return;
                        } else {
                            return;
                        }
                    }
                    hi.ai((byte) 0);
                } else if (bc * -1293081669 == 6) {
                    if (z2 || z3) {
                        fn.ah(true, -753165460);
                    }
                    i3 = ((af * 1525295689) + 100) + 50;
                    if (z && i2 >= i3 - 20 && i2 <= i3 + 20) {
                        fn.ah(true, -1246361977);
                    }
                }
            }
        }
    }

    static void bs(ks ksVar, es esVar) {
        if (cs) {
            ar.ax(ksVar, esVar, -676034514);
            return;
        }
        boolean z;
        int i = 1692209959 * dt.an;
        int i2 = 142688287 * dt.aq;
        boolean z2 = dt.ao;
        boolean z3 = dt.aa;
        boolean z4 = dt.ak;
        boolean z5 = dt.ap;
        dt.an(49283737);
        if (z2 && i >= (1575298007 + (ac * 1623850600)) - 1971978048 && i < (ac * -1775170451) + 765 && i2 >= 2118472485 && i2 < dy.ks) {
            fk fkVar = ae.nv;
            if (ae.nv.aq) {
                z = false;
            } else {
                z = true;
            }
            fkVar.aq = z;
            et.an(-1688930979);
            if (ae.nv.aq) {
                hn.ao(328952598);
            } else {
                ga.ac(ae.bl, "scape main", "", 2093897505, false, 65280);
            }
        }
        if (client.az * -1509356823 != 5) {
            if (-1 == dv * -8545241206418545829L) {
                dv = (aw.aj((byte) -20) + 1000) * -4995597375227751213L;
            }
            long aj = aw.aj((byte) 44);
            if (bj.au(1144074947) && -1 == -7979269953817283049L * dq) {
                dq = aj * -1010664779252457049L;
                if (dq * -7979269953817283049L > dv * -8545241206418545829L) {
                    dv = dq * -7276231893158289163L;
                }
            }
            bs -= 822856080;
            if (326401888 * client.az == 10 || 11 == 546375420 * client.az) {
                int i3;
                if (1201256695 * client.ai == 0) {
                    if (z2) {
                        i3 = (-417802756 * ac) + 5;
                        if (i >= i3 && i <= i3 + 100 && i2 >= 463 && i2 <= 1893944282) {
                            be.au(1506943265);
                            return;
                        }
                    }
                    if (gh.ah != null) {
                        be.au(1288214280);
                    }
                }
                i3 = client.ac.to(-401924967);
                if (i3 != dh * 1306675236) {
                    dh = 1364672065 * i3;
                    dt.dk = -1166463362 * client.af;
                }
                if (-1482755511 * client.af >= (563083782 * dt.dk) + 8) {
                    if (-1 == dh * -2062612797 || i3 >= (ao * -343489547) + 171) {
                        av = 308607425;
                    } else {
                        av = ((i3 - (ao * -1832980841)) / 2) * -1956795403;
                        if (av * 1065969757 < 0) {
                            av = 0;
                        }
                    }
                }
                if (1065969757 * av != af * 1525295689) {
                    float f = 0.25f * (((float) (av * -1640688042)) - au);
                    if (f > -0.5f && f < 0.5f) {
                        f = (float) ((av * 1065969757) - (af * 1525295689));
                    }
                    au = f + au;
                    af = ((int) au) * 1619278915;
                }
                int i4;
                String str;
                if (bc * 2048922173 == 0) {
                    i3 = (518138324 * kb.ag) - 80;
                    i4 = ((1216513717 * af) + 1766792030) + 20;
                    if (z2 && i >= i3 - 75 && i <= i3 + 75 && i2 >= i4 - 20 && i2 <= i4 + 20) {
                        str = dl.fu("secure", true, -1026696745) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                        if (ki.aj.startsWith("win")) {
                            jg.aj(str, 0, 2143994751);
                        } else if (ki.aj.startsWith("mac")) {
                            cx.ac(str, 1, "openjs", (byte) 0);
                        } else {
                            jg.aj(str, 2, 1901386690);
                        }
                    }
                    i3 = (-1845421424 * kb.ag) + 80;
                    if ((z2 && i >= i3 - 202561365 && i <= i3 + 75 && i2 >= i4 - 20 && i2 <= i4 + 20) || z3) {
                        if (((client.aq * 1278097979) & mu.aa) != 0) {
                            bk = "";
                            bf = ix.ia;
                            bl = ix.iu;
                            cb = ix.ig;
                            bc = -187329259;
                            ab.aa((byte) 36);
                        } else if (((client.aq * 1714188329) & 4) != 0) {
                            if (((client.aq * -827123157) & -682680830) != 0) {
                                bf = ix.iz;
                                bl = ix.in;
                                cb = ix.iw;
                            } else {
                                bf = ix.id;
                                bl = ix.it;
                                cb = ix.iy;
                            }
                            bk = ix.il;
                            bc = 231468429;
                            ab.aa((byte) -95);
                        } else if (((client.aq * -827123157) & 1024) != 0) {
                            bf = ix.ic;
                            bl = ix.ib;
                            cb = ix.io;
                            bk = ix.il;
                            bc = -187329259;
                            ab.aa((byte) -6);
                        } else {
                            fn.ah(false, -714170676);
                        }
                    }
                } else if (bc * 2048922173 == 1) {
                    if (z4) {
                        fd.at(false, (byte) 43);
                    } else if (z3) {
                        fn.ah(false, -1878188539);
                    }
                    i3 = (230318388 * kb.ag) - 762353358;
                    i4 = (-1909233016 + (1525295689 * af)) + 50;
                    if (z2 && i >= i3 - 1242599572 && i <= i3 + 1793634405 && i2 >= i4 - 20 && i2 <= i4 + 20) {
                        fn.ah(false, -754361666);
                    }
                    i3 = (1329605134 * kb.ag) + 1666335652;
                    if (z2 && i >= i3 - 75 && i <= i3 + 75 && i2 >= i4 - 20 && i2 <= i4 + 20) {
                        fd.at(false, (byte) -17);
                    }
                } else if (2048922173 * bc == 2) {
                    i3 = (((af * 1525295689) + 100) - 70) + 52;
                    if (z2 && i2 >= i3 - 12 && i2 < i3 + 2) {
                        cq = 0;
                    }
                    i3 += 15;
                    if (z2 && i2 >= i3 - 12 && i2 < i3 + 2) {
                        cq = -138110470;
                    }
                    i3 += 15;
                    i3 = -1922740498 + ((af * 1525295689) - 867058191);
                    if (!z2 || i2 < i3 - 15 || i2 >= i3) {
                        i3 = (kb.ag * -611756465) - 80;
                        i4 = ((1525295689 * af) + 100) + 50;
                        if (!z2 || i < i3 - 75 || i > i3 + 812643536 || i2 < i4 - 20 || i2 > i4 + 20) {
                            i3 = ((-673913001 * ay) + 180) + 80;
                            if (z2 && i >= i3 - 36546742 && i <= i3 + 1311138249 && i2 >= i4 - 20 && i2 <= i4 + 20) {
                                fd.at(true, (byte) -4);
                                ci = true;
                            }
                            i3 = (kb.ag * -229836607) - 117;
                            i4 = -1811471461 + (660551364 * af);
                            if (i < i3 || i >= i3 + (gt.cp * -951214983) || i2 < i4 || i2 >= (bg.ct * -381274597) + i4) {
                                z = false;
                            } else {
                                z = true;
                            }
                            cm = z;
                            if (z2 && cm) {
                                if (co) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                co = z;
                                if (!(co || ae.nv.aa == null)) {
                                    ae.nv.aa = null;
                                    et.an(-106041368);
                                }
                            }
                            i3 = (-229836607 * kb.ag) + 24;
                            i4 = (1133734774 * af) + cq.dk;
                            z = i >= i3 && i < i3 + (gt.cp * 550882872) && i2 >= i4 && i2 < (2046052078 * bg.ct) + i4;
                            ck = z;
                            if (z2 && ck) {
                                ae.nv.ak = !ae.nv.ak;
                                if (!ae.nv.ak) {
                                    cy = "";
                                    ae.nv.aa = null;
                                    ab.aa((byte) 67);
                                }
                                et.an(345874000);
                            }
                            if (z4) {
                                fd.at(true, (byte) 1);
                                ci = true;
                                return;
                            } else if (z3) {
                                if (cq * -1295719160 == 0) {
                                    cq = 347924385;
                                    return;
                                }
                                cq = 0;
                                cy = cy.trim();
                                if (cy.length() == 0) {
                                    dk.am(ix.ed, ix.et, ix.ec, -686185965);
                                    return;
                                } else if (cl.length() == 0) {
                                    dk.am(ix.ea, ix.er, ix.ee, -1523717410);
                                    return;
                                } else {
                                    dk.am(ix.ir, ix.ip, ix.ii, -1383871051);
                                    fv.bt(false, -1252853219);
                                    gx.as(20, (short) 912);
                                    return;
                                }
                            } else if (!z5) {
                                return;
                            } else {
                                if (-2064175101 * cq == 0) {
                                    cq = -1433259545;
                                    return;
                                } else {
                                    cq = 0;
                                    return;
                                }
                            }
                        }
                        cy = cy.trim();
                        if (cy.length() == 0) {
                            dk.am(ix.ed, ix.et, ix.ec, 2130198159);
                            return;
                        } else if (cl.length() == 0) {
                            dk.am(ix.ea, ix.er, ix.ee, -837509018);
                            return;
                        } else {
                            dk.am(ix.ir, ix.ip, ix.ii, -1695155769);
                            fv.bt(false, -1722249407);
                            gx.as(20, (short) 8551);
                            return;
                        }
                    }
                    dk.am(ix.jc, ix.jz, ix.ja, 1302559062);
                    bc = 1634501257;
                } else if (bc * 507722905 == 3) {
                    i3 = (ay * -1148183490) + 180;
                    i4 = ((1525295689 * af) + 100) + 5;
                    if (z3 || z4 || (z2 && i >= i3 - 75 && i <= i3 + 1777466162 && i2 >= i4 - 20 && i2 <= i4 + 20)) {
                        fn.ah(false, -489921972);
                    }
                    i3 = -425945768 + (-673913001 * ay);
                    i4 = ((af * 1525295689) + 100) + 55;
                    if (z2 && i >= i3 - 120482308 && i <= i3 - 67361408 && i2 >= i4 - 20 && i2 <= i4 + 20) {
                        dk.am(ix.jc, ix.jz, ix.ja, -303500405);
                        bc = 295799394;
                    }
                } else if (1403828050 * bc == 4) {
                    i3 = ((984579848 * ay) - 1732184352) - -1667005901;
                    i4 = 439614161 + ((1525295689 * af) - 1122375945);
                    if (!z2 || i < i3 - 75 || i > i3 + 24220668 || i2 < i4 - 20 || i2 > i4 + 20) {
                        if (z2 && i >= ((ay * -673913001) + 180) - 9 && i <= (772215887 + (-673913001 * ay)) + 1911844169 && i2 >= ((af * 1525295689) + 100) - 8 && i2 <= ((911910854 * af) - 583283587) + 25) {
                            if (ci) {
                                z = false;
                            } else {
                                z = true;
                            }
                            ci = z;
                        }
                        if (z2 && i >= ((-462769388 * ay) - 1245246020) - 34 && i <= ((1097006504 * ay) + 180) + 34 && i2 >= ((1525295689 * af) + 100) + 1358353255 && i2 <= ((af * -974970280) + 100) + 92) {
                            str = dl.fu("secure", true, 387039175) + "m=totp-authenticator/disableTOTPRequest";
                            if (ki.aj.startsWith("win")) {
                                jg.aj(str, 0, 1903564809);
                            } else if (ki.aj.startsWith("mac")) {
                                cx.ac(str, 1, "openjs", (byte) 0);
                            } else {
                                jg.aj(str, 2, 2071424044);
                            }
                        }
                        i3 = -1302007788 + (101268647 + (-673913001 * ay));
                        if (z2 && i >= i3 - -859235512 && i <= i3 + 75 && i2 >= i4 - 20 && i2 <= i4 + 20) {
                            fd.at(true, (byte) 85);
                        }
                        if (z4) {
                            fd.at(true, (byte) 8);
                            return;
                        } else if (z3) {
                            cv.ch.trim();
                            if (cv.ch.length() != 6) {
                                dk.am(ix.bx, ix.bi, ix.bs, 1116348581);
                                return;
                            }
                            bi.ce = Integer.parseInt(cv.ch) * 412634699;
                            cv.ch = "";
                            fv.bt(true, 448900623);
                            dk.am(ix.ir, ix.ip, ix.ii, -1928321073);
                            gx.as(20, (short) 5056);
                            return;
                        } else {
                            return;
                        }
                    }
                    cv.ch.trim();
                    if (cv.ch.length() != 6) {
                        dk.am(ix.bx, ix.bi, ix.bs, 676259944);
                        return;
                    }
                    bi.ce = Integer.parseInt(cv.ch) * 412634699;
                    cv.ch = "";
                    fv.bt(true, -410497730);
                    dk.am(ix.ir, ix.ip, ix.ii, -522969351);
                    gx.as(20, (short) -8271);
                } else if (bc * 2048922173 == 5) {
                    i3 = ((ay * -673913001) + 180) - -1422409317;
                    i4 = ((af * 1525295689) + 100) + 1723689260;
                    if (!z2 || i < i3 - 75 || i > i3 + 75 || i2 < i4 - 20 || i2 > i4 + 20) {
                        i3 = ((101061808 * ay) - 1289839958) + 81765975;
                        if (z2 && i >= i3 - 75 && i <= i3 + 75 && i2 >= i4 - 20 && i2 <= i4 + 20) {
                            fn.ah(true, -1104777778);
                        }
                        if (z4) {
                            fn.ah(true, -1842073263);
                            return;
                        } else if (z3) {
                            hi.ai((byte) 0);
                            return;
                        } else {
                            return;
                        }
                    }
                    hi.ai((byte) 0);
                } else if (bc * 2048922173 == 6) {
                    if (z3 || z4) {
                        fn.ah(true, -1862533048);
                    }
                    i3 = ((af * 947275776) + 100) + 1743160667;
                    if (z2 && i2 >= i3 - 20 && i2 <= i3 + 20) {
                        fn.ah(true, -1485792280);
                    }
                }
            }
        }
    }

    static void bj(boolean z) {
        client.ac.th(-1470901491);
        bc = 0;
        if (z) {
            cy = "";
            cl = "";
            bi.ce = 0;
            cv.ch = "";
        }
    }

    static void bo(boolean z) {
        client.ac.th(-1151558108);
        bc = 0;
        if (z) {
            cy = "";
            cl = "";
            bi.ce = 0;
            cv.ch = "";
        }
    }

    static void bq(boolean z) {
        client.ac.th(-158307533);
        bc = 0;
        if (z) {
            cy = "";
            cl = "";
            bi.ce = 0;
            cv.ch = "";
        }
    }

    static void bz(boolean z) {
        client.ac.th(467703666);
        bc = 0;
        if (z) {
            cy = "";
            cl = "";
            bi.ce = 0;
            cv.ch = "";
        }
    }

    static void ba(boolean z) {
        client.ac.tt(1095672175);
        bf = ix.ih;
        bl = ix.if;
        cb = ix.im;
        bc = 1344711324;
        if (z) {
            cl = "";
        }
        dz.ao(1655785455);
        ab.aa((byte) 25);
    }

    static void bv(boolean z) {
        client.ac.tt(983292252);
        bf = ix.ih;
        bl = ix.if;
        cb = ix.im;
        bc = 2074507584;
        if (z) {
            cl = "";
        }
        dz.ao(741540732);
        ab.aa((byte) -69);
    }

    static void be(kh khVar, kh khVar2, kh khVar3, boolean z, es esVar) {
        esVar.ac((byte) 14);
        ac = 1461509477 * (((gf.pz * 647702547) - 1343508566) / 2);
        ay = (ac * -2059867285) - 623630889;
        kb.ag = 1256067531 + (1632636439 * ay);
        if (cs) {
            dx.az(khVar, khVar2, esVar, 1760822370);
            return;
        }
        long aj = aw.aj((byte) -73);
        if (dz * -8014044872750225279L == -1) {
            dj = (300 + aj) * -607912057828415363L;
            dz = (dj * -3725301949744816555L) + 6302462470895900248L;
        }
        if (aj >= dj * -3853991963858513707L) {
            int aj2;
            int i;
            int i2;
            String aq;
            int i3;
            int i4;
            int i5;
            if (aj < -8014044872750225279L * dz) {
                aj2 = (int) (do.aj(1.0f - (((float) ((-8014044872750225279L * dz) - aj)) / 600.0f), 1277291091) * 383.0f);
                esVar.fj((kb.ag * -87361572) - aj2, 0, (-229836607 * kb.ag) + aj2, dy.ks, -1816242282);
            }
            al.av(esVar, (byte) 15);
            if (client.az * 1827781011 == 0 || 5 == client.az * 960514153) {
                khVar.aw(ix.ix, -942572961 + (ay * -673913001), (((af * 1525295689) + 100) - 26) - 20, 16777215, -1, esVar);
                i = (((-2028284473 * af) + 100) - 18) - 20;
                esVar.fd((999933989 + (ay * -1369764983)) - 1335846524, i, 304, 34, 9179409, (short) -29755);
                esVar.fd(((-1764159131 * ay) + 180) - 1018143314, i + 1, 132169242, -207720857, 0, (short) -29193);
                esVar.aq(((ay * -673913001) + 180) - 1399895923, i + 2, bz * -1839216590, 30, -1638870795, (byte) 56);
                esVar.aq((((ay * -673913001) - 502003273) - 150) + (bz * -1152018705), i + 2, 300 - (bz * 1099905580), 30, -16777216, (byte) 43);
                khVar.aw(bq, (895815552 * ay) - 568838949, ((-2035204701 + (-1144752678 * af)) + 5) - 20, 16777215, -1, esVar);
            }
            if (1827781011 * client.az == 20) {
                esVar.au(an, ((-695780716 * ay) + 180) - (an.an / 2), (-490838179 + (af * 1525295689)) - (an.aq / 2), 1108546370);
                i2 = (-927548567 + (af * 1525295689)) - 1102410488;
                khVar.aw(bf, (ay * -673913001) + 1312420934, i2, 797613368, 0, esVar);
                i2 += 15;
                khVar.aw(bl, (ay * 1663144536) + 180, i2, 16776960, 0, esVar);
                i2 += 15;
                khVar.aw(cb, (ay * -495261955) + 180, i2, 16776960, 0, esVar);
                i2 = (i2 + 15) + 7;
                if (4 != bc * -722756311) {
                    khVar.at(ix.ij, (1242771083 + (ay * -673913001)) - -1088213544, i2, 16777215, 0, esVar);
                    aq = hy.aq(1638767855);
                    while (khVar.aq(aq) > 200) {
                        aq = aq.substring(0, aq.length() - 1);
                    }
                    khVar.at(kh.ap(aq), ((-673913001 * ay) + 180) - 875677015, i2, -963571684, 0, esVar);
                    i2 += 15;
                    khVar.at(ix.ik + kx.at('*', cl.length(), -609947353), ((272093642 * ay) + 180) - 108, i2, -816326379, 0, esVar);
                    aj2 = i2 + 15;
                }
            }
            if (10 == 1304991457 * client.az || 1827781011 * client.az == 11) {
                esVar.au(an, ay * -673913001, af * 1525295689, 344192006);
                if (bc * -426348402 == 0) {
                    i2 = ((af * -1203256788) + 100) - 20;
                    khVar.aw(ix.jq, (ay * -1425316308) + 180, i2, -2021834017, 0, esVar);
                    aj2 = i2 + 30;
                    aj2 = (-710734361 + (-2105579024 * ay)) - 589661532;
                    int i6 = ((af * 265439756) + 100) + 20;
                    esVar.au(aq, aj2 - 73, i6 - 20, 1385468430);
                    khVar.am(ix.jj, aj2 - 73, i6 - 20, 144, 40, -894739936, 0, 1, 1, 0, esVar);
                    aj2 = ((-673913001 * ay) - 1504416145) + 389862873;
                    esVar.au(aq, aj2 - 2111462245, i6 - 20, 2041165778);
                    khVar.am(ix.jo, aj2 - 73, i6 - 20, -1104411293, 539252669, 16777215, 0, 1, 1, 0, esVar);
                    i6 += 50;
                    if (-8545241206418545829L * dv != -1 && aj >= dv * -8545241206418545829L && (-7979269953817283049L * dq == -1 || aj < (dq * -7979269953817283049L) + 5000)) {
                        gk gkVar;
                        int i7;
                        int i8;
                        int aq2;
                        String str;
                        float f;
                        if (client.od == null || 19893829 * client.ox >= client.od.size()) {
                            gkVar = null;
                        } else {
                            gkVar = (gk) client.od.get(-1116903485 * client.ox);
                        }
                        String str2 = "All game assets pre-cached";
                        i2 = khVar2.aq(str2);
                        int i9 = ((-332579344 * ay) + 180) - 150;
                        if (gkVar != null) {
                            i2 = dh.av((byte) 66);
                            str2 = "Pre-caching game assets - ";
                            i7 = 3261415;
                            i8 = (i2 * 300) / -894374635;
                            aq2 = khVar2.aq(str2 + "99.11%");
                            str = str2 + dl.format((double) (((float) i2) / 100.0f)) + "%";
                        } else {
                            i7 = -2017846075;
                            i8 = -1339446944;
                            aq2 = i2;
                            str = str2;
                        }
                        if (-1 != dq * -7979269953817283049L && aj > 4700 + (dq * -7979269953817283049L)) {
                            f = 1.0f - (((float) ((aj - (dq * -7979269953817283049L)) - 4700)) / 300.0f);
                        } else if (aj < (dv * -8545241206418545829L) + 300) {
                            f = ((float) (aj - (-8545241206418545829L * dv))) / 300.0f;
                        } else {
                            f = 1.0f;
                        }
                        esVar.fn(dm, 1774502709);
                        if (1.0f != f) {
                            aj2 = (int) (de.aj(f, -2032985316) * 304.0f);
                            i3 = ((-673913001 * ay) - 1800661789) - (aj2 / 2);
                            esVar.fj(i3, i6 - 14, aj2 + i3, (i6 - 14) + 20, -1654070016);
                        }
                        i4 = (int) (128.0f * f);
                        int i10 = (int) (255.0f * f);
                        esVar.fv(i9 - 2, i6 - 14, 304, 20, i7, i4, -2020162373);
                        esVar.an(i9, i6 - 12, i8, 16, i7, i4, 77199058);
                        khVar2.ah(str, ((ay * -258357264) - 47401810) - (aq2 / 2), i6, 16777215, 0, i10, esVar);
                        esVar.fl(dm, -1238917643);
                    }
                } else if (bc * 2048922173 == 1) {
                    khVar.aw(bk, (ay * 1533127796) + 180, ((af * -152030068) - 1791017171) - 70, 16776960, 0, esVar);
                    i2 = (919579108 + (af * -1176381158)) - 2139999443;
                    khVar.aw(bf, (1838965091 * ay) + 180, i2, 16777215, 0, esVar);
                    i2 += 15;
                    khVar.aw(bl, (-673913001 * ay) + 180, i2, -430199816, 0, esVar);
                    i2 += 15;
                    khVar.aw(cb, 31330438 + (ay * 699871330), i2, 1562876213, 0, esVar);
                    aj2 = i2 + 15;
                    i = (-1324430965 + (ay * -673913001)) - 80;
                    i5 = ((-1772343110 * af) - 106571133) + 1292619400;
                    esVar.au(aq, i - 73, i5 - 20, 1803540293);
                    khVar.aw(ix.ak, i, i5 + 5, -1387346293, 0, esVar);
                    i = ((ay * -673913001) + 180) + 1005553075;
                    esVar.au(aq, i - 73, i5 - 20, 1117294482);
                    khVar.aw(ix.jg, i, i5 + 5, 1443157357, 0, esVar);
                } else if (2 == 760476719 * bc) {
                    i2 = ((af * 1525295689) + 100) - 70;
                    khVar.aw(bf, -229836607 * kb.ag, i2, 16776960, 0, esVar);
                    i2 += 15;
                    khVar.aw(bl, kb.ag * 1615366120, i2, 16776960, 0, esVar);
                    i2 += 15;
                    khVar.aw(cb, -229836607 * kb.ag, i2, 16776960, 0, esVar);
                    i2 = (i2 + 15) + 7;
                    khVar.at(ix.ij, (-2008181370 * kb.ag) - 110, i2, 16777215, 0, esVar);
                    aq = hy.aq(1638767855);
                    while (khVar.aq(aq) > -724166194) {
                        aq = aq.substring(1);
                    }
                    StringBuilder append = new StringBuilder().append(kh.ap(aq));
                    if (cq * -2064175101 == 0) {
                        aj2 = 1;
                    } else {
                        aj2 = 0;
                    }
                    if ((client.af * 1254706314) % 40 < 20) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    if ((aj2 & i3) != 0) {
                        aq = fj.ac(16776960, 1780325987) + gw.an;
                    } else {
                        aq = "";
                    }
                    khVar.at(append.append(aq).toString(), (kb.ag * -229836607) - -1549143727, i2, 16777215, 0, esVar);
                    i2 += 15;
                    append = new StringBuilder().append(ix.ik).append(kx.at('*', cl.length(), -1377762603));
                    if (cq * -2064175101 == 1) {
                        aj2 = 1;
                    } else {
                        aj2 = 0;
                    }
                    if ((client.af * -513692754) % -1901339459 < 20) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    if ((aj2 & i3) != 0) {
                        aq = fj.ac(16776960, -540036377) + gw.an;
                    } else {
                        aq = "";
                    }
                    khVar.at(append.append(aq).toString(), (84918247 * kb.ag) - -1149797201, i2, -2142439293, 0, esVar);
                    aj2 = i2 + 15;
                    i5 = (1525295689 * af) - 501667011;
                    i3 = (-229836607 * kb.ag) + 998970916;
                    boolean z2 = co;
                    boolean z3 = cm;
                    r4 = z2 ? z3 ? ae : eu.am : z3 ? ac.aw : ke.ai;
                    esVar.au(r4, i3, i5, 1085708133);
                    khVar2.at(ix.ju, i3 + (r4.an + 5), i5 + 13, 1570629176, 0, esVar);
                    aj2 = (kb.ag * -545375696) + 24;
                    fl an = ik.an(ae.nv.ak, ck, (byte) 95);
                    esVar.au(an, aj2, i5, 326052919);
                    khVar2.at(ix.jn, aj2 + (an.an + 5), i5 + 13, 16776960, 0, esVar);
                    aj2 = i5 + 15;
                    i = (kb.ag * -229836607) - -173066196;
                    i5 = ((509149427 * af) + 100) + 802139017;
                    esVar.au(aq, i - 337447197, i5 - 20, 266045410);
                    khVar.aw(ix.jd, i, i5 + 5, -1004111968, 0, esVar);
                    i = (-48163895 * kb.ag) + 80;
                    esVar.au(aq, i - 2038118300, i5 - 20, 985614755);
                    khVar.aw(ix.jg, i, i5 + 5, 16777215, 0, esVar);
                    khVar2.aw(ix.jp, 1721598505 * kb.ag, ((af * 1566978322) + 100) + 86, 16776960, 0, esVar);
                } else if (2048922173 * bc == 3) {
                    i2 = ((af * 1525295689) + 100) - 70;
                    khVar.aw(ix.jv, (ay * -198204041) + 239864356, i2, 16776960, 0, esVar);
                    i2 += 20;
                    khVar2.aw(ix.jx, (-673913001 * ay) + 180, i2, -1997542109, 0, esVar);
                    i2 += 15;
                    khVar2.aw(ix.jk, (-673913001 * ay) + 180, i2, 16776960, 0, esVar);
                    aj2 = i2 + 15;
                    i = (ay * -673913001) + 752850358;
                    aj2 = ((af * 1878414105) + 100) + 5;
                    esVar.au(aq, i - 1254604190, aj2 - 20, -237661007);
                    khVar3.aw(ix.jf, i, aj2 + 5, 16777215, 0, esVar);
                    i = (ay * 1109542349) + 180;
                    aj2 = ((af * -229978822) + 100) + 55;
                    esVar.au(aq, i - 73, aj2 - 20, 82976144);
                    khVar3.aw(ix.jr, i, aj2 + 5, 1016646964, 0, esVar);
                } else if (4 == 2048922173 * bc) {
                    khVar.aw(ix.iv, (-673913001 * ay) - 778916774, ((af * 1525295689) + 100) - 70, 538665423, 0, esVar);
                    i2 = (-877196842 + (af * 1525295689)) - 323603001;
                    khVar.aw(bf, (33382460 * ay) + 180, i2, 16777215, 0, esVar);
                    i2 += 15;
                    khVar.aw(bl, -85677653 + (-673913001 * ay), i2, 16777215, 0, esVar);
                    i2 += 15;
                    khVar.aw(cb, (-673913001 * ay) - 1959246256, i2, -1584402600, 0, esVar);
                    i2 += 15;
                    StringBuilder append2 = new StringBuilder().append(ix.iq).append(kx.at('䡳', cv.ch.length(), -1421846268));
                    if ((client.af * 901275591) % 40 < 20) {
                        aq = fj.ac(-1144933061, 715822174) + gw.an;
                    } else {
                        aq = "";
                    }
                    khVar.at(append2.append(aq).toString(), ((-673913001 * ay) + 180) - -879658593, i2, 16777215, 0, esVar);
                    i2 -= 8;
                    khVar.at(ix.at, ((ay * -673913001) + 180) - 9, i2, 367446113, 0, esVar);
                    i2 += 15;
                    khVar.at(ix.ah, ((ay * -673913001) + 1898439694) - 9, i2, 16776960, 0, esVar);
                    i3 = (((1986566227 + (ay * -673913001)) - 9) + khVar.aq(ix.ah)) + 15;
                    i = i2 - khVar.ak;
                    if (ci) {
                        r4 = eu.am;
                    } else {
                        r4 = ke.ai;
                    }
                    esVar.au(r4, i3, i, 662060950);
                    aj2 = i2 + 15;
                    i = ((ay * -673913001) + 180) - 1374682379;
                    i5 = ((af * -1367585594) - 1088349897) + 50;
                    esVar.au(aq, i - 73, i5 - 20, 1280576155);
                    khVar.aw(ix.ak, i, i5 + 5, -1190707762, 0, esVar);
                    i = ((ay * -673913001) + 180) + 80;
                    esVar.au(aq, i - 73, i5 - 20, 217718253);
                    khVar.aw(ix.jg, i, i5 + 5, 1991765763, 0, esVar);
                    khVar2.aw(ix.is, (ay * 1639962137) + 180, i5 - 1239221505, 185127127, 0, esVar);
                } else if (5 == bc * -1830616975) {
                    khVar.aw(ix.ji, 413706102 + (ay * -673913001), ((1525295689 * af) + 100) - 1561649965, 894276490, 0, esVar);
                    i2 = ((af * -1829361978) + 100) - 277985745;
                    khVar3.aw(bf, (-673913001 * ay) + 180, i2, 1060590958, 0, esVar);
                    i2 += 15;
                    khVar3.aw(bl, (-974185552 * ay) + 180, i2, 1706593240, 0, esVar);
                    i2 += 15;
                    khVar3.aw(cb, (-673913001 * ay) + 180, i2, 16776960, 0, esVar);
                    i2 = (i2 + 15) + 14;
                    khVar.at(ix.jt, (1263005174 + (479727076 * ay)) - 145, i2, -854661829, 0, esVar);
                    aq = hy.aq(1638767855);
                    while (khVar.aq(aq) > 174) {
                        aq = aq.substring(1);
                    }
                    khVar.at(kh.ap(aq) + ((-1015563812 * client.af) % 833332308 < 20 ? fj.ac(16776960, 1026829066) + gw.an : ""), ((ay * -673913001) + 180) - -1941298362, i2, 549055698, 0, esVar);
                    aj2 = i2 + 15;
                    i = ((ay * 1531839299) - 1523423890) - 80;
                    i5 = ((af * 1525295689) - 135679998) + 50;
                    esVar.au(aq, i - 73, i5 - 20, -281326192);
                    khVar.aw(ix.jb, i, i5 + 5, 339018650, 0, esVar);
                    i = ((-673913001 * ay) - 819695409) - 1928822856;
                    esVar.au(aq, i - 73, i5 - 20, -310661870);
                    khVar.aw(ix.jl, i, i5 + 5, 16777215, 0, esVar);
                } else if (2048922173 * bc == 6) {
                    i2 = ((1525295689 * af) + 100) - 70;
                    khVar.aw(bf, 845875589 + (-673913001 * ay), i2, 16776960, 0, esVar);
                    i2 += 15;
                    khVar.aw(bl, -427948061 + (843710475 * ay), i2, 16776960, 0, esVar);
                    i2 += 15;
                    khVar.aw(cb, (-673913001 * ay) + 584723235, i2, 16776960, 0, esVar);
                    aj2 = i2 + 15;
                    i = (-122783813 * ay) + 180;
                    aj2 = ((1525295689 * af) + 1311860163) + 50;
                    esVar.au(aq, i - 73, aj2 - 20, 2047994361);
                    khVar.aw(ix.jl, i, aj2 + 5, 16777215, 0, esVar);
                }
            }
            if (1917854043 * bs > 0) {
                int i11 = bs * -2048968137;
                bx += -806232192 * i11;
                if (bx * 934610124 > aw.bb.length) {
                    bx -= 1839195071 * aw.bb.length;
                    az.ae(aa[(int) (Math.random() * 12.0d)], (short) 1702);
                }
                i4 = 1763149176 * i11;
                i5 = (bq.ah - i11) * 128;
                i = 0;
                i3 = 0;
                while (i3 < i5) {
                    aj2 = dm.bd[i + i4] - ((aw.bb[((-471357653 * bx) + i) & (aw.bb.length - 1)] * i11) / 6);
                    if (aj2 < 0) {
                        aj2 = 0;
                    }
                    i2 = i + 1;
                    dm.bd[i] = aj2;
                    i3++;
                    i = i2;
                }
                for (aj2 = bq.ah - i11; aj2 < bq.ah; aj2++) {
                    i3 = -2016486544 * aj2;
                }
                if (903560632 * bt > 0) {
                    bt -= -1875776276 * i11;
                }
                if (br * -320021473 > 0) {
                    br -= -74416297 * i11;
                }
                if (-403359033 * bt == 0 && -320021473 * br == 0) {
                    aj2 = (int) (Math.random() * ((double) (1725625516 / i11)));
                    if (aj2 == 0) {
                        bt = 1069471283;
                    }
                    if (1 == aj2) {
                        br = -1367376896;
                    }
                }
                for (aj2 = 0; aj2 < bq.ah - i11; aj2++) {
                    ad[aj2] = ad[i11 + aj2];
                }
                for (aj2 = bq.ah - i11; aj2 < bq.ah; aj2++) {
                    ad[aj2] = (int) (((Math.sin(((double) (bo * 384740885)) / 14.0d) * 16.0d) + (Math.sin(((double) (384740885 * bo)) / 15.0d) * 14.0d)) + (Math.sin(((double) (76745579 * bo)) / 16.0d) * 12.0d));
                    bo -= 1397444291;
                }
                bi += 973573419 * i11;
                i2 = (((client.af * 901275591) & 1) + i11) / 2;
                if (i2 > 0) {
                    for (aj2 = 0; aj2 < bi * -513886420; aj2++) {
                        dm.bd[(((int) (Math.random() * 124.0d)) + 2) + ((((int) (Math.random() * 128.0d)) + 128) << 7)] = 192;
                    }
                    bi = 0;
                    for (i = 0; i < bq.ah; i++) {
                        i11 = 1209342934 * i;
                        aj2 = 0;
                        for (i3 = -i2; i3 < 128; i3++) {
                            if (i3 + i2 < -605981201) {
                                aj2 += dm.bd[(i3 + i11) + i2];
                            }
                            if (i3 - (i2 + 1) >= 0) {
                                aj2 -= dm.bd[(i11 + i3) - (i2 + 1)];
                            }
                            if (i3 >= 0) {
                                ch.by[i3 + i11] = aj2 / ((i2 * 2) + 1);
                            }
                        }
                    }
                    for (i = 0; i < 128; i++) {
                        aj2 = 0;
                        for (i3 = -i2; i3 < bq.ah; i3++) {
                            i11 = i3 * 128;
                            if (i3 + i2 < bq.ah) {
                                aj2 += ch.by[(i11 + i) + (i2 * 128)];
                            }
                            if (i3 - (i2 + 1) >= 0) {
                                aj2 -= ch.by[(i11 + i) - ((i2 + 1) * -1707248628)];
                            }
                            if (i3 >= 0) {
                                dm.bd[i11 + i] = aj2 / ((i2 * 2) + 1);
                            }
                        }
                    }
                }
                bs = 0;
            }
            if (aj >= -8014044872750225279L * dz) {
                fr.al(esVar, -548460666);
            }
            fl[] flVarArr = bh.ah;
            if (ae.nv.aq) {
                aj2 = 1;
            } else {
                aj2 = 0;
            }
            esVar.au(flVarArr[aj2], ((-1315492604 * ac) + 157002442) - 40, 224689088, -507424948);
            if (client.az * -1109699639 > 5 && -419773642 * client.ai == 0) {
                if (aq.cz != null) {
                    i5 = (ac * 903837565) + 5;
                    esVar.au(aq.cz, i5, 463, -14065751);
                    khVar.aw(ix.gt + " " + (54729869 * client.an), i5 + 354400316, 478, 16777215, 0, esVar);
                    if (gh.ah != null) {
                        khVar2.aw(ix.kn, i5 + 354400316, 492, -2042688517, 0, esVar);
                        return;
                    } else {
                        khVar2.aw(ix.ks, 354400316 + i5, 492, 16777215, 0, esVar);
                        return;
                    }
                }
                aq.cz = dq.aa(cf.cy, "sl_button", "", (byte) -125);
            }
        }
    }

    static void bc(String str, String str2, String str3) {
        bf = str;
        bl = str2;
        cb = str3;
    }

    static void bg(String str, String str2, String str3) {
        bf = str;
        bl = str2;
        cb = str3;
    }

    static void bn(String str, String str2, String str3) {
        bf = str;
        bl = str2;
        cb = str3;
    }

    static void bw(String str, String str2, String str3) {
        bf = str;
        bl = str2;
        cb = str3;
    }

    static final void bf(fl flVar) {
        int i;
        int i2;
        for (i = 0; i < aw.bb.length; i++) {
            aw.bb[i] = 0;
        }
        for (i = 0; i < 5000; i++) {
            aw.bb[(int) ((Math.random() * 128.0d) * ((double) bq.ah))] = (int) (Math.random() * 256.0d);
        }
        for (i2 = 0; i2 < 20; i2++) {
            int i3;
            for (i3 = 1; i3 < 255; i3++) {
                for (i = 1; i < 127; i++) {
                    int i4 = (i3 << 7) + i;
                    ch.bu[i4] = (aw.bb[i4 + 128] + ((aw.bb[i4 + 1] + aw.bb[i4 - 1]) + aw.bb[i4 - 128])) / 4;
                }
            }
            int[] iArr = aw.bb;
            aw.bb = ch.bu;
            ch.bu = iArr;
        }
        if (flVar != null) {
            int i5 = 0;
            for (i = 0; i < flVar.aq; i++) {
                i3 = 0;
                while (i3 < flVar.an) {
                    i2 = i5 + 1;
                    if (flVar.aj[i5] != (byte) 0) {
                        aw.bb[(flVar.ao + (i3 + 16)) + (((i + 16) + flVar.aa) << 7)] = 0;
                    }
                    i3++;
                    i5 = i2;
                }
            }
        }
    }

    static final void bk(fl flVar) {
        int i;
        int i2;
        for (i = 0; i < aw.bb.length; i++) {
            aw.bb[i] = 0;
        }
        for (i = 0; i < 5000; i++) {
            aw.bb[(int) ((Math.random() * 128.0d) * ((double) bq.ah))] = (int) (Math.random() * 256.0d);
        }
        for (i2 = 0; i2 < 20; i2++) {
            int i3;
            for (i3 = 1; i3 < 255; i3++) {
                for (i = 1; i < 127; i++) {
                    int i4 = (i3 << 7) + i;
                    ch.bu[i4] = (aw.bb[i4 + 128] + ((aw.bb[i4 + 1] + aw.bb[i4 - 1]) + aw.bb[i4 - 128])) / 4;
                }
            }
            int[] iArr = aw.bb;
            aw.bb = ch.bu;
            ch.bu = iArr;
        }
        if (flVar != null) {
            int i5 = 0;
            for (i = 0; i < flVar.aq; i++) {
                i3 = 0;
                while (i3 < flVar.an) {
                    i2 = i5 + 1;
                    if (flVar.aj[i5] != (byte) 0) {
                        aw.bb[(flVar.ao + (i3 + 16)) + (((i + 16) + flVar.aa) << 7)] = 0;
                    }
                    i3++;
                    i5 = i2;
                }
            }
        }
    }

    static final void bl(fl flVar) {
        int i;
        int i2;
        int i3;
        for (i = 0; i < aw.bb.length; i++) {
            aw.bb[i] = 0;
        }
        for (i = 0; i < 5000; i++) {
            aw.bb[(int) ((Math.random() * 128.0d) * ((double) bq.ah))] = (int) (Math.random() * 256.0d);
        }
        for (i2 = 0; i2 < 20; i2++) {
            for (i3 = 1; i3 < 255; i3++) {
                for (i = 1; i < 127; i++) {
                    int i4 = (i3 << 7) + i;
                    ch.bu[i4] = (aw.bb[i4 + 128] + ((aw.bb[i4 + 1] + aw.bb[i4 - 1]) + aw.bb[i4 - 128])) / 4;
                }
            }
            int[] iArr = aw.bb;
            aw.bb = ch.bu;
            ch.bu = iArr;
        }
        if (flVar != null) {
            int i5 = 0;
            for (i = 0; i < flVar.aq; i++) {
                i3 = 0;
                while (i3 < flVar.an) {
                    i2 = i5 + 1;
                    if (flVar.aj[i5] != (byte) 0) {
                        aw.bb[(flVar.ao + (i3 + 16)) + (((i + 16) + flVar.aa) << 7)] = 0;
                    }
                    i3++;
                    i5 = i2;
                }
            }
        }
    }

    static final void cb(fl flVar) {
        int i;
        int i2;
        for (i = 0; i < aw.bb.length; i++) {
            aw.bb[i] = 0;
        }
        for (i = 0; i < 5000; i++) {
            aw.bb[(int) ((Math.random() * 128.0d) * ((double) bq.ah))] = (int) (Math.random() * 256.0d);
        }
        for (i2 = 0; i2 < 20; i2++) {
            int i3;
            for (i3 = 1; i3 < 255; i3++) {
                for (i = 1; i < 127; i++) {
                    int i4 = (i3 << 7) + i;
                    ch.bu[i4] = (aw.bb[i4 + 128] + ((aw.bb[i4 + 1] + aw.bb[i4 - 1]) + aw.bb[i4 - 128])) / 4;
                }
            }
            int[] iArr = aw.bb;
            aw.bb = ch.bu;
            ch.bu = iArr;
        }
        if (flVar != null) {
            int i5 = 0;
            for (i = 0; i < flVar.aq; i++) {
                i3 = 0;
                while (i3 < flVar.an) {
                    i2 = i5 + 1;
                    if (flVar.aj[i5] != (byte) 0) {
                        aw.bb[(flVar.ao + (i3 + 16)) + (((i + 16) + flVar.aa) << 7)] = 0;
                    }
                    i3++;
                    i5 = i2;
                }
            }
        }
    }

    static final int cy(int i, int i2, int i3) {
        int i4 = 256 - i3;
        return ((((i4 * (i & 16711935)) + ((i2 & 16711935) * i3)) & -16711936) + ((((i2 & 65280) * i3) + ((65280 & i) * i4)) & 16711680)) >> 8;
    }

    static final void cc(es esVar) {
        int i;
        int i2;
        if (-963729933 * bt > 0) {
            for (i = 0; i < bq.ah; i++) {
                if (-963729933 * bt > 768) {
                    lt.ab[i] = cv.as(lm.bp[i], dc.bm[i], 1024 - (-963729933 * bt), 881051736);
                } else if (bt * -963729933 > bq.ah) {
                    lt.ab[i] = dc.bm[i];
                } else {
                    lt.ab[i] = cv.as(dc.bm[i], lm.bp[i], 256 - (-963729933 * bt), 1823351032);
                }
            }
        } else if (br * -320021473 > 0) {
            for (i = 0; i < bq.ah; i++) {
                if (-320021473 * br > 768) {
                    lt.ab[i] = cv.as(lm.bp[i], gs.bh[i], 1024 - (br * -320021473), 940281488);
                } else if (br * -320021473 > bq.ah) {
                    lt.ab[i] = gs.bh[i];
                } else {
                    lt.ab[i] = cv.as(gs.bh[i], lm.bp[i], 256 - (-320021473 * br), 1236477847);
                }
            }
        } else {
            for (i = 0; i < bq.ah; i++) {
                lt.ab[i] = lm.bp[i];
            }
        }
        esVar.fn(dm, 435249325);
        esVar.fi(ac * -1775170451, 9, (ac * -1775170451) + 128, 263, (byte) 2);
        esVar.al(mi.ak, -1775170451 * ac, 0, -2125945569);
        esVar.fl(dm, -1191402049);
        int i3 = 0;
        int i4 = (-1775170451 * ac) + (esVar.ac * 1086115735);
        int i5 = 1;
        while (i5 < 255) {
            i = (((bq.ah - i5) * ad[i5]) / bq.ah) + 22;
            if (i < 0) {
                i = 0;
            }
            int i6 = i4;
            i4 = i3 + i;
            i3 = i;
            while (i3 < 128) {
                i2 = i4 + 1;
                int i7 = dm.bd[i4];
                if (i7 != 0) {
                    int i8 = 256 - i7;
                    int i9 = lt.ab[i7];
                    int i10 = esVar.aj[i6];
                    i4 = i6 + 1;
                    esVar.aj[i6] = (((((i7 * (i9 & 16711935)) + (i8 * (i10 & 16711935))) & -16711936) + ((((65280 & i9) * i7) + ((65280 & i10) * i8)) & 16711680)) >> 8) | -16777216;
                } else {
                    i4 = i6 + 1;
                }
                i3++;
                i6 = i4;
                i4 = i2;
            }
            i5++;
            int i11 = i6 + ((i + (1075116703 * esVar.ac)) - 128);
            i3 = i4;
            i4 = i11;
        }
        esVar.fn(dm, 740805948);
        esVar.fi(((-1775170451 * ac) + 765) - 128, 9, (-1775170451 * ac) + 765, 263, (byte) 37);
        esVar.al(ap, (ac * -1775170451) + 382, 0, -2126766680);
        esVar.fl(dm, -570696579);
        i3 = 0;
        i2 = 1;
        i = (ac * -1775170451) + (((esVar.ac * 1086115735) + 24) + 637);
        while (i2 < 255) {
            i5 = (ad[i2] * (bq.ah - i2)) / bq.ah;
            i7 = 103 - i5;
            i4 = i + i5;
            i = i3;
            i3 = i4;
            i4 = 0;
            while (i4 < i7) {
                i6 = i + 1;
                i8 = dm.bd[i];
                if (i8 != 0) {
                    i9 = 256 - i8;
                    i10 = lt.ab[i8];
                    int i12 = esVar.aj[i3];
                    i = i3 + 1;
                    esVar.aj[i3] = (((((i8 * (i10 & 65280)) + (i9 * (65280 & i12))) & 16711680) + ((((16711935 & i10) * i8) + ((16711935 & i12) * i9)) & -16711936)) >> 8) | -16777216;
                } else {
                    i = i3 + 1;
                }
                i4++;
                i3 = i;
                i = i6;
            }
            i4 = i3 + (((1075116703 * esVar.ac) - i7) - i5);
            i2++;
            i3 = i + (128 - i7);
            i = i4;
        }
    }

    static final void cf(es esVar) {
        int i;
        int i2;
        if (-963729933 * bt > 0) {
            for (i = 0; i < bq.ah; i++) {
                if (-963729933 * bt > 768) {
                    lt.ab[i] = cv.as(lm.bp[i], dc.bm[i], 1024 - (-963729933 * bt), 1839844991);
                } else if (bt * -963729933 > bq.ah) {
                    lt.ab[i] = dc.bm[i];
                } else {
                    lt.ab[i] = cv.as(dc.bm[i], lm.bp[i], 256 - (-963729933 * bt), 1742971112);
                }
            }
        } else if (br * -320021473 > 0) {
            for (i = 0; i < bq.ah; i++) {
                if (-320021473 * br > 768) {
                    lt.ab[i] = cv.as(lm.bp[i], gs.bh[i], 1024 - (br * -320021473), 2037998448);
                } else if (br * -320021473 > bq.ah) {
                    lt.ab[i] = gs.bh[i];
                } else {
                    lt.ab[i] = cv.as(gs.bh[i], lm.bp[i], 256 - (-320021473 * br), 1970464917);
                }
            }
        } else {
            for (i = 0; i < bq.ah; i++) {
                lt.ab[i] = lm.bp[i];
            }
        }
        esVar.fn(dm, 727275808);
        esVar.fi(ac * -1775170451, 9, (ac * -1775170451) + 128, 263, (byte) 17);
        esVar.al(mi.ak, -1775170451 * ac, 0, -2090887043);
        esVar.fl(dm, -1213956611);
        int i3 = 0;
        int i4 = (-1775170451 * ac) + (esVar.ac * 1086115735);
        int i5 = 1;
        while (i5 < 255) {
            i = (((bq.ah - i5) * ad[i5]) / bq.ah) + 22;
            if (i < 0) {
                i = 0;
            }
            int i6 = i4;
            i4 = i3 + i;
            i3 = i;
            while (i3 < 128) {
                i2 = i4 + 1;
                int i7 = dm.bd[i4];
                if (i7 != 0) {
                    int i8 = 256 - i7;
                    int i9 = lt.ab[i7];
                    int i10 = esVar.aj[i6];
                    i4 = i6 + 1;
                    esVar.aj[i6] = (((((i7 * (i9 & 16711935)) + (i8 * (i10 & 16711935))) & -16711936) + ((((65280 & i9) * i7) + ((65280 & i10) * i8)) & 16711680)) >> 8) | -16777216;
                } else {
                    i4 = i6 + 1;
                }
                i3++;
                i6 = i4;
                i4 = i2;
            }
            i5++;
            int i11 = i6 + ((i + (1075116703 * esVar.ac)) - 128);
            i3 = i4;
            i4 = i11;
        }
        esVar.fn(dm, 1735948494);
        esVar.fi(((-1775170451 * ac) + 765) - 128, 9, (-1775170451 * ac) + 765, 263, (byte) 96);
        esVar.al(ap, (ac * -1775170451) + 382, 0, -2113889856);
        esVar.fl(dm, -1767994998);
        i3 = 0;
        i2 = 1;
        i = (ac * -1775170451) + (((esVar.ac * 1086115735) + 24) + 637);
        while (i2 < 255) {
            i5 = (ad[i2] * (bq.ah - i2)) / bq.ah;
            i7 = 103 - i5;
            i4 = i + i5;
            i = i3;
            i3 = i4;
            i4 = 0;
            while (i4 < i7) {
                i6 = i + 1;
                i8 = dm.bd[i];
                if (i8 != 0) {
                    i9 = 256 - i8;
                    i10 = lt.ab[i8];
                    int i12 = esVar.aj[i3];
                    i = i3 + 1;
                    esVar.aj[i3] = (((((i8 * (i10 & 65280)) + (i9 * (65280 & i12))) & 16711680) + ((((16711935 & i10) * i8) + ((16711935 & i12) * i9)) & -16711936)) >> 8) | -16777216;
                } else {
                    i = i3 + 1;
                }
                i4++;
                i3 = i;
                i = i6;
            }
            i4 = i3 + (((1075116703 * esVar.ac) - i7) - i5);
            i2++;
            i3 = i + (128 - i7);
            i = i4;
        }
    }

    static final void cl(es esVar) {
        int i;
        int i2;
        if (-963729933 * bt > 0) {
            for (i = 0; i < bq.ah; i++) {
                if (-963729933 * bt > 768) {
                    lt.ab[i] = cv.as(lm.bp[i], dc.bm[i], 1024 - (-963729933 * bt), 1551192236);
                } else if (bt * -963729933 > bq.ah) {
                    lt.ab[i] = dc.bm[i];
                } else {
                    lt.ab[i] = cv.as(dc.bm[i], lm.bp[i], 256 - (-963729933 * bt), 556355607);
                }
            }
        } else if (br * -320021473 > 0) {
            for (i = 0; i < bq.ah; i++) {
                if (-320021473 * br > 768) {
                    lt.ab[i] = cv.as(lm.bp[i], gs.bh[i], 1024 - (br * -320021473), 1698357558);
                } else if (br * -320021473 > bq.ah) {
                    lt.ab[i] = gs.bh[i];
                } else {
                    lt.ab[i] = cv.as(gs.bh[i], lm.bp[i], 256 - (-320021473 * br), 540556892);
                }
            }
        } else {
            for (i = 0; i < bq.ah; i++) {
                lt.ab[i] = lm.bp[i];
            }
        }
        esVar.fn(dm, 2046369509);
        esVar.fi(ac * -1775170451, 9, (ac * -1775170451) + 128, 263, (byte) 99);
        esVar.al(mi.ak, -1775170451 * ac, 0, -2102885487);
        esVar.fl(dm, -477755552);
        int i3 = 0;
        int i4 = (-1775170451 * ac) + (esVar.ac * 1086115735);
        int i5 = 1;
        while (i5 < 255) {
            i = (((bq.ah - i5) * ad[i5]) / bq.ah) + 22;
            if (i < 0) {
                i = 0;
            }
            int i6 = i4;
            i4 = i3 + i;
            i3 = i;
            while (i3 < 128) {
                i2 = i4 + 1;
                int i7 = dm.bd[i4];
                if (i7 != 0) {
                    int i8 = 256 - i7;
                    int i9 = lt.ab[i7];
                    int i10 = esVar.aj[i6];
                    i4 = i6 + 1;
                    esVar.aj[i6] = (((((i7 * (i9 & 16711935)) + (i8 * (i10 & 16711935))) & -16711936) + ((((65280 & i9) * i7) + ((65280 & i10) * i8)) & 16711680)) >> 8) | -16777216;
                } else {
                    i4 = i6 + 1;
                }
                i3++;
                i6 = i4;
                i4 = i2;
            }
            i5++;
            int i11 = i6 + ((i + (1075116703 * esVar.ac)) - 128);
            i3 = i4;
            i4 = i11;
        }
        esVar.fn(dm, 2104626159);
        esVar.fi(((-1775170451 * ac) + 765) - 128, 9, (-1775170451 * ac) + 765, 263, (byte) 36);
        esVar.al(ap, (ac * -1775170451) + 382, 0, -2110281188);
        esVar.fl(dm, -668912325);
        i3 = 0;
        i2 = 1;
        i = (ac * -1775170451) + (((esVar.ac * 1086115735) + 24) + 637);
        while (i2 < 255) {
            i5 = (ad[i2] * (bq.ah - i2)) / bq.ah;
            i7 = 103 - i5;
            i4 = i + i5;
            i = i3;
            i3 = i4;
            i4 = 0;
            while (i4 < i7) {
                i6 = i + 1;
                i8 = dm.bd[i];
                if (i8 != 0) {
                    i9 = 256 - i8;
                    i10 = lt.ab[i8];
                    int i12 = esVar.aj[i3];
                    i = i3 + 1;
                    esVar.aj[i3] = (((((i8 * (i10 & 65280)) + (i9 * (65280 & i12))) & 16711680) + ((((16711935 & i10) * i8) + ((16711935 & i12) * i9)) & -16711936)) >> 8) | -16777216;
                } else {
                    i = i3 + 1;
                }
                i4++;
                i3 = i;
                i = i6;
            }
            i4 = i3 + (((1075116703 * esVar.ac) - i7) - i5);
            i2++;
            i3 = i + (128 - i7);
            i = i4;
        }
    }

    static final void co(es esVar) {
        int i;
        int i2;
        if (-963729933 * bt > 0) {
            for (i = 0; i < bq.ah; i++) {
                if (-963729933 * bt > 768) {
                    lt.ab[i] = cv.as(lm.bp[i], dc.bm[i], 1024 - (-963729933 * bt), 699763521);
                } else if (bt * -963729933 > bq.ah) {
                    lt.ab[i] = dc.bm[i];
                } else {
                    lt.ab[i] = cv.as(dc.bm[i], lm.bp[i], 256 - (-963729933 * bt), 1564172667);
                }
            }
        } else if (br * -320021473 > 0) {
            for (i = 0; i < bq.ah; i++) {
                if (-320021473 * br > 768) {
                    lt.ab[i] = cv.as(lm.bp[i], gs.bh[i], 1024 - (br * -320021473), 1924697567);
                } else if (br * -320021473 > bq.ah) {
                    lt.ab[i] = gs.bh[i];
                } else {
                    lt.ab[i] = cv.as(gs.bh[i], lm.bp[i], 256 - (-320021473 * br), 2025592842);
                }
            }
        } else {
            for (i = 0; i < bq.ah; i++) {
                lt.ab[i] = lm.bp[i];
            }
        }
        esVar.fn(dm, 1613894892);
        esVar.fi(ac * -1775170451, 9, (ac * -1775170451) + 128, 263, (byte) 45);
        esVar.al(mi.ak, -1775170451 * ac, 0, -2115198024);
        esVar.fl(dm, -732337830);
        int i3 = 0;
        int i4 = (-1775170451 * ac) + (esVar.ac * 1086115735);
        int i5 = 1;
        while (i5 < 255) {
            i = (((bq.ah - i5) * ad[i5]) / bq.ah) + 22;
            if (i < 0) {
                i = 0;
            }
            int i6 = i4;
            i4 = i3 + i;
            i3 = i;
            while (i3 < 128) {
                i2 = i4 + 1;
                int i7 = dm.bd[i4];
                if (i7 != 0) {
                    int i8 = 256 - i7;
                    int i9 = lt.ab[i7];
                    int i10 = esVar.aj[i6];
                    i4 = i6 + 1;
                    esVar.aj[i6] = (((((i7 * (i9 & 16711935)) + (i8 * (i10 & 16711935))) & -16711936) + ((((65280 & i9) * i7) + ((65280 & i10) * i8)) & 16711680)) >> 8) | -16777216;
                } else {
                    i4 = i6 + 1;
                }
                i3++;
                i6 = i4;
                i4 = i2;
            }
            i5++;
            int i11 = i6 + ((i + (1075116703 * esVar.ac)) - 128);
            i3 = i4;
            i4 = i11;
        }
        esVar.fn(dm, 383427453);
        esVar.fi(((-1775170451 * ac) + 765) - 128, 9, (-1775170451 * ac) + 765, 263, (byte) 36);
        esVar.al(ap, (ac * -1775170451) + 382, 0, -2146842840);
        esVar.fl(dm, -902681874);
        i3 = 0;
        i2 = 1;
        i = (ac * -1775170451) + (((esVar.ac * 1086115735) + 24) + 637);
        while (i2 < 255) {
            i5 = (ad[i2] * (bq.ah - i2)) / bq.ah;
            i7 = 103 - i5;
            i4 = i + i5;
            i = i3;
            i3 = i4;
            i4 = 0;
            while (i4 < i7) {
                i6 = i + 1;
                i8 = dm.bd[i];
                if (i8 != 0) {
                    i9 = 256 - i8;
                    i10 = lt.ab[i8];
                    int i12 = esVar.aj[i3];
                    i = i3 + 1;
                    esVar.aj[i3] = (((((i8 * (i10 & 65280)) + (i9 * (65280 & i12))) & 16711680) + ((((16711935 & i10) * i8) + ((16711935 & i12) * i9)) & -16711936)) >> 8) | -16777216;
                } else {
                    i = i3 + 1;
                }
                i4++;
                i3 = i;
                i = i6;
            }
            i4 = i3 + (((1075116703 * esVar.ac) - i7) - i5);
            i2++;
            i3 = i + (128 - i7);
            i = i4;
        }
    }

    static void ca(kh khVar, kh khVar2, es esVar) {
        int i = dt.an * 1641921826;
        int i2 = dt.aq * 142688287;
        if (ev.cx == null) {
            ev.cx = cg.ak(cf.cy, "sl_back", "", (byte) 107);
        }
        if (cn.cd == null) {
            cn.cd = fc.ao(cf.cy, "sl_flags", "", (byte) -18);
        }
        if (fb.cw == null) {
            fb.cw = fc.ao(cf.cy, "sl_arrows", "", (byte) -41);
        }
        if (aa.cn == null) {
            aa.cn = fc.ao(cf.cy, "sl_stars", "", (byte) -72);
        }
        esVar.aq(ac * 287209370, 23, 765, 1096813809, -103525251, (byte) 88);
        esVar.at(-1775170451 * ac, 0, -1311859457, 23, -1250301678, 9135624, 986297666);
        esVar.at((ac * 1179233817) + 125, 0, 950758535, 23, 5197647, 2697513, 964268066);
        khVar.aw(ix.kz, (ac * -1775170451) + 62, 15, 0, -1, esVar);
        if (aa.cn != null) {
            esVar.au(aa.cn[1], (ac * -1775170451) + 2062317488, 1, 1097630958);
            khVar2.at(ix.km, (-1775170451 * ac) + 725421708, 10, -554984961, -1, esVar);
            esVar.au(aa.cn[0], (1934644778 * ac) + 140, 12, 1094234891);
            khVar2.at(ix.kx, -78743522 + (ac * 1727576655), 21, -1511852845, -1, esVar);
        }
        if (fb.cw != null) {
            fl flVar;
            fl flVar2;
            if (gh.at[0] == 0 && 1 == gh.ap[0]) {
                flVar = fb.cw[2];
            } else {
                flVar = fb.cw[0];
            }
            if (gh.at[0] == 0 && 1 == gh.ap[0]) {
                flVar2 = fb.cw[3];
            } else {
                flVar2 = fb.cw[1];
            }
            int i3 = 1038338669 + (ac * -1775170451);
            esVar.au(flVar, i3, 4, -529800838);
            esVar.au(flVar2, i3 + 15, 4, 2000898965);
            khVar.at(ix.ky, -129551203 + i3, 17, -1623537132, -1, esVar);
            i3 = -1822935329 + (ac * 22949987);
            esVar.au(flVar, i3, 4, 872556999);
            esVar.au(flVar2, i3 + 15, 4, -559318139);
            khVar.at(ix.kb, 205250529 + i3, 17, 16777215, -1, esVar);
            i3 = -2808302 + (-1904640064 * ac);
            esVar.au(flVar, i3, 4, 417302197);
            esVar.au(flVar2, i3 + 15, 4, 746592498);
            khVar.at(ix.kr, -439354132 + i3, 17, -1193845831, -1, esVar);
            i3 = -1964660065 + (ac * -1775170451);
            esVar.au(flVar, i3, 4, 705041772);
            esVar.au(flVar2, i3 + 15, 4, 1980222863);
            khVar.at(ix.kq, 955434868 + i3, 17, -1748451616, -1, esVar);
        }
        esVar.aq(1667437651 + (ac * -1775170451), 4, 553681280, 16, -263371416, (byte) 47);
        khVar2.aw(ix.jg, ((-1775170451 * ac) + 708) + 25, 16, 16777215, -1, esVar);
        cj = 1405491690;
        if (ev.cx != null) {
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10 = 8;
            i3 = 24;
            while (true) {
                if ((i10 - 1) * i3 >= gh.aa * -790198861) {
                    i4 = i10 - 1;
                } else {
                    i4 = i10;
                }
                if ((i3 - 1) * i4 >= 527043929 * gh.aa) {
                    i5 = i3 - 1;
                } else {
                    i5 = i3;
                }
                if ((i5 - 1) * i4 >= 518175009 * gh.aa) {
                    i6 = i5 - 1;
                } else {
                    i6 = i5;
                }
                if (i6 == i3 && i4 == i10) {
                    break;
                }
                i3 = i6;
                i10 = i4;
            }
            i3 = (912516072 - (88 * i4)) / (i4 + 1);
            if (i3 > 5) {
                i7 = 5;
            } else {
                i7 = i3;
            }
            i3 = (1173939194 - (19 * i6)) / (i6 + 1);
            if (i3 > 5) {
                i8 = 5;
            } else {
                i8 = i3;
            }
            int i11 = ((1013008869 - (19 * i6)) - ((i6 - 1) * i8)) / 2;
            int i12 = 0;
            int i13 = 0;
            Object obj = null;
            i4 = (ac * -1775170451) + (((765 - (i4 * 88)) - ((i4 - 1) * i7)) / 2);
            i5 = i11 + 23;
            while (i12 < 518175009 * gh.aa) {
                String str;
                Object obj2;
                gh ghVar = gh.ao[i12];
                String num = Integer.toString(ghVar.am * 794816761);
                if (-1 == ghVar.am * -432241849) {
                    str = ix.ki;
                    obj2 = null;
                } else if (ghVar.am * -1688499638 > 1980) {
                    str = ix.kc;
                    obj2 = null;
                } else {
                    str = num;
                    i10 = 1;
                }
                int i14 = 0;
                if (ghVar.am(2015772244)) {
                    i9 = ghVar.ap(1935994358) ? 7 : 6;
                } else if (ghVar.aw(-967124378)) {
                    i14 = 16711680;
                    i9 = ghVar.ap(1593106154) ? 5 : 4;
                } else {
                    i9 = ghVar.ah(-543607073) ? ghVar.ap(1552839912) ? 3 : 2 : ghVar.ap(2065682730) ? 1 : 0;
                }
                if (i < i4 || i2 < i5 || i >= i4 + 88 || i2 >= i5 + 19 || r2 == null) {
                    esVar.al(ev.cx[i9], i4, i5, -2098948230);
                    obj2 = obj;
                } else {
                    cj = -493074193 * i12;
                    esVar.ag(ev.cx[i9], i4, i5, 128, 1852328247, 959386389);
                    obj2 = 1;
                }
                if (cn.cd != null) {
                    fl[] flVarArr = cn.cd;
                    if (ghVar.ap(1891158301)) {
                        i3 = 8;
                    } else {
                        i3 = 0;
                    }
                    esVar.au(flVarArr[i3 + (ghVar.al * 1756888659)], i4 + 29, i5, -187876472);
                }
                khVar.aw(Integer.toString(ghVar.ai * 1057964181), i4 + 15, (i5 + 9) + 5, i14, -1, esVar);
                khVar2.aw(str, i4 + 596026656, (i5 + 9) + 5, 607785755, -1, esVar);
                i9 = i5 + (i8 + 19);
                i3 = i13 + 1;
                if (i3 >= i6) {
                    i9 = i11 + 23;
                    i5 = i4 + (i7 + 88);
                    i4 = 0;
                } else {
                    i5 = i4;
                    i4 = i3;
                }
                i12++;
                i13 = i4;
                obj = obj2;
                i4 = i5;
                i5 = i9;
            }
            if (obj != null) {
                i5 = khVar2.aq(gh.ao[1332673435 * cj].as) + 6;
                i9 = khVar2.ak + 8;
                esVar.aq(i - (i5 / 2), (i2 + 20) + 5, i5, i9, -530710171, (byte) 50);
                esVar.fd(i - (i5 / 2), (i2 + 20) + 5, i5, i9, 0, (short) -18111);
                khVar2.aw(gh.ao[-1271660755 * cj].as, i, (((i2 + 20) + 5) + khVar2.ak) + 4, 0, -1, esVar);
            }
        }
    }

    static void cr(kh khVar, kh khVar2, es esVar) {
        int i = dt.an * 676422121;
        int i2 = dt.aq * 349168927;
        if (ev.cx == null) {
            ev.cx = cg.ak(cf.cy, "sl_back", "", (byte) -12);
        }
        if (cn.cd == null) {
            cn.cd = fc.ao(cf.cy, "sl_flags", "", (byte) -36);
        }
        if (fb.cw == null) {
            fb.cw = fc.ao(cf.cy, "sl_arrows", "", (byte) -36);
        }
        if (aa.cn == null) {
            aa.cn = fc.ao(cf.cy, "sl_stars", "", (byte) -126);
        }
        esVar.aq(ac * -1775170451, 23, 940394359, -163836354, -16777216, (byte) 82);
        esVar.at(-1775170451 * ac, 0, 1159469353, 23, -865356741, -337048917, 523894473);
        esVar.at((ac * -1775170451) + 1348820321, 0, 640, 23, -1141721717, 2697513, 1024916935);
        khVar.aw(ix.kz, (ac * -1775170451) + 690269854, 15, 0, -1, esVar);
        if (aa.cn != null) {
            esVar.au(aa.cn[1], (ac * -1775170451) + 140, 1, 43219787);
            khVar2.at(ix.km, (-1775170451 * ac) + 152, 10, 962858903, -1, esVar);
            esVar.au(aa.cn[0], -1255236066 + (-1775170451 * ac), 12, 1546917620);
            khVar2.at(ix.kx, (ac * -1775170451) + 152, 21, 16777215, -1, esVar);
        }
        if (fb.cw != null) {
            fl flVar;
            fl flVar2;
            if (gh.at[0] == 0 && 1 == gh.ap[0]) {
                flVar = fb.cw[2];
            } else {
                flVar = fb.cw[0];
            }
            if (gh.at[0] == 0 && 1 == gh.ap[0]) {
                flVar2 = fb.cw[3];
            } else {
                flVar2 = fb.cw[1];
            }
            int i3 = (ac * -1452259630) + 280;
            esVar.au(flVar, i3, 4, 116084631);
            esVar.au(flVar2, i3 + 15, 4, 597863493);
            khVar.at(ix.ky, i3 + 32, 17, -866037935, -1, esVar);
            i3 = -1107812500 + (ac * -1911261518);
            esVar.au(flVar, i3, 4, 1657830850);
            esVar.au(flVar2, i3 + 15, 4, 2136523306);
            khVar.at(ix.kb, i3 + 32, 17, 16777215, -1, esVar);
            i3 = (-1775170451 * ac) + 500;
            esVar.au(flVar, i3, 4, 509559436);
            esVar.au(flVar2, i3 + 15, 4, 500466926);
            khVar.at(ix.kr, -1372632248 + i3, 17, 16777215, -1, esVar);
            i3 = 1971367776 + (ac * -548595717);
            esVar.au(flVar, i3, 4, -460047453);
            esVar.au(flVar2, i3 + 15, 4, 2114548337);
            khVar.at(ix.kq, i3 + 32, 17, 16777215, -1, esVar);
        }
        esVar.aq(-2094204613 + (ac * 979015634), 4, 50, 16, -16777216, (byte) 88);
        khVar2.aw(ix.jg, ((384696958 * ac) - 1372155800) + 25, 16, 16777215, -1, esVar);
        cj = -576720127;
        if (ev.cx != null) {
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10 = 1;
            i3 = 24;
            while (true) {
                if ((i10 - 1) * i3 >= gh.aa * -748077067) {
                    i4 = i10 - 1;
                } else {
                    i4 = i10;
                }
                if ((i3 - 1) * i4 >= -1689716424 * gh.aa) {
                    i5 = i3 - 1;
                } else {
                    i5 = i3;
                }
                if ((i5 - 1) * i4 >= 518175009 * gh.aa) {
                    i6 = i5 - 1;
                } else {
                    i6 = i5;
                }
                if (i6 == i3 && i4 == i10) {
                    break;
                }
                i3 = i6;
                i10 = i4;
            }
            i3 = (765 - (-1528329553 * i4)) / (i4 + 1);
            if (i3 > 5) {
                i7 = 5;
            } else {
                i7 = i3;
            }
            i3 = (480 - (19 * i6)) / (i6 + 1);
            if (i3 > 5) {
                i8 = 5;
            } else {
                i8 = i3;
            }
            int i11 = ((-1443522950 - (19 * i6)) - ((i6 - 1) * i8)) / 2;
            int i12 = i11 + 23;
            int i13 = (ac * -1775170451) + (((765 - (i4 * -1528329553)) - ((i4 - 1) * i7)) / 2);
            int i14 = 0;
            int i15 = 0;
            Object obj = null;
            while (i14 < 973144299 * gh.aa) {
                String str;
                Object obj2;
                gh ghVar = gh.ao[i14];
                String num = Integer.toString(ghVar.am * 667067782);
                Object obj3;
                if (-1 == ghVar.am * -2018715672) {
                    str = ix.ki;
                    obj3 = null;
                } else if (ghVar.am * -1891792538 > -659393461) {
                    str = ix.kc;
                    obj3 = null;
                } else {
                    str = num;
                    i10 = 1;
                }
                i9 = 0;
                if (ghVar.am(2021887749)) {
                    i4 = ghVar.ap(1431017041) ? 7 : 6;
                } else if (ghVar.aw(-1887241823)) {
                    i9 = 16711680;
                    i4 = ghVar.ap(1593348437) ? 5 : 4;
                } else {
                    i4 = ghVar.ah(-1927589285) ? ghVar.ap(1599108659) ? 3 : 2 : ghVar.ap(1557782719) ? 1 : 0;
                }
                if (i < i13 || i2 < i12 || i >= i13 - 1528329553 || i2 >= i12 + 19 || r2 == null) {
                    esVar.al(ev.cx[i4], i13, i12, -2135475045);
                    obj2 = obj;
                } else {
                    cj = 576720127 * i14;
                    esVar.ag(ev.cx[i4], i13, i12, 128, 1535565944, 1869654682);
                    obj2 = 1;
                }
                if (cn.cd != null) {
                    fl[] flVarArr = cn.cd;
                    if (ghVar.ap(1948544518)) {
                        i3 = 8;
                    } else {
                        i3 = 0;
                    }
                    esVar.au(flVarArr[i3 + (ghVar.al * 23568962)], i13 + 29, i12, -724895276);
                }
                khVar.aw(Integer.toString(ghVar.ai * 1057964181), i13 + 15, (i12 + 9) + 5, i9, -1, esVar);
                khVar2.aw(str, i13 + 60, (i12 + 9) + 5, -38027357, -1, esVar);
                i12 += i8 + 19;
                i10 = i15 + 1;
                if (i10 >= i6) {
                    i12 = i11 + 23;
                    i13 += i7 - 1528329553;
                    i10 = 0;
                }
                i14++;
                i15 = i10;
                obj = obj2;
            }
            if (obj != null) {
                i5 = khVar2.aq(gh.ao[-2013859073 * cj].as) + 6;
                i9 = khVar2.ak + 8;
                esVar.aq(i - (i5 / 2), (i2 + 20) + 5, i5, i9, 664822259, (byte) 122);
                esVar.fd(i - (i5 / 2), (i2 + 20) + 5, i5, i9, 0, (short) -31946);
                khVar2.aw(gh.ao[391954392 * cj].as, i, (((i2 + 20) + 5) + khVar2.ak) + 4, 0, -1, esVar);
            }
        }
    }

    static void ck(ks ksVar, es esVar) {
        int i = -124114311 * dt.an;
        int i2 = dt.aq * 142688287;
        boolean z = dt.ao;
        dt.an(1162847030);
        if (z) {
            int i3 = (ac * -1775170451) + 280;
            if (i >= i3 && i <= i3 + 14 && i2 >= 4 && i2 <= 18) {
                dr.ac(0, 0, -1549792105);
            } else if (i < i3 + 15 || i > i3 + 80 || i2 < 4 || i2 > 18) {
                i3 = (ac * -1775170451) + 390;
                if (i >= i3 && i <= i3 + 14 && i2 >= 4 && i2 <= 18) {
                    dr.ac(1, 0, 1726932042);
                } else if (i < i3 + 15 || i > i3 + 80 || i2 < 4 || i2 > 18) {
                    i3 = (ac * -1775170451) + 500;
                    if (i >= i3 && i <= i3 + 14 && i2 >= 4 && i2 <= 18) {
                        dr.ac(2, 0, 1581146116);
                    } else if (i < i3 + 15 || i > i3 + 80 || i2 < 4 || i2 > 18) {
                        i3 = (ac * -1775170451) + 610;
                        if (i >= i3 && i <= i3 + 14 && i2 >= 4 && i2 <= 18) {
                            dr.ac(3, 0, -732474692);
                        } else if (i >= i3 + 15 && i <= i3 + 80 && i2 >= 4 && i2 <= 18) {
                            dr.ac(3, 1, 1838054052);
                        } else if (i >= (ac * -1775170451) + 708 && i2 >= 4 && i <= ((ac * -1775170451) + 708) + 50 && i2 <= 20) {
                            cs = false;
                            al.av(esVar, (byte) 15);
                        } else if (-2013859073 * cj != -1) {
                            at.af(gh.ao[-2013859073 * cj], -206745753);
                            cs = false;
                            al.av(esVar, (byte) 15);
                        }
                    } else {
                        dr.ac(2, 1, 746917554);
                    }
                } else {
                    dr.ac(1, 1, -1234026982);
                }
            } else {
                dr.ac(0, 1, 730583835);
            }
        }
    }

    static void cm(ks ksVar, es esVar) {
        int i = -124114311 * dt.an;
        int i2 = dt.aq * 142688287;
        boolean z = dt.ao;
        dt.an(-737054629);
        if (z) {
            int i3 = (ac * -1775170451) + 280;
            if (i >= i3 && i <= i3 + 14 && i2 >= 4 && i2 <= 18) {
                dr.ac(0, 0, 1831649234);
            } else if (i < i3 + 15 || i > i3 + 80 || i2 < 4 || i2 > 18) {
                i3 = (ac * -1775170451) + 390;
                if (i >= i3 && i <= i3 + 14 && i2 >= 4 && i2 <= 18) {
                    dr.ac(1, 0, -997777658);
                } else if (i < i3 + 15 || i > i3 + 80 || i2 < 4 || i2 > 18) {
                    i3 = (ac * -1775170451) + 500;
                    if (i >= i3 && i <= i3 + 14 && i2 >= 4 && i2 <= 18) {
                        dr.ac(2, 0, -1279262236);
                    } else if (i < i3 + 15 || i > i3 + 80 || i2 < 4 || i2 > 18) {
                        i3 = (ac * -1775170451) + 610;
                        if (i >= i3 && i <= i3 + 14 && i2 >= 4 && i2 <= 18) {
                            dr.ac(3, 0, 1890884302);
                        } else if (i >= i3 + 15 && i <= i3 + 80 && i2 >= 4 && i2 <= 18) {
                            dr.ac(3, 1, 664291475);
                        } else if (i >= (ac * -1775170451) + 708 && i2 >= 4 && i <= ((ac * -1775170451) + 708) + 50 && i2 <= 20) {
                            cs = false;
                            al.av(esVar, (byte) 15);
                        } else if (-2013859073 * cj != -1) {
                            at.af(gh.ao[-2013859073 * cj], -907351431);
                            cs = false;
                            al.av(esVar, (byte) 15);
                        }
                    } else {
                        dr.ac(2, 1, -81708614);
                    }
                } else {
                    dr.ac(1, 1, 1979397833);
                }
            } else {
                dr.ac(0, 1, -926503247);
            }
        }
    }

    static void cp(ks ksVar, es esVar) {
        int i = 681398251 * dt.an;
        int i2 = dt.aq * 142688287;
        boolean z = dt.ao;
        dt.an(509978736);
        if (z) {
            int i3 = (ac * -1775170451) + 280;
            if (i >= i3 && i <= i3 + 14 && i2 >= 4 && i2 <= 18) {
                dr.ac(0, 0, 1368416299);
            } else if (i < i3 + 15 || i > i3 + 80 || i2 < 4 || i2 > 18) {
                i3 = (ac * -1775170451) + 390;
                if (i >= i3 && i <= i3 + 14 && i2 >= 4 && i2 <= 18) {
                    dr.ac(1, 0, -314043607);
                } else if (i < i3 + 15 || i > i3 + 80 || i2 < 4 || i2 > 18) {
                    i3 = (-681505701 * ac) + 500;
                    if (i >= i3 && i <= i3 + 14 && i2 >= 4 && i2 <= 18) {
                        dr.ac(2, 0, 330837637);
                    } else if (i < i3 + 15 || i > i3 + 1154766527 || i2 < 4 || i2 > 18) {
                        i3 = (ac * -1775170451) + 610;
                        if (i >= i3 && i <= i3 + 14 && i2 >= 4 && i2 <= 18) {
                            dr.ac(3, 0, 837651068);
                        } else if (i >= i3 + 15 && i <= i3 + 80 && i2 >= 4 && i2 <= 18) {
                            dr.ac(3, 1, 1227253704);
                        } else if (i >= (-645279299 * ac) + 708 && i2 >= 4 && i <= 1484580998 + ((ac * -1695035574) + 708) && i2 <= 20) {
                            cs = false;
                            al.av(esVar, (byte) 15);
                        } else if (-649462620 * cj != -1) {
                            at.af(gh.ao[-1619782331 * cj], -679945559);
                            cs = false;
                            al.av(esVar, (byte) 15);
                        }
                    } else {
                        dr.ac(2, 1, 959439524);
                    }
                } else {
                    dr.ac(1, 1, -521288591);
                }
            } else {
                dr.ac(0, 1, -520419704);
            }
        }
    }

    static void ct(ks ksVar, es esVar) {
        int i = -124114311 * dt.an;
        int i2 = dt.aq * 142688287;
        boolean z = dt.ao;
        dt.an(-1464263842);
        if (z) {
            int i3 = -1406362201 + (ac * -1775170451);
            if (i >= i3 && i <= i3 + 14 && i2 >= 4 && i2 <= 18) {
                dr.ac(0, 0, 838366517);
            } else if (i < i3 + 15 || i > i3 + 80 || i2 < 4 || i2 > 18) {
                i3 = (656826629 * ac) + 390;
                if (i >= i3 && i <= i3 + 14 && i2 >= 4 && i2 <= 18) {
                    dr.ac(1, 0, 61015191);
                } else if (i < i3 + 15 || i > i3 + 80 || i2 < 4 || i2 > 18) {
                    i3 = (111310214 * ac) - 1942200979;
                    if (i >= i3 && i <= i3 + 14 && i2 >= 4 && i2 <= 18) {
                        dr.ac(2, 0, 413709590);
                    } else if (i < i3 + 15 || i > i3 + 80 || i2 < 4 || i2 > 18) {
                        i3 = (ac * 1416467432) + 610;
                        if (i >= i3 && i <= i3 + 14 && i2 >= 4 && i2 <= 18) {
                            dr.ac(3, 0, 1142367616);
                        } else if (i >= i3 + 15 && i <= i3 + 80 && i2 >= 4 && i2 <= 18) {
                            dr.ac(3, 1, 1295162822);
                        } else if (i >= 748538912 + (ac * -1775170451) && i2 >= 4 && i <= 933632154 + (-1875713365 + (ac * -989175327)) && i2 <= 20) {
                            cs = false;
                            al.av(esVar, (byte) 15);
                        } else if (-231700434 * cj != -1) {
                            at.af(gh.ao[-2013859073 * cj], 1447228931);
                            cs = false;
                            al.av(esVar, (byte) 15);
                        }
                    } else {
                        dr.ac(2, 1, 647934322);
                    }
                } else {
                    dr.ac(1, 1, -1958768413);
                }
            } else {
                dr.ac(0, 1, -1239614787);
            }
        }
    }

    static void ce(gh ghVar) {
        int i;
        if (ghVar.ap(1878231441) != client.at) {
            client.at = ghVar.ap(1422141152);
            ff.ay(ghVar.ap(1414150502), 2118874993);
        }
        af.cv = ghVar.ae;
        client.an = ghVar.ai * -2071075287;
        client.aq = 1107141433 * ghVar.aw;
        if (client.aa * 633981527 == 0) {
            i = 2141803801;
        } else {
            i = (ghVar.ai * 1305108838) - 476366685;
        }
        de.cu = i * 1789306752;
        dw.cg = (1477204923 * client.aa == 0 ? -1588546450 : 50000 + (ghVar.ai * 210150657)) * -1357259286;
        ay.cs = -1755801289 * de.cu;
    }

    static void ch(gh ghVar) {
        int i;
        if (ghVar.ap(1651744730) != client.at) {
            client.at = ghVar.ap(1772295810);
            ff.ay(ghVar.ap(1872241480), 2041554833);
        }
        af.cv = ghVar.ae;
        client.an = ghVar.ai * 1623881634;
        client.aq = 1107141433 * ghVar.aw;
        if (client.aa * 1477204923 == 0) {
            i = 43594;
        } else {
            i = (ghVar.ai * 1057964181) + cw.aj;
        }
        de.cu = i * -1591359037;
        if (-354219015 * client.aa == 0) {
            i = 443;
        } else {
            i = 50000 + (ghVar.ai * 1057964181);
        }
        dw.cg = i * 288844821;
        ay.cs = 1418523824 * de.cu;
    }

    static void ci() {
        if (fy.aj((byte) -59)) {
            cs = true;
        }
    }

    static void cq() {
        if (fy.aj((byte) -81)) {
            cs = true;
        }
    }

    static void cv() {
        if (fy.aj((byte) -40)) {
            cs = true;
        }
    }

    static void cg(es esVar) {
        esVar.al(mi.ak, ac * -1775170451, 0, -2112655147);
        esVar.al(ap, (ac * -1172151637) + 382, 0, -2086537327);
        esVar.au(eu.at, (-871554689 + (-1425426145 * ac)) - (eu.at.an / 2), 18, 1197480819);
    }

    static void cs(es esVar) {
        esVar.al(mi.ak, ac * -1775170451, 0, -2093417387);
        esVar.al(ap, (ac * -1775170451) + 382, 0, -2132439879);
        esVar.au(eu.at, ((ac * -1775170451) + 382) - (eu.at.an / 2), 18, 769782917);
    }

    static void cu(es esVar) {
        esVar.al(mi.ak, ac * -1223680981, 0, -2114942842);
        esVar.al(ap, (ac * 531370070) + 382, 0, -2095532658);
        esVar.au(eu.at, (-1930794115 + (-1914890861 * ac)) - (eu.at.an / 2), 18, -655426857);
    }
}
