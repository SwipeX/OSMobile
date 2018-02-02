package defpackage;

import java.io.IOException;
import java.net.Socket;

public abstract class lo {
    public abstract int ac(short s) throws IOException;

    public abstract int ae() throws IOException;

    public abstract void ah();

    public abstract int ai() throws IOException;

    public abstract void aj(short s);

    public abstract void ak(byte[] bArr, int i, int i2, int i3) throws IOException;

    public abstract int al(byte[] bArr, int i, int i2) throws IOException;

    public abstract int am() throws IOException;

    public abstract int an(byte b) throws IOException;

    public abstract int ao(byte[] bArr, int i, int i2, int i3) throws IOException;

    public abstract void ap();

    public abstract boolean aq(int i, int i2) throws IOException;

    public abstract boolean as(int i) throws IOException;

    public abstract void at();

    public abstract int aw() throws IOException;

    public abstract int ax(byte[] bArr, int i, int i2) throws IOException;

    public abstract void ay(byte[] bArr, int i, int i2) throws IOException;

    public abstract int az(byte[] bArr, int i, int i2) throws IOException;

    lo() {
        try {
        } catch (Throwable e) {
            throw ei.ac(e, "lo.<init>(" + ')');
        }
    }

    public static lo ar(Socket socket, int i, int i2) throws IOException {
        return new ln(socket, i, i2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void aa(he r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        /*
        if (r10 < 0) goto L_0x0131;
    L_0x0002:
        r0 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        if (r10 >= r0) goto L_0x0131;
    L_0x0006:
        if (r11 < 0) goto L_0x0131;
    L_0x0008:
        r0 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        if (r11 >= r0) goto L_0x0131;
    L_0x000c:
        r0 = defpackage.fb.ac;	 Catch:{ RuntimeException -> 0x0096 }
        r0 = r0[r9];	 Catch:{ RuntimeException -> 0x0096 }
        r0 = r0[r10];	 Catch:{ RuntimeException -> 0x0096 }
        r1 = 0;
        r0[r11] = r1;	 Catch:{ RuntimeException -> 0x0096 }
    L_0x0015:
        r0 = -310118664; // 0xffffffffed83f6f8 float:-5.105138E27 double:NaN;
        r0 = r8.au(r0);	 Catch:{ RuntimeException -> 0x0096 }
        if (r0 != 0) goto L_0x0079;
    L_0x001e:
        if (r9 != 0) goto L_0x0111;
    L_0x0020:
        r0 = defpackage.fb.aj;	 Catch:{ RuntimeException -> 0x0096 }
        r1 = 0;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0096 }
        r1 = r0[r10];	 Catch:{ RuntimeException -> 0x0096 }
        r0 = 932731; // 0xe3b7b float:1.307035E-39 double:4.608303E-318;
        r0 = r0 + r10;
        r0 = r0 + r12;
        r2 = 556238; // 0x87cce float:7.79455E-40 double:2.74818E-318;
        r2 = r2 + r11;
        r2 = r2 + r13;
        r3 = 45365; // 0xb135 float:6.357E-41 double:2.24133E-319;
        r3 = r3 + r0;
        r4 = 91923; // 0x16713 float:1.28812E-40 double:4.5416E-319;
        r4 = r4 + r2;
        r5 = 4;
        r6 = -117465201; // 0xfffffffff8ff9f8f float:-4.1477248E34 double:NaN;
        r3 = defpackage.bl.aw(r3, r4, r5, r6);	 Catch:{ RuntimeException -> 0x0096 }
        r3 = r3 + -128;
        r4 = r0 + 10294;
        r5 = 37821; // 0x93bd float:5.2999E-41 double:1.8686E-319;
        r5 = r5 + r2;
        r6 = 2;
        r7 = -840997793; // 0xffffffffcddf645f float:-4.68487136E8 double:NaN;
        r4 = defpackage.bl.aw(r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0096 }
        r4 = r4 + -128;
        r4 = r4 >> 1;
        r3 = r3 + r4;
        r4 = 1;
        r5 = -333967346; // 0xffffffffec18100e float:-7.3533016E26 double:NaN;
        r0 = defpackage.bl.aw(r0, r2, r4, r5);	 Catch:{ RuntimeException -> 0x0096 }
        r0 = r0 + -128;
        r0 = r0 >> 2;
        r0 = r0 + r3;
        r2 = 4599075939470750515; // 0x3fd3333333333333 float:4.172325E-8 double:0.3;
        r4 = (double) r0;	 Catch:{ RuntimeException -> 0x0096 }
        r2 = r2 * r4;
        r0 = (int) r2;	 Catch:{ RuntimeException -> 0x0096 }
        r0 = r0 + 35;
        r2 = 10;
        if (r0 >= r2) goto L_0x00b1;
    L_0x0071:
        r0 = 10;
    L_0x0073:
        r0 = -r0;
        r0 = r0 * 8;
        r1[r11] = r0;	 Catch:{ RuntimeException -> 0x0096 }
    L_0x0078:
        return;
    L_0x0079:
        r1 = 1;
        if (r0 != r1) goto L_0x00b8;
    L_0x007c:
        r0 = -310118664; // 0xffffffffed83f6f8 float:-5.105138E27 double:NaN;
        r0 = r8.au(r0);	 Catch:{ RuntimeException -> 0x0096 }
        r1 = 1;
        if (r0 != r1) goto L_0x0087;
    L_0x0086:
        r0 = 0;
    L_0x0087:
        if (r9 != 0) goto L_0x00e8;
    L_0x0089:
        r1 = defpackage.fb.aj;	 Catch:{ RuntimeException -> 0x0096 }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0096 }
        r1 = r1[r10];	 Catch:{ RuntimeException -> 0x0096 }
        r0 = -r0;
        r0 = r0 * 8;
        r1[r11] = r0;	 Catch:{ RuntimeException -> 0x0096 }
        goto L_0x0078;
    L_0x0096:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "lo.aa(";
        r1 = r1.append(r2);
        r2 = 41;
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0 = defpackage.ei.ac(r0, r1);
        throw r0;
    L_0x00b1:
        r2 = 60;
        if (r0 <= r2) goto L_0x0073;
    L_0x00b5:
        r0 = 60;
        goto L_0x0073;
    L_0x00b8:
        r1 = 49;
        if (r0 > r1) goto L_0x0100;
    L_0x00bc:
        r1 = defpackage.id.ao;	 Catch:{ RuntimeException -> 0x0096 }
        r1 = r1[r9];	 Catch:{ RuntimeException -> 0x0096 }
        r1 = r1[r10];	 Catch:{ RuntimeException -> 0x0096 }
        r2 = -232364108; // 0xfffffffff22667b4 float:-3.2959924E30 double:NaN;
        r2 = r8.av(r2);	 Catch:{ RuntimeException -> 0x0096 }
        r1[r11] = r2;	 Catch:{ RuntimeException -> 0x0096 }
        r1 = defpackage.eq.aa;	 Catch:{ RuntimeException -> 0x0096 }
        r1 = r1[r9];	 Catch:{ RuntimeException -> 0x0096 }
        r1 = r1[r10];	 Catch:{ RuntimeException -> 0x0096 }
        r2 = r0 + -2;
        r2 = r2 / 4;
        r2 = (byte) r2;	 Catch:{ RuntimeException -> 0x0096 }
        r1[r11] = r2;	 Catch:{ RuntimeException -> 0x0096 }
        r1 = defpackage.bp.ak;	 Catch:{ RuntimeException -> 0x0096 }
        r1 = r1[r9];	 Catch:{ RuntimeException -> 0x0096 }
        r1 = r1[r10];	 Catch:{ RuntimeException -> 0x0096 }
        r0 = r0 + -2;
        r0 = r0 + r14;
        r0 = r0 & 3;
        r0 = (byte) r0;	 Catch:{ RuntimeException -> 0x0096 }
        r1[r11] = r0;	 Catch:{ RuntimeException -> 0x0096 }
        goto L_0x0015;
    L_0x00e8:
        r1 = defpackage.fb.aj;	 Catch:{ RuntimeException -> 0x0096 }
        r1 = r1[r9];	 Catch:{ RuntimeException -> 0x0096 }
        r1 = r1[r10];	 Catch:{ RuntimeException -> 0x0096 }
        r2 = defpackage.fb.aj;	 Catch:{ RuntimeException -> 0x0096 }
        r3 = r9 + -1;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x0096 }
        r2 = r2[r10];	 Catch:{ RuntimeException -> 0x0096 }
        r2 = r2[r11];	 Catch:{ RuntimeException -> 0x0096 }
        r0 = r0 * 8;
        r0 = r2 - r0;
        r1[r11] = r0;	 Catch:{ RuntimeException -> 0x0096 }
        goto L_0x0078;
    L_0x0100:
        r1 = 81;
        if (r0 > r1) goto L_0x0145;
    L_0x0104:
        r1 = defpackage.fb.ac;	 Catch:{ RuntimeException -> 0x0096 }
        r1 = r1[r9];	 Catch:{ RuntimeException -> 0x0096 }
        r1 = r1[r10];	 Catch:{ RuntimeException -> 0x0096 }
        r0 = r0 + -49;
        r0 = (byte) r0;	 Catch:{ RuntimeException -> 0x0096 }
        r1[r11] = r0;	 Catch:{ RuntimeException -> 0x0096 }
        goto L_0x0015;
    L_0x0111:
        r0 = defpackage.fb.aj;	 Catch:{ RuntimeException -> 0x0096 }
        r0 = r0[r9];	 Catch:{ RuntimeException -> 0x0096 }
        r0 = r0[r10];	 Catch:{ RuntimeException -> 0x0096 }
        r1 = defpackage.fb.aj;	 Catch:{ RuntimeException -> 0x0096 }
        r2 = r9 + -1;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0096 }
        r1 = r1[r10];	 Catch:{ RuntimeException -> 0x0096 }
        r1 = r1[r11];	 Catch:{ RuntimeException -> 0x0096 }
        r1 = r1 + -240;
        r0[r11] = r1;	 Catch:{ RuntimeException -> 0x0096 }
        goto L_0x0078;
    L_0x0127:
        r1 = 49;
        if (r0 > r1) goto L_0x0131;
    L_0x012b:
        r0 = -310118664; // 0xffffffffed83f6f8 float:-5.105138E27 double:NaN;
        r8.au(r0);	 Catch:{ RuntimeException -> 0x0096 }
    L_0x0131:
        r0 = -310118664; // 0xffffffffed83f6f8 float:-5.105138E27 double:NaN;
        r0 = r8.au(r0);	 Catch:{ RuntimeException -> 0x0096 }
        if (r0 == 0) goto L_0x0078;
    L_0x013a:
        r1 = 1;
        if (r0 != r1) goto L_0x0127;
    L_0x013d:
        r0 = -310118664; // 0xffffffffed83f6f8 float:-5.105138E27 double:NaN;
        r8.au(r0);	 Catch:{ RuntimeException -> 0x0096 }
        goto L_0x0078;
    L_0x0145:
        r1 = defpackage.gh.aq;	 Catch:{ RuntimeException -> 0x0096 }
        r1 = r1[r9];	 Catch:{ RuntimeException -> 0x0096 }
        r1 = r1[r10];	 Catch:{ RuntimeException -> 0x0096 }
        r0 = r0 + -81;
        r0 = (byte) r0;	 Catch:{ RuntimeException -> 0x0096 }
        r1[r11] = r0;	 Catch:{ RuntimeException -> 0x0096 }
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: lo.aa(he, int, int, int, int, int, int, int):void");
    }

    public static final void ef(int i, byte b) {
        int i2 = 0;
        try {
            cv.eg(-1531119021);
            dv.ac(-1821922824);
            int i3 = ar.ac(i, (byte) -51).aq * -2107382953;
            if (i3 != 0) {
                hi hiVar;
                int i4 = bp.an[i];
                if (i3 == 1) {
                    if (i4 == 1) {
                        md.bb(0.9d, 0, cj.at, 967549589);
                        ((ck) by.ae).br(0.9d);
                    }
                    if (i4 == 2) {
                        md.bb(0.8d, 0, cj.at, 967549589);
                        ((ck) by.ae).br(0.8d);
                    }
                    if (3 == i4) {
                        md.bb(0.7d, 0, cj.at, 967549589);
                        ((ck) by.ae).br(0.7d);
                    }
                    if (i4 == 4) {
                        md.bb(0.6d, 0, cj.at, 967549589);
                        ((ck) by.ae).br(0.6d);
                    }
                    al.av(1118110390);
                }
                if (i3 == 3) {
                    int i5;
                    if (i4 == 0) {
                        i5 = 255;
                    } else {
                        i5 = 0;
                    }
                    if (i4 == 1) {
                        i5 = 192;
                    }
                    if (i4 == 2) {
                        i5 = cj.ak;
                    }
                    if (3 == i4) {
                        i5 = 64;
                    }
                    if (i4 != 4) {
                        i2 = i5;
                    }
                    if (client.ly * 405992575 != i2) {
                        if (405992575 * client.ly == 0 && -1 != -510254497 * client.lh) {
                            gv.an(ae.bl, client.lh * -510254497, 0, i2, false, (byte) 103);
                            client.mt = false;
                        } else if (i2 == 0) {
                            hn.ao(-1400128103);
                            client.mt = false;
                        } else {
                            kk.aq(i2, (byte) -108);
                        }
                        client.ly = 489212799 * i2;
                    }
                }
                if (i3 == 4) {
                    if (i4 == 0) {
                        client.mi = 1337507429;
                    }
                    if (i4 == 1) {
                        client.mi = -510809568;
                    }
                    if (i4 == 2) {
                        client.mi = -340539712;
                    }
                    if (3 == i4) {
                        client.mi = -170269856;
                    }
                    if (i4 == 4) {
                        client.mi = 0;
                    }
                }
                if (i3 == 5) {
                    client.hj = 1484736327 * i4;
                }
                if (6 == i3) {
                    client.ib = 1942687073 * i4;
                }
                if (i3 == 9) {
                    client.io = -218914501 * i4;
                }
                if (10 == i3) {
                    if (i4 == 0) {
                        client.mp = 78837569;
                    }
                    if (1 == i4) {
                        client.mp = 1953437600;
                    }
                    if (i4 == 2) {
                        client.mp = -129364032;
                    }
                    if (i4 == 3) {
                        client.mp = 2082801632;
                    }
                    if (4 == i4) {
                        client.mp = 0;
                    }
                }
                if (i3 == 17) {
                    client.iu = -2077624571 * (65535 & i4);
                }
                if (18 == i3) {
                    hiVar = (hi) bp.aj(new hi[]{hi.an, hi.aj, hi.aq, hi.ac}, i4, -741243182);
                    if (hiVar == null) {
                        hiVar = hi.aj;
                    }
                    dj.hs.bc(hiVar, 1621686031);
                }
                if (19 == i3) {
                    if (i4 == -1) {
                        client.hd = -520335055;
                    } else {
                        client.hd = 520335055 * (i4 & 2047);
                    }
                }
                if (i3 == 22) {
                    hiVar = (hi) bp.aj(new hi[]{hi.an, hi.aj, hi.aq, hi.ac}, i4, 322531748);
                    if (hiVar == null) {
                        hiVar = hi.aj;
                    }
                    dj.hs.bk(hiVar, (byte) 56);
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "lo.ef(" + ')');
        }
    }
}
