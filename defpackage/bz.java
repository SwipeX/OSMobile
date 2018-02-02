package defpackage;

public final class bz {
    static final int az = 65536;
    static int fy;
    ci aa;
    int ac;
    int aj;
    int ak;
    int an;
    ci ao;
    int ap;
    ci aq;

    bz() {
        try {
        } catch (Throwable e) {
            throw ei.ac(e, "bz.<init>(" + ')');
        }
    }

    public static as ac(int i, int i2) {
        try {
            as asVar = (as) as.an.aj((long) i);
            if (asVar == null) {
                byte[] an = as.aj.an(33, i, -1647200395);
                asVar = new as();
                if (an != null) {
                    asVar.an(new he(an), 1918311845);
                }
                as.an.an(asVar, (long) i);
            }
            return asVar;
        } catch (Throwable e) {
            throw ei.ac(e, "bz.ac(" + ')');
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int an(int r20, defpackage.fs r21, boolean r22, byte r23) {
        /*
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = r20;
        if (r0 >= r4) goto L_0x0834;
    L_0x0006:
        r4 = 100;
        r0 = r20;
        if (r0 != r4) goto L_0x039f;
    L_0x000c:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -1205774901; // 0xffffffffb82155cb float:-3.8465292E-5 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = r7 * r8;
        r7 = r7 + 2;
        r6 = r6[r7];	 Catch:{ RuntimeException -> 0x003e }
        if (r5 != 0) goto L_0x0222;
    L_0x0038:
        r4 = new java.lang.RuntimeException;	 Catch:{ RuntimeException -> 0x003e }
        r4.<init>();	 Catch:{ RuntimeException -> 0x003e }
        throw r4;	 Catch:{ RuntimeException -> 0x003e }
    L_0x003e:
        r4 = move-exception;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = "bz.an(";
        r5 = r5.append(r6);
        r6 = 41;
        r5 = r5.append(r6);
        r5 = r5.toString();
        r4 = defpackage.ei.ac(r4, r5);
        throw r4;
    L_0x0059:
        r4 = r15 - r16;
        if (r4 == 0) goto L_0x2259;
    L_0x005d:
        if (r4 <= 0) goto L_0x2316;
    L_0x005f:
        r4 = 1;
    L_0x0060:
        r10[r11] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
    L_0x0063:
        return r4;
    L_0x0064:
        r4 = 4119; // 0x1017 float:5.772E-42 double:2.035E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x16ba;
    L_0x006a:
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 - r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r6 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r7 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r6.length();	 Catch:{ RuntimeException -> 0x003e }
        r7.<init>(r4);	 Catch:{ RuntimeException -> 0x003e }
        r5 = 0;
        r4 = 0;
        r19 = r4;
        r4 = r5;
        r5 = r19;
    L_0x008a:
        r8 = r6.length();	 Catch:{ RuntimeException -> 0x003e }
        if (r5 >= r8) goto L_0x2471;
    L_0x0090:
        r8 = r6.charAt(r5);	 Catch:{ RuntimeException -> 0x003e }
        r9 = 60;
        if (r8 != r9) goto L_0x216c;
    L_0x0098:
        r4 = 1;
    L_0x0099:
        r5 = r5 + 1;
        goto L_0x008a;
    L_0x009c:
        r4 = 0;
    L_0x009d:
        if (r4 == 0) goto L_0x25b6;
    L_0x009f:
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = r4.ai;	 Catch:{ RuntimeException -> 0x003e }
        r8 = 1057964181; // 0x3f0f4095 float:0.5595792 double:5.227037564E-315;
        r7 = r7 * r8;
        r5[r6] = r7;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = -687262573; // 0xffffffffd7093493 float:-1.50858898E14 double:NaN;
        r8 = r4.aw;	 Catch:{ RuntimeException -> 0x003e }
        r7 = r7 * r8;
        r5[r6] = r7;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r6 = r6 + r7;
        defpackage.di.ah = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = r4.as;	 Catch:{ RuntimeException -> 0x003e }
        r5[r6] = r7;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = r4.al;	 Catch:{ RuntimeException -> 0x003e }
        r8 = 700245205; // 0x29bce4d5 float:8.388573E-14 double:3.459670995E-315;
        r7 = r7 * r8;
        r5[r6] = r7;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = 794816761; // 0x2f5ff0f9 float:2.0367343E-10 double:3.926916563E-315;
        r8 = r4.am;	 Catch:{ RuntimeException -> 0x003e }
        r7 = r7 * r8;
        r5[r6] = r7;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r6 = r6 + r7;
        defpackage.di.ah = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r4 = r4.ae;	 Catch:{ RuntimeException -> 0x003e }
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
    L_0x0127:
        r4 = 1;
        goto L_0x0063;
    L_0x012a:
        r5 = -1;
        if (r5 != r7) goto L_0x0382;
    L_0x012d:
        r5 = 0;
    L_0x012e:
        r8[r9] = r5;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x0133:
        r4 = 4007; // 0xfa7 float:5.615E-42 double:1.9797E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x0fa2;
    L_0x0139:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r7 = r7 + r8;
        defpackage.dy.ap = r7;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = r7 * r8;
        r7 = r7 + -1;
        r5 = r5 * r4;
        r5 = r5 / 100;
        r4 = r4 + r5;
        r6[r7] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x0170:
        r8 = defpackage.client.ai;	 Catch:{ RuntimeException -> 0x003e }
        r9 = 1201256695; // 0x4799b8f7 float:78705.93 double:5.93499665E-315;
        r8 = r8 * r9;
        if (r8 == 0) goto L_0x2993;
    L_0x0178:
        r8 = defpackage.ix.gn;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r6.startsWith(r8);	 Catch:{ RuntimeException -> 0x003e }
        if (r8 == 0) goto L_0x262f;
    L_0x0180:
        r4 = 0;
        r6 = defpackage.ix.gn;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r4;
    L_0x018c:
        r8 = r5.toLowerCase();	 Catch:{ RuntimeException -> 0x003e }
        r4 = 0;
        r9 = defpackage.ix.hz;	 Catch:{ RuntimeException -> 0x003e }
        r9 = r8.startsWith(r9);	 Catch:{ RuntimeException -> 0x003e }
        if (r9 == 0) goto L_0x26e4;
    L_0x0199:
        r4 = 1;
        r8 = defpackage.ix.hz;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r8.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r8);	 Catch:{ RuntimeException -> 0x003e }
    L_0x01a4:
        r8 = defpackage.mr.ax;	 Catch:{ RuntimeException -> 0x003e }
        r9 = defpackage.client.dp;	 Catch:{ RuntimeException -> 0x003e }
        r9 = r9.ao;	 Catch:{ RuntimeException -> 0x003e }
        r10 = -70;
        r11 = defpackage.hd.ac(r8, r9, r10);	 Catch:{ RuntimeException -> 0x003e }
        r8 = r11.an;	 Catch:{ RuntimeException -> 0x003e }
        r9 = 0;
        r10 = -36;
        r8.an(r9, r10);	 Catch:{ RuntimeException -> 0x003e }
        r8 = r11.an;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r8.ac;	 Catch:{ RuntimeException -> 0x003e }
        r9 = 489625177; // 0x1d2f1659 float:2.317261E-21 double:2.419069793E-315;
        r12 = r8 * r9;
        r8 = r11.an;	 Catch:{ RuntimeException -> 0x003e }
        r9 = -45;
        r8.an(r7, r9);	 Catch:{ RuntimeException -> 0x003e }
        r7 = r11.an;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -48;
        r7.an(r6, r8);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r11.an;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -111; // 0xffffffffffffff91 float:NaN double:NaN;
        r6.an(r4, r7);	 Catch:{ RuntimeException -> 0x003e }
        r13 = r11.an;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r13.ac;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 489625177; // 0x1d2f1659 float:2.317261E-21 double:2.419069793E-315;
        r4 = r4 * r6;
        r4 = -27;
        r5 = defpackage.dv.ac(r5, r4);	 Catch:{ RuntimeException -> 0x003e }
        r4 = r5.length;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -793053588; // 0xffffffffd0baf66c float:-2.50936934E10 double:NaN;
        r13.ax(r4, r6);	 Catch:{ RuntimeException -> 0x003e }
        r14 = r13.ac;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.kv.aj;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 0;
        r7 = r5.length;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r13.aj;	 Catch:{ RuntimeException -> 0x003e }
        r9 = 489625177; // 0x1d2f1659 float:2.317261E-21 double:2.419069793E-315;
        r10 = r13.ac;	 Catch:{ RuntimeException -> 0x003e }
        r9 = r9 * r10;
        r10 = 120357231; // 0x72c816f float:1.2977879E-34 double:5.9464373E-316;
        r4 = r4.aj(r5, r6, r7, r8, r9, r10);	 Catch:{ RuntimeException -> 0x003e }
        r5 = -984165911; // 0xffffffffc556d1e9 float:-3437.1194 double:NaN;
        r4 = r4 * r5;
        r4 = r4 + r14;
        r13.ac = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r11.an;	 Catch:{ RuntimeException -> 0x003e }
        r5 = r11.an;	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.ac;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 489625177; // 0x1d2f1659 float:2.317261E-21 double:2.419069793E-315;
        r5 = r5 * r6;
        r5 = r5 - r12;
        r6 = 12;
        r4.az(r5, r6);	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.client.dp;	 Catch:{ RuntimeException -> 0x003e }
        r5 = 1428686316; // 0x552805ec float:1.15464617E13 double:7.058648274E-315;
        r4.an(r11, r5);	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x0222:
        r7 = 1531704268; // 0x5b4bf3cc float:5.7407478E16 double:7.567624584E-315;
        r7 = defpackage.ac.aj(r4, r7);	 Catch:{ RuntimeException -> 0x003e }
        r4 = r7.ft;	 Catch:{ RuntimeException -> 0x003e }
        if (r4 != 0) goto L_0x0233;
    L_0x022d:
        r4 = r6 + 1;
        r4 = new defpackage.ab[r4];	 Catch:{ RuntimeException -> 0x003e }
        r7.ft = r4;	 Catch:{ RuntimeException -> 0x003e }
    L_0x0233:
        r4 = r7.ft;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4.length;	 Catch:{ RuntimeException -> 0x003e }
        if (r4 > r6) goto L_0x0300;
    L_0x0238:
        r4 = r6 + 1;
        r8 = new defpackage.ab[r4];	 Catch:{ RuntimeException -> 0x003e }
        r4 = 0;
    L_0x023d:
        r9 = r7.ft;	 Catch:{ RuntimeException -> 0x003e }
        r9 = r9.length;	 Catch:{ RuntimeException -> 0x003e }
        if (r4 >= r9) goto L_0x02fe;
    L_0x0242:
        r9 = r7.ft;	 Catch:{ RuntimeException -> 0x003e }
        r9 = r9[r4];	 Catch:{ RuntimeException -> 0x003e }
        r8[r4] = r9;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4 + 1;
        goto L_0x023d;
    L_0x024b:
        r7 = r8 + 1;
        r6 = r12.charAt(r8);	 Catch:{ RuntimeException -> 0x003e }
        r8 = r7;
        r7 = r6;
    L_0x0253:
        if (r4 == 0) goto L_0x2163;
    L_0x0255:
        r6 = 564168411; // 0x21a086db float:1.0877718E-18 double:2.787362303E-315;
        r9 = defpackage.bq.ac(r7, r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1823920974; // 0x6cb6d34e float:1.7681789E27 double:9.01136694E-315;
        r6 = defpackage.bq.ac(r4, r6);	 Catch:{ RuntimeException -> 0x003e }
        r17 = 57;
        r0 = r17;
        r7 = defpackage.fc.aj(r7, r14, r0);	 Catch:{ RuntimeException -> 0x003e }
        r17 = -62;
        r0 = r17;
        r4 = defpackage.fc.aj(r4, r14, r0);	 Catch:{ RuntimeException -> 0x003e }
        if (r4 == r7) goto L_0x2173;
    L_0x0275:
        r17 = java.lang.Character.toUpperCase(r7);	 Catch:{ RuntimeException -> 0x003e }
        r18 = java.lang.Character.toUpperCase(r4);	 Catch:{ RuntimeException -> 0x003e }
        r0 = r17;
        r1 = r18;
        if (r0 == r1) goto L_0x2173;
    L_0x0283:
        r7 = java.lang.Character.toLowerCase(r7);	 Catch:{ RuntimeException -> 0x003e }
        r4 = java.lang.Character.toLowerCase(r4);	 Catch:{ RuntimeException -> 0x003e }
        if (r4 == r7) goto L_0x2173;
    L_0x028d:
        r5 = 94;
        r5 = defpackage.fe.an(r7, r14, r5);	 Catch:{ RuntimeException -> 0x003e }
        r6 = 24;
        r4 = defpackage.fe.an(r4, r14, r6);	 Catch:{ RuntimeException -> 0x003e }
        r4 = r5 - r4;
        goto L_0x005d;
    L_0x029d:
        r4 = 4018; // 0xfb2 float:5.63E-42 double:1.985E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x1bc8;
    L_0x02a3:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -1205774901; // 0xffffffffb82155cb float:-3.8465292E-5 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r4 = (long) r4;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = r7 * r8;
        r7 = r7 + 1;
        r6 = r6[r7];	 Catch:{ RuntimeException -> 0x003e }
        r6 = (long) r6;	 Catch:{ RuntimeException -> 0x003e }
        r8 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r9 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r10 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r9 = r9 * r10;
        r9 = r9 + 2;
        r8 = r8[r9];	 Catch:{ RuntimeException -> 0x003e }
        r8 = (long) r8;	 Catch:{ RuntimeException -> 0x003e }
        r10 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r11 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r12 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r11 = r11 + r12;
        defpackage.dy.ap = r11;	 Catch:{ RuntimeException -> 0x003e }
        r12 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r11 = r11 * r12;
        r11 = r11 + -1;
        r4 = r4 * r8;
        r4 = r4 / r6;
        r4 = (int) r4;	 Catch:{ RuntimeException -> 0x003e }
        r10[r11] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x02e8:
        r8 = defpackage.ix.gg;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r6.startsWith(r8);	 Catch:{ RuntimeException -> 0x003e }
        if (r8 == 0) goto L_0x0778;
    L_0x02f0:
        r4 = 3;
        r6 = defpackage.ix.gg;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r4;
        goto L_0x018c;
    L_0x02fe:
        r7.ft = r8;	 Catch:{ RuntimeException -> 0x003e }
    L_0x0300:
        if (r6 <= 0) goto L_0x0325;
    L_0x0302:
        r4 = r7.ft;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r6 + -1;
        r4 = r4[r8];	 Catch:{ RuntimeException -> 0x003e }
        if (r4 != 0) goto L_0x0325;
    L_0x030a:
        r4 = new java.lang.RuntimeException;	 Catch:{ RuntimeException -> 0x003e }
        r5 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x003e }
        r5.<init>();	 Catch:{ RuntimeException -> 0x003e }
        r7 = "";
        r5 = r5.append(r7);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 + -1;
        r5 = r5.append(r6);	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.toString();	 Catch:{ RuntimeException -> 0x003e }
        r4.<init>(r5);	 Catch:{ RuntimeException -> 0x003e }
        throw r4;	 Catch:{ RuntimeException -> 0x003e }
    L_0x0325:
        r4 = new ab;	 Catch:{ RuntimeException -> 0x003e }
        r4.<init>();	 Catch:{ RuntimeException -> 0x003e }
        r8 = 1384788655; // 0x528a32af float:2.96777908E11 double:6.84176501E-315;
        r5 = r5 * r8;
        r4.au = r5;	 Catch:{ RuntimeException -> 0x003e }
        r5 = r7.ax;	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5 * 1;
        r4.ax = r5;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -1211110355; // 0xffffffffb7cfec2d float:-2.47863E-5 double:NaN;
        r5 = r5 * r8;
        r4.bi = r5;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -63936127; // 0xfffffffffc306981 float:-3.6639365E36 double:NaN;
        r5 = r5 * r6;
        r4.af = r5;	 Catch:{ RuntimeException -> 0x003e }
        r5 = 1;
        r4.az = r5;	 Catch:{ RuntimeException -> 0x003e }
        r5 = r7.ft;	 Catch:{ RuntimeException -> 0x003e }
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        if (r22 == 0) goto L_0x039c;
    L_0x034b:
        defpackage.client.ae = r4;	 Catch:{ RuntimeException -> 0x003e }
    L_0x034d:
        r4 = -75;
        defpackage.cf.ew(r7, r4);	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x0355:
        r4 = 6600; // 0x19c8 float:9.249E-42 double:3.261E-320;
        r0 = r20;
        if (r0 >= r4) goto L_0x1a94;
    L_0x035b:
        r4 = 6500; // 0x1964 float:9.108E-42 double:3.2114E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x102b;
    L_0x0361:
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r4 = r4 + r6;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r4 = r4 * r6;
        r6 = r4 + -1;
        r4 = -13;
        r4 = defpackage.fy.aj(r4);	 Catch:{ RuntimeException -> 0x003e }
        if (r4 == 0) goto L_0x0ad3;
    L_0x0379:
        r4 = 1;
    L_0x037a:
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x037f:
        r4 = 2;
        goto L_0x0063;
    L_0x0382:
        r6 = 0;
        r5 = 0;
        r19 = r5;
        r5 = r6;
        r6 = r19;
    L_0x0389:
        r10 = r4.an;	 Catch:{ RuntimeException -> 0x003e }
        r10 = r10.length;	 Catch:{ RuntimeException -> 0x003e }
        if (r6 >= r10) goto L_0x012e;
    L_0x038e:
        r10 = r4.ac;	 Catch:{ RuntimeException -> 0x003e }
        r10 = r10[r6];	 Catch:{ RuntimeException -> 0x003e }
        if (r7 != r10) goto L_0x0399;
    L_0x0394:
        r10 = r4.an;	 Catch:{ RuntimeException -> 0x003e }
        r10 = r10[r6];	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5 + r10;
    L_0x0399:
        r6 = r6 + 1;
        goto L_0x0389;
    L_0x039c:
        defpackage.ef.am = r4;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x034d;
    L_0x039f:
        r4 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r0 = r20;
        if (r4 != r0) goto L_0x0586;
    L_0x03a5:
        if (r22 == 0) goto L_0x03ce;
    L_0x03a7:
        r4 = defpackage.client.ae;	 Catch:{ RuntimeException -> 0x003e }
    L_0x03a9:
        r5 = r4.ax;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -1035840093; // 0xffffffffc24255a3 float:-48.58363 double:NaN;
        r5 = r5 * r6;
        r6 = -912598490; // 0xffffffffc99ada26 float:-1268548.8 double:NaN;
        r5 = defpackage.ac.aj(r5, r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r5.ft;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4.af;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -303442303; // 0xffffffffede9d681 float:-9.046166E27 double:NaN;
        r4 = r4 * r7;
        r7 = 0;
        r6[r4] = r7;	 Catch:{ RuntimeException -> 0x003e }
        r4 = -64;
        defpackage.cf.ew(r5, r4);	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x03c9:
        if (r6 == 0) goto L_0x024b;
    L_0x03cb:
        r7 = r6;
        goto L_0x0253;
    L_0x03ce:
        r4 = defpackage.ef.am;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x03a9;
    L_0x03d1:
        r4 = 5004; // 0x138c float:7.012E-42 double:2.4723E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x07a2;
    L_0x03d7:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gt.ac;	 Catch:{ RuntimeException -> 0x003e }
        r6 = (long) r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r5.aj(r6);	 Catch:{ RuntimeException -> 0x003e }
        r4 = (defpackage.gu) r4;	 Catch:{ RuntimeException -> 0x003e }
        if (r4 == 0) goto L_0x232a;
    L_0x03f2:
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = r4.an;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -1469333937; // 0xffffffffa86bbe4f float:-1.3086387E-14 double:NaN;
        r7 = r7 * r8;
        r5[r6] = r7;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = r4.ac;	 Catch:{ RuntimeException -> 0x003e }
        r8 = 596728005; // 0x239158c5 float:1.5758527E-17 double:2.94822807E-315;
        r7 = r7 * r8;
        r5[r6] = r7;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 + r7;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r7;
        r7 = r5 + -1;
        r5 = r4.aq;	 Catch:{ RuntimeException -> 0x003e }
        if (r5 == 0) goto L_0x2575;
    L_0x0436:
        r5 = r4.aq;	 Catch:{ RuntimeException -> 0x003e }
    L_0x0438:
        r6[r7] = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 + r7;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r7;
        r7 = r5 + -1;
        r5 = r4.ap;	 Catch:{ RuntimeException -> 0x003e }
        if (r5 == 0) goto L_0x2579;
    L_0x044e:
        r5 = r4.ap;	 Catch:{ RuntimeException -> 0x003e }
    L_0x0450:
        r6[r7] = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 + r7;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r7;
        r7 = r5 + -1;
        r5 = r4.at;	 Catch:{ RuntimeException -> 0x003e }
        if (r5 == 0) goto L_0x257d;
    L_0x0466:
        r5 = r4.at;	 Catch:{ RuntimeException -> 0x003e }
    L_0x0468:
        r6[r7] = r5;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = 904560884; // 0x35ea80f4 float:1.7471889E-6 double:4.469124574E-315;
        r7 = r4.an(r7);	 Catch:{ RuntimeException -> 0x003e }
        if (r7 == 0) goto L_0x2528;
    L_0x0483:
        r4 = 1;
    L_0x0484:
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
    L_0x0486:
        r4 = 1;
        goto L_0x0063;
    L_0x0489:
        r4 = 4110; // 0x100e float:5.76E-42 double:2.0306E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x2296;
    L_0x048f:
        r4 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r5 = 873608978; // 0x34123712 float:1.3617344E-7 double:4.31620184E-315;
        r4 = r4 - r5;
        defpackage.di.ah = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r6 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r7 = r7 - r8;
        defpackage.dy.ap = r7;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = r7 * r8;
        r6 = r6[r7];	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1;
        if (r6 != r7) goto L_0x2282;
    L_0x04c0:
        r5 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r6 = r6 + r7;
        defpackage.di.ah = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
    L_0x04d2:
        r4 = 1;
        goto L_0x0063;
    L_0x04d5:
        r4 = 3303; // 0xce7 float:4.628E-42 double:1.632E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x118b;
    L_0x04db:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r6 = r6 + 1;
        r7 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r8 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r9 = r5 + -1;
        r5 = defpackage.gm.aj;	 Catch:{ RuntimeException -> 0x003e }
        r10 = (long) r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r5.aj(r10);	 Catch:{ RuntimeException -> 0x003e }
        r4 = (defpackage.gm) r4;	 Catch:{ RuntimeException -> 0x003e }
        if (r4 != 0) goto L_0x27a2;
    L_0x0514:
        r5 = 0;
    L_0x0515:
        r8[r9] = r5;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x051a:
        r4 = 5017; // 0x1399 float:7.03E-42 double:2.4787E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x2770;
    L_0x0520:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = -1447561320; // 0xffffffffa9b7f798 float:-8.169783E-14 double:NaN;
        r4 = defpackage.ak.ao(r4, r7);	 Catch:{ RuntimeException -> 0x003e }
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x054c:
        r4 = 4015; // 0xfaf float:5.626E-42 double:1.9837E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x029d;
    L_0x0552:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r7 = r7 + r8;
        defpackage.dy.ap = r7;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = r7 * r8;
        r7 = r7 + -1;
        r4 = r4 | r5;
        r6[r7] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x0586:
        r4 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r0 = r20;
        if (r4 != r0) goto L_0x0606;
    L_0x058c:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = 1681747134; // 0x643d6cbe float:1.3977081E22 double:8.30893484E-315;
        r4 = defpackage.ac.aj(r4, r5);	 Catch:{ RuntimeException -> 0x003e }
        r5 = 0;
        r4.ft = r5;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -27;
        defpackage.cf.ew(r4, r5);	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x05ae:
        r4 = 6513; // 0x1971 float:9.127E-42 double:3.218E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x1c84;
    L_0x05b4:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1139209334; // 0x43e6f476 float:461.90985 double:5.628441954E-315;
        r6 = defpackage.bb.ac(r5, r6);	 Catch:{ RuntimeException -> 0x003e }
        r7 = -1847906801; // 0xffffffff91db2e0f float:-3.4580493E-28 double:NaN;
        r7 = r6.aa(r7);	 Catch:{ RuntimeException -> 0x003e }
        if (r7 == 0) goto L_0x225c;
    L_0x05e2:
        r7 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r8 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r9 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r8 = r8 + r9;
        defpackage.di.ah = r8;	 Catch:{ RuntimeException -> 0x003e }
        r9 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r8 = r8 * r9;
        r8 = r8 + -1;
        r9 = 46;
        r4 = defpackage.ag.aj(r4, r9);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.ao;	 Catch:{ RuntimeException -> 0x003e }
        r9 = 234118784; // 0xdf45e80 float:1.5060411E-30 double:1.15670048E-315;
        r4 = r4.ah(r5, r6, r9);	 Catch:{ RuntimeException -> 0x003e }
        r7[r8] = r4;	 Catch:{ RuntimeException -> 0x003e }
    L_0x0603:
        r4 = 1;
        goto L_0x0063;
    L_0x0606:
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r0 = r20;
        if (r4 != r0) goto L_0x0727;
    L_0x060c:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = 324434421; // 0x135679f5 float:2.7070727E-27 double:1.602919017E-315;
        r4 = defpackage.li.ac(r4, r5, r6);	 Catch:{ RuntimeException -> 0x003e }
        if (r4 == 0) goto L_0x290d;
    L_0x0633:
        r6 = -1;
        if (r5 == r6) goto L_0x290d;
    L_0x0636:
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = 1;
        r5[r6] = r7;	 Catch:{ RuntimeException -> 0x003e }
        if (r22 == 0) goto L_0x06f2;
    L_0x064b:
        defpackage.client.ae = r4;	 Catch:{ RuntimeException -> 0x003e }
    L_0x064d:
        r4 = 1;
        goto L_0x0063;
    L_0x0650:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = -1;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 0;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 + r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = "";
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 0;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 0;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 + r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = "";
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
    L_0x06c4:
        r4 = 1;
        goto L_0x0063;
    L_0x06c7:
        r4 = 5022; // 0x139e float:7.037E-42 double:2.481E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x27ea;
    L_0x06cd:
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 + r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = defpackage.client.lm;	 Catch:{ RuntimeException -> 0x003e }
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x06e4:
        r4 = 8;
        r4 = r5.aa(r4);	 Catch:{ RuntimeException -> 0x003e }
        if (r4 == 0) goto L_0x0775;
    L_0x06ec:
        r4 = 2;
    L_0x06ed:
        r6[r7] = r4;	 Catch:{ RuntimeException -> 0x003e }
    L_0x06ef:
        r4 = 1;
        goto L_0x0063;
    L_0x06f2:
        defpackage.ef.am = r4;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x064d;
    L_0x06f6:
        r4 = 4117; // 0x1015 float:5.769E-42 double:2.034E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x23d1;
    L_0x06fc:
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 - r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        if (r4 == 0) goto L_0x23a7;
    L_0x070e:
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r4 = r4.length();	 Catch:{ RuntimeException -> 0x003e }
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
    L_0x0724:
        r4 = 1;
        goto L_0x0063;
    L_0x0727:
        r4 = 201; // 0xc9 float:2.82E-43 double:9.93E-322;
        r0 = r20;
        if (r0 != r4) goto L_0x037f;
    L_0x072d:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = -279374489; // 0xffffffffef591567 float:-6.718412E28 double:NaN;
        r4 = defpackage.ac.aj(r4, r5);	 Catch:{ RuntimeException -> 0x003e }
        if (r4 == 0) goto L_0x078e;
    L_0x0746:
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = 1;
        r5[r6] = r7;	 Catch:{ RuntimeException -> 0x003e }
        if (r22 == 0) goto L_0x2513;
    L_0x075b:
        defpackage.client.ae = r4;	 Catch:{ RuntimeException -> 0x003e }
    L_0x075d:
        r4 = 1;
        goto L_0x0063;
    L_0x0760:
        r4 = 2800; // 0xaf0 float:3.924E-42 double:1.3834E-320;
        r0 = r20;
        if (r0 >= r4) goto L_0x0c3d;
    L_0x0766:
        r4 = -1800789883; // 0xffffffff94aa2085 float:-1.717844E-26 double:NaN;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r4 = defpackage.aw.as(r0, r1, r2, r4);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0063;
    L_0x0775:
        r4 = 0;
        goto L_0x06ed;
    L_0x0778:
        r8 = defpackage.ix.hc;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r6.startsWith(r8);	 Catch:{ RuntimeException -> 0x003e }
        if (r8 == 0) goto L_0x1465;
    L_0x0780:
        r4 = 4;
        r6 = defpackage.ix.hc;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r4;
        goto L_0x018c;
    L_0x078e:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 0;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x075d;
    L_0x07a2:
        r4 = 5005; // 0x138d float:7.013E-42 double:2.473E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x0e88;
    L_0x07a8:
        r4 = defpackage.et.ld;	 Catch:{ RuntimeException -> 0x003e }
        if (r4 != 0) goto L_0x2584;
    L_0x07ac:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = -1;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
    L_0x07bf:
        r4 = 1;
        goto L_0x0063;
    L_0x07c2:
        r4 = 6512; // 0x1970 float:9.125E-42 double:3.2174E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x05ae;
    L_0x07c8:
        r5 = defpackage.dj.hs;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 - r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r4 = r4[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1;
        if (r4 != r6) goto L_0x290a;
    L_0x07dd:
        r4 = 1;
    L_0x07de:
        r6 = -2055691750; // 0xffffffff8578a21a float:-1.1690677E-35 double:NaN;
        r5.bl(r4, r6);	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x07e7:
        r4 = 4112; // 0x1010 float:5.762E-42 double:2.0316E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x22d9;
    L_0x07ed:
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 - r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 - r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r8 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r7 = r7 + r8;
        defpackage.di.ah = r7;	 Catch:{ RuntimeException -> 0x003e }
        r8 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r7 = r7 * r8;
        r7 = r7 + -1;
        r8 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x003e }
        r8.<init>();	 Catch:{ RuntimeException -> 0x003e }
        r4 = r8.append(r4);	 Catch:{ RuntimeException -> 0x003e }
        r5 = (char) r5;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4.append(r5);	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4.toString();	 Catch:{ RuntimeException -> 0x003e }
        r6[r7] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x0834:
        r4 = 1100; // 0x44c float:1.541E-42 double:5.435E-321;
        r0 = r20;
        if (r0 >= r4) goto L_0x0849;
    L_0x083a:
        r4 = 1638330094; // 0x61a6eeee float:3.8492203E20 double:8.09442616E-315;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r4 = defpackage.gh.aq(r0, r1, r2, r4);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0063;
    L_0x0849:
        r4 = 1200; // 0x4b0 float:1.682E-42 double:5.93E-321;
        r0 = r20;
        if (r0 >= r4) goto L_0x085e;
    L_0x084f:
        r4 = 1854484790; // 0x6e893136 float:2.122947E28 double:9.162372255E-315;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r4 = defpackage.bz.ao(r0, r1, r2, r4);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0063;
    L_0x085e:
        r4 = 1300; // 0x514 float:1.822E-42 double:6.423E-321;
        r0 = r20;
        if (r0 >= r4) goto L_0x0873;
    L_0x0864:
        r4 = 1842726972; // 0x6dd5c83c float:8.270297E27 double:9.104280915E-315;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r4 = defpackage.eg.aa(r0, r1, r2, r4);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0063;
    L_0x0873:
        r4 = 1400; // 0x578 float:1.962E-42 double:6.917E-321;
        r0 = r20;
        if (r0 >= r4) goto L_0x0888;
    L_0x0879:
        r4 = -1898174146; // 0xffffffff8edc293e float:-5.4273902E-30 double:NaN;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r4 = defpackage.cj.ak(r0, r1, r2, r4);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0063;
    L_0x0888:
        r4 = 1500; // 0x5dc float:2.102E-42 double:7.41E-321;
        r0 = r20;
        if (r0 >= r4) goto L_0x089d;
    L_0x088e:
        r4 = 1596887409; // 0x5f2e9171 float:1.257896E19 double:7.88967209E-315;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r4 = defpackage.bl.ap(r0, r1, r2, r4);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0063;
    L_0x089d:
        r4 = 1600; // 0x640 float:2.242E-42 double:7.905E-321;
        r0 = r20;
        if (r0 >= r4) goto L_0x2533;
    L_0x08a3:
        r4 = -1000286443; // 0xffffffffc460d715 float:-899.36066 double:NaN;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r4 = defpackage.dy.at(r0, r1, r2, r4);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0063;
    L_0x08b2:
        r8 = defpackage.ix.hb;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r6.startsWith(r8);	 Catch:{ RuntimeException -> 0x003e }
        if (r8 == 0) goto L_0x0a6e;
    L_0x08ba:
        r4 = 8;
        r6 = defpackage.ix.hb;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r4;
        goto L_0x018c;
    L_0x08c9:
        r4 = 4010; // 0xfaa float:5.619E-42 double:1.981E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x1afc;
    L_0x08cf:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r7 = r7 + r8;
        defpackage.dy.ap = r7;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = r7 * r8;
        r7 = r7 + -1;
        r8 = 1;
        r5 = r8 << r5;
        r4 = r4 & r5;
        if (r4 == 0) goto L_0x1c45;
    L_0x0903:
        r4 = 1;
    L_0x0904:
        r6[r7] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x0909:
        r4 = 1800; // 0x708 float:2.522E-42 double:8.893E-321;
        r0 = r20;
        if (r0 >= r4) goto L_0x091e;
    L_0x090f:
        r4 = 1982865126; // 0x76301ee6 float:8.93038E32 double:9.79665539E-315;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r4 = defpackage.du.ai(r0, r1, r2, r4);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0063;
    L_0x091e:
        r4 = 1900; // 0x76c float:2.662E-42 double:9.387E-321;
        r0 = r20;
        if (r0 >= r4) goto L_0x0abe;
    L_0x0924:
        if (r22 == 0) goto L_0x0951;
    L_0x0926:
        r4 = defpackage.client.ae;	 Catch:{ RuntimeException -> 0x003e }
    L_0x0928:
        r5 = 1800; // 0x708 float:2.522E-42 double:8.893E-321;
        r0 = r20;
        if (r5 != r0) goto L_0x09c1;
    L_0x092e:
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = 1588397356; // 0x5ead052c float:6.2337098E18 double:7.847725655E-315;
        r4 = defpackage.at.ft(r4, r7);	 Catch:{ RuntimeException -> 0x003e }
        r7 = 148019405; // 0x8d298cd float:1.2674839E-33 double:7.3131303E-316;
        r4 = defpackage.fj.an(r4, r7);	 Catch:{ RuntimeException -> 0x003e }
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x0951:
        r4 = defpackage.ef.am;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0928;
    L_0x0954:
        r4 = 3325; // 0xcfd float:4.66E-42 double:1.643E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x2324;
    L_0x095a:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -1607699868; // 0xffffffffa02c7264 float:-1.4606815E-19 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r8 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = r7 * r8;
        r7 = r7 + 2;
        r6 = r6[r7];	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r8 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r9 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r8 = r8 * r9;
        r8 = r8 + 3;
        r7 = r7[r8];	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5 << 14;
        r4 = r4 + r5;
        r5 = r6 << 28;
        r4 = r4 + r5;
        r4 = r4 + r7;
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x09ac:
        r9 = defpackage.ix.ie;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r8.startsWith(r9);	 Catch:{ RuntimeException -> 0x003e }
        if (r8 == 0) goto L_0x01a4;
    L_0x09b4:
        r4 = 5;
        r8 = defpackage.ix.ie;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r8.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r8);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x01a4;
    L_0x09c1:
        r5 = 1801; // 0x709 float:2.524E-42 double:8.9E-321;
        r0 = r20;
        if (r5 != r0) goto L_0x0a85;
    L_0x09c7:
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 - r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5 + -1;
        r6 = r4.dv;	 Catch:{ RuntimeException -> 0x003e }
        if (r6 == 0) goto L_0x09e8;
    L_0x09dd:
        r6 = r4.dv;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.length;	 Catch:{ RuntimeException -> 0x003e }
        if (r5 >= r6) goto L_0x09e8;
    L_0x09e2:
        r6 = r4.dv;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6[r5];	 Catch:{ RuntimeException -> 0x003e }
        if (r6 != 0) goto L_0x14f4;
    L_0x09e8:
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 + r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = "";
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
    L_0x09fc:
        r4 = 1;
        goto L_0x0063;
    L_0x09ff:
        r4 = 2;
        goto L_0x0063;
    L_0x0a02:
        r4 = 4114; // 0x1012 float:5.765E-42 double:2.0326E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x1aa9;
    L_0x0a08:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r4 = (char) r4;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 48;
        if (r4 < r7) goto L_0x0a31;
    L_0x0a2d:
        r7 = 57;
        if (r4 <= r7) goto L_0x0a41;
    L_0x0a31:
        r7 = 65;
        if (r4 < r7) goto L_0x0a39;
    L_0x0a35:
        r7 = 90;
        if (r4 <= r7) goto L_0x0a41;
    L_0x0a39:
        r7 = 97;
        if (r4 < r7) goto L_0x2321;
    L_0x0a3d:
        r7 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        if (r4 > r7) goto L_0x2321;
    L_0x0a41:
        r4 = 1;
    L_0x0a42:
        if (r4 == 0) goto L_0x2327;
    L_0x0a44:
        r4 = 1;
    L_0x0a45:
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x0a4a:
        r8 = defpackage.ix.hl;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r6.startsWith(r8);	 Catch:{ RuntimeException -> 0x003e }
        if (r8 == 0) goto L_0x0170;
    L_0x0a52:
        r4 = 11;
        r6 = defpackage.ix.hl;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r4;
        goto L_0x018c;
    L_0x0a61:
        if (r5 < 0) goto L_0x0a68;
    L_0x0a63:
        r8 = r4.an;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r8.length;	 Catch:{ RuntimeException -> 0x003e }
        if (r5 < r8) goto L_0x1d9d;
    L_0x0a68:
        r4 = 0;
    L_0x0a69:
        r6[r7] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x0a6e:
        r8 = defpackage.ix.hr;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r6.startsWith(r8);	 Catch:{ RuntimeException -> 0x003e }
        if (r8 == 0) goto L_0x1841;
    L_0x0a76:
        r4 = 9;
        r6 = defpackage.ix.hr;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r4;
        goto L_0x018c;
    L_0x0a85:
        r5 = 1802; // 0x70a float:2.525E-42 double:8.903E-321;
        r0 = r20;
        if (r5 != r0) goto L_0x0abb;
    L_0x0a8b:
        r5 = r4.dw;	 Catch:{ RuntimeException -> 0x003e }
        if (r5 != 0) goto L_0x0aa6;
    L_0x0a8f:
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 + r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = "";
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
    L_0x0aa3:
        r4 = 1;
        goto L_0x0063;
    L_0x0aa6:
        r5 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r6 = r6 + r7;
        defpackage.di.ah = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r4 = r4.dw;	 Catch:{ RuntimeException -> 0x003e }
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0aa3;
    L_0x0abb:
        r4 = 2;
        goto L_0x0063;
    L_0x0abe:
        r4 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        r0 = r20;
        if (r0 >= r4) goto L_0x0ad6;
    L_0x0ac4:
        r4 = 1530846649; // 0x5b3eddb9 float:5.3724032E16 double:7.563387383E-315;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r4 = defpackage.fr.aw(r0, r1, r2, r4);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0063;
    L_0x0ad3:
        r4 = 0;
        goto L_0x037a;
    L_0x0ad6:
        r4 = 2100; // 0x834 float:2.943E-42 double:1.0375E-320;
        r0 = r20;
        if (r0 >= r4) goto L_0x0b25;
    L_0x0adc:
        r4 = 1066352531; // 0x3f8f3f93 float:1.1191276 double:5.26848152E-315;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r4 = defpackage.gh.aq(r0, r1, r2, r4);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0063;
    L_0x0aeb:
        r4 = 4003; // 0xfa3 float:5.61E-42 double:1.9777E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x1b36;
    L_0x0af1:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r7 = r7 + r8;
        defpackage.dy.ap = r7;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = r7 * r8;
        r7 = r7 + -1;
        r4 = r4 / r5;
        r6[r7] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x0b25:
        r4 = 2200; // 0x898 float:3.083E-42 double:1.087E-320;
        r0 = r20;
        if (r0 >= r4) goto L_0x0b77;
    L_0x0b2b:
        r4 = -1808753791; // 0xffffffff94309b81 float:-8.916397E-27 double:NaN;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r4 = defpackage.bz.ao(r0, r1, r2, r4);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0063;
    L_0x0b3a:
        r4 = 3300; // 0xce4 float:4.624E-42 double:1.6304E-320;
        r0 = r20;
        if (r0 >= r4) goto L_0x0e61;
    L_0x0b40:
        r4 = 3200; // 0xc80 float:4.484E-42 double:1.581E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x0cfc;
    L_0x0b46:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -1205774901; // 0xffffffffb82155cb float:-3.8465292E-5 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r8 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = r7 * r8;
        r7 = r7 + 2;
        r6 = r6[r7];	 Catch:{ RuntimeException -> 0x003e }
        r7 = -8;
        defpackage.kv.by(r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x0b77:
        r4 = 2300; // 0x8fc float:3.223E-42 double:1.1364E-320;
        r0 = r20;
        if (r0 >= r4) goto L_0x1da3;
    L_0x0b7d:
        r4 = 883712435; // 0x34ac61b3 float:3.2108582E-7 double:4.36611955E-315;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r4 = defpackage.eg.aa(r0, r1, r2, r4);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0063;
    L_0x0b8c:
        r4 = 4108; // 0x100c float:5.757E-42 double:2.0296E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x21fd;
    L_0x0b92:
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 - r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = r7 * r8;
        r7 = r7 + 1;
        r6 = r6[r7];	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.bx.ca;	 Catch:{ RuntimeException -> 0x003e }
        r8 = 0;
        r9 = -738490465; // 0xffffffffd3fb879f float:-2.16062427E12 double:NaN;
        r6 = r7.an(r6, r8, r9);	 Catch:{ RuntimeException -> 0x003e }
        r7 = new kh;	 Catch:{ RuntimeException -> 0x003e }
        r7.<init>(r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r8 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r9 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r8 = r8 + r9;
        defpackage.dy.ap = r8;	 Catch:{ RuntimeException -> 0x003e }
        r9 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r8 = r8 * r9;
        r8 = r8 + -1;
        r4 = r7.ak(r4, r5);	 Catch:{ RuntimeException -> 0x003e }
        r6[r8] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x0be8:
        r8 = defpackage.ix.hv;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r6.startsWith(r8);	 Catch:{ RuntimeException -> 0x003e }
        if (r8 == 0) goto L_0x1528;
    L_0x0bf0:
        r4 = 7;
        r6 = defpackage.ix.hv;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r4;
        goto L_0x018c;
    L_0x0bfe:
        r4 = 2500; // 0x9c4 float:3.503E-42 double:1.235E-320;
        r0 = r20;
        if (r0 >= r4) goto L_0x0c13;
    L_0x0c04:
        r4 = 2048781574; // 0x7a1ded06 float:2.049995E35 double:1.0122325915E-314;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r4 = defpackage.bl.ap(r0, r1, r2, r4);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0063;
    L_0x0c13:
        r4 = 2600; // 0xa28 float:3.643E-42 double:1.2846E-320;
        r0 = r20;
        if (r0 >= r4) goto L_0x0c28;
    L_0x0c19:
        r4 = -1122909811; // 0xffffffffbd11c18d float:-0.035584975 double:NaN;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r4 = defpackage.dw.am(r0, r1, r2, r4);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0063;
    L_0x0c28:
        r4 = 2700; // 0xa8c float:3.784E-42 double:1.334E-320;
        r0 = r20;
        if (r0 >= r4) goto L_0x0760;
    L_0x0c2e:
        r4 = -1669446067; // 0xffffffff9c7e464d float:-8.413241E-22 double:NaN;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r4 = defpackage.dr.ae(r0, r1, r2, r4);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0063;
    L_0x0c3d:
        r4 = 2900; // 0xb54 float:4.064E-42 double:1.433E-320;
        r0 = r20;
        if (r0 >= r4) goto L_0x0c8d;
    L_0x0c43:
        r4 = -2008527199; // 0xffffffff88484ea1 float:-6.027774E-34 double:NaN;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r4 = defpackage.gh.al(r0, r1, r2, r4);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0063;
    L_0x0c52:
        r4 = defpackage.aj.aj;	 Catch:{ RuntimeException -> 0x003e }
        r10 = 34;
        r11 = 844807; // 0xce407 float:1.183827E-39 double:4.1739E-318;
        r10 = r4.an(r10, r5, r11);	 Catch:{ RuntimeException -> 0x003e }
        r4 = new aj;	 Catch:{ RuntimeException -> 0x003e }
        r4.<init>();	 Catch:{ RuntimeException -> 0x003e }
        if (r10 == 0) goto L_0x0c6f;
    L_0x0c64:
        r11 = new he;	 Catch:{ RuntimeException -> 0x003e }
        r11.<init>(r10);	 Catch:{ RuntimeException -> 0x003e }
        r10 = 949906919; // 0x389e6de7 float:7.554498E-5 double:4.693163754E-315;
        r4.ac(r11, r10);	 Catch:{ RuntimeException -> 0x003e }
    L_0x0c6f:
        r10 = -1515773806; // 0xffffffffa5a72092 float:-2.8991953E-16 double:NaN;
        r4.aj(r10);	 Catch:{ RuntimeException -> 0x003e }
        r10 = defpackage.aj.ac;	 Catch:{ RuntimeException -> 0x003e }
        r12 = (long) r5;	 Catch:{ RuntimeException -> 0x003e }
        r10.an(r4, r12);	 Catch:{ RuntimeException -> 0x003e }
    L_0x0c7b:
        r5 = r7.aq;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -1702464013; // 0xffffffff9a8675f3 float:-5.561166E-23 double:NaN;
        r5 = r5 * r7;
        r7 = 2119462488; // 0x7e546e58 float:7.059232E37 double:1.047153603E-314;
        r4 = r4.aq(r6, r5, r7);	 Catch:{ RuntimeException -> 0x003e }
        r8[r9] = r4;	 Catch:{ RuntimeException -> 0x003e }
    L_0x0c8a:
        r4 = 1;
        goto L_0x0063;
    L_0x0c8d:
        r4 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;
        r0 = r20;
        if (r0 >= r4) goto L_0x0ca2;
    L_0x0c93:
        r4 = 1530846649; // 0x5b3eddb9 float:5.3724032E16 double:7.563387383E-315;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r4 = defpackage.fr.aw(r0, r1, r2, r4);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0063;
    L_0x0ca2:
        r4 = 3200; // 0xc80 float:4.484E-42 double:1.581E-320;
        r0 = r20;
        if (r0 >= r4) goto L_0x0b3a;
    L_0x0ca8:
        r4 = -650837036; // 0xffffffffd93503d4 float:-3.18444874E15 double:NaN;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r4 = defpackage.bt.az(r0, r1, r2, r4);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0063;
    L_0x0cb7:
        r4 = 3307; // 0xceb float:4.634E-42 double:1.634E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x1339;
    L_0x0cbd:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = defpackage.client.hi;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r7[r4];	 Catch:{ RuntimeException -> 0x003e }
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x0ce6:
        r8 = defpackage.ix.hx;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r6.startsWith(r8);	 Catch:{ RuntimeException -> 0x003e }
        if (r8 == 0) goto L_0x0ec9;
    L_0x0cee:
        r4 = 6;
        r6 = defpackage.ix.hx;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r4;
        goto L_0x018c;
    L_0x0cfc:
        r4 = 3201; // 0xc81 float:4.486E-42 double:1.5815E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x0da0;
    L_0x0d02:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = 1426385970; // 0x5504ec32 float:9.1343741E12 double:7.047283055E-315;
        defpackage.eu.bx(r4, r5);	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x0d1b:
        r4 = 4107; // 0x100b float:5.755E-42 double:2.029E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x0b8c;
    L_0x0d21:
        r4 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r5 = 873608978; // 0x34123712 float:1.3617344E-7 double:4.31620184E-315;
        r4 = r4 - r5;
        defpackage.di.ah = r4;	 Catch:{ RuntimeException -> 0x003e }
        r10 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r4 = r4 + r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r4 = r4 * r5;
        r11 = r4 + -1;
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r6 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5 * r6;
        r12 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r5 = r5 + 1;
        r13 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.client.ai;	 Catch:{ RuntimeException -> 0x003e }
        r5 = 1201256695; // 0x4799b8f7 float:78705.93 double:5.93499665E-315;
        r14 = r4 * r5;
        r15 = r12.length();	 Catch:{ RuntimeException -> 0x003e }
        r16 = r13.length();	 Catch:{ RuntimeException -> 0x003e }
        r8 = 0;
        r5 = 0;
        r6 = 0;
        r4 = 0;
    L_0x0d62:
        r7 = r8 - r6;
        if (r7 < r15) goto L_0x1bcb;
    L_0x0d66:
        r7 = r5 - r4;
        r0 = r16;
        if (r7 < r0) goto L_0x1bcb;
    L_0x0d6c:
        r5 = java.lang.Math.min(r15, r16);	 Catch:{ RuntimeException -> 0x003e }
        r4 = 0;
    L_0x0d71:
        if (r4 >= r5) goto L_0x0059;
    L_0x0d73:
        r6 = r12.charAt(r4);	 Catch:{ RuntimeException -> 0x003e }
        r7 = r13.charAt(r4);	 Catch:{ RuntimeException -> 0x003e }
        if (r6 == r7) goto L_0x2177;
    L_0x0d7d:
        r8 = java.lang.Character.toUpperCase(r6);	 Catch:{ RuntimeException -> 0x003e }
        r9 = java.lang.Character.toUpperCase(r7);	 Catch:{ RuntimeException -> 0x003e }
        if (r8 == r9) goto L_0x2177;
    L_0x0d87:
        r6 = java.lang.Character.toLowerCase(r6);	 Catch:{ RuntimeException -> 0x003e }
        r7 = java.lang.Character.toLowerCase(r7);	 Catch:{ RuntimeException -> 0x003e }
        if (r7 == r6) goto L_0x2177;
    L_0x0d91:
        r4 = 69;
        r4 = defpackage.fe.an(r6, r14, r4);	 Catch:{ RuntimeException -> 0x003e }
        r5 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r5 = defpackage.fe.an(r7, r14, r5);	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4 - r5;
        goto L_0x005d;
    L_0x0da0:
        r4 = 3202; // 0xc82 float:4.487E-42 double:1.582E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x283f;
    L_0x0da6:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = -2141674919; // 0xffffffff8058a259 float:-8.139763E-39 double:NaN;
        defpackage.eq.bi(r4, r5, r6);	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x0dcd:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = -1;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 0;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 + r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = "";
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 + r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = "";
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 + r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = "";
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 0;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x06ef;
    L_0x0e44:
        r7 = 8364; // 0x20ac float:1.172E-41 double:4.1324E-320;
        if (r4 == r7) goto L_0x0e58;
    L_0x0e48:
        r7 = 338; // 0x152 float:4.74E-43 double:1.67E-321;
        if (r7 == r4) goto L_0x0e58;
    L_0x0e4c:
        r7 = 8212; // 0x2014 float:1.1507E-41 double:4.0573E-320;
        if (r7 == r4) goto L_0x0e58;
    L_0x0e50:
        r7 = 339; // 0x153 float:4.75E-43 double:1.675E-321;
        if (r7 == r4) goto L_0x0e58;
    L_0x0e54:
        r7 = 376; // 0x178 float:5.27E-43 double:1.86E-321;
        if (r7 != r4) goto L_0x231b;
    L_0x0e58:
        r4 = 1;
    L_0x0e59:
        if (r4 == 0) goto L_0x231e;
    L_0x0e5b:
        r4 = 1;
    L_0x0e5c:
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x0e61:
        r4 = 3400; // 0xd48 float:4.764E-42 double:1.68E-320;
        r0 = r20;
        if (r0 >= r4) goto L_0x18dc;
    L_0x0e67:
        r4 = 3300; // 0xce4 float:4.624E-42 double:1.6304E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x0eec;
    L_0x0e6d:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 901275591; // 0x35b85fc7 float:1.3736943E-6 double:4.45289307E-315;
        r7 = defpackage.client.af;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x0e88:
        r4 = 5008; // 0x1390 float:7.018E-42 double:2.4743E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x15fa;
    L_0x0e8e:
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 - r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r5 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 - r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r7 = r4[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = r5.toLowerCase();	 Catch:{ RuntimeException -> 0x003e }
        r4 = 0;
        r8 = defpackage.ix.gl;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r6.startsWith(r8);	 Catch:{ RuntimeException -> 0x003e }
        if (r8 == 0) goto L_0x25a0;
    L_0x0ebb:
        r4 = 0;
        r6 = defpackage.ix.gl;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r4;
        goto L_0x018c;
    L_0x0ec9:
        r8 = defpackage.ix.hm;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r6.startsWith(r8);	 Catch:{ RuntimeException -> 0x003e }
        if (r8 == 0) goto L_0x08b2;
    L_0x0ed1:
        r4 = 7;
        r6 = defpackage.ix.hm;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r4;
        goto L_0x018c;
    L_0x0edf:
        if (r5 < 0) goto L_0x0ee6;
    L_0x0ee1:
        r8 = r4.an;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r8.length;	 Catch:{ RuntimeException -> 0x003e }
        if (r5 < r8) goto L_0x150c;
    L_0x0ee6:
        r4 = 0;
    L_0x0ee7:
        r6[r7] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x0eec:
        r4 = 3301; // 0xce5 float:4.626E-42 double:1.631E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x0f60;
    L_0x0ef2:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r7 = r7 + r8;
        defpackage.dy.ap = r7;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = r7 * r8;
        r7 = r7 + -1;
        r8 = 2056853318; // 0x7a991746 float:3.9744673E35 double:1.016220563E-314;
        r4 = defpackage.az.aj(r4, r5, r8);	 Catch:{ RuntimeException -> 0x003e }
        r6[r7] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x0f2c:
        r4 = 4005; // 0xfa5 float:5.612E-42 double:1.9787E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x1596;
    L_0x0f32:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r8 = java.lang.Math.random();	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4 + 1;
        r10 = (double) r4;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r8 * r10;
        r4 = (int) r8;	 Catch:{ RuntimeException -> 0x003e }
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x0f60:
        r4 = 3302; // 0xce6 float:4.627E-42 double:1.6314E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x04d5;
    L_0x0f66:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r7 = r7 + r8;
        defpackage.dy.ap = r7;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = r7 * r8;
        r7 = r7 + -1;
        r8 = defpackage.gm.aj;	 Catch:{ RuntimeException -> 0x003e }
        r10 = (long) r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r8.aj(r10);	 Catch:{ RuntimeException -> 0x003e }
        r4 = (defpackage.gm) r4;	 Catch:{ RuntimeException -> 0x003e }
        if (r4 != 0) goto L_0x0a61;
    L_0x0f9f:
        r4 = 0;
        goto L_0x0a69;
    L_0x0fa2:
        r4 = 4008; // 0xfa8 float:5.616E-42 double:1.98E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x1a55;
    L_0x0fa8:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r7 = r7 + r8;
        defpackage.dy.ap = r7;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = r7 * r8;
        r7 = r7 + -1;
        r8 = 1;
        r5 = r8 << r5;
        r4 = r4 | r5;
        r6[r7] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x0fdf:
        r4 = 6507; // 0x196b float:9.118E-42 double:3.215E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x18f1;
    L_0x0fe5:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -1607699868; // 0xffffffffa02c7264 float:-1.4606815E-19 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5 * r6;
        r6 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r7;
        r5 = r5 + 1;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = 1;
        if (r4 != r5) goto L_0x298c;
    L_0x1006:
        r4 = 1;
        r5 = r4;
    L_0x1008:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = r7 * r8;
        r7 = r7 + 2;
        r7 = r4[r7];	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        r8 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r9 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r10 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r9 = r9 * r10;
        r9 = r9 + 3;
        r8 = r8[r9];	 Catch:{ RuntimeException -> 0x003e }
        if (r4 != r8) goto L_0x241e;
    L_0x1023:
        r4 = 1;
    L_0x1024:
        r8 = -1;
        defpackage.ck.aq(r6, r5, r7, r4, r8);	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x102b:
        r4 = 6501; // 0x1965 float:9.11E-42 double:3.212E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x2421;
    L_0x1031:
        r4 = -536523808; // 0xffffffffe0054be0 float:-3.8420068E19 double:NaN;
        r4 = defpackage.ev.ak(r4);	 Catch:{ RuntimeException -> 0x003e }
        if (r4 == 0) goto L_0x0650;
    L_0x103a:
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = r4.ai;	 Catch:{ RuntimeException -> 0x003e }
        r8 = 1057964181; // 0x3f0f4095 float:0.5595792 double:5.227037564E-315;
        r7 = r7 * r8;
        r5[r6] = r7;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = r4.aw;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -687262573; // 0xffffffffd7093493 float:-1.50858898E14 double:NaN;
        r7 = r7 * r8;
        r5[r6] = r7;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r6 = r6 + r7;
        defpackage.di.ah = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = r4.as;	 Catch:{ RuntimeException -> 0x003e }
        r5[r6] = r7;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = 700245205; // 0x29bce4d5 float:8.388573E-14 double:3.459670995E-315;
        r8 = r4.al;	 Catch:{ RuntimeException -> 0x003e }
        r7 = r7 * r8;
        r5[r6] = r7;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = 794816761; // 0x2f5ff0f9 float:2.0367343E-10 double:3.926916563E-315;
        r8 = r4.am;	 Catch:{ RuntimeException -> 0x003e }
        r7 = r7 * r8;
        r5[r6] = r7;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r6 = r6 + r7;
        defpackage.di.ah = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r4 = r4.ae;	 Catch:{ RuntimeException -> 0x003e }
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x06c4;
    L_0x10c4:
        r4 = 4105; // 0x1009 float:5.752E-42 double:2.028E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x2048;
    L_0x10ca:
        r4 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r5 = 873608978; // 0x34123712 float:1.3617344E-7 double:4.31620184E-315;
        r4 = r4 - r5;
        defpackage.di.ah = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r6 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.cx.hb;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.ac;	 Catch:{ RuntimeException -> 0x003e }
        if (r6 == 0) goto L_0x2034;
    L_0x10ee:
        r6 = defpackage.cx.hb;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.ac;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.an;	 Catch:{ RuntimeException -> 0x003e }
        if (r6 == 0) goto L_0x2034;
    L_0x10f6:
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r6 = r6 + r7;
        defpackage.di.ah = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r4[r6] = r5;	 Catch:{ RuntimeException -> 0x003e }
    L_0x1108:
        r4 = 1;
        goto L_0x0063;
    L_0x110b:
        r4 = 3314; // 0xcf2 float:4.644E-42 double:1.6373E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x13f2;
    L_0x1111:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4 + r5;
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r7 = r7 + r8;
        defpackage.dy.ap = r7;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = r7 * r8;
        r7 = r7 + -1;
        r8 = defpackage.gm.aj;	 Catch:{ RuntimeException -> 0x003e }
        r10 = (long) r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r8.aj(r10);	 Catch:{ RuntimeException -> 0x003e }
        r4 = (defpackage.gm) r4;	 Catch:{ RuntimeException -> 0x003e }
        if (r4 != 0) goto L_0x0edf;
    L_0x114e:
        r4 = 0;
        goto L_0x0ee7;
    L_0x1151:
        r6 = 0;
        r5 = 0;
        r19 = r5;
        r5 = r6;
        r6 = r19;
    L_0x1158:
        r10 = r4.an;	 Catch:{ RuntimeException -> 0x003e }
        r10 = r10.length;	 Catch:{ RuntimeException -> 0x003e }
        if (r6 >= r10) goto L_0x0515;
    L_0x115d:
        r10 = r4.ac;	 Catch:{ RuntimeException -> 0x003e }
        r10 = r10[r6];	 Catch:{ RuntimeException -> 0x003e }
        if (r10 != r7) goto L_0x1168;
    L_0x1163:
        r10 = r4.an;	 Catch:{ RuntimeException -> 0x003e }
        r10 = r10[r6];	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5 + r10;
    L_0x1168:
        r6 = r6 + 1;
        goto L_0x1158;
    L_0x116b:
        r4 = 3312; // 0xcf0 float:4.641E-42 double:1.6363E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x147e;
    L_0x1171:
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r4 = r4 + r6;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r4 = r4 * r6;
        r6 = r4 + -1;
        r4 = defpackage.client.at;	 Catch:{ RuntimeException -> 0x003e }
        if (r4 == 0) goto L_0x147b;
    L_0x1185:
        r4 = 1;
    L_0x1186:
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x118b:
        r4 = 3304; // 0xce8 float:4.63E-42 double:1.6324E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x11c3;
    L_0x1191:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = 1833290576; // 0x6d45cb50 float:3.825896E27 double:9.057658924E-315;
        r4 = defpackage.cj.aj(r4, r7);	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4.an;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -19099633; // 0xfffffffffedc900f float:-1.4658908E38 double:NaN;
        r4 = r4 * r7;
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x11c3:
        r4 = 3305; // 0xce9 float:4.631E-42 double:1.633E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x1229;
    L_0x11c9:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = defpackage.client.hu;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r7[r4];	 Catch:{ RuntimeException -> 0x003e }
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x11f2:
        r4 = 5019; // 0x139b float:7.033E-42 double:2.4797E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x274d;
    L_0x11f8:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = defpackage.gt.ac;	 Catch:{ RuntimeException -> 0x003e }
        r8 = (long) r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r7.aj(r8);	 Catch:{ RuntimeException -> 0x003e }
        r4 = (defpackage.gu) r4;	 Catch:{ RuntimeException -> 0x003e }
        if (r4 != 0) goto L_0x27a8;
    L_0x1223:
        r4 = -1;
    L_0x1224:
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x1229:
        r4 = 3306; // 0xcea float:4.633E-42 double:1.6334E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x0cb7;
    L_0x122f:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = defpackage.client.hf;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r7[r4];	 Catch:{ RuntimeException -> 0x003e }
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x1258:
        r5 = r5 + 1;
    L_0x125a:
        r7 = 518175009; // 0x1ee2b921 float:2.4005248E-20 double:2.560124705E-315;
        r8 = defpackage.gh.aa;	 Catch:{ RuntimeException -> 0x003e }
        r7 = r7 * r8;
        if (r5 >= r7) goto L_0x1272;
    L_0x1262:
        r7 = defpackage.gh.ao;	 Catch:{ RuntimeException -> 0x003e }
        r7 = r7[r5];	 Catch:{ RuntimeException -> 0x003e }
        r7 = r7.ai;	 Catch:{ RuntimeException -> 0x003e }
        r8 = 1057964181; // 0x3f0f4095 float:0.5595792 double:5.227037564E-315;
        r7 = r7 * r8;
        if (r7 != r6) goto L_0x1258;
    L_0x126e:
        r4 = defpackage.gh.ao;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
    L_0x1272:
        if (r4 == 0) goto L_0x2877;
    L_0x1274:
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = 1057964181; // 0x3f0f4095 float:0.5595792 double:5.227037564E-315;
        r8 = r4.ai;	 Catch:{ RuntimeException -> 0x003e }
        r7 = r7 * r8;
        r5[r6] = r7;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = r4.aw;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -687262573; // 0xffffffffd7093493 float:-1.50858898E14 double:NaN;
        r7 = r7 * r8;
        r5[r6] = r7;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r6 = r6 + r7;
        defpackage.di.ah = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = r4.as;	 Catch:{ RuntimeException -> 0x003e }
        r5[r6] = r7;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = r4.al;	 Catch:{ RuntimeException -> 0x003e }
        r8 = 700245205; // 0x29bce4d5 float:8.388573E-14 double:3.459670995E-315;
        r7 = r7 * r8;
        r5[r6] = r7;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = r4.am;	 Catch:{ RuntimeException -> 0x003e }
        r8 = 794816761; // 0x2f5ff0f9 float:2.0367343E-10 double:3.926916563E-315;
        r7 = r7 * r8;
        r5[r6] = r7;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r6 = r6 + r7;
        defpackage.di.ah = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r4 = r4.ae;	 Catch:{ RuntimeException -> 0x003e }
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
    L_0x12fc:
        r4 = 1;
        goto L_0x0063;
    L_0x12ff:
        r4 = 4001; // 0xfa1 float:5.607E-42 double:1.977E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x1a1b;
    L_0x1305:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r7 = r7 + r8;
        defpackage.dy.ap = r7;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = r7 * r8;
        r7 = r7 + -1;
        r4 = r4 - r5;
        r6[r7] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x1339:
        r4 = 3308; // 0xcec float:4.635E-42 double:1.6344E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x1382;
    L_0x133f:
        r4 = defpackage.lw.hn;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -2005147175; // 0xffffffff887be1d9 float:-7.5798048E-34 double:NaN;
        r4 = r4 * r5;
        r5 = defpackage.cx.hb;	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.br;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1948391561; // 0x74221889 float:5.137022E31 double:9.62633335E-315;
        r5 = r5 * r6;
        r5 = r5 >> 7;
        r6 = -357869149; // 0xffffffffeaab59a3 float:-1.0357481E26 double:NaN;
        r7 = defpackage.fz.du;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r5 = r5 + r6;
        r6 = 1195683827; // 0x4744aff3 float:50351.95 double:5.90746302E-315;
        r7 = defpackage.fm.dn;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r7 = defpackage.cx.hb;	 Catch:{ RuntimeException -> 0x003e }
        r7 = r7.bb;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -1461980333; // 0xffffffffa8dbf353 float:-2.441941E-14 double:NaN;
        r7 = r7 * r8;
        r7 = r7 >> 7;
        r6 = r6 + r7;
        r7 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r8 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r9 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r8 = r8 + r9;
        defpackage.dy.ap = r8;	 Catch:{ RuntimeException -> 0x003e }
        r9 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r8 = r8 * r9;
        r8 = r8 + -1;
        r4 = r4 << 28;
        r5 = r5 << 14;
        r4 = r4 + r5;
        r4 = r4 + r6;
        r7[r8] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x1382:
        r4 = 3309; // 0xced float:4.637E-42 double:1.635E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x13b1;
    L_0x1388:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r4 = r4 >> 14;
        r4 = r4 & 16383;
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x13b1:
        r4 = 3310; // 0xcee float:4.638E-42 double:1.6354E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x1438;
    L_0x13b7:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r4 = r4 >> 28;
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x13de:
        r4 = 4000; // 0xfa0 float:5.605E-42 double:1.9763E-320;
        r0 = r20;
        if (r0 >= r4) goto L_0x199f;
    L_0x13e4:
        r4 = 29;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r4 = defpackage.bp.au(r0, r1, r2, r4);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0063;
    L_0x13f2:
        r4 = 3315; // 0xcf3 float:4.645E-42 double:1.638E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x1691;
    L_0x13f8:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r4 = r4 + r5;
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r6 = r6 + 1;
        r7 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r8 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r9 = r5 + -1;
        r5 = defpackage.gm.aj;	 Catch:{ RuntimeException -> 0x003e }
        r10 = (long) r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r5.aj(r10);	 Catch:{ RuntimeException -> 0x003e }
        r4 = (defpackage.gm) r4;	 Catch:{ RuntimeException -> 0x003e }
        if (r4 != 0) goto L_0x012a;
    L_0x1435:
        r5 = 0;
        goto L_0x012e;
    L_0x1438:
        r4 = 3311; // 0xcef float:4.64E-42 double:1.636E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x116b;
    L_0x143e:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r4 = r4 & 16383;
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x1465:
        r8 = defpackage.ix.ht;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r6.startsWith(r8);	 Catch:{ RuntimeException -> 0x003e }
        if (r8 == 0) goto L_0x0ce6;
    L_0x146d:
        r4 = 5;
        r6 = defpackage.ix.ht;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r4;
        goto L_0x018c;
    L_0x147b:
        r4 = 0;
        goto L_0x1186;
    L_0x147e:
        r4 = 3313; // 0xcf1 float:4.643E-42 double:1.637E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x110b;
    L_0x1484:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4 + r5;
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r7 = r7 + r8;
        defpackage.dy.ap = r7;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = r7 * r8;
        r7 = r7 + -1;
        r8 = 2056853318; // 0x7a991746 float:3.9744673E35 double:1.016220563E-314;
        r4 = defpackage.az.aj(r4, r5, r8);	 Catch:{ RuntimeException -> 0x003e }
        r6[r7] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x14c2:
        r4 = 5531; // 0x159b float:7.75E-42 double:2.7327E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x2824;
    L_0x14c8:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 879447041; // 0x346b4c01 float:2.191373E-7 double:4.345045703E-315;
        r7 = defpackage.client.fg;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x14e3:
        r4 = 6521; // 0x1979 float:9.138E-42 double:3.222E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x2990;
    L_0x14e9:
        r4 = defpackage.client.ac;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -1006162543; // 0xffffffffc4072d91 float:-540.712 double:NaN;
        r4.th(r5);	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x14f4:
        r6 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r8 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r7 = r7 + r8;
        defpackage.di.ah = r7;	 Catch:{ RuntimeException -> 0x003e }
        r8 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r7 = r7 * r8;
        r7 = r7 + -1;
        r4 = r4.dv;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r6[r7] = r4;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x09fc;
    L_0x150c:
        r4 = r4.an;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0ee7;
    L_0x1512:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 0;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
    L_0x1525:
        r4 = 1;
        goto L_0x0063;
    L_0x1528:
        r8 = defpackage.ix.hy;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r6.startsWith(r8);	 Catch:{ RuntimeException -> 0x003e }
        if (r8 == 0) goto L_0x248a;
    L_0x1530:
        r4 = 8;
        r6 = defpackage.ix.hy;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r4;
        goto L_0x018c;
    L_0x153f:
        r4 = 6515; // 0x1973 float:9.13E-42 double:3.219E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x24a1;
    L_0x1545:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = -153270361; // 0xfffffffff6dd47a7 float:-2.2440447E33 double:NaN;
        r6 = defpackage.bb.ac(r5, r6);	 Catch:{ RuntimeException -> 0x003e }
        r7 = -1462233129; // 0xffffffffa8d817d7 float:-2.3991156E-14 double:NaN;
        r7 = r6.aa(r7);	 Catch:{ RuntimeException -> 0x003e }
        if (r7 == 0) goto L_0x294a;
    L_0x1573:
        r7 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r8 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r9 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r8 = r8 + r9;
        defpackage.di.ah = r8;	 Catch:{ RuntimeException -> 0x003e }
        r9 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r8 = r8 * r9;
        r8 = r8 + -1;
        r9 = 11791; // 0x2e0f float:1.6523E-41 double:5.8255E-320;
        r4 = defpackage.al.ac(r4, r9);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.ao;	 Catch:{ RuntimeException -> 0x003e }
        r9 = 63;
        r4 = r4.af(r5, r6, r9);	 Catch:{ RuntimeException -> 0x003e }
        r7[r8] = r4;	 Catch:{ RuntimeException -> 0x003e }
    L_0x1593:
        r4 = 1;
        goto L_0x0063;
    L_0x1596:
        r4 = 4006; // 0xfa6 float:5.614E-42 double:1.979E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x0133;
    L_0x159c:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -2009624835; // 0xffffffff88378efd float:-5.523764E-34 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r8 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = r7 * r8;
        r7 = r7 + 2;
        r6 = r6[r7];	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r8 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r9 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r8 = r8 * r9;
        r8 = r8 + 3;
        r7 = r7[r8];	 Catch:{ RuntimeException -> 0x003e }
        r8 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r9 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r10 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r9 = r9 * r10;
        r9 = r9 + 4;
        r8 = r8[r9];	 Catch:{ RuntimeException -> 0x003e }
        r9 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r10 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r11 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r10 = r10 + r11;
        defpackage.dy.ap = r10;	 Catch:{ RuntimeException -> 0x003e }
        r11 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r10 = r10 * r11;
        r10 = r10 + -1;
        r5 = r5 - r4;
        r8 = r8 - r6;
        r5 = r5 * r8;
        r6 = r7 - r6;
        r5 = r5 / r6;
        r4 = r4 + r5;
        r9[r10] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x15fa:
        r4 = 5009; // 0x1391 float:7.019E-42 double:2.475E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x2686;
    L_0x1600:
        r4 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r5 = 873608978; // 0x34123712 float:1.3617344E-7 double:4.31620184E-315;
        r4 = r4 - r5;
        defpackage.di.ah = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.mr.cg;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.client.dp;	 Catch:{ RuntimeException -> 0x003e }
        r7 = r7.ao;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -65;
        r11 = defpackage.hd.ac(r6, r7, r8);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r11.an;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 0;
        r8 = -550628907; // 0xffffffffdf2e11d5 float:-1.2543041E19 double:NaN;
        r6.aq(r7, r8);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r11.an;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.ac;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 489625177; // 0x1d2f1659 float:2.317261E-21 double:2.419069793E-315;
        r12 = r6 * r7;
        r6 = r11.an;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -1945522199; // 0xffffffff8c09afe9 float:-1.0607032E-31 double:NaN;
        r6.ai(r4, r7);	 Catch:{ RuntimeException -> 0x003e }
        r13 = r11.an;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 489625177; // 0x1d2f1659 float:2.317261E-21 double:2.419069793E-315;
        r6 = r13.ac;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4 * r6;
        r4 = -10;
        r5 = defpackage.dv.ac(r5, r4);	 Catch:{ RuntimeException -> 0x003e }
        r4 = r5.length;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1034458113; // 0x3da89401 float:0.082313545 double:5.110902157E-315;
        r13.ax(r4, r6);	 Catch:{ RuntimeException -> 0x003e }
        r14 = r13.ac;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.kv.aj;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 0;
        r7 = r5.length;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r13.aj;	 Catch:{ RuntimeException -> 0x003e }
        r9 = r13.ac;	 Catch:{ RuntimeException -> 0x003e }
        r10 = 489625177; // 0x1d2f1659 float:2.317261E-21 double:2.419069793E-315;
        r9 = r9 * r10;
        r10 = 120357231; // 0x72c816f float:1.2977879E-34 double:5.9464373E-316;
        r4 = r4.aj(r5, r6, r7, r8, r9, r10);	 Catch:{ RuntimeException -> 0x003e }
        r5 = -984165911; // 0xffffffffc556d1e9 float:-3437.1194 double:NaN;
        r4 = r4 * r5;
        r4 = r4 + r14;
        r13.ac = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r11.an;	 Catch:{ RuntimeException -> 0x003e }
        r5 = 489625177; // 0x1d2f1659 float:2.317261E-21 double:2.419069793E-315;
        r6 = r11.an;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.ac;	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5 * r6;
        r5 = r5 - r12;
        r6 = 225268372; // 0xd6d5294 float:7.3130663E-31 double:1.112973637E-315;
        r4.al(r5, r6);	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.client.dp;	 Catch:{ RuntimeException -> 0x003e }
        r5 = 1559705268; // 0x5cf736b4 float:5.56675728E17 double:7.705967906E-315;
        r4.an(r11, r5);	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x1691:
        r4 = 3316; // 0xcf4 float:4.647E-42 double:1.6383E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x16f9;
    L_0x1697:
        r4 = defpackage.client.ia;	 Catch:{ RuntimeException -> 0x003e }
        r5 = 240624837; // 0xe57a4c5 float:2.658013E-30 double:1.188844655E-315;
        r4 = r4 * r5;
        r5 = 2;
        if (r4 < r5) goto L_0x1512;
    L_0x16a0:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 240624837; // 0xe57a4c5 float:2.658013E-30 double:1.188844655E-315;
        r7 = defpackage.client.ia;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x1525;
    L_0x16ba:
        r4 = 4120; // 0x1018 float:5.773E-42 double:2.0356E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x17d3;
    L_0x16c0:
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 - r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 - r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r7 = r7 + r8;
        defpackage.dy.ap = r7;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = r7 * r8;
        r7 = r7 + -1;
        r4 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x003e }
        r6[r7] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x16f9:
        r4 = 3317; // 0xcf5 float:4.648E-42 double:1.639E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x171a;
    L_0x16ff:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 318569437; // 0x12fcfbdd float:1.5965525E-27 double:1.573942146E-315;
        r7 = defpackage.client.bh;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x171a:
        r4 = 3318; // 0xcf6 float:4.65E-42 double:1.6393E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x17b2;
    L_0x1720:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = defpackage.client.an;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 54729869; // 0x3431c8d float:5.7338124E-37 double:2.7040148E-316;
        r6 = r6 * r7;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x173b:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = -1;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 0;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 + r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = "";
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 0;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 0;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 + r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = "";
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
    L_0x17af:
        r4 = 1;
        goto L_0x0063;
    L_0x17b2:
        r4 = 3321; // 0xcf9 float:4.654E-42 double:1.641E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x1820;
    L_0x17b8:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = -1135501985; // 0xffffffffbc519d5f float:-0.012793868 double:NaN;
        r7 = defpackage.client.in;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x17d3:
        r4 = 4121; // 0x1019 float:5.775E-42 double:2.036E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x24fb;
    L_0x17d9:
        r4 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r5 = 873608978; // 0x34123712 float:1.3617344E-7 double:4.31620184E-315;
        r4 = r4 - r5;
        defpackage.di.ah = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r7 = r7 - r8;
        defpackage.dy.ap = r7;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = r7 * r8;
        r6 = r6[r7];	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r8 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r9 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r8 = r8 + r9;
        defpackage.dy.ap = r8;	 Catch:{ RuntimeException -> 0x003e }
        r9 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r8 = r8 * r9;
        r8 = r8 + -1;
        r4 = r4.indexOf(r5, r6);	 Catch:{ RuntimeException -> 0x003e }
        r7[r8] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x1820:
        r4 = 3322; // 0xcfa float:4.655E-42 double:1.6413E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x1858;
    L_0x1826:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = -1540354617; // 0xffffffffa4300dc7 float:-3.8175586E-17 double:NaN;
        r7 = defpackage.client.iw;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x1841:
        r8 = defpackage.ix.hd;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r6.startsWith(r8);	 Catch:{ RuntimeException -> 0x003e }
        if (r8 == 0) goto L_0x0a4a;
    L_0x1849:
        r4 = 10;
        r6 = defpackage.ix.hd;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r4;
        goto L_0x018c;
    L_0x1858:
        r4 = 3323; // 0xcfb float:4.657E-42 double:1.642E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x188c;
    L_0x185e:
        r4 = defpackage.client.ig;	 Catch:{ RuntimeException -> 0x003e }
        if (r4 == 0) goto L_0x1878;
    L_0x1862:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 1;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
    L_0x1875:
        r4 = 1;
        goto L_0x0063;
    L_0x1878:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 0;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x1875;
    L_0x188c:
        r4 = 3324; // 0xcfc float:4.658E-42 double:1.6423E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x0954;
    L_0x1892:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = defpackage.client.aq;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -827123157; // 0xffffffffceb31a2b float:-1.5024183E9 double:NaN;
        r6 = r6 * r7;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x18ad:
        r4 = 4103; // 0x1007 float:5.75E-42 double:2.027E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x1fbd;
    L_0x18b3:
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 - r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r6 = r6 + r7;
        defpackage.di.ah = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r4 = r4.toLowerCase();	 Catch:{ RuntimeException -> 0x003e }
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x18dc:
        r4 = 3500; // 0xdac float:4.905E-42 double:1.729E-320;
        r0 = r20;
        if (r0 >= r4) goto L_0x214e;
    L_0x18e2:
        r4 = 658225730; // 0x273bba42 float:2.6052434E-15 double:3.252067204E-315;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r4 = defpackage.ck.ax(r0, r1, r2, r4);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0063;
    L_0x18f1:
        r4 = 6511; // 0x196f float:9.124E-42 double:3.217E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x07c2;
    L_0x18f7:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        if (r4 < 0) goto L_0x173b;
    L_0x1909:
        r5 = defpackage.gh.aa;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 518175009; // 0x1ee2b921 float:2.4005248E-20 double:2.560124705E-315;
        r5 = r5 * r6;
        if (r4 >= r5) goto L_0x173b;
    L_0x1911:
        r5 = defpackage.gh.ao;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r5[r4];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = r4.ai;	 Catch:{ RuntimeException -> 0x003e }
        r8 = 1057964181; // 0x3f0f4095 float:0.5595792 double:5.227037564E-315;
        r7 = r7 * r8;
        r5[r6] = r7;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = r4.aw;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -687262573; // 0xffffffffd7093493 float:-1.50858898E14 double:NaN;
        r7 = r7 * r8;
        r5[r6] = r7;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r6 = r6 + r7;
        defpackage.di.ah = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = r4.as;	 Catch:{ RuntimeException -> 0x003e }
        r5[r6] = r7;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = r4.al;	 Catch:{ RuntimeException -> 0x003e }
        r8 = 700245205; // 0x29bce4d5 float:8.388573E-14 double:3.459670995E-315;
        r7 = r7 * r8;
        r5[r6] = r7;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = r4.am;	 Catch:{ RuntimeException -> 0x003e }
        r8 = 794816761; // 0x2f5ff0f9 float:2.0367343E-10 double:3.926916563E-315;
        r7 = r7 * r8;
        r5[r6] = r7;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r6 = r6 + r7;
        defpackage.di.ah = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r4 = r4.ae;	 Catch:{ RuntimeException -> 0x003e }
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x17af;
    L_0x199f:
        r4 = 4100; // 0x1004 float:5.745E-42 double:2.0257E-320;
        r0 = r20;
        if (r0 >= r4) goto L_0x1eff;
    L_0x19a5:
        r4 = 4000; // 0xfa0 float:5.605E-42 double:1.9763E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x12ff;
    L_0x19ab:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r7 = r7 + r8;
        defpackage.dy.ap = r7;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = r7 * r8;
        r7 = r7 + -1;
        r4 = r4 + r5;
        r6[r7] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x19df:
        r4 = 4013; // 0xfad float:5.623E-42 double:1.9827E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x1e2d;
    L_0x19e5:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        if (r4 != 0) goto L_0x1dc1;
    L_0x1a05:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 0;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x1a1b:
        r4 = 4002; // 0xfa2 float:5.608E-42 double:1.9773E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x0aeb;
    L_0x1a21:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r7 = r7 + r8;
        defpackage.dy.ap = r7;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = r7 * r8;
        r7 = r7 + -1;
        r4 = r4 * r5;
        r6[r7] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x1a55:
        r4 = 4009; // 0xfa9 float:5.618E-42 double:1.9807E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x08c9;
    L_0x1a5b:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r7 = r7 + r8;
        defpackage.dy.ap = r7;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = r7 * r8;
        r7 = r7 + -1;
        r8 = 1;
        r5 = r8 << r5;
        r5 = -1 - r5;
        r4 = r4 & r5;
        r6[r7] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x1a94:
        r4 = 6700; // 0x1a2c float:9.389E-42 double:3.31E-320;
        r0 = r20;
        if (r0 >= r4) goto L_0x09ff;
    L_0x1a9a:
        r4 = 496001839; // 0x1d90632f float:3.8219036E-21 double:2.45057469E-315;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r4 = defpackage.bi.ar(r0, r1, r2, r4);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0063;
    L_0x1aa9:
        r4 = 4115; // 0x1013 float:5.766E-42 double:2.033E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x2077;
    L_0x1aaf:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r4 = (char) r4;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -1775170451; // 0xffffffff96310c6d float:-1.4301867E-25 double:NaN;
        r4 = defpackage.fj.aa(r4, r7);	 Catch:{ RuntimeException -> 0x003e }
        if (r4 == 0) goto L_0x23a1;
    L_0x1ad9:
        r4 = 1;
    L_0x1ada:
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x1adf:
        r4 = r4 + 1;
    L_0x1ae1:
        if (r4 >= r5) goto L_0x2907;
    L_0x1ae3:
        r6 = r12.charAt(r4);	 Catch:{ RuntimeException -> 0x003e }
        r7 = r13.charAt(r4);	 Catch:{ RuntimeException -> 0x003e }
        if (r6 == r7) goto L_0x1adf;
    L_0x1aed:
        r4 = 55;
        r4 = defpackage.fe.an(r6, r14, r4);	 Catch:{ RuntimeException -> 0x003e }
        r5 = 32;
        r5 = defpackage.fe.an(r7, r14, r5);	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4 - r5;
        goto L_0x005d;
    L_0x1afc:
        r4 = 4011; // 0xfab float:5.62E-42 double:1.9817E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x1c48;
    L_0x1b02:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r7 = r7 + r8;
        defpackage.dy.ap = r7;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = r7 * r8;
        r7 = r7 + -1;
        r4 = r4 % r5;
        r6[r7] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x1b36:
        r4 = 4004; // 0xfa4 float:5.611E-42 double:1.978E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x0f2c;
    L_0x1b3c:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r8 = java.lang.Math.random();	 Catch:{ RuntimeException -> 0x003e }
        r10 = (double) r4;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r8 * r10;
        r4 = (int) r8;	 Catch:{ RuntimeException -> 0x003e }
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x1b68:
        r4 = 5600; // 0x15e0 float:7.847E-42 double:2.767E-320;
        r0 = r20;
        if (r0 >= r4) goto L_0x22c5;
    L_0x1b6e:
        r4 = 5504; // 0x1580 float:7.713E-42 double:2.7193E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x1e8a;
    L_0x1b74:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.client.mf;	 Catch:{ RuntimeException -> 0x003e }
        if (r6 != 0) goto L_0x1ba8;
    L_0x1b96:
        r6 = -1868788125; // 0xffffffff909c8e63 float:-6.175053E-29 double:NaN;
        r4 = r4 * r6;
        defpackage.client.fe = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 770940897; // 0x2df39fe1 float:2.7696902E-11 double:3.80895412E-315;
        r4 = r4 * r5;
        defpackage.client.fu = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 0;
        defpackage.client.fb = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 0;
        defpackage.client.fm = r4;	 Catch:{ RuntimeException -> 0x003e }
    L_0x1ba8:
        r4 = 1;
        goto L_0x0063;
    L_0x1bab:
        r9 = defpackage.client.ai;	 Catch:{ RuntimeException -> 0x003e }
        r10 = 1201256695; // 0x4799b8f7 float:78705.93 double:5.93499665E-315;
        r9 = r9 * r10;
        if (r9 == 0) goto L_0x01a4;
    L_0x1bb3:
        r9 = defpackage.ix.hu;	 Catch:{ RuntimeException -> 0x003e }
        r9 = r8.startsWith(r9);	 Catch:{ RuntimeException -> 0x003e }
        if (r9 == 0) goto L_0x270e;
    L_0x1bbb:
        r4 = 1;
        r8 = defpackage.ix.hu;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r8.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r8);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x01a4;
    L_0x1bc8:
        r4 = 2;
        goto L_0x0063;
    L_0x1bcb:
        r7 = r8 - r6;
        if (r7 < r15) goto L_0x1db8;
    L_0x1bcf:
        r4 = -1;
        goto L_0x005d;
    L_0x1bd2:
        r4 = 5002; // 0x138a float:7.009E-42 double:2.4713E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x1cdd;
    L_0x1bd8:
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 - r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = r7 * r8;
        r7 = r7 + 1;
        r6 = r6[r7];	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.mr.ay;	 Catch:{ RuntimeException -> 0x003e }
        r8 = defpackage.client.dp;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r8.ao;	 Catch:{ RuntimeException -> 0x003e }
        r9 = -32;
        r7 = defpackage.hd.ac(r7, r8, r9);	 Catch:{ RuntimeException -> 0x003e }
        r8 = r7.an;	 Catch:{ RuntimeException -> 0x003e }
        r9 = -302181868; // 0xffffffffedfd1214 float:-9.7901953E27 double:NaN;
        r9 = defpackage.cx.ah(r4, r9);	 Catch:{ RuntimeException -> 0x003e }
        r9 = r9 + 2;
        r10 = -47;
        r8.an(r9, r10);	 Catch:{ RuntimeException -> 0x003e }
        r8 = r7.an;	 Catch:{ RuntimeException -> 0x003e }
        r9 = -118982167; // 0xfffffffff8e879e9 float:-3.7721422E34 double:NaN;
        r8.ai(r4, r9);	 Catch:{ RuntimeException -> 0x003e }
        r4 = r7.an;	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5 + -1;
        r8 = -56;
        r4.an(r5, r8);	 Catch:{ RuntimeException -> 0x003e }
        r4 = r7.an;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -58;
        r4.an(r6, r5);	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.client.dp;	 Catch:{ RuntimeException -> 0x003e }
        r5 = 1907646262; // 0x71b45f36 float:1.786317E30 double:9.425024825E-315;
        r4.an(r7, r5);	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x1c45:
        r4 = 0;
        goto L_0x0904;
    L_0x1c48:
        r4 = 4012; // 0xfac float:5.622E-42 double:1.982E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x19df;
    L_0x1c4e:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        if (r4 != 0) goto L_0x2842;
    L_0x1c6e:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 0;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
    L_0x1c81:
        r4 = 1;
        goto L_0x0063;
    L_0x1c84:
        r4 = 6514; // 0x1972 float:9.128E-42 double:3.2183E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x153f;
    L_0x1c8a:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = -983755282; // 0xffffffffc55d15ee float:-3537.3706 double:NaN;
        r6 = defpackage.bb.ac(r5, r6);	 Catch:{ RuntimeException -> 0x003e }
        r7 = -785088131; // 0xffffffffd134817d float:-4.845416E10 double:NaN;
        r7 = r6.aa(r7);	 Catch:{ RuntimeException -> 0x003e }
        if (r7 == 0) goto L_0x2922;
    L_0x1cb8:
        r7 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r8 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r9 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r8 = r8 + r9;
        defpackage.di.ah = r8;	 Catch:{ RuntimeException -> 0x003e }
        r9 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r8 = r8 * r9;
        r8 = r8 + -1;
        r9 = -171006063; // 0xfffffffff5cea791 float:-5.2393154E32 double:NaN;
        r4 = defpackage.ey.ac(r4, r9);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.ao;	 Catch:{ RuntimeException -> 0x003e }
        r9 = 410657453; // 0x187a22ad float:3.232925E-24 double:2.028917397E-315;
        r4 = r4.ae(r5, r6, r9);	 Catch:{ RuntimeException -> 0x003e }
        r7[r8] = r4;	 Catch:{ RuntimeException -> 0x003e }
    L_0x1cda:
        r4 = 1;
        goto L_0x0063;
    L_0x1cdd:
        r4 = 5003; // 0x138b float:7.01E-42 double:2.472E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x03d1;
    L_0x1ce3:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = -18;
        r5 = defpackage.an.aq(r4, r5, r6);	 Catch:{ RuntimeException -> 0x003e }
        if (r5 == 0) goto L_0x0dcd;
    L_0x1d09:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = -894271997; // 0xffffffffcab27e03 float:-5848833.5 double:NaN;
        r8 = r5.aj;	 Catch:{ RuntimeException -> 0x003e }
        r7 = r7 * r8;
        r4[r6] = r7;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = 596728005; // 0x239158c5 float:1.5758527E-17 double:2.94822807E-315;
        r8 = r5.ac;	 Catch:{ RuntimeException -> 0x003e }
        r7 = r7 * r8;
        r4[r6] = r7;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r4 = r4 + r7;
        defpackage.di.ah = r4;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r4 = r4 * r7;
        r7 = r4 + -1;
        r4 = r5.aq;	 Catch:{ RuntimeException -> 0x003e }
        if (r4 == 0) goto L_0x2548;
    L_0x1d4d:
        r4 = r5.aq;	 Catch:{ RuntimeException -> 0x003e }
    L_0x1d4f:
        r6[r7] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r4 = r4 + r7;
        defpackage.di.ah = r4;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r4 = r4 * r7;
        r7 = r4 + -1;
        r4 = r5.ap;	 Catch:{ RuntimeException -> 0x003e }
        if (r4 == 0) goto L_0x254c;
    L_0x1d65:
        r4 = r5.ap;	 Catch:{ RuntimeException -> 0x003e }
    L_0x1d67:
        r6[r7] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r4 = r4 + r7;
        defpackage.di.ah = r4;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r4 = r4 * r7;
        r7 = r4 + -1;
        r4 = r5.at;	 Catch:{ RuntimeException -> 0x003e }
        if (r4 == 0) goto L_0x2550;
    L_0x1d7d:
        r4 = r5.at;	 Catch:{ RuntimeException -> 0x003e }
    L_0x1d7f:
        r6[r7] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r4 = r4 + r7;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r4 = r4 * r7;
        r7 = r4 + -1;
        r4 = 1822482187; // 0x6ca0df0b float:1.5558514E27 double:9.00425839E-315;
        r4 = r5.an(r4);	 Catch:{ RuntimeException -> 0x003e }
        if (r4 == 0) goto L_0x06e4;
    L_0x1d9a:
        r4 = 1;
        goto L_0x06ed;
    L_0x1d9d:
        r4 = r4.an;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0a69;
    L_0x1da3:
        r4 = 2400; // 0x960 float:3.363E-42 double:1.186E-320;
        r0 = r20;
        if (r0 >= r4) goto L_0x0bfe;
    L_0x1da9:
        r4 = -2024605590; // 0xffffffff8752f86a float:-1.5871646E-34 double:NaN;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r4 = defpackage.cj.ak(r0, r1, r2, r4);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0063;
    L_0x1db8:
        r7 = r5 - r4;
        r0 = r16;
        if (r7 < r0) goto L_0x03c9;
    L_0x1dbe:
        r4 = 1;
        goto L_0x005d;
    L_0x1dc1:
        switch(r5) {
            case 0: goto L_0x20ab;
            case 1: goto L_0x1dfd;
            case 2: goto L_0x28ed;
            case 3: goto L_0x1de4;
            case 4: goto L_0x1e10;
            default: goto L_0x1dc4;
        };	 Catch:{ RuntimeException -> 0x003e }
    L_0x1dc4:
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r7 = r7 + r8;
        defpackage.dy.ap = r7;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = r7 * r8;
        r7 = r7 + -1;
        r8 = (double) r4;	 Catch:{ RuntimeException -> 0x003e }
        r10 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r4 = (double) r5;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r10 / r4;
        r4 = java.lang.Math.pow(r8, r4);	 Catch:{ RuntimeException -> 0x003e }
        r4 = (int) r4;	 Catch:{ RuntimeException -> 0x003e }
        r6[r7] = r4;	 Catch:{ RuntimeException -> 0x003e }
    L_0x1de1:
        r4 = 1;
        goto L_0x0063;
    L_0x1de4:
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r8 = (double) r4;	 Catch:{ RuntimeException -> 0x003e }
        r8 = java.lang.Math.cbrt(r8);	 Catch:{ RuntimeException -> 0x003e }
        r4 = (int) r8;	 Catch:{ RuntimeException -> 0x003e }
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x1de1;
    L_0x1dfd:
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x1de1;
    L_0x1e10:
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r8 = (double) r4;	 Catch:{ RuntimeException -> 0x003e }
        r8 = java.lang.Math.sqrt(r8);	 Catch:{ RuntimeException -> 0x003e }
        r8 = java.lang.Math.sqrt(r8);	 Catch:{ RuntimeException -> 0x003e }
        r4 = (int) r8;	 Catch:{ RuntimeException -> 0x003e }
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x1de1;
    L_0x1e2d:
        r4 = 4014; // 0xfae float:5.625E-42 double:1.983E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x054c;
    L_0x1e33:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r7 = r7 + r8;
        defpackage.dy.ap = r7;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = r7 * r8;
        r7 = r7 + -1;
        r4 = r4 & r5;
        r6[r7] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x1e67:
        r4 = 5021; // 0x139d float:7.036E-42 double:2.4807E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x06c7;
    L_0x1e6d:
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 - r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4.toLowerCase();	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4.trim();	 Catch:{ RuntimeException -> 0x003e }
        defpackage.client.lm = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x1e8a:
        r4 = 5505; // 0x1581 float:7.714E-42 double:2.72E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x2554;
    L_0x1e90:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = -1203346613; // 0xffffffffb846634b float:-4.7299352E-5 double:NaN;
        r7 = defpackage.client.fe;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x1eab:
        r4 = 4102; // 0x1006 float:5.748E-42 double:2.0267E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x18ad;
    L_0x1eb1:
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 - r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 - r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r8 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r7 = r7 + r8;
        defpackage.di.ah = r7;	 Catch:{ RuntimeException -> 0x003e }
        r8 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r7 = r7 * r8;
        r7 = r7 + -1;
        r8 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x003e }
        r8.<init>();	 Catch:{ RuntimeException -> 0x003e }
        r4 = r8.append(r4);	 Catch:{ RuntimeException -> 0x003e }
        r8 = 1;
        r9 = -135833546; // 0xfffffffff7e75836 float:-9.384451E33 double:NaN;
        r5 = defpackage.fa.aq(r5, r8, r9);	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4.append(r5);	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4.toString();	 Catch:{ RuntimeException -> 0x003e }
        r6[r7] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x1eff:
        r4 = 4200; // 0x1068 float:5.885E-42 double:2.075E-320;
        r0 = r20;
        if (r0 >= r4) goto L_0x24fe;
    L_0x1f05:
        r4 = 4100; // 0x1004 float:5.745E-42 double:2.0257E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x1f51;
    L_0x1f0b:
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 - r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 - r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r8 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r7 = r7 + r8;
        defpackage.di.ah = r7;	 Catch:{ RuntimeException -> 0x003e }
        r8 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r7 = r7 * r8;
        r7 = r7 + -1;
        r8 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x003e }
        r8.<init>();	 Catch:{ RuntimeException -> 0x003e }
        r4 = r8.append(r4);	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4.append(r5);	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4.toString();	 Catch:{ RuntimeException -> 0x003e }
        r6[r7] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x1f51:
        r4 = 4101; // 0x1005 float:5.747E-42 double:2.026E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x1eab;
    L_0x1f57:
        r4 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r5 = 873608978; // 0x34123712 float:1.3617344E-7 double:4.31620184E-315;
        r4 = r4 - r5;
        defpackage.di.ah = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r6 = r6 * r7;
        r6 = r6 + 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r8 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r7 = r7 + r8;
        defpackage.di.ah = r7;	 Catch:{ RuntimeException -> 0x003e }
        r8 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r7 = r7 * r8;
        r7 = r7 + -1;
        r8 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x003e }
        r8.<init>();	 Catch:{ RuntimeException -> 0x003e }
        r4 = r8.append(r4);	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4.append(r5);	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4.toString();	 Catch:{ RuntimeException -> 0x003e }
        r6[r7] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x1f9b:
        r4 = 6518; // 0x1976 float:9.134E-42 double:3.2203E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x2517;
    L_0x1fa1:
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r4 = r4 + r6;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r4 = r4 * r6;
        r6 = r4 + -1;
        r4 = defpackage.client.ac;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4.al;	 Catch:{ RuntimeException -> 0x003e }
        if (r4 == 0) goto L_0x262c;
    L_0x1fb7:
        r4 = 1;
    L_0x1fb8:
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x1fbd:
        r4 = 4104; // 0x1008 float:5.751E-42 double:2.0276E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x10c4;
    L_0x1fc3:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r6 = 11745; // 0x2de1 float:1.6458E-41 double:5.803E-320;
        r4 = (long) r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4 + r6;
        r6 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r4 = r4 * r6;
        r6 = defpackage.gr.as;	 Catch:{ RuntimeException -> 0x003e }
        r7 = new java.util.Date;	 Catch:{ RuntimeException -> 0x003e }
        r7.<init>(r4);	 Catch:{ RuntimeException -> 0x003e }
        r6.setTime(r7);	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.as;	 Catch:{ RuntimeException -> 0x003e }
        r5 = 5;
        r4 = r4.get(r5);	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.as;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 2;
        r5 = r5.get(r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.as;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1;
        r6 = r6.get(r7);	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r8 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r9 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r8 = r8 + r9;
        defpackage.di.ah = r8;	 Catch:{ RuntimeException -> 0x003e }
        r9 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r8 = r8 * r9;
        r8 = r8 + -1;
        r9 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x003e }
        r9.<init>();	 Catch:{ RuntimeException -> 0x003e }
        r4 = r9.append(r4);	 Catch:{ RuntimeException -> 0x003e }
        r9 = "-";
        r4 = r4.append(r9);	 Catch:{ RuntimeException -> 0x003e }
        r9 = defpackage.gr.al;	 Catch:{ RuntimeException -> 0x003e }
        r5 = r9[r5];	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4.append(r5);	 Catch:{ RuntimeException -> 0x003e }
        r5 = "-";
        r4 = r4.append(r5);	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4.append(r6);	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4.toString();	 Catch:{ RuntimeException -> 0x003e }
        r7[r8] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x2034:
        r5 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r6 = r6 + r7;
        defpackage.di.ah = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x1108;
    L_0x2048:
        r4 = 4106; // 0x100a float:5.754E-42 double:2.0286E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x0d1b;
    L_0x204e:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r6 = r6 + r7;
        defpackage.di.ah = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r4 = java.lang.Integer.toString(r4);	 Catch:{ RuntimeException -> 0x003e }
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x2077:
        r4 = 4116; // 0x1014 float:5.768E-42 double:2.0336E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x06f6;
    L_0x207d:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r4 = (char) r4;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 0;
        r4 = defpackage.kd.ak(r4, r7);	 Catch:{ RuntimeException -> 0x003e }
        if (r4 == 0) goto L_0x23a4;
    L_0x20a5:
        r4 = 1;
    L_0x20a6:
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x20ab:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x1de1;
    L_0x20c2:
        r4 = 5001; // 0x1389 float:7.008E-42 double:2.471E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x1bd2;
    L_0x20c8:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -1205774901; // 0xffffffffb82155cb float:-3.8465292E-5 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1903968101; // 0x717c3f65 float:1.2490698E30 double:9.406852295E-315;
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4 * r5;
        defpackage.client.lq = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5 * r6;
        r5 = r5 + 1;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = 1506757305; // 0x59cf4ab9 float:7.2934348E15 double:7.44437021E-315;
        r4 = defpackage.cu.ac(r4, r5);	 Catch:{ RuntimeException -> 0x003e }
        defpackage.et.ld = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.et.ld;	 Catch:{ RuntimeException -> 0x003e }
        if (r4 != 0) goto L_0x20fd;
    L_0x20f9:
        r4 = defpackage.np.ac;	 Catch:{ RuntimeException -> 0x003e }
        defpackage.et.ld = r4;	 Catch:{ RuntimeException -> 0x003e }
    L_0x20fd:
        r4 = -884650329; // 0xffffffffcb454ea7 float:-1.2930727E7 double:NaN;
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + 2;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4 * r5;
        defpackage.client.la = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.mr.am;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.client.dp;	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.ao;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r4 = defpackage.hd.ac(r4, r5, r6);	 Catch:{ RuntimeException -> 0x003e }
        r5 = r4.an;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 509205101; // 0x1e59da6d float:1.1533054E-20 double:2.51580747E-315;
        r7 = defpackage.client.lq;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r7 = -127; // 0xffffffffffffff81 float:NaN double:NaN;
        r5.an(r6, r7);	 Catch:{ RuntimeException -> 0x003e }
        r5 = r4.an;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1536608241; // 0x5b96c7f1 float:8.4882169E16 double:7.59185343E-315;
        r7 = defpackage.et.ld;	 Catch:{ RuntimeException -> 0x003e }
        r7 = r7.aq;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r7 = -35;
        r5.an(r6, r7);	 Catch:{ RuntimeException -> 0x003e }
        r5 = r4.an;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.client.la;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -725649129; // 0xffffffffd4bf7917 float:-6.5789624E12 double:NaN;
        r6 = r6 * r7;
        r7 = -5;
        r5.an(r6, r7);	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.client.dp;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1434403158; // 0x557f4156 float:1.7541005E13 double:7.086893227E-315;
        r5.an(r4, r6);	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x214e:
        r4 = 3700; // 0xe74 float:5.185E-42 double:1.828E-320;
        r0 = r20;
        if (r0 >= r4) goto L_0x13de;
    L_0x2154:
        r4 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r4 = defpackage.ai.af(r0, r1, r2, r4);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0063;
    L_0x2163:
        r6 = r5 + 1;
        r4 = r13.charAt(r5);	 Catch:{ RuntimeException -> 0x003e }
        r5 = r6;
        goto L_0x0255;
    L_0x216c:
        r9 = 62;
        if (r9 != r8) goto L_0x246a;
    L_0x2170:
        r4 = 0;
        goto L_0x0099;
    L_0x2173:
        r4 = r6;
        r6 = r9;
        goto L_0x0d62;
    L_0x2177:
        r4 = r4 + 1;
        goto L_0x0d71;
    L_0x217b:
        r8 = defpackage.ix.he;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r6.startsWith(r8);	 Catch:{ RuntimeException -> 0x003e }
        if (r8 == 0) goto L_0x21a7;
    L_0x2183:
        r4 = 5;
        r6 = defpackage.ix.he;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r4;
        goto L_0x018c;
    L_0x2191:
        r8 = defpackage.ix.gy;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r6.startsWith(r8);	 Catch:{ RuntimeException -> 0x003e }
        if (r8 == 0) goto L_0x02e8;
    L_0x2199:
        r4 = 2;
        r6 = defpackage.ix.gy;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r4;
        goto L_0x018c;
    L_0x21a7:
        r8 = defpackage.ix.hn;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r6.startsWith(r8);	 Catch:{ RuntimeException -> 0x003e }
        if (r8 == 0) goto L_0x0be8;
    L_0x21af:
        r4 = 6;
        r6 = defpackage.ix.hn;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r4;
        goto L_0x018c;
    L_0x21bd:
        r4 = 5100; // 0x13ec float:7.147E-42 double:2.5197E-320;
        r0 = r20;
        if (r0 >= r4) goto L_0x27ed;
    L_0x21c3:
        r4 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x20c2;
    L_0x21c9:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 509205101; // 0x1e59da6d float:1.1533054E-20 double:2.51580747E-315;
        r7 = defpackage.client.lq;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x21e4:
        r4 = 0;
        goto L_0x0060;
    L_0x21e7:
        r8 = defpackage.ix.ha;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r6.startsWith(r8);	 Catch:{ RuntimeException -> 0x003e }
        if (r8 == 0) goto L_0x265b;
    L_0x21ef:
        r4 = 3;
        r6 = defpackage.ix.ha;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r4;
        goto L_0x018c;
    L_0x21fd:
        r4 = 4109; // 0x100d float:5.758E-42 double:2.03E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x0489;
    L_0x2203:
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 - r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r8 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = r7 * r8;
        r7 = r7 + 1;
        r6 = r6[r7];	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.bx.ca;	 Catch:{ RuntimeException -> 0x003e }
        r8 = 0;
        r9 = -1541550537; // 0xffffffffa41dce37 float:-3.421862E-17 double:NaN;
        r6 = r7.an(r6, r8, r9);	 Catch:{ RuntimeException -> 0x003e }
        r7 = new kh;	 Catch:{ RuntimeException -> 0x003e }
        r7.<init>(r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r8 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r9 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r8 = r8 + r9;
        defpackage.dy.ap = r8;	 Catch:{ RuntimeException -> 0x003e }
        r9 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r8 = r8 * r9;
        r8 = r8 + -1;
        r4 = r7.aa(r4, r5);	 Catch:{ RuntimeException -> 0x003e }
        r6[r8] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x2259:
        r4 = 0;
        goto L_0x1ae1;
    L_0x225c:
        r7 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r8 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r9 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r8 = r8 + r9;
        defpackage.dy.ap = r8;	 Catch:{ RuntimeException -> 0x003e }
        r9 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r8 = r8 * r9;
        r8 = r8 + -1;
        r9 = 46;
        r4 = defpackage.ag.aj(r4, r9);	 Catch:{ RuntimeException -> 0x003e }
        r9 = -1702464013; // 0xffffffff9a8675f3 float:-5.561166E-23 double:NaN;
        r6 = r6.aq;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r9;
        r9 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r4 = r4.at(r5, r6, r9);	 Catch:{ RuntimeException -> 0x003e }
        r7[r8] = r4;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0603;
    L_0x2282:
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r6 = r6 + r7;
        defpackage.di.ah = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r4[r6] = r5;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x04d2;
    L_0x2296:
        r4 = 4111; // 0x100f float:5.761E-42 double:2.031E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x07e7;
    L_0x229c:
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 - r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r6 = r6 + r7;
        defpackage.di.ah = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r4 = defpackage.kh.ap(r4);	 Catch:{ RuntimeException -> 0x003e }
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x22c5:
        r4 = 5700; // 0x1644 float:7.987E-42 double:2.816E-320;
        r0 = r20;
        if (r0 >= r4) goto L_0x282a;
    L_0x22cb:
        r4 = 5630; // 0x15fe float:7.89E-42 double:2.7816E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x2827;
    L_0x22d1:
        r4 = 2098855890; // 0x7d19ffd2 float:1.2793761E37 double:1.036972591E-314;
        defpackage.client.dd = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x22d9:
        r4 = 4113; // 0x1011 float:5.764E-42 double:2.032E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x0a02;
    L_0x22df:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r4 = (char) r4;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 32;
        if (r4 < r7) goto L_0x230b;
    L_0x2304:
        r7 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        if (r4 > r7) goto L_0x230b;
    L_0x2308:
        r4 = 1;
        goto L_0x0e59;
    L_0x230b:
        r7 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        if (r4 < r7) goto L_0x0e44;
    L_0x230f:
        r7 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r4 > r7) goto L_0x0e44;
    L_0x2313:
        r4 = 1;
        goto L_0x0e59;
    L_0x2316:
        if (r4 >= 0) goto L_0x21e4;
    L_0x2318:
        r4 = -1;
        goto L_0x0060;
    L_0x231b:
        r4 = 0;
        goto L_0x0e59;
    L_0x231e:
        r4 = 0;
        goto L_0x0e5c;
    L_0x2321:
        r4 = 0;
        goto L_0x0a42;
    L_0x2324:
        r4 = 2;
        goto L_0x0063;
    L_0x2327:
        r4 = 0;
        goto L_0x0a45;
    L_0x232a:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = -1;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 0;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 + r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = "";
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 + r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = "";
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 + r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = "";
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 0;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0486;
    L_0x23a1:
        r4 = 0;
        goto L_0x1ada;
    L_0x23a4:
        r4 = 0;
        goto L_0x20a6;
    L_0x23a7:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 0;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0724;
    L_0x23bc:
        r9 = defpackage.ix.hh;	 Catch:{ RuntimeException -> 0x003e }
        r9 = r8.startsWith(r9);	 Catch:{ RuntimeException -> 0x003e }
        if (r9 == 0) goto L_0x26f9;
    L_0x23c4:
        r4 = 4;
        r8 = defpackage.ix.hh;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r8.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r8);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x01a4;
    L_0x23d1:
        r4 = 4118; // 0x1016 float:5.77E-42 double:2.0346E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x0064;
    L_0x23d7:
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 - r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r8 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = r7 * r8;
        r7 = r7 + 1;
        r6 = r6[r7];	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r8 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r9 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r8 = r8 + r9;
        defpackage.di.ah = r8;	 Catch:{ RuntimeException -> 0x003e }
        r9 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r8 = r8 * r9;
        r8 = r8 + -1;
        r4 = r4.substring(r5, r6);	 Catch:{ RuntimeException -> 0x003e }
        r7[r8] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x241e:
        r4 = 0;
        goto L_0x1024;
    L_0x2421:
        r4 = 6502; // 0x1966 float:9.111E-42 double:3.2124E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x285d;
    L_0x2427:
        r4 = defpackage.gh.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = 1963634435; // 0x750aaf03 float:1.758024E32 double:9.701643153E-315;
        r4 = r4 * r5;
        r5 = defpackage.gh.aa;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 518175009; // 0x1ee2b921 float:2.4005248E-20 double:2.560124705E-315;
        r5 = r5 * r6;
        if (r4 >= r5) goto L_0x009c;
    L_0x2435:
        r4 = defpackage.gh.ao;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gh.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -517295189; // 0xffffffffe12ab3ab float:-1.968058E20 double:NaN;
        r5 = r5 + r6;
        defpackage.gh.ak = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1963634435; // 0x750aaf03 float:1.758024E32 double:9.701643153E-315;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x009d;
    L_0x2449:
        r4 = 5016; // 0x1398 float:7.029E-42 double:2.478E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x051a;
    L_0x244f:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = -725649129; // 0xffffffffd4bf7917 float:-6.5789624E12 double:NaN;
        r7 = defpackage.client.la;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x246a:
        if (r4 != 0) goto L_0x0099;
    L_0x246c:
        r7.append(r8);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0099;
    L_0x2471:
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 + r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = r7.toString();	 Catch:{ RuntimeException -> 0x003e }
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x248a:
        r8 = defpackage.ix.hp;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r6.startsWith(r8);	 Catch:{ RuntimeException -> 0x003e }
        if (r8 == 0) goto L_0x26b6;
    L_0x2492:
        r4 = 9;
        r6 = defpackage.ix.hp;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r4;
        goto L_0x018c;
    L_0x24a1:
        r4 = 6516; // 0x1974 float:9.131E-42 double:3.2193E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x1f9b;
    L_0x24a7:
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -803849934; // 0xffffffffd0163932 float:-1.0081323E10 double:NaN;
        r4 = r4 - r5;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + 1;
        r6 = r4[r6];	 Catch:{ RuntimeException -> 0x003e }
        r4 = -1476425958; // 0xffffffffa7ff871a float:-7.0923195E-15 double:NaN;
        r7 = defpackage.bb.ac(r6, r4);	 Catch:{ RuntimeException -> 0x003e }
        r4 = -1318549858; // 0xffffffffb168869e float:-3.3836964E-9 double:NaN;
        r4 = r7.aa(r4);	 Catch:{ RuntimeException -> 0x003e }
        if (r4 == 0) goto L_0x296f;
    L_0x24d5:
        r8 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r9 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r4 = r4 + r9;
        defpackage.di.ah = r4;	 Catch:{ RuntimeException -> 0x003e }
        r9 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r4 = r4 * r9;
        r9 = r4 + -1;
        r4 = defpackage.aj.ac;	 Catch:{ RuntimeException -> 0x003e }
        r10 = (long) r5;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4.aj(r10);	 Catch:{ RuntimeException -> 0x003e }
        r4 = (defpackage.aj) r4;	 Catch:{ RuntimeException -> 0x003e }
        if (r4 == 0) goto L_0x27bf;
    L_0x24f0:
        r5 = r7.ao;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1;
        r4 = r4.ao(r6, r5, r7);	 Catch:{ RuntimeException -> 0x003e }
        r8[r9] = r4;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0c8a;
    L_0x24fb:
        r4 = 2;
        goto L_0x0063;
    L_0x24fe:
        r4 = 4300; // 0x10cc float:6.026E-42 double:2.1245E-320;
        r0 = r20;
        if (r0 >= r4) goto L_0x21bd;
    L_0x2504:
        r4 = 479611865; // 0x1c964bd9 float:9.945774E-22 double:2.36959746E-315;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r4 = defpackage.go.av(r0, r1, r2, r4);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0063;
    L_0x2513:
        defpackage.ef.am = r4;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x075d;
    L_0x2517:
        r4 = 6520; // 0x1978 float:9.136E-42 double:3.2213E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x14e3;
    L_0x251d:
        r4 = defpackage.client.ac;	 Catch:{ RuntimeException -> 0x003e }
        r5 = 1708093888; // 0x65cf71c0 float:1.2245352E23 double:8.4391051E-315;
        r4.tt(r5);	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x2528:
        r7 = 8;
        r4 = r4.aa(r7);	 Catch:{ RuntimeException -> 0x003e }
        if (r4 == 0) goto L_0x2581;
    L_0x2530:
        r4 = 2;
        goto L_0x0484;
    L_0x2533:
        r4 = 1700; // 0x6a4 float:2.382E-42 double:8.4E-321;
        r0 = r20;
        if (r0 >= r4) goto L_0x0909;
    L_0x2539:
        r4 = -85675572; // 0xfffffffffae4b1cc float:-5.937249E35 double:NaN;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r4 = defpackage.ah.ah(r0, r1, r2, r4);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0063;
    L_0x2548:
        r4 = "";
        goto L_0x1d4f;
    L_0x254c:
        r4 = "";
        goto L_0x1d67;
    L_0x2550:
        r4 = "";
        goto L_0x1d7f;
    L_0x2554:
        r4 = 5506; // 0x1582 float:7.716E-42 double:2.7203E-320;
        r0 = r20;
        if (r0 != r4) goto L_0x2802;
    L_0x255a:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = -1883970527; // 0xffffffff8fb4e421 float:-1.7837242E-29 double:NaN;
        r7 = defpackage.client.fu;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x2575:
        r5 = "";
        goto L_0x0438;
    L_0x2579:
        r5 = "";
        goto L_0x0450;
    L_0x257d:
        r5 = "";
        goto L_0x0468;
    L_0x2581:
        r4 = 0;
        goto L_0x0484;
    L_0x2584:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 1536608241; // 0x5b96c7f1 float:8.4882169E16 double:7.59185343E-315;
        r7 = defpackage.et.ld;	 Catch:{ RuntimeException -> 0x003e }
        r7 = r7.aq;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r7;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x07bf;
    L_0x25a0:
        r8 = defpackage.ix.gq;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r6.startsWith(r8);	 Catch:{ RuntimeException -> 0x003e }
        if (r8 == 0) goto L_0x2191;
    L_0x25a8:
        r4 = 1;
        r6 = defpackage.ix.gq;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r4;
        goto L_0x018c;
    L_0x25b6:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = -1;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 0;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 + r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = "";
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 0;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 0;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 + r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = "";
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0127;
    L_0x262c:
        r4 = 0;
        goto L_0x1fb8;
    L_0x262f:
        r8 = defpackage.ix.gf;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r6.startsWith(r8);	 Catch:{ RuntimeException -> 0x003e }
        if (r8 == 0) goto L_0x2645;
    L_0x2637:
        r4 = 1;
        r6 = defpackage.ix.gf;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r4;
        goto L_0x018c;
    L_0x2645:
        r8 = defpackage.ix.gs;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r6.startsWith(r8);	 Catch:{ RuntimeException -> 0x003e }
        if (r8 == 0) goto L_0x21e7;
    L_0x264d:
        r4 = 2;
        r6 = defpackage.ix.gs;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r4;
        goto L_0x018c;
    L_0x265b:
        r8 = defpackage.ix.hk;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r6.startsWith(r8);	 Catch:{ RuntimeException -> 0x003e }
        if (r8 == 0) goto L_0x217b;
    L_0x2663:
        r4 = 4;
        r6 = defpackage.ix.hk;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r4;
        goto L_0x018c;
    L_0x2671:
        r9 = defpackage.ix.hs;	 Catch:{ RuntimeException -> 0x003e }
        r9 = r8.startsWith(r9);	 Catch:{ RuntimeException -> 0x003e }
        if (r9 == 0) goto L_0x23bc;
    L_0x2679:
        r4 = 3;
        r8 = defpackage.ix.hs;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r8.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r8);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x01a4;
    L_0x2686:
        r4 = 5015; // 0x1397 float:7.028E-42 double:2.4777E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x2449;
    L_0x268c:
        r4 = defpackage.cx.hb;	 Catch:{ RuntimeException -> 0x003e }
        if (r4 == 0) goto L_0x276c;
    L_0x2690:
        r4 = defpackage.cx.hb;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4.aj;	 Catch:{ RuntimeException -> 0x003e }
        if (r4 == 0) goto L_0x276c;
    L_0x2696:
        r4 = defpackage.cx.hb;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4.aj;	 Catch:{ RuntimeException -> 0x003e }
        r5 = -446018289; // 0xffffffffe56a4d0f float:-6.9153452E22 double:NaN;
        r4 = r4.aj(r5);	 Catch:{ RuntimeException -> 0x003e }
    L_0x26a1:
        r5 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r6 = r6 + r7;
        defpackage.di.ah = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x26b6:
        r8 = defpackage.ix.hq;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r6.startsWith(r8);	 Catch:{ RuntimeException -> 0x003e }
        if (r8 == 0) goto L_0x26cd;
    L_0x26be:
        r4 = 10;
        r6 = defpackage.ix.hq;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r4;
        goto L_0x018c;
    L_0x26cd:
        r8 = defpackage.ix.hw;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.startsWith(r8);	 Catch:{ RuntimeException -> 0x003e }
        if (r6 == 0) goto L_0x2993;
    L_0x26d5:
        r4 = 11;
        r6 = defpackage.ix.hw;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r6);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r4;
        goto L_0x018c;
    L_0x26e4:
        r9 = defpackage.ix.hf;	 Catch:{ RuntimeException -> 0x003e }
        r9 = r8.startsWith(r9);	 Catch:{ RuntimeException -> 0x003e }
        if (r9 == 0) goto L_0x2671;
    L_0x26ec:
        r4 = 2;
        r8 = defpackage.ix.hf;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r8.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r8);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x01a4;
    L_0x26f9:
        r9 = defpackage.ix.hg;	 Catch:{ RuntimeException -> 0x003e }
        r9 = r8.startsWith(r9);	 Catch:{ RuntimeException -> 0x003e }
        if (r9 == 0) goto L_0x1bab;
    L_0x2701:
        r4 = 5;
        r8 = defpackage.ix.hg;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r8.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r8);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x01a4;
    L_0x270e:
        r9 = defpackage.ix.hi;	 Catch:{ RuntimeException -> 0x003e }
        r9 = r8.startsWith(r9);	 Catch:{ RuntimeException -> 0x003e }
        if (r9 == 0) goto L_0x2723;
    L_0x2716:
        r4 = 2;
        r8 = defpackage.ix.hi;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r8.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r8);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x01a4;
    L_0x2723:
        r9 = defpackage.ix.hj;	 Catch:{ RuntimeException -> 0x003e }
        r9 = r8.startsWith(r9);	 Catch:{ RuntimeException -> 0x003e }
        if (r9 == 0) goto L_0x2738;
    L_0x272b:
        r4 = 3;
        r8 = defpackage.ix.hj;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r8.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r8);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x01a4;
    L_0x2738:
        r9 = defpackage.ix.ho;	 Catch:{ RuntimeException -> 0x003e }
        r9 = r8.startsWith(r9);	 Catch:{ RuntimeException -> 0x003e }
        if (r9 == 0) goto L_0x09ac;
    L_0x2740:
        r4 = 4;
        r8 = defpackage.ix.ho;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r8.length();	 Catch:{ RuntimeException -> 0x003e }
        r5 = r5.substring(r8);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x01a4;
    L_0x274d:
        r4 = 5020; // 0x139c float:7.035E-42 double:2.48E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x1e67;
    L_0x2753:
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 - r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = -2129208566; // 0xffffffff8116db0a float:-2.7707802E-38 double:NaN;
        defpackage.aw.bq(r4, r5);	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x276c:
        r4 = "";
        goto L_0x26a1;
    L_0x2770:
        r4 = 5018; // 0x139a float:7.032E-42 double:2.479E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x11f2;
    L_0x2776:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r7 = -1540247365; // 0xffffffffa431b0bb float:-3.8530453E-17 double:NaN;
        r4 = defpackage.al.ak(r4, r7);	 Catch:{ RuntimeException -> 0x003e }
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x27a2:
        r5 = -1;
        if (r7 != r5) goto L_0x1151;
    L_0x27a5:
        r5 = 0;
        goto L_0x0515;
    L_0x27a8:
        r7 = r4.dq;	 Catch:{ RuntimeException -> 0x003e }
        r8 = defpackage.gt.an;	 Catch:{ RuntimeException -> 0x003e }
        r8 = r8.aj;	 Catch:{ RuntimeException -> 0x003e }
        if (r7 != r8) goto L_0x27b3;
    L_0x27b0:
        r4 = -1;
        goto L_0x1224;
    L_0x27b3:
        r7 = -894271997; // 0xffffffffcab27e03 float:-5848833.5 double:NaN;
        r4 = r4.dq;	 Catch:{ RuntimeException -> 0x003e }
        r4 = (defpackage.gu) r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4.aj;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4 * r7;
        goto L_0x1224;
    L_0x27bf:
        r4 = defpackage.aj.aj;	 Catch:{ RuntimeException -> 0x003e }
        r10 = 34;
        r11 = -2031752828; // 0xffffffff86e5e984 float:-8.6483346E-35 double:NaN;
        r10 = r4.an(r10, r5, r11);	 Catch:{ RuntimeException -> 0x003e }
        r4 = new aj;	 Catch:{ RuntimeException -> 0x003e }
        r4.<init>();	 Catch:{ RuntimeException -> 0x003e }
        if (r10 == 0) goto L_0x27dc;
    L_0x27d1:
        r11 = new he;	 Catch:{ RuntimeException -> 0x003e }
        r11.<init>(r10);	 Catch:{ RuntimeException -> 0x003e }
        r10 = -2111814210; // 0xffffffff822045be float:-1.1774959E-37 double:NaN;
        r4.ac(r11, r10);	 Catch:{ RuntimeException -> 0x003e }
    L_0x27dc:
        r10 = -1876771459; // 0xffffffff9022bd7d float:-3.2094843E-29 double:NaN;
        r4.aj(r10);	 Catch:{ RuntimeException -> 0x003e }
        r10 = defpackage.aj.ac;	 Catch:{ RuntimeException -> 0x003e }
        r12 = (long) r5;	 Catch:{ RuntimeException -> 0x003e }
        r10.an(r4, r12);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x24f0;
    L_0x27ea:
        r4 = 2;
        goto L_0x0063;
    L_0x27ed:
        r4 = 5400; // 0x1518 float:7.567E-42 double:2.668E-320;
        r0 = r20;
        if (r0 >= r4) goto L_0x1b68;
    L_0x27f3:
        r4 = -411681370; // 0xffffffffe7763da6 float:-1.1628394E24 double:NaN;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r4 = defpackage.dz.ay(r0, r1, r2, r4);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0063;
    L_0x2802:
        r4 = 5530; // 0x159a float:7.749E-42 double:2.732E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x14c2;
    L_0x2808:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        if (r4 >= 0) goto L_0x281b;
    L_0x281a:
        r4 = 0;
    L_0x281b:
        r5 = -1440435199; // 0xffffffffaa24b401 float:-1.4628577E-13 double:NaN;
        r4 = r4 * r5;
        defpackage.client.fg = r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = 1;
        goto L_0x0063;
    L_0x2824:
        r4 = 2;
        goto L_0x0063;
    L_0x2827:
        r4 = 2;
        goto L_0x0063;
    L_0x282a:
        r4 = 6300; // 0x189c float:8.828E-42 double:3.1126E-320;
        r0 = r20;
        if (r0 >= r4) goto L_0x0355;
    L_0x2830:
        r4 = -909345993; // 0xffffffffc9cc7b37 float:-1675110.9 double:NaN;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r4 = defpackage.bd.ag(r0, r1, r2, r4);	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x0063;
    L_0x283f:
        r4 = 2;
        goto L_0x0063;
    L_0x2842:
        r6 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r7 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r7 = r7 + r8;
        defpackage.dy.ap = r7;	 Catch:{ RuntimeException -> 0x003e }
        r8 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r7 = r7 * r8;
        r7 = r7 + -1;
        r8 = (double) r4;	 Catch:{ RuntimeException -> 0x003e }
        r4 = (double) r5;	 Catch:{ RuntimeException -> 0x003e }
        r4 = java.lang.Math.pow(r8, r4);	 Catch:{ RuntimeException -> 0x003e }
        r4 = (int) r4;	 Catch:{ RuntimeException -> 0x003e }
        r6[r7] = r4;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x1c81;
    L_0x285d:
        r4 = 6506; // 0x196a float:9.117E-42 double:3.2144E-320;
        r0 = r20;
        if (r4 != r0) goto L_0x0fdf;
    L_0x2863:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 - r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r6 = r4[r5];	 Catch:{ RuntimeException -> 0x003e }
        r4 = 0;
        r5 = 0;
        goto L_0x125a;
    L_0x2877:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = -1;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 0;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 + r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = "";
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 0;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 0;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.gr.at;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.di.ah;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 436804489; // 0x1a091b89 float:2.835318E-23 double:2.15810092E-315;
        r5 = r5 + r6;
        defpackage.di.ah = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = 1894369977; // 0x70e9cab9 float:5.7884067E29 double:9.35943126E-315;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = "";
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x12fc;
    L_0x28ed:
        r5 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r6 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r6 = r6 + r7;
        defpackage.dy.ap = r6;	 Catch:{ RuntimeException -> 0x003e }
        r7 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r6 = r6 * r7;
        r6 = r6 + -1;
        r8 = (double) r4;	 Catch:{ RuntimeException -> 0x003e }
        r8 = java.lang.Math.sqrt(r8);	 Catch:{ RuntimeException -> 0x003e }
        r4 = (int) r8;	 Catch:{ RuntimeException -> 0x003e }
        r5[r6] = r4;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x1de1;
    L_0x2907:
        r4 = 0;
        goto L_0x005d;
    L_0x290a:
        r4 = 0;
        goto L_0x07de;
    L_0x290d:
        r4 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r5 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r5 = r5 + r6;
        defpackage.dy.ap = r5;	 Catch:{ RuntimeException -> 0x003e }
        r6 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r5 = r5 * r6;
        r5 = r5 + -1;
        r6 = 0;
        r4[r5] = r6;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x064d;
    L_0x2922:
        r7 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r8 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r9 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r8 = r8 + r9;
        defpackage.dy.ap = r8;	 Catch:{ RuntimeException -> 0x003e }
        r9 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r8 = r8 * r9;
        r8 = r8 + -1;
        r9 = -1121989347; // 0xffffffffbd1fcd1d float:-0.03901397 double:NaN;
        r4 = defpackage.ey.ac(r4, r9);	 Catch:{ RuntimeException -> 0x003e }
        r9 = -1702464013; // 0xffffffff9a8675f3 float:-5.561166E-23 double:NaN;
        r6 = r6.aq;	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6 * r9;
        r9 = -1317065069; // 0xffffffffb17f2e93 float:-3.7133858E-9 double:NaN;
        r4 = r4.am(r5, r6, r9);	 Catch:{ RuntimeException -> 0x003e }
        r7[r8] = r4;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x1cda;
    L_0x294a:
        r7 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r8 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r9 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r8 = r8 + r9;
        defpackage.dy.ap = r8;	 Catch:{ RuntimeException -> 0x003e }
        r9 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r8 = r8 * r9;
        r8 = r8 + -1;
        r9 = -2959; // 0xfffffffffffff471 float:NaN double:NaN;
        r4 = defpackage.al.ac(r4, r9);	 Catch:{ RuntimeException -> 0x003e }
        r6 = r6.aq;	 Catch:{ RuntimeException -> 0x003e }
        r9 = -1702464013; // 0xffffffff9a8675f3 float:-5.561166E-23 double:NaN;
        r6 = r6 * r9;
        r9 = -1;
        r4 = r4.ax(r5, r6, r9);	 Catch:{ RuntimeException -> 0x003e }
        r7[r8] = r4;	 Catch:{ RuntimeException -> 0x003e }
        goto L_0x1593;
    L_0x296f:
        r8 = defpackage.gr.ak;	 Catch:{ RuntimeException -> 0x003e }
        r4 = defpackage.dy.ap;	 Catch:{ RuntimeException -> 0x003e }
        r9 = -401924967; // 0xffffffffe80b1c99 float:-2.627746E24 double:NaN;
        r4 = r4 + r9;
        defpackage.dy.ap = r4;	 Catch:{ RuntimeException -> 0x003e }
        r9 = -38307927; // 0xfffffffffdb777a9 float:-3.0483754E37 double:NaN;
        r4 = r4 * r9;
        r9 = r4 + -1;
        r4 = defpackage.aj.ac;	 Catch:{ RuntimeException -> 0x003e }
        r10 = (long) r5;	 Catch:{ RuntimeException -> 0x003e }
        r4 = r4.aj(r10);	 Catch:{ RuntimeException -> 0x003e }
        r4 = (defpackage.aj) r4;	 Catch:{ RuntimeException -> 0x003e }
        if (r4 == 0) goto L_0x0c52;
    L_0x298a:
        goto L_0x0c7b;
    L_0x298c:
        r4 = 0;
        r5 = r4;
        goto L_0x1008;
    L_0x2990:
        r4 = 2;
        goto L_0x0063;
    L_0x2993:
        r6 = r4;
        goto L_0x018c;
        */
        throw new UnsupportedOperationException("Method not decompiled: bz.an(int, fs, boolean, byte):int");
    }

    static int ao(int i, fs fsVar, boolean z, int i2) {
        boolean z2 = false;
        if (i >= 2000) {
            i -= 1000;
            try {
                int[] iArr = gr.ak;
                int i3 = dy.ap - -401924967;
                dy.ap = i3;
                int i4 = iArr[i3 * -38307927];
                ab aj = ac.aj(i4, 1070420999);
            } catch (Throwable e) {
                throw ei.ac(e, "bz.ao(" + ')');
            }
        }
        ab abVar;
        if (z) {
            abVar = client.ae;
        } else {
            abVar = ef.am;
        }
        aj = abVar;
        i4 = -1;
        if (i == 1100) {
            dy.ap -= -803849934;
            aj.bo = -1184850653 * gr.ak[dy.ap * -38307927];
            if (aj.bo * 976779915 > (aj.bq * 1332151095) - (aj.bu * 1120250035)) {
                aj.bo = (aj.bq * -72471675) - (-140781703 * aj.bu);
            }
            if (aj.bo * 976779915 < 0) {
                aj.bo = 0;
            }
            aj.bz = gr.ak[(dy.ap * -38307927) + 1] * -792754297;
            if (707497527 * aj.bz > (aj.bj * -248255019) - (aj.bd * -1781667913)) {
                aj.bz = (381206099 * aj.bj) - (642757249 * aj.bd);
            }
            if (707497527 * aj.bz < 0) {
                aj.bz = 0;
            }
            cf.ew(aj, (byte) -79);
            return 1;
        } else if (1101 == i) {
            iArr = gr.ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.ba = iArr[r2 * -38307927] * 1402931311;
            cf.ew(aj, (byte) -94);
            return 1;
        } else if (1102 == i) {
            iArr = gr.ak;
            r4 = dy.ap - -401924967;
            dy.ap = r4;
            if (iArr[r4 * -38307927] == 1) {
                z2 = true;
            }
            aj.bn = z2;
            cf.ew(aj, (byte) -91);
            return 1;
        } else if (1103 == i) {
            iArr = gr.ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.bc = iArr[r2 * -38307927] * 947459509;
            cf.ew(aj, (byte) -41);
            return 1;
        } else if (i == 1104) {
            iArr = gr.ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.bf = iArr[r2 * -38307927] * -816123949;
            cf.ew(aj, (byte) -89);
            return 1;
        } else if (i == 1105) {
            iArr = gr.ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.cb = iArr[r2 * -38307927] * -1636058231;
            cf.ew(aj, (byte) -10);
            return 1;
        } else if (i == 1106) {
            iArr = gr.ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.cl = iArr[r2 * -38307927] * -938386137;
            cf.ew(aj, (byte) -104);
            return 1;
        } else if (1107 == i) {
            iArr = gr.ak;
            r4 = dy.ap - -401924967;
            dy.ap = r4;
            if (iArr[r4 * -38307927] == 1) {
                z2 = true;
            }
            aj.co = z2;
            cf.ew(aj, (byte) -37);
            return 1;
        } else if (1108 == i) {
            aj.cp = -70120369;
            iArr = gr.ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.ct = iArr[r2 * -38307927] * -1320879157;
            cf.ew(aj, (byte) -97);
            return 1;
        } else if (i == 1109) {
            dy.ap -= 1883417494;
            aj.ci = -984753891 * gr.ak[dy.ap * -38307927];
            aj.cq = gr.ak[(dy.ap * -38307927) + 1] * -1426695571;
            aj.cv = gr.ak[(dy.ap * -38307927) + 2] * -666819087;
            aj.cu = gr.ak[(dy.ap * -38307927) + 3] * 1231133277;
            aj.cg = 127086743 * gr.ak[(dy.ap * -38307927) + 4];
            aj.cs = -2004757675 * gr.ak[(dy.ap * -38307927) + 5];
            cf.ew(aj, (byte) -67);
            return 1;
        } else if (i == 1110) {
            iArr = gr.ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            i4 = iArr[r2 * -38307927];
            if (703619083 * aj.ce == i4) {
                return 1;
            }
            aj.ce = i4 * 1091775395;
            aj.fo = 0;
            aj.fk = 0;
            cf.ew(aj, (byte) -29);
            return 1;
        } else if (1111 == i) {
            iArr = gr.ak;
            r4 = dy.ap - -401924967;
            dy.ap = r4;
            if (iArr[r4 * -38307927] == 1) {
                z2 = true;
            }
            aj.cw = z2;
            cf.ew(aj, (byte) -111);
            return 1;
        } else if (1112 == i) {
            String[] strArr = gr.at;
            r2 = di.ah - 436804489;
            di.ah = r2;
            String str = strArr[r2 * 1894369977];
            if (str.equals(aj.cj)) {
                return 1;
            }
            aj.cj = str;
            cf.ew(aj, (byte) -91);
            return 1;
        } else if (1113 == i) {
            iArr = gr.ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.cz = iArr[r2 * -38307927] * 1453901265;
            cf.ew(aj, (byte) -36);
            return 1;
        } else if (i == 1114) {
            dy.ap -= -1205774901;
            aj.db = gr.ak[dy.ap * -38307927] * 1146478291;
            aj.dl = gr.ak[(dy.ap * -38307927) + 1] * -1610227479;
            aj.dh = 636698837 * gr.ak[(dy.ap * -38307927) + 2];
            cf.ew(aj, (byte) -38);
            return 1;
        } else if (i == 1115) {
            iArr = gr.ak;
            r4 = dy.ap - -401924967;
            dy.ap = r4;
            if (iArr[r4 * -38307927] == 1) {
                z2 = true;
            }
            aj.de = z2;
            cf.ew(aj, (byte) -19);
            return 1;
        } else if (1116 == i) {
            iArr = gr.ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.cc = iArr[r2 * -38307927] * 933402023;
            cf.ew(aj, (byte) -81);
            return 1;
        } else if (1117 == i) {
            iArr = gr.ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.cf = iArr[r2 * -38307927] * 2021340221;
            cf.ew(aj, (byte) -94);
            return 1;
        } else if (1118 == i) {
            iArr = gr.ak;
            r4 = dy.ap - -401924967;
            dy.ap = r4;
            if (iArr[r4 * -38307927] == 1) {
                z2 = true;
            }
            aj.ca = z2;
            cf.ew(aj, (byte) -75);
            return 1;
        } else if (i == 1119) {
            iArr = gr.ak;
            r4 = dy.ap - -401924967;
            dy.ap = r4;
            if (iArr[r4 * -38307927] == 1) {
                z2 = true;
            }
            aj.cr = z2;
            cf.ew(aj, (byte) -62);
            return 1;
        } else if (i == 1120) {
            dy.ap -= -803849934;
            aj.bq = -1077927289 * gr.ak[dy.ap * -38307927];
            aj.bj = gr.ak[(dy.ap * -38307927) + 1] * 2050876285;
            cf.ew(aj, (byte) -125);
            if (-1 == i4 || -1999477681 * aj.au != 0) {
                return 1;
            }
            cu.ej(ab.aa[i4 >> 16], aj, false, (byte) -98);
            return 1;
        } else if (i == 1121) {
            i4 = -1035840093 * aj.ax;
            r2 = aj.af * -303442303;
            mg ac = hd.ac(mr.bp, client.dp.ao, (byte) -6);
            ac.an.cm(i4, 507215861);
            ac.an.cy(r2, (byte) -90);
            client.dp.an(ac, 1849440485);
            client.iz = aj;
            cf.ew(aj, (byte) -13);
            return 1;
        } else if (i == 1122) {
            iArr = gr.ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.cy = iArr[r2 * -38307927] * 197821145;
            cf.ew(aj, (byte) -24);
            return 1;
        } else if (i == 1123) {
            iArr = gr.ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.bv = iArr[r2 * -38307927] * -1887670743;
            cf.ew(aj, (byte) -113);
            return 1;
        } else if (1124 == i) {
            iArr = gr.ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            aj.bk = iArr[r2 * -38307927] * 1443527195;
            cf.ew(aj, (byte) -60);
            return 1;
        } else if (1125 == i) {
            iArr = gr.ak;
            r2 = dy.ap - -401924967;
            dy.ap = r2;
            fj fjVar = (fj) bp.aj(new fj[]{fj.aq, fj.ac, fj.an, fj.aj, fj.ao}, iArr[r2 * -38307927], -1704551586);
            if (fjVar == null) {
                return 1;
            }
            aj.bg = fjVar;
            cf.ew(aj, (byte) -5);
            return 1;
        } else if (1126 != i) {
            return 2;
        } else {
            iArr = gr.ak;
            r4 = dy.ap - -401924967;
            dy.ap = r4;
            aj.bl = iArr[r4 * -38307927] == 1;
            return 1;
        }
    }

    static final int ct(int i) {
        try {
            if (ae.nv.an) {
                return lw.hn * -2005147175;
            }
            int i2;
            int i3 = 3;
            if (934655837 * cz.ft < 310) {
                int i4 = (cz.fz * 1130591639) >> 7;
                int i5 = (ac.fk * -749631659) >> 7;
                int i6 = (cx.hb.br * 1948391561) >> 7;
                int i7 = (cx.hb.bb * -1461980333) >> 7;
                if (i4 < 0 || i5 < 0 || i4 >= ez.cz || i5 >= ez.cz) {
                    return lw.hn * -2005147175;
                }
                int i8;
                if ((fb.ac[lw.hn * -2005147175][i4][i5] & 4) != 0) {
                    i3 = -2005147175 * lw.hn;
                }
                if (i6 > i4) {
                    i8 = i6 - i4;
                } else {
                    i8 = i4 - i6;
                }
                if (i7 > i5) {
                    i2 = i7 - i5;
                } else {
                    i2 = i5 - i7;
                }
                if (i8 > i2) {
                    i8 = (i2 * az) / i8;
                    i2 = i5;
                    i5 = i4;
                    i4 = i3;
                    i3 = 32768;
                    while (i6 != i5) {
                        if (i5 < i6) {
                            i5++;
                        } else if (i5 > i6) {
                            i5--;
                        }
                        if ((fb.ac[lw.hn * -2005147175][i5][i2] & 4) != 0) {
                            i4 = lw.hn * -2005147175;
                        }
                        i3 += i8;
                        if (i3 >= az) {
                            i3 -= az;
                            if (i2 < i7) {
                                i2++;
                            } else if (i2 > i7) {
                                i2--;
                            }
                            if ((fb.ac[lw.hn * -2005147175][i5][i2] & 4) != 0) {
                                i4 = lw.hn * -2005147175;
                            }
                        }
                    }
                    i2 = i4;
                } else {
                    i8 = (i8 * az) / i2;
                    i2 = i3;
                    i3 = 32768;
                    while (i7 != i5) {
                        if (i5 < i7) {
                            i5++;
                        } else if (i5 > i7) {
                            i5--;
                        }
                        if ((fb.ac[lw.hn * -2005147175][i4][i5] & 4) != 0) {
                            i2 = lw.hn * -2005147175;
                        }
                        i3 += i8;
                        if (i3 >= az) {
                            i3 -= az;
                            if (i4 < i6) {
                                i4++;
                            } else if (i4 > i6) {
                                i4--;
                            }
                            if ((fb.ac[lw.hn * -2005147175][i4][i5] & 4) != 0) {
                                i2 = lw.hn * -2005147175;
                            }
                        }
                    }
                }
            } else {
                i2 = 3;
            }
            if (cx.hb.br * 1948391561 < 0 || cx.hb.bb * -1461980333 < 0 || cx.hb.br * 1948391561 >= 13312 || cx.hb.bb * -1461980333 >= 13312) {
                return lw.hn * -2005147175;
            }
            if ((fb.ac[lw.hn * -2005147175][(cx.hb.br * 1948391561) >> 7][(cx.hb.bb * -1461980333) >> 7] & 4) != 0) {
                return lw.hn * -2005147175;
            }
            return i2;
        } catch (Throwable e) {
            throw ei.ac(e, "bz.ct(" + ')');
        }
    }

    static void fc(he heVar, byte b) {
        try {
            if (client.cd != null) {
                heVar.ae(client.cd, 0, client.cd.length, (byte) -11);
                return;
            }
            byte[] an = do.an(-647109662);
            heVar.ae(an, 0, an.length, (byte) 76);
        } catch (Throwable e) {
            throw ei.ac(e, "bz.fc(" + ')');
        }
    }
}
