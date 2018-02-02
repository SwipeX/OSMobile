package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class gx {
    static final String ac = "2";
    static int ae = 0;
    static final int aj = 1;
    String[] aa;
    boolean ak;
    boolean[] an;
    int[] ao;
    long ap;
    boolean[] aq;

    public void ak(int r10) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:88:?
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.modifyBlocksTree(BlockProcessor.java:248)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.rerun(BlockProcessor.java:44)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.visit(BlockFinallyExtract.java:57)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
        /*
        r9 = this;
        r1 = 3;
        r8 = -1;
        r3 = 0;
        r0 = 1;
        r2 = -1213253767; // 0xffffffffb7af3779 float:-2.0887457E-5 double:NaN;
        r5 = r9.aa(r0, r2);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r2 = r3;
        r0 = r3;
    L_0x000d:
        r4 = r9.ao;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r4 = r4.length;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        if (r2 >= r4) goto L_0x0025;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
    L_0x0012:
        r4 = r9.an;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r4 = r4[r2];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        if (r4 == 0) goto L_0x0022;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
    L_0x0018:
        r4 = r9.ao;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r4 = r4[r2];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        if (r8 == r4) goto L_0x0022;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
    L_0x001e:
        r1 = r1 + 6;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r0 = r0 + 1;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
    L_0x0022:
        r2 = r2 + 1;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        goto L_0x000d;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
    L_0x0025:
        r2 = r1 + 2;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r4 = r3;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r1 = r3;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
    L_0x0029:
        r6 = r9.aa;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r6 = r6.length;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        if (r4 >= r6) goto L_0x004d;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
    L_0x002e:
        r6 = r9.aq;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r6 = r6[r4];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        if (r6 == 0) goto L_0x004a;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
    L_0x0034:
        r6 = r9.aa;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r6 = r6[r4];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        if (r6 == 0) goto L_0x004a;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
    L_0x003a:
        r6 = r9.aa;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r6 = r6[r4];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r7 = 456650264; // 0x1b37ee18 float:1.5214337E-22 double:2.256152076E-315;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r6 = defpackage.cx.ah(r6, r7);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r6 = r6 + 2;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r2 = r2 + r6;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r1 = r1 + 1;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
    L_0x004a:
        r4 = r4 + 1;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        goto L_0x0029;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
    L_0x004d:
        r4 = new he;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r4.<init>(r2);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r2 = 1;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r6 = -88;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r4.an(r2, r6);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r2 = 1285336604; // 0x4c9cae1c float:8.2145504E7 double:6.350406594E-315;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r4.aq(r0, r2);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r0 = r3;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
    L_0x005f:
        r2 = r9.ao;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r2 = r2.length;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        if (r0 >= r2) goto L_0x0083;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
    L_0x0064:
        r2 = r9.an;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r2 = r2[r0];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        if (r2 == 0) goto L_0x0080;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
    L_0x006a:
        r2 = r9.ao;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r2 = r2[r0];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        if (r2 == r8) goto L_0x0080;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
    L_0x0070:
        r2 = -1624282278; // 0xffffffff9f2f6b5a float:-3.714649E-20 double:NaN;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r4.aq(r0, r2);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r2 = r9.ao;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r2 = r2[r0];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r6 = 2012261711; // 0x77f0ad4f float:9.7630185E33 double:9.94189382E-315;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r4.aa(r2, r6);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
    L_0x0080:
        r0 = r0 + 1;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        goto L_0x005f;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
    L_0x0083:
        r0 = -36444342; // 0xfffffffffdd3e74a float:-3.5208504E37 double:NaN;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r4.aq(r1, r0);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r0 = r3;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
    L_0x008a:
        r1 = r9.aa;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r1 = r1.length;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        if (r0 >= r1) goto L_0x00ae;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
    L_0x008f:
        r1 = r9.aq;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r1 = r1[r0];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        if (r1 == 0) goto L_0x00ab;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
    L_0x0095:
        r1 = r9.aa;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r1 = r1[r0];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        if (r1 == 0) goto L_0x00ab;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
    L_0x009b:
        r1 = 1418258461; // 0x5488e81d float:4.7040781E12 double:7.007127825E-315;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r4.aq(r0, r1);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r1 = r9.aa;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r1 = r1[r0];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r2 = 961895916; // 0x39555dec float:2.0348252E-4 double:4.75239727E-315;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r4.ai(r1, r2);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
    L_0x00ab:
        r0 = r0 + 1;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        goto L_0x008a;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
    L_0x00ae:
        r0 = r4.aj;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r1 = 0;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r2 = r4.ac;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r3 = 489625177; // 0x1d2f1659 float:2.317261E-21 double:2.419069793E-315;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r2 = r2 * r3;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r3 = -29458; // 0xffffffffffff8cee float:NaN double:NaN;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r5.ac(r0, r1, r2, r3);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r0 = 163742537; // 0x9c28349 float:4.682726E-33 double:8.08995623E-316;
        r5.an(r0);	 Catch:{ Exception -> 0x0100 }
    L_0x00c2:
        r0 = 0;
        r9.ak = r0;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r0 = 3;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r0 = defpackage.aw.aj(r0);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r2 = 2730330497289485831; // 0x25e4151f125afe07 float:6.9101784E-28 double:3.708426852814838E-126;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r0 = r0 * r2;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        r9.ap = r0;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
        return;
    L_0x00d3:
        r0 = move-exception;
        r0 = -1683066079; // 0xffffffff9bae7321 float:-2.8860286E-22 double:NaN;
        r5.an(r0);	 Catch:{ Exception -> 0x00db }
        goto L_0x00c2;
    L_0x00db:
        r0 = move-exception;
        goto L_0x00c2;
    L_0x00dd:
        r0 = move-exception;
        r1 = 288836537; // 0x11374bb9 float:1.4459488E-28 double:1.4270421E-315;
        r5.an(r1);	 Catch:{ Exception -> 0x0102 }
    L_0x00e4:
        throw r0;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd, RuntimeException -> 0x00e5 }
    L_0x00e5:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "gx.ak(";
        r1 = r1.append(r2);
        r2 = 41;
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0 = defpackage.ei.ac(r0, r1);
        throw r0;
    L_0x0100:
        r0 = move-exception;
        goto L_0x00c2;
    L_0x0102:
        r1 = move-exception;
        goto L_0x00e4;
        */
        throw new UnsupportedOperationException("Method not decompiled: gx.ak(int):void");
    }

    gx() {
        int i = 0;
        try {
            int i2;
            this.ak = false;
            this.ao = new int[dh.bg.as(19, 415667447)];
            this.aa = new String[dh.bg.as(15, 415667447)];
            this.an = new boolean[this.ao.length];
            for (i2 = 0; i2 < this.ao.length; i2++) {
                this.an[i2] = ed.aj(i2, 1207046000).an;
            }
            this.aq = new boolean[this.aa.length];
            for (i2 = 0; i2 < this.aa.length; i2++) {
                this.aq[i2] = aa.ac(i2, 308788751).an;
            }
            while (i < this.ao.length) {
                this.ao[i] = -1;
                i++;
            }
            ap((byte) 70);
        } catch (Throwable e) {
            throw ei.ac(e, "gx.<init>(" + ')');
        }
    }

    public static final boolean ac(char c, int i) {
        try {
            if (Character.isISOControl(c)) {
                return false;
            }
            boolean z;
            if ((c < '0' || c > '9') && ((c < 'A' || c > 'Z') && (c < 'a' || c > 'z'))) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
            char[] cArr = lh.an;
            for (char c2 : cArr) {
                if (c == c2) {
                    return true;
                }
            }
            cArr = lh.aq;
            for (char c22 : cArr) {
                if (c22 == c) {
                    return true;
                }
            }
            return false;
        } catch (Throwable e) {
            throw ei.ac(e, "gx.ac(" + ')');
        }
    }

    static final int aq(int i) {
        try {
            return -110972263 * cm.aq;
        } catch (Throwable e) {
            throw ei.ac(e, "gx.aq(" + ')');
        }
    }

    void ai(int i, int i2) {
        this.ao[i] = i2;
        if (this.an[i]) {
            this.ak = true;
        }
    }

    void aj(int i, int i2, byte b) {
        try {
            this.ao[i] = i2;
            if (this.an[i]) {
                this.ak = true;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "gx.aj(" + ')');
        }
    }

    void am(int i, int i2) {
        this.ao[i] = i2;
        if (this.an[i]) {
            this.ak = true;
        }
    }

    void aw(int i, int i2) {
        this.ao[i] = i2;
        if (this.an[i]) {
            this.ak = true;
        }
    }

    int ac(int i, byte b) {
        try {
            return this.ao[i];
        } catch (Throwable e) {
            throw ei.ac(e, "gx.ac(" + ')');
        }
    }

    int ae(int i) {
        return this.ao[i];
    }

    void an(int i, String str, int i2) {
        try {
            this.aa[i] = str;
            if (this.aq[i]) {
                this.ak = true;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "gx.an(" + ')');
        }
    }

    void as(int i, String str) {
        this.aa[i] = str;
        if (this.aq[i]) {
            this.ak = true;
        }
    }

    public static final in an(ls lsVar, int i, int i2, int i3) {
        int i4 = 2;
        try {
            if (in.aj * -843861189 == 0) {
                throw new IllegalStateException();
            } else if (i < 0 || i >= 2) {
                throw new IllegalArgumentException();
            } else {
                if (i2 < bq.ah) {
                    i2 = bq.ah;
                }
                try {
                    in aj = hx.at.aj(1483387375);
                    if (!in.ac) {
                        i4 = 1;
                    }
                    aj.ah = new int[(i4 * bq.ah)];
                    aj.as = 95954131 * i2;
                    aj.am((byte) 12);
                    aj.ae = ((i2 & -1024) + 1024) * -470275765;
                    if (aj.ae * -1059383197 > 16384) {
                        aj.ae = 173195264;
                    }
                    aj.ae(aj.ae * -1059383197, (byte) 1);
                    if (in.ao * 150006329 > 0 && in.aa == null) {
                        in.aa = new is();
                        in.aq = Executors.newScheduledThreadPool(1);
                        in.aq.scheduleAtFixedRate(in.aa, 0, 1, TimeUnit.MILLISECONDS);
                    }
                    if (in.aa != null) {
                        if (in.aa.aj[i] != null) {
                            throw new IllegalArgumentException();
                        }
                        in.aa.aj[i] = aj;
                    }
                    return aj;
                } catch (Throwable th) {
                    return new in();
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "gx.an(" + ')');
        }
    }

    String al(int i) {
        return this.aa[i];
    }

    String aq(int i, byte b) {
        try {
            return this.aa[i];
        } catch (Throwable e) {
            throw ei.ac(e, "gx.aq(" + ')');
        }
    }

    String ax(int i) {
        return this.aa[i];
    }

    String az(int i) {
        return this.aa[i];
    }

    void af() {
        int i = 0;
        for (int i2 = 0; i2 < this.ao.length; i2++) {
            if (!this.an[i2]) {
                this.ao[i2] = -1;
            }
        }
        while (i < this.aa.length) {
            if (!this.aq[i]) {
                this.aa[i] = null;
            }
            i++;
        }
    }

    void ao(byte b) {
        int i = 0;
        int i2 = 0;
        while (i2 < this.ao.length) {
            try {
                if (!this.an[i2]) {
                    this.ao[i2] = -1;
                }
                i2++;
            } catch (Throwable e) {
                throw ei.ac(e, "gx.ao(" + ')');
            }
        }
        while (i < this.aa.length) {
            if (!this.aq[i]) {
                this.aa[i] = null;
            }
            i++;
        }
    }

    md aa(boolean z, int i) {
        try {
            return dl.ac(ac, gs.ak.ak, z, -1740304149);
        } catch (Throwable e) {
            throw ei.ac(e, "gx.aa(" + ')');
        }
    }

    md au(boolean z) {
        return dl.ac(ac, gs.ak.ak, z, -1555309478);
    }

    md av(boolean z) {
        return dl.ac(ac, gs.ak.ak, z, -2004766074);
    }

    public void ad() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
        /*
        r9 = this;
        r1 = 1;
        r8 = -1;
        r3 = 0;
        r0 = -1449484518; // 0xffffffffa99a9f1a float:-6.8665736E-14 double:NaN;
        r5 = r9.aa(r1, r0);
        r1 = 3;
        r2 = r3;
        r0 = r3;
    L_0x000d:
        r4 = r9.ao;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r4 = r4.length;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        if (r2 >= r4) goto L_0x0025;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x0012:
        r4 = r9.an;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r4 = r4[r2];	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        if (r4 == 0) goto L_0x0022;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x0018:
        r4 = r9.ao;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r4 = r4[r2];	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        if (r8 == r4) goto L_0x0022;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x001e:
        r1 = r1 + 6;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r0 = r0 + 1;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x0022:
        r2 = r2 + 1;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        goto L_0x000d;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x0025:
        r2 = r1 + 2;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r4 = r3;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r1 = r3;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x0029:
        r6 = r9.aa;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r6 = r6.length;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        if (r4 >= r6) goto L_0x004d;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x002e:
        r6 = r9.aq;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r6 = r6[r4];	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        if (r6 == 0) goto L_0x004a;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x0034:
        r6 = r9.aa;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r6 = r6[r4];	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        if (r6 == 0) goto L_0x004a;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x003a:
        r6 = r9.aa;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r6 = r6[r4];	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r7 = 1408813055; // 0x53f8c7ff float:2.13701453E12 double:6.96046132E-315;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r6 = defpackage.cx.ah(r6, r7);	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r6 = r6 + 2;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r2 = r2 + r6;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r1 = r1 + 1;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x004a:
        r4 = r4 + 1;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        goto L_0x0029;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x004d:
        r4 = new he;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r4.<init>(r2);	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r2 = 1;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r6 = -63;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r4.an(r2, r6);	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r2 = -1548731043; // 0xffffffffa3b03d5d float:-1.9107947E-17 double:NaN;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r4.aq(r0, r2);	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r0 = r3;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x005f:
        r2 = r9.ao;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r2 = r2.length;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        if (r0 >= r2) goto L_0x0083;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x0064:
        r2 = r9.an;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r2 = r2[r0];	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        if (r2 == 0) goto L_0x0080;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x006a:
        r2 = r9.ao;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r2 = r2[r0];	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        if (r2 == r8) goto L_0x0080;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x0070:
        r2 = 2099930513; // 0x7d2a6591 float:1.4156008E37 double:1.037503525E-314;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r4.aq(r0, r2);	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r2 = r9.ao;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r2 = r2[r0];	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r6 = 1895422258; // 0x70f9d932 float:6.1859472E29 double:9.36463022E-315;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r4.aa(r2, r6);	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x0080:
        r0 = r0 + 1;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        goto L_0x005f;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x0083:
        r0 = 930013804; // 0x376ee26c float:1.4238623E-5 double:4.594878707E-315;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r4.aq(r1, r0);	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r0 = r3;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x008a:
        r1 = r9.aa;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r1 = r1.length;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        if (r0 >= r1) goto L_0x00ae;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x008f:
        r1 = r9.aq;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r1 = r1[r0];	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        if (r1 == 0) goto L_0x00ab;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x0095:
        r1 = r9.aa;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r1 = r1[r0];	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        if (r1 == 0) goto L_0x00ab;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x009b:
        r1 = 1096871563; // 0x4160ee8b float:14.058238 double:5.41926557E-315;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r4.aq(r0, r1);	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r1 = r9.aa;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r1 = r1[r0];	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r2 = -1527887839; // 0xffffffffa4ee4821 float:-1.0333824E-16 double:NaN;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r4.ai(r1, r2);	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x00ab:
        r0 = r0 + 1;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        goto L_0x008a;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
    L_0x00ae:
        r0 = r4.aj;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r1 = 0;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r2 = r4.ac;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r4 = 489625177; // 0x1d2f1659 float:2.317261E-21 double:2.419069793E-315;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r2 = r2 * r4;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r4 = -23386; // 0xffffffffffffa4a6 float:NaN double:NaN;	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r5.ac(r0, r1, r2, r4);	 Catch:{ Exception -> 0x00d2, all -> 0x00dc }
        r0 = 956545382; // 0x3903b966 float:1.25622E-4 double:4.72596212E-315;
        r5.an(r0);	 Catch:{ Exception -> 0x00e4 }
    L_0x00c2:
        r9.ak = r3;
        r0 = 2;
        r0 = defpackage.aw.aj(r0);
        r2 = 2730330497289485831; // 0x25e4151f125afe07 float:6.9101784E-28 double:3.708426852814838E-126;
        r0 = r0 * r2;
        r9.ap = r0;
        return;
    L_0x00d2:
        r0 = move-exception;
        r0 = -100478655; // 0xfffffffffa02d141 float:-1.698107E35 double:NaN;
        r5.an(r0);	 Catch:{ Exception -> 0x00da }
        goto L_0x00c2;
    L_0x00da:
        r0 = move-exception;
        goto L_0x00c2;
    L_0x00dc:
        r0 = move-exception;
        r1 = -2116448377; // 0xffffffff81d98f87 float:-7.991916E-38 double:NaN;
        r5.an(r1);	 Catch:{ Exception -> 0x00e6 }
    L_0x00e3:
        throw r0;
    L_0x00e4:
        r0 = move-exception;
        goto L_0x00c2;
    L_0x00e6:
        r1 = move-exception;
        goto L_0x00e3;
        */
        throw new UnsupportedOperationException("Method not decompiled: gx.ad():void");
    }

    public void ag() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
        /*
        r9 = this;
        r1 = 1;
        r8 = -1;
        r3 = 0;
        r0 = -928862770; // 0xffffffffc8a2adce float:-333166.44 double:NaN;
        r5 = r9.aa(r1, r0);
        r1 = 3;
        r2 = r3;
        r0 = r3;
    L_0x000d:
        r4 = r9.ao;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4 = r4.length;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r2 >= r4) goto L_0x0025;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0012:
        r4 = r9.an;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4 = r4[r2];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r4 == 0) goto L_0x0022;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0018:
        r4 = r9.ao;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4 = r4[r2];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r8 == r4) goto L_0x0022;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x001e:
        r1 = r1 + 6;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r0 = r0 + 1;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0022:
        r2 = r2 + 1;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        goto L_0x000d;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0025:
        r2 = r1 + 2;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4 = r3;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r1 = r3;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0029:
        r6 = r9.aa;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r6 = r6.length;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r4 >= r6) goto L_0x004d;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x002e:
        r6 = r9.aq;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r6 = r6[r4];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r6 == 0) goto L_0x004a;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0034:
        r6 = r9.aa;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r6 = r6[r4];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r6 == 0) goto L_0x004a;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x003a:
        r6 = r9.aa;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r6 = r6[r4];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r7 = 98123381; // 0x5d93e75 float:2.0429525E-35 double:4.84793916E-316;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r6 = defpackage.cx.ah(r6, r7);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r6 = r6 + 2;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = r2 + r6;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r1 = r1 + 1;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x004a:
        r4 = r4 + 1;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        goto L_0x0029;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x004d:
        r4 = new he;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4.<init>(r2);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = 1;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r6 = -35;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4.an(r2, r6);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = -1521910742; // 0xffffffffa5497c2a float:-1.747604E-16 double:NaN;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4.aq(r0, r2);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r0 = r3;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x005f:
        r2 = r9.ao;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = r2.length;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r0 >= r2) goto L_0x0083;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0064:
        r2 = r9.an;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = r2[r0];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r2 == 0) goto L_0x0080;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x006a:
        r2 = r9.ao;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = r2[r0];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r2 == r8) goto L_0x0080;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0070:
        r2 = -150483753; // 0xfffffffff707ccd7 float:-2.7543544E33 double:NaN;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4.aq(r0, r2);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = r9.ao;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = r2[r0];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r6 = 689533721; // 0x29197319 float:3.4072656E-14 double:3.40674923E-315;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4.aa(r2, r6);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0080:
        r0 = r0 + 1;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        goto L_0x005f;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0083:
        r0 = 56222239; // 0x359e21f float:6.4030143E-37 double:2.7777477E-316;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4.aq(r1, r0);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r0 = r3;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x008a:
        r1 = r9.aa;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r1 = r1.length;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r0 >= r1) goto L_0x00ae;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x008f:
        r1 = r9.aq;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r1 = r1[r0];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r1 == 0) goto L_0x00ab;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0095:
        r1 = r9.aa;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r1 = r1[r0];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r1 == 0) goto L_0x00ab;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x009b:
        r1 = 294779161; // 0x1191f919 float:2.3030485E-28 double:1.456402566E-315;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4.aq(r0, r1);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r1 = r9.aa;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r1 = r1[r0];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = -961741049; // 0xffffffffc6acff07 float:-22143.514 double:NaN;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4.ai(r1, r2);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x00ab:
        r0 = r0 + 1;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        goto L_0x008a;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x00ae:
        r0 = r4.aj;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r1 = 0;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = r4.ac;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4 = 489625177; // 0x1d2f1659 float:2.317261E-21 double:2.419069793E-315;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = r2 * r4;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4 = -8780; // 0xffffffffffffddb4 float:NaN double:NaN;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r5.ac(r0, r1, r2, r4);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r0 = 76577223; // 0x49079c7 float:3.3966072E-36 double:3.7834175E-316;
        r5.an(r0);	 Catch:{ Exception -> 0x00e5 }
    L_0x00c2:
        r9.ak = r3;
        r0 = -108; // 0xffffffffffffff94 float:NaN double:NaN;
        r0 = defpackage.aw.aj(r0);
        r2 = 2730330497289485831; // 0x25e4151f125afe07 float:6.9101784E-28 double:3.708426852814838E-126;
        r0 = r0 * r2;
        r9.ap = r0;
        return;
    L_0x00d3:
        r0 = move-exception;
        r0 = -1844015109; // 0xffffffff92168ffb float:-4.7509124E-28 double:NaN;
        r5.an(r0);	 Catch:{ Exception -> 0x00db }
        goto L_0x00c2;
    L_0x00db:
        r0 = move-exception;
        goto L_0x00c2;
    L_0x00dd:
        r0 = move-exception;
        r1 = 350678982; // 0x14e6efc6 float:2.3318639E-26 double:1.732584377E-315;
        r5.an(r1);	 Catch:{ Exception -> 0x00e7 }
    L_0x00e4:
        throw r0;
    L_0x00e5:
        r0 = move-exception;
        goto L_0x00c2;
    L_0x00e7:
        r1 = move-exception;
        goto L_0x00e4;
        */
        throw new UnsupportedOperationException("Method not decompiled: gx.ag():void");
    }

    public void ar() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
        /*
        r9 = this;
        r1 = 1;
        r8 = -1;
        r3 = 0;
        r0 = -1067405531; // 0xffffffffc060af25 float:-3.51069 double:NaN;
        r5 = r9.aa(r1, r0);
        r1 = 3;
        r2 = r3;
        r0 = r3;
    L_0x000d:
        r4 = r9.ao;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4 = r4.length;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r2 >= r4) goto L_0x0025;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0012:
        r4 = r9.an;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4 = r4[r2];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r4 == 0) goto L_0x0022;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0018:
        r4 = r9.ao;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4 = r4[r2];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r8 == r4) goto L_0x0022;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x001e:
        r1 = r1 + 6;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r0 = r0 + 1;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0022:
        r2 = r2 + 1;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        goto L_0x000d;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0025:
        r2 = r1 + 2;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4 = r3;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r1 = r3;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0029:
        r6 = r9.aa;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r6 = r6.length;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r4 >= r6) goto L_0x004d;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x002e:
        r6 = r9.aq;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r6 = r6[r4];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r6 == 0) goto L_0x004a;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0034:
        r6 = r9.aa;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r6 = r6[r4];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r6 == 0) goto L_0x004a;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x003a:
        r6 = r9.aa;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r6 = r6[r4];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r7 = 255578442; // 0xf3bd14a float:9.2601194E-30 double:1.26272528E-315;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r6 = defpackage.cx.ah(r6, r7);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r6 = r6 + 2;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = r2 + r6;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r1 = r1 + 1;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x004a:
        r4 = r4 + 1;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        goto L_0x0029;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x004d:
        r4 = new he;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4.<init>(r2);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = 1;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r6 = -94;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4.an(r2, r6);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = 2076298859; // 0x7bc1ce6b float:2.0125999E36 double:1.0258279367E-314;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4.aq(r0, r2);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r0 = r3;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x005f:
        r2 = r9.ao;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = r2.length;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r0 >= r2) goto L_0x0083;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0064:
        r2 = r9.an;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = r2[r0];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r2 == 0) goto L_0x0080;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x006a:
        r2 = r9.ao;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = r2[r0];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r2 == r8) goto L_0x0080;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0070:
        r2 = -2146960225; // 0xffffffff8007fc9f float:-7.33472E-40 double:NaN;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4.aq(r0, r2);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = r9.ao;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = r2[r0];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r6 = -195686079; // 0xfffffffff4561141 float:-6.7840666E31 double:NaN;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4.aa(r2, r6);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0080:
        r0 = r0 + 1;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        goto L_0x005f;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0083:
        r0 = 1365970590; // 0x516b0e9e float:6.3097659E10 double:6.748791417E-315;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4.aq(r1, r0);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r0 = r3;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x008a:
        r1 = r9.aa;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r1 = r1.length;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r0 >= r1) goto L_0x00ae;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x008f:
        r1 = r9.aq;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r1 = r1[r0];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r1 == 0) goto L_0x00ab;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0095:
        r1 = r9.aa;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r1 = r1[r0];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r1 == 0) goto L_0x00ab;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x009b:
        r1 = -1604526863; // 0xffffffffa05cdcf1 float:-1.8707828E-19 double:NaN;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4.aq(r0, r1);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r1 = r9.aa;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r1 = r1[r0];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = -600541236; // 0xffffffffdc3477cc float:-2.03188855E17 double:NaN;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4.ai(r1, r2);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x00ab:
        r0 = r0 + 1;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        goto L_0x008a;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x00ae:
        r0 = r4.aj;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r1 = 0;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = r4.ac;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4 = 489625177; // 0x1d2f1659 float:2.317261E-21 double:2.419069793E-315;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = r2 * r4;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4 = -26780; // 0xffffffffffff9764 float:NaN double:NaN;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r5.ac(r0, r1, r2, r4);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r0 = -127680876; // 0xfffffffff863be94 float:-1.8476825E34 double:NaN;
        r5.an(r0);	 Catch:{ Exception -> 0x00e5 }
    L_0x00c2:
        r9.ak = r3;
        r0 = -82;
        r0 = defpackage.aw.aj(r0);
        r2 = 2730330497289485831; // 0x25e4151f125afe07 float:6.9101784E-28 double:3.708426852814838E-126;
        r0 = r0 * r2;
        r9.ap = r0;
        return;
    L_0x00d3:
        r0 = move-exception;
        r0 = -906201503; // 0xffffffffc9fc7661 float:-2068172.1 double:NaN;
        r5.an(r0);	 Catch:{ Exception -> 0x00db }
        goto L_0x00c2;
    L_0x00db:
        r0 = move-exception;
        goto L_0x00c2;
    L_0x00dd:
        r0 = move-exception;
        r1 = 103450880; // 0x62a8900 float:3.2074098E-35 double:5.1111526E-316;
        r5.an(r1);	 Catch:{ Exception -> 0x00e7 }
    L_0x00e4:
        throw r0;
    L_0x00e5:
        r0 = move-exception;
        goto L_0x00c2;
    L_0x00e7:
        r1 = move-exception;
        goto L_0x00e4;
        */
        throw new UnsupportedOperationException("Method not decompiled: gx.ar():void");
    }

    public void ay() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
        /*
        r9 = this;
        r1 = 1;
        r8 = -1;
        r3 = 0;
        r0 = -364166425; // 0xffffffffea4b42e7 float:-6.143197E25 double:NaN;
        r5 = r9.aa(r1, r0);
        r1 = 3;
        r2 = r3;
        r0 = r3;
    L_0x000d:
        r4 = r9.ao;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4 = r4.length;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r2 >= r4) goto L_0x0025;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0012:
        r4 = r9.an;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4 = r4[r2];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r4 == 0) goto L_0x0022;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0018:
        r4 = r9.ao;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4 = r4[r2];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r8 == r4) goto L_0x0022;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x001e:
        r1 = r1 + 6;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r0 = r0 + 1;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0022:
        r2 = r2 + 1;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        goto L_0x000d;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0025:
        r2 = r1 + 2;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4 = r3;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r1 = r3;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0029:
        r6 = r9.aa;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r6 = r6.length;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r4 >= r6) goto L_0x004d;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x002e:
        r6 = r9.aq;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r6 = r6[r4];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r6 == 0) goto L_0x004a;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0034:
        r6 = r9.aa;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r6 = r6[r4];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r6 == 0) goto L_0x004a;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x003a:
        r6 = r9.aa;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r6 = r6[r4];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r7 = -1830181311; // 0xffffffff92e9a641 float:-1.4745352E-27 double:NaN;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r6 = defpackage.cx.ah(r6, r7);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r6 = r6 + 2;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = r2 + r6;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r1 = r1 + 1;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x004a:
        r4 = r4 + 1;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        goto L_0x0029;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x004d:
        r4 = new he;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4.<init>(r2);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = 1;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r6 = -18;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4.an(r2, r6);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = -1659935505; // 0xffffffff9d0f64ef float:-1.8978074E-21 double:NaN;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4.aq(r0, r2);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r0 = r3;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x005f:
        r2 = r9.ao;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = r2.length;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r0 >= r2) goto L_0x0083;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0064:
        r2 = r9.an;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = r2[r0];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r2 == 0) goto L_0x0080;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x006a:
        r2 = r9.ao;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = r2[r0];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r2 == r8) goto L_0x0080;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0070:
        r2 = -155350660; // 0xfffffffff6bd897c float:-1.922134E33 double:NaN;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4.aq(r0, r2);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = r9.ao;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = r2[r0];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r6 = 1112654063; // 0x4251c0ef float:52.43841 double:5.49724148E-315;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4.aa(r2, r6);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0080:
        r0 = r0 + 1;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        goto L_0x005f;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0083:
        r0 = 1621122298; // 0x60a05cfa float:9.2443085E19 double:8.00940835E-315;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4.aq(r1, r0);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r0 = r3;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x008a:
        r1 = r9.aa;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r1 = r1.length;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r0 >= r1) goto L_0x00ae;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x008f:
        r1 = r9.aq;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r1 = r1[r0];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r1 == 0) goto L_0x00ab;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x0095:
        r1 = r9.aa;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r1 = r1[r0];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        if (r1 == 0) goto L_0x00ab;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x009b:
        r1 = -1782728005; // 0xffffffff95bdbabb float:-7.66311E-26 double:NaN;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4.aq(r0, r1);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r1 = r9.aa;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r1 = r1[r0];	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = 2101750768; // 0x7d462bf0 float:1.6463455E37 double:1.0384028506E-314;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4.ai(r1, r2);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x00ab:
        r0 = r0 + 1;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        goto L_0x008a;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
    L_0x00ae:
        r0 = r4.aj;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r1 = 0;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = r4.ac;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4 = 489625177; // 0x1d2f1659 float:2.317261E-21 double:2.419069793E-315;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r2 = r2 * r4;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r4 = -29849; // 0xffffffffffff8b67 float:NaN double:NaN;	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r5.ac(r0, r1, r2, r4);	 Catch:{ Exception -> 0x00d3, all -> 0x00dd }
        r0 = -180967160; // 0xfffffffff536a908 float:-2.3154941E32 double:NaN;
        r5.an(r0);	 Catch:{ Exception -> 0x00e5 }
    L_0x00c2:
        r9.ak = r3;
        r0 = -72;
        r0 = defpackage.aw.aj(r0);
        r2 = 2730330497289485831; // 0x25e4151f125afe07 float:6.9101784E-28 double:3.708426852814838E-126;
        r0 = r0 * r2;
        r9.ap = r0;
        return;
    L_0x00d3:
        r0 = move-exception;
        r0 = 118488321; // 0x70ffd01 float:1.0832475E-34 double:5.8541009E-316;
        r5.an(r0);	 Catch:{ Exception -> 0x00db }
        goto L_0x00c2;
    L_0x00db:
        r0 = move-exception;
        goto L_0x00c2;
    L_0x00dd:
        r0 = move-exception;
        r1 = -369213800; // 0xffffffffe9fe3e98 float:-3.8420344E25 double:NaN;
        r5.an(r1);	 Catch:{ Exception -> 0x00e7 }
    L_0x00e4:
        throw r0;
    L_0x00e5:
        r0 = move-exception;
        goto L_0x00c2;
    L_0x00e7:
        r1 = move-exception;
        goto L_0x00e4;
        */
        throw new UnsupportedOperationException("Method not decompiled: gx.ay():void");
    }

    void ap(byte r9) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
        /*
        r8 = this;
        r0 = 0;
        r6 = 1;
        r1 = 0;
        r2 = -1132378804; // 0xffffffffbc81454c float:-0.015780114 double:NaN;
        r2 = r8.aa(r1, r2);	 Catch:{ RuntimeException -> 0x00b6 }
        r1 = -855574716; // 0xffffffffcd00f744 float:-1.35230528E8 double:NaN;
        r4 = r2.ao(r1);	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        r1 = (int) r4;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        r3 = new byte[r1];	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        r1 = r0;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
    L_0x0015:
        r4 = r3.length;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        if (r1 >= r4) goto L_0x0037;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
    L_0x0018:
        r4 = r3.length;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        r4 = r4 - r1;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        r5 = 1995347696; // 0x76ee96f0 float:2.419586E33 double:9.85832748E-315;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        r4 = r2.aa(r3, r1, r4, r5);	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        r5 = -1;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        if (r4 != r5) goto L_0x0035;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
    L_0x0024:
        r0 = new java.io.EOFException;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        r0.<init>();	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        throw r0;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
    L_0x002a:
        r0 = move-exception;
        r0 = 21812244; // 0x14cd414 float:3.762104E-38 double:1.07766804E-316;
        r2.an(r0);	 Catch:{ Exception -> 0x00d1 }
    L_0x0031:
        r0 = 0;
        r8.ak = r0;	 Catch:{ RuntimeException -> 0x00b6 }
    L_0x0034:
        return;
    L_0x0035:
        r1 = r1 + r4;
        goto L_0x0015;
    L_0x0037:
        r4 = new he;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        r4.<init>(r3);	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        r1 = r4.aj;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        r1 = r1.length;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        r3 = 489625177; // 0x1d2f1659 float:2.317261E-21 double:2.419069793E-315;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        r5 = r4.ac;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        r3 = r3 * r5;
        r1 = r1 - r3;
        if (r1 >= r6) goto L_0x0051;
    L_0x0048:
        r0 = 519955686; // 0x1efde4e6 float:2.6882087E-20 double:2.56892242E-315;
        r2.an(r0);	 Catch:{ Exception -> 0x004f }
        goto L_0x0034;
    L_0x004f:
        r0 = move-exception;
        goto L_0x0034;
    L_0x0051:
        r1 = -310118664; // 0xffffffffed83f6f8 float:-5.105138E27 double:NaN;
        r1 = r4.au(r1);	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        if (r1 < 0) goto L_0x005c;
    L_0x005a:
        if (r1 <= r6) goto L_0x0065;
    L_0x005c:
        r0 = -1669331882; // 0xffffffff9c800456 float:-8.47145E-22 double:NaN;
        r2.an(r0);	 Catch:{ Exception -> 0x0063 }
        goto L_0x0034;
    L_0x0063:
        r0 = move-exception;
        goto L_0x0034;
    L_0x0065:
        r1 = 1;
        r3 = r4.ay(r1);	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        r1 = r0;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
    L_0x006b:
        if (r1 >= r3) goto L_0x0085;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
    L_0x006d:
        r5 = 1;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        r5 = r4.ay(r5);	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        r6 = -68;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        r6 = r4.ad(r6);	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        r7 = r8.an;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        r7 = r7[r5];	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        if (r7 == 0) goto L_0x0082;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
    L_0x007e:
        r7 = r8.ao;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        r7[r5] = r6;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
    L_0x0082:
        r1 = r1 + 1;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        goto L_0x006b;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
    L_0x0085:
        r1 = 1;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        r1 = r4.ay(r1);	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
    L_0x008a:
        if (r0 >= r1) goto L_0x00a5;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
    L_0x008c:
        r3 = 1;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        r3 = r4.ay(r3);	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        r5 = -593810185; // 0xffffffffdc9b2cf7 float:-3.49424486E17 double:NaN;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        r5 = r4.bh(r5);	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        r6 = r8.aq;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        r6 = r6[r3];	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        if (r6 == 0) goto L_0x00a2;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
    L_0x009e:
        r6 = r8.aa;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
        r6[r3] = r5;	 Catch:{ Exception -> 0x002a, all -> 0x00ae }
    L_0x00a2:
        r0 = r0 + 1;
        goto L_0x008a;
    L_0x00a5:
        r0 = -637127098; // 0xffffffffda063646 float:-9.4443303E15 double:NaN;
        r2.an(r0);	 Catch:{ Exception -> 0x00ac }
        goto L_0x0031;
    L_0x00ac:
        r0 = move-exception;
        goto L_0x0031;
    L_0x00ae:
        r0 = move-exception;
        r1 = -200467303; // 0xfffffffff40d1c99 float:-4.4720086E31 double:NaN;
        r2.an(r1);	 Catch:{ Exception -> 0x00d4 }
    L_0x00b5:
        throw r0;	 Catch:{ RuntimeException -> 0x00b6 }
    L_0x00b6:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "gx.ap(";
        r1 = r1.append(r2);
        r2 = 41;
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0 = defpackage.ei.ac(r0, r1);
        throw r0;
    L_0x00d1:
        r0 = move-exception;
        goto L_0x0031;
    L_0x00d4:
        r1 = move-exception;
        goto L_0x00b5;
        */
        throw new UnsupportedOperationException("Method not decompiled: gx.ap(byte):void");
    }

    void ab() {
        if (this.ak && 420018179945664439L * this.ap < aw.aj((byte) -43) - 60000) {
            ak(1905375874);
        }
    }

    void at(byte b) {
        try {
            if (this.ak && 420018179945664439L * this.ap < aw.aj((byte) -12) - 60000) {
                ak(1905375874);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "gx.at(" + ')');
        }
    }

    void bh() {
        if (this.ak && 420018179945664439L * this.ap < aw.aj((byte) 53) - 60000) {
            ak(1905375874);
        }
    }

    void bm() {
        if (this.ak && 420018179945664439L * this.ap < aw.aj((byte) -53) - 60000) {
            ak(1905375874);
        }
    }

    void bp() {
        if (this.ak && 420018179945664439L * this.ap < aw.aj((byte) -44) - 60000) {
            ak(1905375874);
        }
    }

    public boolean ah(int i) {
        try {
            return this.ak;
        } catch (Throwable e) {
            throw ei.ac(e, "gx.ah(" + ')');
        }
    }

    public boolean bb() {
        return this.ak;
    }

    public boolean br() {
        return this.ak;
    }

    public boolean bt() {
        return this.ak;
    }

    static void as(int i, short s) {
        int i2 = 0;
        try {
            if (i != client.az * 1827781011) {
                if (client.az * 1827781011 == 0) {
                    client.ac.uu(1161489439);
                }
                if (i == 20 || i == 40 || 45 == i) {
                    client.ck = 0;
                    client.ce = 0;
                    client.ch = 0;
                    client.di.an(i, 2083777330);
                    if (i != 20) {
                        fv.bt(false, -1476782487);
                    }
                }
                if (!(20 == i || i == 40 || ap.dr == null)) {
                    ap.dr.aj((short) -7844);
                    ap.dr = null;
                }
                if (client.az * 1827781011 == 25) {
                    client.eu = 0;
                    client.dy = 0;
                    client.dc = -1091299207;
                    client.ei = 0;
                    client.eq = -1805002065;
                }
                if (5 == i || 10 == i) {
                    an.ac(ac.co, cf.cy, true, 0, client.ac.qc.aj((byte) -10), (short) 19915);
                } else if (i == 20) {
                    ju juVar = ac.co;
                    ju juVar2 = cf.cy;
                    if (11 == client.az * 1827781011) {
                        i2 = 4;
                    }
                    an.ac(juVar, juVar2, true, i2, client.ac.qc.aj((byte) -22), (short) -17012);
                } else if (11 == i) {
                    an.ac(ac.co, cf.cy, false, 4, client.ac.qc.aj((byte) -6), (short) -12206);
                } else {
                    if (fw.aj) {
                        fw.an = null;
                        fw.aq = null;
                        fw.aa = null;
                        mi.ak = null;
                        fw.ap = null;
                        eu.at = null;
                        bh.ah = null;
                        ke.ai = null;
                        eu.am = null;
                        ev.cx = null;
                        cn.cd = null;
                        fb.cw = null;
                        aa.cn = null;
                        aq.cz = null;
                        lm.bp = null;
                        dc.bm = null;
                        gs.bh = null;
                        lt.ab = null;
                        aw.bb = null;
                        ch.bu = null;
                        dm.bd = null;
                        ch.by = null;
                        cb.ap(2, 1877141469);
                        hm.ac(true, 259728032);
                        fw.aj = false;
                    }
                    client.ac.um(bu.au, -1412236491);
                }
                client.az = -1822471013 * i;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "gx.as(" + ')');
        }
    }
}
