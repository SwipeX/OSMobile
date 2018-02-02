package defpackage;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;

public class ga {
    static final BigInteger aa = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
    static final String ac = "services";
    static final int ak = 2;
    static final String an = "passwordchoice.ws";
    static final BigInteger ao = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
    static final int ap = 3;
    static final int aq = 1000;

    ga() throws Throwable {
        try {
            throw new Error();
        } catch (Throwable e) {
            throw ei.ac(e, "ga.<init>(" + ')');
        }
    }

    public static void ac(ju juVar, String str, String str2, int i, boolean z, int i2) {
        try {
            int au = juVar.au(str, -1801251467);
            gv.an(juVar, au, juVar.av(au, str2, (byte) -44), i, z, (byte) 14);
        } catch (Throwable e) {
            throw ei.ac(e, "ga.ac(" + ')');
        }
    }

    static long ac() {
        try {
            URLConnection openConnection = new URL(dl.fu(ac, false, -1495356082) + "m=accountappeal/login.ws").openConnection();
            openConnection.setRequestProperty("connection", "close");
            openConnection.setDoInput(true);
            openConnection.setDoOutput(true);
            openConnection.setConnectTimeout(5000);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openConnection.getOutputStream());
            outputStreamWriter.write("data1=req");
            outputStreamWriter.flush();
            InputStream inputStream = openConnection.getInputStream();
            he heVar = new he(new byte[aq]);
            do {
                int read = inputStream.read(heVar.aj, heVar.ac * 489625177, 1000 - (heVar.ac * 489625177));
                if (-1 == read) {
                    heVar.ac = 0;
                    return heVar.ab(Byte.MAX_VALUE);
                }
                heVar.ac = (read * -984165911) + heVar.ac;
            } while (heVar.ac * 489625177 < aq);
            return 0;
        } catch (Exception e) {
            return 0;
        }
    }

    static long an() {
        try {
            URLConnection openConnection = new URL(dl.fu(ac, false, -227345291) + "m=accountappeal/login.ws").openConnection();
            openConnection.setRequestProperty("connection", "close");
            openConnection.setDoInput(true);
            openConnection.setDoOutput(true);
            openConnection.setConnectTimeout(5000);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openConnection.getOutputStream());
            outputStreamWriter.write("data1=req");
            outputStreamWriter.flush();
            InputStream inputStream = openConnection.getInputStream();
            he heVar = new he(new byte[-1836026171]);
            do {
                int read = inputStream.read(heVar.aj, heVar.ac * -1993250048, 1000 - (heVar.ac * 489625177));
                if (-1 == read) {
                    heVar.ac = 0;
                    return heVar.ab((byte) 88);
                }
                heVar.ac = (read * -984165911) + heVar.ac;
            } while (heVar.ac * 489625177 < aq);
            return 0;
        } catch (Exception e) {
            return 0;
        }
    }

    static String ap(byte b) {
        try {
            Iterator it = gt.ac.iterator();
            String str = "";
            while (it.hasNext()) {
                gu guVar = (gu) it.next();
                str = str + guVar.aq + ':' + guVar.at + '\n';
            }
            return str;
        } catch (Throwable e) {
            throw ei.ac(e, "ga.ap(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void dj(defpackage.hn r12, byte r13) {
        /*
        r0 = 0;
        r9 = r0;
    L_0x0002:
        r0 = defpackage.client.db;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = 1194086319; // 0x472c4faf float:44111.684 double:5.899570284E-315;
        r0 = r0 * r1;
        if (r9 >= r0) goto L_0x02ce;
    L_0x000a:
        r0 = defpackage.client.dl;	 Catch:{ RuntimeException -> 0x0267 }
        r0 = r0[r9];	 Catch:{ RuntimeException -> 0x0267 }
        r1 = defpackage.client.cj;	 Catch:{ RuntimeException -> 0x0267 }
        r0 = r1[r0];	 Catch:{ RuntimeException -> 0x0267 }
        r1 = -310118664; // 0xffffffffed83f6f8 float:-5.105138E27 double:NaN;
        r10 = r12.au(r1);	 Catch:{ RuntimeException -> 0x0267 }
        r1 = r10 & 32;
        if (r1 == 0) goto L_0x00b1;
    L_0x001d:
        r1 = -1380904992; // 0xffffffffadb10fe0 float:-2.012962E-11 double:NaN;
        r11 = r12.bn(r1);	 Catch:{ RuntimeException -> 0x0267 }
        if (r11 <= 0) goto L_0x006b;
    L_0x0026:
        r1 = 0;
        r8 = r1;
    L_0x0028:
        if (r8 >= r11) goto L_0x006b;
    L_0x002a:
        r3 = -1;
        r2 = -1;
        r4 = -1;
        r1 = 799009297; // 0x2f9fea11 float:2.9088246E-10 double:3.947630444E-315;
        r1 = r12.bu(r1);	 Catch:{ RuntimeException -> 0x0267 }
        r5 = 32767; // 0x7fff float:4.5916E-41 double:1.6189E-319;
        if (r1 != r5) goto L_0x024f;
    L_0x0038:
        r1 = 1395339692; // 0x532b31ac float:7.3527276E11 double:6.89389406E-315;
        r1 = r12.bu(r1);	 Catch:{ RuntimeException -> 0x0267 }
        r2 = 1349274748; // 0x506c4c7c float:1.58577418E10 double:6.666303E-315;
        r2 = r12.bu(r2);	 Catch:{ RuntimeException -> 0x0267 }
        r3 = 1860976545; // 0x6eec3fa1 float:3.6557692E28 double:9.194445786E-315;
        r3 = r12.bu(r3);	 Catch:{ RuntimeException -> 0x0267 }
        r4 = 680776559; // 0x2893d36f float:1.6411973E-14 double:3.363483103E-315;
        r4 = r12.bu(r4);	 Catch:{ RuntimeException -> 0x0267 }
    L_0x0054:
        r5 = 346455723; // 0x14a67eab float:1.6811678E-26 double:1.711718705E-315;
        r6 = r12.bu(r5);	 Catch:{ RuntimeException -> 0x0267 }
        r5 = defpackage.client.af;	 Catch:{ RuntimeException -> 0x0267 }
        r7 = 901275591; // 0x35b85fc7 float:1.3736943E-6 double:4.45289307E-315;
        r5 = r5 * r7;
        r7 = 231317886; // 0xdc9a17e float:1.2426459E-30 double:1.142862207E-315;
        r0.be(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0267 }
        r1 = r8 + 1;
        r8 = r1;
        goto L_0x0028;
    L_0x006b:
        r1 = -310118664; // 0xffffffffed83f6f8 float:-5.105138E27 double:NaN;
        r11 = r12.au(r1);	 Catch:{ RuntimeException -> 0x0267 }
        if (r11 <= 0) goto L_0x00b1;
    L_0x0074:
        r1 = 0;
        r8 = r1;
    L_0x0076:
        if (r8 >= r11) goto L_0x00b1;
    L_0x0078:
        r1 = 1480307574; // 0x583bb376 float:8.2551781E14 double:7.313691176E-315;
        r1 = r12.bu(r1);	 Catch:{ RuntimeException -> 0x0267 }
        r2 = 669130925; // 0x27e220ad float:6.276303E-15 double:3.305946026E-315;
        r3 = r12.bu(r2);	 Catch:{ RuntimeException -> 0x0267 }
        r2 = 32767; // 0x7fff float:4.5916E-41 double:1.6189E-319;
        if (r3 == r2) goto L_0x025f;
    L_0x008a:
        r2 = 726155598; // 0x2b48414e float:7.11449E-13 double:3.587685345E-315;
        r4 = r12.bu(r2);	 Catch:{ RuntimeException -> 0x0267 }
        r2 = 610967076; // 0x246a9e24 float:5.0874612E-17 double:3.01857843E-315;
        r5 = r12.bc(r2);	 Catch:{ RuntimeException -> 0x0267 }
        if (r3 <= 0) goto L_0x0282;
    L_0x009a:
        r2 = 1022988279; // 0x3cf98ff7 float:0.030464156 double:5.054233648E-315;
        r6 = r12.bc(r2);	 Catch:{ RuntimeException -> 0x0267 }
    L_0x00a1:
        r2 = defpackage.client.af;	 Catch:{ RuntimeException -> 0x0267 }
        r7 = 901275591; // 0x35b85fc7 float:1.3736943E-6 double:4.45289307E-315;
        r2 = r2 * r7;
        r7 = -1780983967; // 0xffffffff95d85761 float:-8.7379565E-26 double:NaN;
        r0.bw(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0267 }
    L_0x00ad:
        r1 = r8 + 1;
        r8 = r1;
        goto L_0x0076;
    L_0x00b1:
        r1 = r10 & 2;
        if (r1 == 0) goto L_0x00c3;
    L_0x00b5:
        r1 = -663870815; // 0xffffffffd86e22a1 float:-1.04732999E15 double:NaN;
        r1 = r12.bh(r1);	 Catch:{ RuntimeException -> 0x0267 }
        r0.ba = r1;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = 644737300; // 0x266de914 float:8.254177E-16 double:3.185425505E-315;
        r0.bw = r1;	 Catch:{ RuntimeException -> 0x0267 }
    L_0x00c3:
        r1 = r10 & 8;
        if (r1 == 0) goto L_0x0109;
    L_0x00c7:
        r1 = 2119231213; // 0x7e50e6ed float:6.9419615E37 double:1.047039338E-314;
        r1 = r12.cc(r1);	 Catch:{ RuntimeException -> 0x0267 }
        r2 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r1 != r2) goto L_0x00d4;
    L_0x00d3:
        r1 = -1;
    L_0x00d4:
        r2 = -1380904992; // 0xffffffffadb10fe0 float:-2.012962E-11 double:NaN;
        r2 = r12.bn(r2);	 Catch:{ RuntimeException -> 0x0267 }
        r3 = 1976380739; // 0x75cd2d43 float:5.20185E32 double:9.76461826E-315;
        r4 = r0.ck;	 Catch:{ RuntimeException -> 0x0267 }
        r3 = r3 * r4;
        if (r3 != r1) goto L_0x0285;
    L_0x00e3:
        r3 = -1;
        if (r1 == r3) goto L_0x0285;
    L_0x00e6:
        r3 = 0;
        r1 = defpackage.bn.aj(r1, r3);	 Catch:{ RuntimeException -> 0x0267 }
        r1 = r1.af;	 Catch:{ RuntimeException -> 0x0267 }
        r3 = 1516569231; // 0x5a65028f float:1.61151457E16 double:7.492847566E-315;
        r1 = r1 * r3;
        r3 = 1;
        if (r3 != r1) goto L_0x0103;
    L_0x00f4:
        r3 = 0;
        r0.ce = r3;	 Catch:{ RuntimeException -> 0x0267 }
        r3 = 0;
        r0.ch = r3;	 Catch:{ RuntimeException -> 0x0267 }
        r3 = 1611262399; // 0x6009e9bf float:3.9750736E19 double:7.96069398E-315;
        r2 = r2 * r3;
        r0.ci = r2;	 Catch:{ RuntimeException -> 0x0267 }
        r2 = 0;
        r0.cq = r2;	 Catch:{ RuntimeException -> 0x0267 }
    L_0x0103:
        r2 = 2;
        if (r2 != r1) goto L_0x0109;
    L_0x0106:
        r1 = 0;
        r0.cq = r1;	 Catch:{ RuntimeException -> 0x0267 }
    L_0x0109:
        r1 = r10 & 1;
        if (r1 == 0) goto L_0x012a;
    L_0x010d:
        r1 = 1930026949; // 0x7309dfc5 float:1.0923512E31 double:9.53560011E-315;
        r1 = r12.cc(r1);	 Catch:{ RuntimeException -> 0x0267 }
        r2 = 2130005305; // 0x7ef54d39 float:1.6303091E38 double:1.0523624467E-314;
        r1 = r1 * r2;
        r0.cf = r1;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r2 = -1329884919; // 0xffffffffb0bb9109 float:-1.3647262E-9 double:NaN;
        r3 = r0.cf;	 Catch:{ RuntimeException -> 0x0267 }
        r2 = r2 * r3;
        if (r1 != r2) goto L_0x012a;
    L_0x0125:
        r1 = -2130005305; // 0xffffffff810ab2c7 float:-2.5474863E-38 double:NaN;
        r0.cf = r1;	 Catch:{ RuntimeException -> 0x0267 }
    L_0x012a:
        r1 = r10 & 64;
        if (r1 == 0) goto L_0x0197;
    L_0x012e:
        r1 = 1945368271; // 0x73f3f6cf float:3.8657654E31 double:9.61139631E-315;
        r1 = r12.cc(r1);	 Catch:{ RuntimeException -> 0x0267 }
        r2 = 46;
        r1 = defpackage.ag.aj(r1, r2);	 Catch:{ RuntimeException -> 0x0267 }
        r0.aj = r1;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = r0.aj;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = r1.ak;	 Catch:{ RuntimeException -> 0x0267 }
        r2 = -1573231187; // 0xffffffffa23a65ad float:-2.5261527E-18 double:NaN;
        r1 = r1 * r2;
        r0.bd = r1;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = r0.aj;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = r1.bt;	 Catch:{ RuntimeException -> 0x0267 }
        r2 = 348102737; // 0x14bfa051 float:1.9349305E-26 double:1.719856036E-315;
        r1 = r1 * r2;
        r0.dp = r1;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = r0.aj;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = r1.am;	 Catch:{ RuntimeException -> 0x0267 }
        r2 = 616642851; // 0x24c13923 float:8.37972E-17 double:3.046620484E-315;
        r1 = r1 * r2;
        r0.bs = r1;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = 1305572179; // 0x4dd17353 float:4.39249504E8 double:6.45038362E-315;
        r2 = r0.aj;	 Catch:{ RuntimeException -> 0x0267 }
        r2 = r2.ae;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = r1 * r2;
        r0.bo = r1;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = r0.aj;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = r1.as;	 Catch:{ RuntimeException -> 0x0267 }
        r2 = -296135971; // 0xffffffffee5952dd float:-1.6814606E28 double:NaN;
        r1 = r1 * r2;
        r0.bz = r1;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = 1378694421; // 0x522d3515 float:1.85979978E11 double:6.811655495E-315;
        r2 = r0.aj;	 Catch:{ RuntimeException -> 0x0267 }
        r2 = r2.al;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = r1 * r2;
        r0.bq = r1;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = r0.aj;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = r1.ah;	 Catch:{ RuntimeException -> 0x0267 }
        r2 = -991597229; // 0xffffffffc4e56d53 float:-1835.4164 double:NaN;
        r1 = r1 * r2;
        r0.by = r1;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = 107589931; // 0x669b12b float:4.3952592E-35 double:5.31564887E-316;
        r2 = r0.aj;	 Catch:{ RuntimeException -> 0x0267 }
        r2 = r2.ai;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = r1 * r2;
        r0.bx = r1;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = 2012844555; // 0x77f9920b float:1.01237814E34 double:9.94477345E-315;
        r2 = r0.aj;	 Catch:{ RuntimeException -> 0x0267 }
        r2 = r2.aw;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = r1 * r2;
        r0.bi = r1;	 Catch:{ RuntimeException -> 0x0267 }
    L_0x0197:
        r1 = r10 & 16;
        if (r1 == 0) goto L_0x01f2;
    L_0x019b:
        r1 = 2050117015; // 0x7a324d97 float:2.3145064E35 double:1.012892387E-314;
        r1 = r12.cc(r1);	 Catch:{ RuntimeException -> 0x0267 }
        r2 = 1977017815; // 0x75d6e5d7 float:5.4483068E32 double:9.767765836E-315;
        r2 = r12.cc(r2);	 Catch:{ RuntimeException -> 0x0267 }
        r3 = r0.br;	 Catch:{ RuntimeException -> 0x0267 }
        r4 = 1948391561; // 0x74221889 float:5.137022E31 double:9.62633335E-315;
        r3 = r3 * r4;
        r4 = -357869149; // 0xffffffffeaab59a3 float:-1.0357481E26 double:NaN;
        r5 = defpackage.fz.du;	 Catch:{ RuntimeException -> 0x0267 }
        r4 = r4 * r5;
        r1 = r1 - r4;
        r4 = defpackage.fz.du;	 Catch:{ RuntimeException -> 0x0267 }
        r5 = -357869149; // 0xffffffffeaab59a3 float:-1.0357481E26 double:NaN;
        r4 = r4 * r5;
        r1 = r1 - r4;
        r1 = r1 * 64;
        r1 = r3 - r1;
        r3 = r0.bb;	 Catch:{ RuntimeException -> 0x0267 }
        r4 = -1461980333; // 0xffffffffa8dbf353 float:-2.441941E-14 double:NaN;
        r3 = r3 * r4;
        r4 = 1195683827; // 0x4744aff3 float:50351.95 double:5.90746302E-315;
        r5 = defpackage.fm.dn;	 Catch:{ RuntimeException -> 0x0267 }
        r4 = r4 * r5;
        r2 = r2 - r4;
        r4 = defpackage.fm.dn;	 Catch:{ RuntimeException -> 0x0267 }
        r5 = 1195683827; // 0x4744aff3 float:50351.95 double:5.90746302E-315;
        r4 = r4 * r5;
        r2 = r2 - r4;
        r2 = r2 * 64;
        r2 = r3 - r2;
        if (r1 != 0) goto L_0x01dd;
    L_0x01db:
        if (r2 == 0) goto L_0x01f2;
    L_0x01dd:
        r4 = (double) r1;	 Catch:{ RuntimeException -> 0x0267 }
        r2 = (double) r2;	 Catch:{ RuntimeException -> 0x0267 }
        r2 = java.lang.Math.atan2(r4, r2);	 Catch:{ RuntimeException -> 0x0267 }
        r4 = 4644441771640602231; // 0x40745f2f1a9fbe77 float:6.606857E-23 double:325.949;
        r2 = r2 * r4;
        r1 = (int) r2;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = r1 & 2047;
        r2 = 291359525; // 0x115dcb25 float:1.7496425E-28 double:1.43950732E-315;
        r1 = r1 * r2;
        r0.cr = r1;	 Catch:{ RuntimeException -> 0x0267 }
    L_0x01f2:
        r1 = r10 & 4;
        if (r1 == 0) goto L_0x024a;
    L_0x01f6:
        r1 = -119; // 0xffffffffffffff89 float:NaN double:NaN;
        r1 = r12.co(r1);	 Catch:{ RuntimeException -> 0x0267 }
        r2 = 566382975; // 0x21c2517f float:1.3167523E-18 double:2.798303703E-315;
        r1 = r1 * r2;
        r0.cv = r1;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = 11;
        r1 = r12.cq(r1);	 Catch:{ RuntimeException -> 0x0267 }
        r2 = 1408073397; // 0x53ed7eb5 float:2.04006608E12 double:6.956806923E-315;
        r3 = r1 >> 16;
        r2 = r2 * r3;
        r0.cx = r2;	 Catch:{ RuntimeException -> 0x0267 }
        r2 = 1017703515; // 0x3ca8ec5b float:0.020620516 double:5.028123444E-315;
        r3 = defpackage.client.af;	 Catch:{ RuntimeException -> 0x0267 }
        r4 = 901275591; // 0x35b85fc7 float:1.3736943E-6 double:4.45289307E-315;
        r3 = r3 * r4;
        r4 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r1 = r1 & r4;
        r1 = r1 + r3;
        r1 = r1 * r2;
        r0.cs = r1;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = 0;
        r0.cu = r1;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = 0;
        r0.cg = r1;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = r0.cs;	 Catch:{ RuntimeException -> 0x0267 }
        r2 = 1048208339; // 0x3e7a63d3 float:0.24452142 double:5.1788373E-315;
        r1 = r1 * r2;
        r2 = defpackage.client.af;	 Catch:{ RuntimeException -> 0x0267 }
        r3 = 901275591; // 0x35b85fc7 float:1.3736943E-6 double:4.45289307E-315;
        r2 = r2 * r3;
        if (r1 <= r2) goto L_0x023a;
    L_0x0235:
        r1 = -1045839501; // 0xffffffffc1a9c173 float:-21.219458 double:NaN;
        r0.cu = r1;	 Catch:{ RuntimeException -> 0x0267 }
    L_0x023a:
        r1 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r2 = 250310271; // 0xeeb6e7f float:5.8038377E-30 double:1.236697057E-315;
        r3 = r0.cv;	 Catch:{ RuntimeException -> 0x0267 }
        r2 = r2 * r3;
        if (r1 != r2) goto L_0x024a;
    L_0x0245:
        r1 = -566382975; // 0xffffffffde3dae81 float:-3.41700094E18 double:NaN;
        r0.cv = r1;	 Catch:{ RuntimeException -> 0x0267 }
    L_0x024a:
        r0 = r9 + 1;
        r9 = r0;
        goto L_0x0002;
    L_0x024f:
        r5 = 32766; // 0x7ffe float:4.5915E-41 double:1.61886E-319;
        if (r1 == r5) goto L_0x025c;
    L_0x0253:
        r2 = 1804667316; // 0x6b9109b4 float:3.5068013E26 double:8.91624123E-315;
        r2 = r12.bu(r2);	 Catch:{ RuntimeException -> 0x0267 }
        goto L_0x0054;
    L_0x025c:
        r1 = -1;
        goto L_0x0054;
    L_0x025f:
        r2 = -208288828; // 0xfffffffff395c3c4 float:-2.3731165E31 double:NaN;
        r0.bn(r1, r2);	 Catch:{ RuntimeException -> 0x0267 }
        goto L_0x00ad;
    L_0x0267:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "ga.dj(";
        r1 = r1.append(r2);
        r2 = 41;
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0 = defpackage.ei.ac(r0, r1);
        throw r0;
    L_0x0282:
        r6 = r5;
        goto L_0x00a1;
    L_0x0285:
        r3 = -1;
        if (r1 == r3) goto L_0x02af;
    L_0x0288:
        r3 = -1;
        r4 = r0.ck;	 Catch:{ RuntimeException -> 0x0267 }
        r5 = 1976380739; // 0x75cd2d43 float:5.20185E32 double:9.76461826E-315;
        r4 = r4 * r5;
        if (r3 == r4) goto L_0x02af;
    L_0x0291:
        r3 = 0;
        r3 = defpackage.bn.aj(r1, r3);	 Catch:{ RuntimeException -> 0x0267 }
        r3 = r3.am;	 Catch:{ RuntimeException -> 0x0267 }
        r4 = 79095755; // 0x4b6e7cb float:4.3000863E-36 double:3.90784953E-316;
        r3 = r3 * r4;
        r4 = r0.ck;	 Catch:{ RuntimeException -> 0x0267 }
        r5 = 1976380739; // 0x75cd2d43 float:5.20185E32 double:9.76461826E-315;
        r4 = r4 * r5;
        r5 = 0;
        r4 = defpackage.bn.aj(r4, r5);	 Catch:{ RuntimeException -> 0x0267 }
        r4 = r4.am;	 Catch:{ RuntimeException -> 0x0267 }
        r5 = 79095755; // 0x4b6e7cb float:4.3000863E-36 double:3.90784953E-316;
        r4 = r4 * r5;
        if (r3 < r4) goto L_0x0109;
    L_0x02af:
        r3 = -2042247317; // 0xffffffff8645c76b float:-3.719809E-35 double:NaN;
        r1 = r1 * r3;
        r0.ck = r1;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = 0;
        r0.ce = r1;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = 0;
        r0.ch = r1;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = 1611262399; // 0x6009e9bf float:3.9750736E19 double:7.96069398E-315;
        r1 = r1 * r2;
        r0.ci = r1;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = 0;
        r0.cq = r1;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = 1719369689; // 0x667b7fd9 float:2.9691809E23 double:8.49481496E-315;
        r2 = r0.dr;	 Catch:{ RuntimeException -> 0x0267 }
        r1 = r1 * r2;
        r0.dw = r1;	 Catch:{ RuntimeException -> 0x0267 }
        goto L_0x0109;
    L_0x02ce:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.dj(hn, byte):void");
    }

    static final void ev(ab[] abVarArr, int i, int i2) {
        for (ab abVar : abVarArr) {
            if (abVar != null) {
                if (i == -1228023025 * abVar.bi) {
                    if (!abVar.az || !ex.fe(abVar, (byte) -111)) {
                        int i3;
                        if (abVar.au * -1999477681 == 0) {
                            if (abVar.az || !ex.fe(abVar, (byte) -118) || abVar == an.hg) {
                                ga.ev(abVarArr, abVar.ax * -1035840093, 2118662120);
                                if (abVar.ft != null) {
                                    ga.ev(abVar.ft, abVar.ax * -1035840093, 504001273);
                                }
                                fr frVar = (fr) client.ic.aj((long) (abVar.ax * -1035840093));
                                if (frVar != null) {
                                    i3 = frVar.aj * -1696662607;
                                    if (ku.an(i3, 1671262481)) {
                                        try {
                                            ga.ev(ab.aa[i3], -1, 1214308096);
                                        } catch (Throwable e) {
                                            throw ei.ac(e, "ga.ev(" + ')');
                                        }
                                    }
                                }
                            }
                        }
                        if (-1999477681 * abVar.au == 6) {
                            if (!(-1 == 703619083 * abVar.ce && abVar.ch * -2049122957 == -1)) {
                                if (bb.ex(abVar, 193188808)) {
                                    i3 = -2049122957 * abVar.ch;
                                } else {
                                    i3 = abVar.ce * 703619083;
                                }
                                if (i3 != -1) {
                                    ax aj = bn.aj(i3, (byte) 0);
                                    abVar.fk += 850695041 * client.er;
                                    while (abVar.fk * -983762643 > aj.ap[abVar.fo * -1275974527]) {
                                        abVar.fk -= aj.ap[abVar.fo * -1275974527] * 20233893;
                                        abVar.fo -= 861269119;
                                        if (abVar.fo * -1275974527 >= aj.aa.length) {
                                            abVar.fo -= aj.ah * -635306543;
                                            if (abVar.fo * -1275974527 < 0 || abVar.fo * -1275974527 >= aj.aa.length) {
                                                abVar.fo = 0;
                                            }
                                        }
                                        cf.ew(abVar, (byte) -94);
                                    }
                                }
                            }
                            if (!(abVar.cd * 2123758329 == 0 || abVar.az)) {
                                int i4 = (((abVar.cd * 2123758329) << 16) >> 16) * (-728602963 * client.er);
                                abVar.cv = (((((abVar.cd * 2123758329) >> 16) * (client.er * -728602963)) + (abVar.cv * -971166959)) & 2047) * -666819087;
                                abVar.cu = 1231133277 * ((i4 + (abVar.cu * -449705483)) & 2047);
                                cf.ew(abVar, (byte) -53);
                            }
                        }
                    }
                }
            }
        }
    }
}
