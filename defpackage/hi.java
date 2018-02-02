package defpackage;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class hi implements hp {
    public static final hi ac = new hi(1);
    public static final hi aj = new hi(0);
    public static short[] ak = null;
    public static final hi an = new hi(2);
    public static final hi aq = new hi(3);
    static final int av = 200;
    final int ao;

    hi(int i) {
        try {
            this.ao = -900608135 * i;
        } catch (Throwable e) {
            throw ei.ac(e, "hi.<init>(" + ')');
        }
    }

    public int aa() {
        return -239310135 * this.ao;
    }

    public int ac(byte b) {
        try {
            return -239310135 * this.ao;
        } catch (Throwable e) {
            throw ei.ac(e, "hi.ac(" + ')');
        }
    }

    public int ao() {
        return -239310135 * this.ao;
    }

    public int aq() {
        return -239310135 * this.ao;
    }

    static void ai(byte b) {
        Object obj = 2;
        try {
            fw.cy = fw.cy.trim();
            if (fw.cy.length() == 0) {
                dk.am(ix.jc, ix.jz, ix.ja, -564496004);
                return;
            }
            long aj = bn.aj((byte) -5);
            if (aj == 0) {
                obj = 5;
            } else {
                int i;
                String str = fw.cy;
                Random random = new Random();
                he heVar = new he((int) cj.ak);
                he heVar2 = new he((int) cj.ak);
                int[] iArr = new int[]{random.nextInt(), random.nextInt(), (int) (aj >> 32), (int) aj};
                heVar.an(10, (byte) -126);
                for (i = 0; i < 4; i++) {
                    heVar.aa(random.nextInt(), 2071199217);
                }
                heVar.aa(iArr[0], 745572282);
                heVar.aa(iArr[1], -1556903183);
                heVar.ap(aj);
                heVar.ap(0);
                for (i = 0; i < 4; i++) {
                    heVar.aa(random.nextInt(), 1383285518);
                }
                heVar.bq(ga.ao, ga.aa, 2007235088);
                heVar2.an(10, Byte.MIN_VALUE);
                for (i = 0; i < 3; i++) {
                    heVar2.aa(random.nextInt(), 308179409);
                }
                heVar2.ap(random.nextLong());
                heVar2.ak(random.nextLong());
                bz.fc(heVar2, (byte) -59);
                heVar2.ap(random.nextLong());
                heVar2.bq(ga.ao, ga.aa, 561186277);
                i = cx.ah(str, 1421202046);
                if (i % 8 != 0) {
                    i += 8 - (i % 8);
                }
                he heVar3 = new he(i);
                heVar3.ai(str, 873446069);
                heVar3.ac = i * -984165911;
                heVar3.bi(iArr, -1689279761);
                he heVar4 = new he((heVar3.ac * 489625177) + (((heVar.ac * 489625177) + 5) + (heVar2.ac * 489625177)));
                heVar4.an(2, (byte) -36);
                heVar4.an(heVar.ac * 489625177, (byte) -91);
                heVar4.ae(heVar.aj, 0, heVar.ac * 489625177, (byte) 68);
                heVar4.an(heVar2.ac * 489625177, (byte) -125);
                heVar4.ae(heVar2.aj, 0, heVar2.ac * 489625177, (byte) -35);
                heVar4.aq(heVar3.ac * 489625177, 1108995729);
                heVar4.ae(heVar3.aj, 0, heVar3.ac * 489625177, (byte) 100);
                byte[] bArr = heVar4.aj;
                int length = bArr.length;
                StringBuilder stringBuilder = new StringBuilder();
                for (i = 0; i < length + 0; i += 3) {
                    int i2 = bArr[i] & 255;
                    stringBuilder.append(mq.aj[i2 >>> 2]);
                    if (i < length - 1) {
                        int i3 = bArr[i + 1] & 255;
                        stringBuilder.append(mq.aj[((i2 & 3) << 4) | (i3 >>> 4)]);
                        if (i < length - 2) {
                            i2 = bArr[i + 2] & 255;
                            stringBuilder.append(mq.aj[((i3 & 15) << 2) | (i2 >>> 6)]).append(mq.aj[i2 & 63]);
                        } else {
                            stringBuilder.append(mq.aj[(i3 & 15) << 2]).append("=");
                        }
                    } else {
                        stringBuilder.append(mq.aj[(i2 & 3) << 4]).append("==");
                    }
                }
                CharSequence stringBuilder2 = stringBuilder.toString();
                try {
                    URLConnection openConnection = new URL(dl.fu("services", false, -2137820949) + "m=accountappeal/login.ws").openConnection();
                    openConnection.setDoInput(true);
                    openConnection.setDoOutput(true);
                    openConnection.setConnectTimeout(5000);
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openConnection.getOutputStream());
                    outputStreamWriter.write("data2=" + ls.aj(stringBuilder2, 1982307678) + "&dest=" + ls.aj("passwordchoice.ws", 2121967801));
                    outputStreamWriter.flush();
                    InputStream inputStream = openConnection.getInputStream();
                    he heVar5 = new he(new byte[1000]);
                    do {
                        int read = inputStream.read(heVar5.aj, heVar5.ac * 489625177, 1000 - (heVar5.ac * 489625177));
                        if (-1 == read) {
                            outputStreamWriter.close();
                            inputStream.close();
                            String str2 = new String(heVar5.aj);
                            if (str2.startsWith("OFFLINE")) {
                                int i4 = 4;
                            } else if (str2.startsWith("WRONG")) {
                                obj = 7;
                            } else if (str2.startsWith("RELOAD")) {
                                obj = 3;
                            } else if (str2.startsWith("Not permitted for social network accounts.")) {
                                obj = 6;
                            } else {
                                Object obj2;
                                heVar5.bs(iArr, (byte) 92);
                                while (heVar5.ac * 489625177 > 0 && heVar5.aj[(heVar5.ac * 489625177) - 1] == (byte) 0) {
                                    heVar5.ac -= -984165911;
                                }
                                str2 = new String(heVar5.aj, 0, heVar5.ac * 489625177);
                                if (str2 == null) {
                                    obj2 = null;
                                } else {
                                    try {
                                        URL url = new URL(str2);
                                        int i5 = 1;
                                    } catch (MalformedURLException e) {
                                        obj2 = null;
                                    }
                                }
                                if (obj2 == null) {
                                    obj = 5;
                                } else if (ki.aj.startsWith("win")) {
                                    jg.aj(str2, 0, 2001336513);
                                } else if (ki.aj.startsWith("mac")) {
                                    cx.ac(str2, 1, "openjs", (byte) 0);
                                } else {
                                    jg.aj(str2, 2, 2139570994);
                                }
                            }
                        } else {
                            heVar5.ac = (read * -984165911) + heVar5.ac;
                        }
                    } while (heVar5.ac * 489625177 < 1000);
                    obj = 5;
                } catch (Throwable th) {
                    th.printStackTrace();
                    obj = 5;
                }
            }
            switch (obj) {
                case 2:
                    dk.am(ix.jw, ix.jh, ix.je, -1054839015);
                    fw.bc = -1123975554;
                    return;
                case 3:
                    dk.am(ix.jy, ix.js, ix.jm, -1048197087);
                    return;
                case 4:
                    dk.am(ix.kp, ix.kg, ix.kl, 258099196);
                    return;
                case 5:
                    dk.am(ix.kh, ix.kv, ix.kt, -1296165350);
                    return;
                case 6:
                    dk.am(ix.ka, ix.kd, ix.ku, 2080076425);
                    return;
                case 7:
                    dk.am(ix.ke, ix.kk, ix.kw, -2140791350);
                    return;
                default:
                    return;
            }
            throw ei.ac(th, "hi.ai(" + ')');
        } catch (Throwable th2) {
            throw ei.ac(th2, "hi.ai(" + ')');
        }
    }
}
