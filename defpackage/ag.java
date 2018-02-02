package defpackage;

public class ag extends jt {
    static final int ac = 1;
    static final int ae = 7;
    static final int ah = 3;
    static final int ai = 4;
    static final int aj = 6;
    static final int am = 6;
    static final int an = 2;
    static final int aq = 3;
    static final int at = 2;
    static he au = null;
    public static final int av = 16777216;
    static final int bh = 19136896;
    int aa;
    boolean ak;
    int ba;
    int bc;
    int bd;
    String be;
    int bf;
    int bg;
    boolean bi;
    int bj;
    int bk;
    String bl;
    String bn;
    int bp;
    int bs;
    int bu;
    String bv;
    String bw;
    int bx;
    int by;
    int bz;
    String cb;
    int cl;
    int[] cy;

    public static ay aj(int i, byte b) {
        try {
            ay ayVar = (ay) ay.an.aj((long) i);
            if (ayVar == null) {
                byte[] an = ay.aj.an(9, i, -1119014814);
                ayVar = new ay();
                ayVar.ao = 1781706173 * i;
                if (an != null) {
                    ayVar.an(new he(an), 1826960598);
                }
                ayVar.ac((byte) 8);
                ay.an.an(ayVar, (long) i);
            }
            return ayVar;
        } catch (Throwable e) {
            throw ei.ac(e, "ag.aj(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ag(boolean r12) {
        /*
        r11 = this;
        r9 = 57;
        r8 = 48;
        r2 = 2;
        r1 = 0;
        r7 = -1;
        r11.<init>();	 Catch:{ RuntimeException -> 0x00a8 }
        r0 = 3;
        r0 = new int[r0];	 Catch:{ RuntimeException -> 0x00a8 }
        r11.cy = r0;	 Catch:{ RuntimeException -> 0x00a8 }
        if (r12 == 0) goto L_0x02cc;
    L_0x0011:
        r0 = defpackage.gm.as;	 Catch:{ RuntimeException -> 0x00a8 }
        r3 = "win";
        r0 = r0.startsWith(r3);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r0 == 0) goto L_0x0097;
    L_0x001b:
        r0 = -313096837; // 0xffffffffed56857b float:-4.1494475E27 double:NaN;
        r11.aa = r0;	 Catch:{ RuntimeException -> 0x00a8 }
    L_0x0020:
        r0 = "os.arch";
        r0 = java.lang.System.getProperty(r0);	 Catch:{ Exception -> 0x00db }
        r0 = r0.toLowerCase();	 Catch:{ Exception -> 0x00db }
        r5 = r0;
    L_0x002b:
        r0 = "os.version";
        r0 = java.lang.System.getProperty(r0);	 Catch:{ Exception -> 0x00e1 }
        r0 = r0.toLowerCase();	 Catch:{ Exception -> 0x00e1 }
        r4 = r0;
    L_0x0036:
        r0 = "Unknown";
        r3 = "1.1";
        r6 = "java.vendor";
        r0 = java.lang.System.getProperty(r6);	 Catch:{ Exception -> 0x0307 }
        r6 = "java.version";
        r3 = java.lang.System.getProperty(r6);	 Catch:{ Exception -> 0x0307 }
    L_0x0046:
        r6 = "amd64";
        r6 = r5.startsWith(r6);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r6 != 0) goto L_0x0056;
    L_0x004e:
        r6 = "x86_64";
        r5 = r5.startsWith(r6);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == 0) goto L_0x00e7;
    L_0x0056:
        r5 = 1;
        r11.ak = r5;	 Catch:{ RuntimeException -> 0x00a8 }
    L_0x0059:
        r5 = -455962189; // 0xffffffffe4d291b3 float:-3.107452E22 double:NaN;
        r6 = r11.aa;	 Catch:{ RuntimeException -> 0x00a8 }
        r5 = r5 * r6;
        r6 = 1;
        if (r5 != r6) goto L_0x0182;
    L_0x0062:
        r5 = "4.0";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x00ec;
    L_0x006a:
        r4 = -774717319; // 0xffffffffd1d2c079 float:-1.13146536E11 double:NaN;
        r11.bp = r4;	 Catch:{ RuntimeException -> 0x00a8 }
    L_0x006f:
        r4 = r0.toLowerCase();	 Catch:{ RuntimeException -> 0x00a8 }
        r5 = "sun";
        r4 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r4 == r7) goto L_0x0202;
    L_0x007b:
        r0 = 146034063; // 0x8b44d8f float:1.085159E-33 double:7.21504137E-316;
        r11.bu = r0;	 Catch:{ RuntimeException -> 0x00a8 }
    L_0x0080:
        r0 = r1;
    L_0x0081:
        r4 = r3.length();	 Catch:{ Exception -> 0x0242 }
        if (r2 >= r4) goto L_0x0243;
    L_0x0087:
        r4 = r3.charAt(r2);	 Catch:{ Exception -> 0x0242 }
        if (r4 < r8) goto L_0x0243;
    L_0x008d:
        if (r4 > r9) goto L_0x0243;
    L_0x008f:
        r4 = r4 + -48;
        r0 = r0 * 10;
        r0 = r0 + r4;
        r2 = r2 + 1;
        goto L_0x0081;
    L_0x0097:
        r0 = defpackage.gm.as;	 Catch:{ RuntimeException -> 0x00a8 }
        r3 = "mac";
        r0 = r0.startsWith(r3);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r0 == 0) goto L_0x00c3;
    L_0x00a1:
        r0 = -626193674; // 0xffffffffdaad0af6 float:-2.43536113E16 double:NaN;
        r11.aa = r0;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x0020;
    L_0x00a8:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "ag.<init>(";
        r1 = r1.append(r2);
        r2 = 41;
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0 = defpackage.ei.ac(r0, r1);
        throw r0;
    L_0x00c3:
        r0 = defpackage.gm.as;	 Catch:{ RuntimeException -> 0x00a8 }
        r3 = "linux";
        r0 = r0.startsWith(r3);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r0 == 0) goto L_0x00d4;
    L_0x00cd:
        r0 = -939290511; // 0xffffffffc8039071 float:-134721.77 double:NaN;
        r11.aa = r0;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x0020;
    L_0x00d4:
        r0 = -1252387348; // 0xffffffffb55a15ec float:-8.124323E-7 double:NaN;
        r11.aa = r0;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x0020;
    L_0x00db:
        r0 = move-exception;
        r0 = "";
        r5 = r0;
        goto L_0x002b;
    L_0x00e1:
        r0 = move-exception;
        r0 = "";
        r4 = r0;
        goto L_0x0036;
    L_0x00e7:
        r5 = 0;
        r11.ak = r5;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x0059;
    L_0x00ec:
        r5 = "4.1";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x00fb;
    L_0x00f4:
        r4 = -1549434638; // 0xffffffffa3a580f2 float:-1.7943946E-17 double:NaN;
        r11.bp = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x00fb:
        r5 = "4.9";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x010a;
    L_0x0103:
        r4 = 1970815339; // 0x7578416b float:3.1470128E32 double:9.737121533E-315;
        r11.bp = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x010a:
        r5 = "5.0";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x0119;
    L_0x0112:
        r4 = 1196098020; // 0x474b01e4 float:51969.89 double:5.909509407E-315;
        r11.bp = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x0119:
        r5 = "5.1";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x0128;
    L_0x0121:
        r4 = 421380701; // 0x191dc25d float:8.155961E-24 double:2.08189728E-315;
        r11.bp = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x0128:
        r5 = "5.2";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x0137;
    L_0x0130:
        r4 = -1902771256; // 0xffffffff8e9603c8 float:-3.6981496E-30 double:NaN;
        r11.bp = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x0137:
        r5 = "6.0";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x0146;
    L_0x013f:
        r4 = -353336618; // 0xffffffffeaf082d6 float:-1.4538003E26 double:NaN;
        r11.bp = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x0146:
        r5 = "6.1";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x0155;
    L_0x014e:
        r4 = -1128053937; // 0xffffffffbcc3434f float:-0.023835806 double:NaN;
        r11.bp = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x0155:
        r5 = "6.2";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x0164;
    L_0x015d:
        r4 = 1617478721; // 0x6068c441 float:6.709041E19 double:7.99140669E-315;
        r11.bp = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x0164:
        r5 = "6.3";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x0173;
    L_0x016c:
        r4 = 842761402; // 0x323b84ba float:1.0915011E-8 double:4.163794564E-315;
        r11.bp = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x0173:
        r5 = "10.0";
        r4 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r4 == r7) goto L_0x006f;
    L_0x017b:
        r4 = 68044083; // 0x40e4533 float:1.6723795E-36 double:3.3618244E-316;
        r11.bp = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x0182:
        r5 = r11.aa;	 Catch:{ RuntimeException -> 0x00a8 }
        r6 = -455962189; // 0xffffffffe4d291b3 float:-3.107452E22 double:NaN;
        r5 = r5 * r6;
        if (r2 != r5) goto L_0x006f;
    L_0x018a:
        r5 = "10.4";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x0199;
    L_0x0192:
        r4 = 1685522804; // 0x64770974 float:1.8228108E22 double:8.327589127E-315;
        r11.bp = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x0199:
        r5 = "10.5";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x01a8;
    L_0x01a1:
        r4 = 910805485; // 0x3649c9ed float:3.006887E-6 double:4.499977E-315;
        r11.bp = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x01a8:
        r5 = "10.6";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x01b7;
    L_0x01b0:
        r4 = 136088166; // 0x81c8a66 float:4.710723E-34 double:6.72364876E-316;
        r11.bp = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x01b7:
        r5 = "10.7";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x01c6;
    L_0x01bf:
        r4 = -638629153; // 0xffffffffd9ef4adf float:-8.4193551E15 double:NaN;
        r11.bp = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x01c6:
        r5 = "10.8";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x01d5;
    L_0x01ce:
        r4 = -1413346472; // 0xffffffffabc20b58 float:-1.3787678E-12 double:NaN;
        r11.bp = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x01d5:
        r5 = "10.9";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x01e4;
    L_0x01dd:
        r4 = 2106903505; // 0x7d94cbd1 float:2.4723002E37 double:1.040948641E-314;
        r11.bp = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x01e4:
        r5 = "10.10";
        r5 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r5 == r7) goto L_0x01f3;
    L_0x01ec:
        r4 = 1332186186; // 0x4f678c4a float:3.88473088E9 double:6.581874284E-315;
        r11.bp = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x01f3:
        r5 = "10.11";
        r4 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r4 == r7) goto L_0x006f;
    L_0x01fb:
        r4 = 557468867; // 0x213a4cc3 float:6.3120845E-19 double:2.75426216E-315;
        r11.bp = r4;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x006f;
    L_0x0202:
        r4 = r0.toLowerCase();	 Catch:{ RuntimeException -> 0x00a8 }
        r5 = "microsoft";
        r4 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r4 == r7) goto L_0x0215;
    L_0x020e:
        r0 = 292068126; // 0x11689b1e float:1.8349372E-28 double:1.443008273E-315;
        r11.bu = r0;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x0080;
    L_0x0215:
        r4 = r0.toLowerCase();	 Catch:{ RuntimeException -> 0x00a8 }
        r5 = "apple";
        r4 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r4 == r7) goto L_0x0228;
    L_0x0221:
        r0 = 438102189; // 0x1a1ce8ad float:3.2447998E-23 double:2.16451241E-315;
        r11.bu = r0;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x0080;
    L_0x0228:
        r0 = r0.toLowerCase();	 Catch:{ RuntimeException -> 0x00a8 }
        r4 = "oracle";
        r0 = r0.indexOf(r4);	 Catch:{ RuntimeException -> 0x00a8 }
        if (r0 == r7) goto L_0x023b;
    L_0x0234:
        r0 = 730170315; // 0x2b8583cb float:9.486798E-13 double:3.607520683E-315;
        r11.bu = r0;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x0080;
    L_0x023b:
        r0 = 584136252; // 0x22d1363c float:5.6706986E-18 double:2.886016546E-315;
        r11.bu = r0;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x0080;
    L_0x0242:
        r2 = move-exception;
    L_0x0243:
        r2 = -880357127; // 0xffffffffcb86d0f9 float:-1.7670642E7 double:NaN;
        r0 = r0 * r2;
        r11.bd = r0;	 Catch:{ RuntimeException -> 0x00a8 }
        r0 = 46;
        r2 = 2;
        r0 = r3.indexOf(r0, r2);	 Catch:{ RuntimeException -> 0x00a8 }
        r0 = r0 + 1;
        r2 = r0;
        r0 = r1;
    L_0x0254:
        r4 = r3.length();	 Catch:{ Exception -> 0x026a }
        if (r2 >= r4) goto L_0x026b;
    L_0x025a:
        r4 = r3.charAt(r2);	 Catch:{ Exception -> 0x026a }
        if (r4 < r8) goto L_0x026b;
    L_0x0260:
        if (r4 > r9) goto L_0x026b;
    L_0x0262:
        r4 = r4 + -48;
        r0 = r0 * 10;
        r0 = r0 + r4;
        r2 = r2 + 1;
        goto L_0x0254;
    L_0x026a:
        r2 = move-exception;
    L_0x026b:
        r2 = -1200714327; // 0xffffffffb86e8da9 float:-5.6875553E-5 double:NaN;
        r0 = r0 * r2;
        r11.by = r0;	 Catch:{ RuntimeException -> 0x00a8 }
        r0 = 95;
        r2 = 4;
        r0 = r3.indexOf(r0, r2);	 Catch:{ RuntimeException -> 0x00a8 }
        r0 = r0 + 1;
        r10 = r1;
        r1 = r0;
        r0 = r10;
    L_0x027d:
        r2 = r3.length();	 Catch:{ Exception -> 0x0293 }
        if (r1 >= r2) goto L_0x0294;
    L_0x0283:
        r2 = r3.charAt(r1);	 Catch:{ Exception -> 0x0293 }
        if (r2 < r8) goto L_0x0294;
    L_0x0289:
        if (r2 > r9) goto L_0x0294;
    L_0x028b:
        r2 = r2 + -48;
        r0 = r0 * 10;
        r0 = r0 + r2;
        r1 = r1 + 1;
        goto L_0x027d;
    L_0x0293:
        r1 = move-exception;
    L_0x0294:
        r1 = 1916518993; // 0x723bc251 float:3.718951E30 double:9.46886194E-315;
        r0 = r0 * r1;
        r11.bx = r0;	 Catch:{ RuntimeException -> 0x00a8 }
        r0 = 0;
        r11.bi = r0;	 Catch:{ RuntimeException -> 0x00a8 }
        r0 = java.lang.Runtime.getRuntime();	 Catch:{ RuntimeException -> 0x00a8 }
        r0 = r0.maxMemory();	 Catch:{ RuntimeException -> 0x00a8 }
        r2 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r0 = r0 / r2;
        r0 = (int) r0;	 Catch:{ RuntimeException -> 0x00a8 }
        r0 = r0 + 1;
        r1 = -1748387111; // 0xffffffff97c9bad9 float:-1.3036488E-24 double:NaN;
        r0 = r0 * r1;
        r11.bs = r0;	 Catch:{ RuntimeException -> 0x00a8 }
        r0 = r11.bd;	 Catch:{ RuntimeException -> 0x00a8 }
        r1 = -210439863; // 0xfffffffff374f149 float:-1.9406346E31 double:NaN;
        r0 = r0 * r1;
        r1 = 3;
        if (r0 <= r1) goto L_0x0303;
    L_0x02bb:
        r0 = java.lang.Runtime.getRuntime();	 Catch:{ RuntimeException -> 0x00a8 }
        r0 = r0.availableProcessors();	 Catch:{ RuntimeException -> 0x00a8 }
        r1 = 290966299; // 0x1157cb1b float:1.7023096E-28 double:1.437564524E-315;
        r0 = r0 * r1;
        r11.bz = r0;	 Catch:{ RuntimeException -> 0x00a8 }
    L_0x02c9:
        r0 = 0;
        r11.bj = r0;	 Catch:{ RuntimeException -> 0x00a8 }
    L_0x02cc:
        r0 = r11.bv;	 Catch:{ RuntimeException -> 0x00a8 }
        if (r0 != 0) goto L_0x02d4;
    L_0x02d0:
        r0 = "";
        r11.bv = r0;	 Catch:{ RuntimeException -> 0x00a8 }
    L_0x02d4:
        r0 = r11.be;	 Catch:{ RuntimeException -> 0x00a8 }
        if (r0 != 0) goto L_0x02dc;
    L_0x02d8:
        r0 = "";
        r11.be = r0;	 Catch:{ RuntimeException -> 0x00a8 }
    L_0x02dc:
        r0 = r11.bw;	 Catch:{ RuntimeException -> 0x00a8 }
        if (r0 != 0) goto L_0x02e4;
    L_0x02e0:
        r0 = "";
        r11.bw = r0;	 Catch:{ RuntimeException -> 0x00a8 }
    L_0x02e4:
        r0 = r11.bn;	 Catch:{ RuntimeException -> 0x00a8 }
        if (r0 != 0) goto L_0x02ec;
    L_0x02e8:
        r0 = "";
        r11.bn = r0;	 Catch:{ RuntimeException -> 0x00a8 }
    L_0x02ec:
        r0 = r11.bl;	 Catch:{ RuntimeException -> 0x00a8 }
        if (r0 != 0) goto L_0x02f4;
    L_0x02f0:
        r0 = "";
        r11.bl = r0;	 Catch:{ RuntimeException -> 0x00a8 }
    L_0x02f4:
        r0 = r11.cb;	 Catch:{ RuntimeException -> 0x00a8 }
        if (r0 != 0) goto L_0x02fc;
    L_0x02f8:
        r0 = "";
        r11.cb = r0;	 Catch:{ RuntimeException -> 0x00a8 }
    L_0x02fc:
        r0 = 1673110939; // 0x63b9a59b float:6.8491616E21 double:8.266266366E-315;
        r11.aj(r0);	 Catch:{ RuntimeException -> 0x00a8 }
        return;
    L_0x0303:
        r0 = 0;
        r11.bz = r0;	 Catch:{ RuntimeException -> 0x00a8 }
        goto L_0x02c9;
    L_0x0307:
        r6 = move-exception;
        goto L_0x0046;
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.<init>(boolean):void");
    }

    static final void ac(hn hnVar, int i, int i2) {
        try {
            int i3 = hnVar.ac * 489625177;
            fu.am = 0;
            ew.an(hnVar, (byte) 2);
            for (int i4 = 0; i4 < fu.am * -1373931323; i4++) {
                int au;
                int ay;
                int au2;
                int i5;
                int i6;
                int i7 = fu.ae[i4];
                ff ffVar = client.hx[i7];
                int au3 = hnVar.au(-310118664);
                if ((au3 & 16) != 0) {
                    au = au3 + (hnVar.au(-310118664) << 8);
                } else {
                    au = au3;
                }
                byte b = (byte) -1;
                if ((au & cj.ak) != 0) {
                    ay = hnVar.ay((byte) 1);
                    it itVar = (it) bp.aj(new it[]{it.aq, it.ac, it.an, it.ao, it.aj, it.aa}, hnVar.au(-310118664), 205248421);
                    boolean z = hnVar.bn(-1380904992) == 1;
                    au2 = hnVar.au(-310118664);
                    i5 = 489625177 * hnVar.ac;
                    if (!(ffVar.aj == null || ffVar.ac == null)) {
                        Object obj = null;
                        if (itVar.ah && dx.na.ak(ffVar.aj, 1228934358)) {
                            obj = 1;
                        }
                        if (obj == null && 387961459 * client.ha == 0 && !ffVar.ag) {
                            boolean z2;
                            fu.as.ac = 0;
                            hnVar.br(fu.as.aj, 0, au2, 612003314);
                            fu.as.ac = 0;
                            String ap = kh.ap(gi.ap(hf.aj(fu.as, 32767, (byte) 6), 1860939824));
                            ffVar.ba = ap.trim();
                            ffVar.bn = (ay >> 8) * -206728689;
                            ffVar.bg = 1920209413 * (ay & 255);
                            ffVar.bw = -1180377698;
                            ffVar.bv = z;
                            if (ffVar == cx.hb || !itVar.ah || client.lm == "" || ap.toLowerCase().indexOf(client.lm) != -1) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            ffVar.be = z2;
                            if (itVar.at) {
                                if (z) {
                                    i6 = 91;
                                } else {
                                    i6 = 1;
                                }
                            } else if (z) {
                                i6 = 90;
                            } else {
                                i6 = 2;
                            }
                            if (-1 != itVar.ap * -682453825) {
                                cw.ac(i6, hc.aj(itVar.ap * -682453825, (byte) -8) + ffVar.aj.aj(-1300743904), ap, -1858019930);
                            } else {
                                cw.ac(i6, ffVar.aj.aj(-2010131883), ap, -1976157788);
                            }
                        }
                    }
                    hnVar.ac = -984165911 * (i5 + au2);
                }
                if ((au & 4) != 0) {
                    ffVar.cr = hnVar.cf((byte) 50) * 291359525;
                    if (-2019433429 * ffVar.dr == 0) {
                        ffVar.de = -615732351 * ffVar.cr;
                        ffVar.cr = -291359525;
                    }
                }
                if ((au & cj.at) != 0) {
                    ffVar.cv = hnVar.cf((byte) 26) * 566382975;
                    au3 = hnVar.ci(986615257);
                    ffVar.cx = (au3 >> 16) * 1408073397;
                    ffVar.cs = ((au3 & 65535) + (client.af * 901275591)) * 1017703515;
                    ffVar.cu = 0;
                    ffVar.cg = 0;
                    if (ffVar.cs * 1048208339 > 901275591 * client.af) {
                        ffVar.cu = -1045839501;
                    }
                    if (250310271 * ffVar.cv == 65535) {
                        ffVar.cv = -566382975;
                    }
                }
                if ((au & bg.aw) != 0) {
                    b = hnVar.bf(-833379421);
                }
                if ((au & bq.ah) != 0) {
                    ffVar.cd = hnVar.bk(177808245) * 839298761;
                    ffVar.cn = hnVar.bk(-1048557518) * -1585280365;
                    ffVar.cw = hnVar.bl(1820564273) * -1495876001;
                    ffVar.cz = hnVar.av(-1348421677) * -1409962355;
                    ffVar.cj = (hnVar.cf((byte) 25) + (client.af * 901275591)) * 2027651007;
                    ffVar.dk = (hnVar.co((byte) -31) + (901275591 * client.af)) * -270198209;
                    ffVar.dh = hnVar.co((byte) -94) * 2032937747;
                    if (ffVar.bm) {
                        ffVar.cd += -376905465 * ffVar.bh;
                        ffVar.cn += -527288079 * ffVar.bt;
                        ffVar.cw += ffVar.bh * 1640314449;
                        ffVar.cz += 1770239855 * ffVar.bt;
                        ffVar.dr = 0;
                    } else {
                        ffVar.cd += 839298761 * ffVar.dd[0];
                        ffVar.cn += ffVar.ds[0] * -1585280365;
                        ffVar.cw += ffVar.dd[0] * -1495876001;
                        ffVar.cz += ffVar.ds[0] * -1409962355;
                        ffVar.dr = -1817986429;
                    }
                    ffVar.dw = 0;
                }
                if ((au & bq.ai) != 0) {
                    fu.aq[i7] = hnVar.bl(1883393969);
                }
                if ((au & 1) != 0) {
                    ffVar.cf = hnVar.co((byte) -1) * 2130005305;
                    if (65535 == -1329884919 * ffVar.cf) {
                        ffVar.cf = -2130005305;
                    }
                }
                if ((au & 8) != 0) {
                    ffVar.ba = hnVar.bh(-1274125854);
                    if (ffVar.ba.charAt(0) == '~') {
                        ffVar.ba = ffVar.ba.substring(1);
                        cw.ac(2, ffVar.aj.aj(-935506622), ffVar.ba, -2093983640);
                    } else if (ffVar == cx.hb) {
                        cw.ac(2, ffVar.aj.aj(-795932461), ffVar.ba, -2043412615);
                    }
                    ffVar.bv = false;
                    ffVar.bn = 0;
                    ffVar.bg = 0;
                    ffVar.bw = -1180377698;
                }
                if ((au & 32) != 0) {
                    au3 = hnVar.co((byte) -120);
                    if (65535 == au3) {
                        au3 = -1;
                    }
                    lp.bk(ffVar, au3, hnVar.bn(-1380904992), 1398857254);
                }
                if ((au & 1024) != 0) {
                    for (au3 = 0; au3 < 3; au3++) {
                        ffVar.ak[au3] = hnVar.bh(-197731766);
                    }
                }
                if ((au & 64) != 0) {
                    int i8;
                    int i9;
                    int bc = hnVar.bc(-1432718291);
                    if (bc > 0) {
                        for (i8 = 0; i8 < bc; i8++) {
                            i9 = -1;
                            i6 = -1;
                            ay = -1;
                            au3 = hnVar.bu(730795377);
                            if (32767 == au3) {
                                au3 = hnVar.bu(1711051390);
                                i6 = hnVar.bu(1021908784);
                                i9 = hnVar.bu(823992177);
                                ay = hnVar.bu(499980310);
                            } else if (32766 != au3) {
                                i6 = hnVar.bu(1920720069);
                            } else {
                                au3 = -1;
                            }
                            ffVar.be(au3, i6, i9, ay, client.af * 901275591, hnVar.bu(990307073), 1321143384);
                        }
                    }
                    bc = hnVar.bn(-1380904992);
                    if (bc > 0) {
                        for (i8 = 0; i8 < bc; i8++) {
                            au3 = hnVar.bu(2117569758);
                            i9 = hnVar.bu(323987314);
                            if (32767 != i9) {
                                ay = hnVar.bu(869336406);
                                au2 = hnVar.bn(-1380904992);
                                if (i9 > 0) {
                                    i5 = hnVar.bg(-2143491010);
                                } else {
                                    i5 = au2;
                                }
                                ffVar.bw(au3, 901275591 * client.af, i9, ay, au2, i5, -1783625016);
                            } else {
                                ffVar.bn(au3, 1824988930);
                            }
                        }
                    }
                }
                if ((au & 2) != 0) {
                    au3 = hnVar.bg(-2143413065);
                    byte[] bArr = new byte[au3];
                    he heVar = new he(bArr);
                    hnVar.cv(bArr, 0, au3, -62249646);
                    fu.ao[i7] = heVar;
                    ffVar.aj(heVar, (byte) 73);
                }
                if (ffVar.bm) {
                    if (b == Byte.MAX_VALUE) {
                        ffVar.as(ffVar.bh * -1086002865, 150826219 * ffVar.bt, (byte) 44);
                    } else {
                        byte b2;
                        if (b != (byte) -1) {
                            b2 = b;
                        } else {
                            b2 = fu.aq[i7];
                        }
                        ffVar.ae(-1086002865 * ffVar.bh, 150826219 * ffVar.bt, b2, -783042077);
                    }
                }
            }
            if (i != (489625177 * hnVar.ac) - i3) {
                throw new RuntimeException(((hnVar.ac * 489625177) - i3) + " " + i);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ag.ac(" + ')');
        }
    }

    void aj(int i) {
        try {
            if (this.bv.length() > 40) {
                this.bv = this.bv.substring(0, 40);
            }
            if (this.be.length() > 40) {
                this.be = this.be.substring(0, 40);
            }
            if (this.bw.length() > 10) {
                this.bw = this.bw.substring(0, 10);
            }
            if (this.bn.length() > 10) {
                this.bn = this.bn.substring(0, 10);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ag.aj(" + ')');
        }
    }

    void ao() {
        if (this.bv.length() > 40) {
            this.bv = this.bv.substring(0, 40);
        }
        if (this.be.length() > 40) {
            this.be = this.be.substring(0, 40);
        }
        if (this.bw.length() > 10) {
            this.bw = this.bw.substring(0, 10);
        }
        if (this.bn.length() > 10) {
            this.bn = this.bn.substring(0, 10);
        }
    }

    void aq() {
        if (this.bv.length() > 40) {
            this.bv = this.bv.substring(0, 40);
        }
        if (this.be.length() > 40) {
            this.be = this.be.substring(0, 40);
        }
        if (this.bw.length() > 10) {
            this.bw = this.bw.substring(0, 10);
        }
        if (this.bn.length() > 10) {
            this.bn = this.bn.substring(0, 10);
        }
    }

    public void aa(he heVar) {
        int i;
        int i2 = 1;
        int i3 = 0;
        heVar.an(6, (byte) -107);
        heVar.an(this.aa * -455962189, (byte) -29);
        if (this.ak) {
            i = 1;
        } else {
            i = 0;
        }
        heVar.an(i, (byte) -125);
        heVar.an(this.bp * -2108815431, (byte) -52);
        heVar.an(this.bu * 812003695, (byte) -120);
        heVar.an(-210439863 * this.bd, (byte) -98);
        heVar.an(1125934745 * this.by, (byte) -32);
        heVar.an(354526716 * this.bx, Byte.MIN_VALUE);
        if (!this.bi) {
            i2 = 0;
        }
        heVar.an(i2, (byte) -46);
        heVar.aq(-1618530145 * this.bs, 1881946268);
        heVar.an(this.bz * 1698093651, (byte) -10);
        heVar.ao(this.bj * 1202555612, 529129587);
        heVar.aq(this.ba * -1894139266, 801774769);
        heVar.am(this.bv, (byte) 8);
        heVar.am(this.be, (byte) 8);
        heVar.am(this.bw, (byte) 8);
        heVar.am(this.bn, (byte) 8);
        heVar.an(1804739395 * this.bc, (byte) -65);
        heVar.aq(this.bg * 392128439, 1682197400);
        heVar.am(this.bl, (byte) 8);
        heVar.am(this.cb, (byte) 8);
        heVar.an(-1287728021 * this.bk, (byte) -97);
        heVar.an(-1437130049 * this.bf, (byte) -95);
        while (i3 < this.cy.length) {
            heVar.aa(this.cy[i3], 1883713539);
            i3++;
        }
        heVar.aa(this.cl * 1953956470, -5839904);
    }

    public void ac(he heVar, int i) {
        int i2 = 1;
        int i3 = 0;
        try {
            int i4;
            heVar.an(6, (byte) -14);
            heVar.an(this.aa * -455962189, (byte) -47);
            if (this.ak) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            heVar.an(i4, (byte) -29);
            heVar.an(this.bp * 208644553, (byte) -77);
            heVar.an(this.bu * 812003695, (byte) -55);
            heVar.an(-210439863 * this.bd, (byte) -81);
            heVar.an(1125934745 * this.by, (byte) -40);
            heVar.an(-1457207631 * this.bx, (byte) -76);
            if (!this.bi) {
                i2 = 0;
            }
            heVar.an(i2, (byte) -40);
            heVar.aq(94971241 * this.bs, 1203888362);
            heVar.an(this.bz * -587360493, (byte) -123);
            heVar.ao(this.bj * -1887428045, 622402096);
            heVar.aq(this.ba * -1209631693, 1775794316);
            heVar.am(this.bv, (byte) 8);
            heVar.am(this.be, (byte) 8);
            heVar.am(this.bw, (byte) 8);
            heVar.am(this.bn, (byte) 8);
            heVar.an(-161037585 * this.bc, (byte) -50);
            heVar.aq(this.bg * 392128439, 1734718617);
            heVar.am(this.bl, (byte) 8);
            heVar.am(this.cb, (byte) 8);
            heVar.an(-2065858259 * this.bk, (byte) -25);
            heVar.an(-1804424325 * this.bf, (byte) -50);
            while (i3 < this.cy.length) {
                heVar.aa(this.cy[i3], 753015577);
                i3++;
            }
            heVar.aa(this.cl * -174561865, -1328785795);
        } catch (Throwable e) {
            throw ei.ac(e, "ag.ac(" + ')');
        }
    }

    public int ak() {
        return (((((38 + (this.bv.length() + 2)) + (this.be.length() + 2)) + (this.bw.length() + 2)) + (this.bn.length() + 2)) + (this.bl.length() + 2)) + az.aw(this.cb, (byte) 11);
    }

    public int an(byte b) {
        try {
            return (((((38 + (this.bv.length() + 2)) + (this.be.length() + 2)) + (this.bw.length() + 2)) + (this.bn.length() + 2)) + (this.bl.length() + 2)) + az.aw(this.cb, (byte) 91);
        } catch (Throwable e) {
            throw ei.ac(e, "ag.an(" + ')');
        }
    }

    public int ap() {
        return (((((38 + (this.bv.length() + 2)) + (this.be.length() + 2)) + (this.bw.length() + 2)) + (this.bn.length() + 2)) + (this.bl.length() + 2)) + az.aw(this.cb, (byte) 119);
    }

    static void dg(int i, String str, int i2) {
        Object obj = 1;
        try {
            int i3 = -2089377233 * fu.aa;
            int[] iArr = fu.ak;
            ez ezVar = new ez(str, ce.ap);
            int i4 = 0;
            while (i4 < i3) {
                ff ffVar = client.hx[iArr[i4]];
                if (ffVar == null || ffVar == cx.hb || ffVar.aj == null || !ffVar.aj.equals(ezVar)) {
                    i4++;
                } else {
                    mg ac;
                    if (1 == i) {
                        ac = hd.ac(mr.dx, client.dp.ao, (byte) -61);
                        ac.an.cy(iArr[i4], (byte) -6);
                        ac.an.be(0, (byte) 113);
                        client.dp.an(ac, 557134592);
                    } else if (i == 4) {
                        ac = hd.ac(mr.ak, client.dp.ao, (byte) 56);
                        ac.an.bw(0, (byte) -84);
                        ac.an.aq(iArr[i4], 1916124951);
                        client.dp.an(ac, 168232781);
                    } else if (6 == i) {
                        ac = hd.ac(mr.cm, client.dp.ao, (byte) 55);
                        ac.an.cb(iArr[i4], 1518848127);
                        ac.an.bw(0, (byte) -96);
                        client.dp.an(ac, 2060316131);
                    } else if (i == 7) {
                        ac = hd.ac(mr.bf, client.dp.ao, (byte) 53);
                        ac.an.an(0, (byte) -78);
                        ac.an.cb(iArr[i4], 2141892773);
                        client.dp.an(ac, 1793830550);
                    }
                    if (obj == null) {
                        cw.ac(4, "", ix.fs + str, -1931624804);
                    }
                }
            }
            obj = null;
            if (obj == null) {
                cw.ac(4, "", ix.fs + str, -1931624804);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ag.dg(" + ')');
        }
    }
}
