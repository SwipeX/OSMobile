package defpackage;

public class ls implements Runnable {
    static String ac = null;
    static final int ap = 2;
    boolean aa;
    ll an;
    Thread ao;
    ll aq;

    public static String aj(CharSequence charSequence, int i) {
        try {
            int length = charSequence.length();
            StringBuilder stringBuilder = new StringBuilder(length);
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = charSequence.charAt(i2);
                if ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || ((charAt >= '0' && charAt <= '9') || charAt == '.' || charAt == '-' || '*' == charAt || '_' == charAt))) {
                    stringBuilder.append(charAt);
                } else if (' ' == charAt) {
                    stringBuilder.append('+');
                } else {
                    byte aj = eb.aj(charAt, -140240738);
                    stringBuilder.append('%');
                    int i3 = (aj >> 4) & 15;
                    if (i3 >= 10) {
                        stringBuilder.append((char) (i3 + 55));
                    } else {
                        stringBuilder.append((char) (i3 + 48));
                    }
                    int i4 = aj & 15;
                    if (i4 >= 10) {
                        stringBuilder.append((char) (i4 + 55));
                    } else {
                        stringBuilder.append((char) (i4 + 48));
                    }
                }
            }
            return stringBuilder.toString();
        } catch (Throwable e) {
            throw ei.ac(e, "ls.aj(" + ')');
        }
    }

    public ls() {
        try {
            this.an = null;
            this.aq = null;
            this.aa = false;
            hw.aj = "Unknown";
            ac = "1.6";
            try {
                hw.aj = System.getProperty("java.vendor");
                ac = System.getProperty("java.version");
            } catch (Exception e) {
            }
            this.aa = false;
            this.ao = new Thread(this);
            this.ao.setPriority(10);
            this.ao.setDaemon(true);
            this.ao.start();
        } catch (Throwable e2) {
            throw ei.ac(e2, "ls.<init>(" + ')');
        }
    }

    public final void aa() {
        synchronized (this) {
            this.aa = true;
            notifyAll();
        }
        try {
            this.ao.join();
        } catch (InterruptedException e) {
        }
    }

    public final void aj(int i) {
        try {
            synchronized (this) {
                this.aa = true;
                notifyAll();
            }
            try {
                this.ao.join();
            } catch (InterruptedException e) {
            }
        } catch (Throwable e2) {
            throw ei.ac(e2, "ls.aj(" + ')');
        }
    }

    public final void ak() {
        synchronized (this) {
            this.aa = true;
            notifyAll();
        }
        try {
            this.ao.join();
        } catch (InterruptedException e) {
        }
    }

    public final void ao() {
        synchronized (this) {
            this.aa = true;
            notifyAll();
        }
        try {
            this.ao.join();
        } catch (InterruptedException e) {
        }
    }

    public final void ap() {
        synchronized (this) {
            this.aa = true;
            notifyAll();
        }
        try {
            this.ao.join();
        } catch (InterruptedException e) {
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void cs() {
        /*
        r6 = this;
        r5 = 2;
        r4 = 1;
    L_0x0002:
        monitor-enter(r6);
    L_0x0003:
        r0 = r6.aa;	 Catch:{ all -> 0x0042 }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r6);	 Catch:{ all -> 0x0042 }
        return;
    L_0x0009:
        r0 = r6.an;	 Catch:{ all -> 0x0042 }
        if (r0 == 0) goto L_0x003c;
    L_0x000d:
        r1 = r6.an;	 Catch:{ all -> 0x0042 }
        r0 = r6.an;	 Catch:{ all -> 0x0042 }
        r0 = r0.aj;	 Catch:{ all -> 0x0042 }
        r6.an = r0;	 Catch:{ all -> 0x0042 }
        r0 = r6.an;	 Catch:{ all -> 0x0042 }
        if (r0 != 0) goto L_0x001c;
    L_0x0019:
        r0 = 0;
        r6.aq = r0;	 Catch:{ all -> 0x0042 }
    L_0x001c:
        monitor-exit(r6);	 Catch:{ all -> 0x0042 }
        r0 = -519927387; // 0xffffffffe10289a5 float:-1.504997E20 double:NaN;
        r2 = r1.aa;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = r0 * r2;
        if (r0 != r4) goto L_0x0045;
    L_0x0025:
        r2 = new java.net.Socket;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = r1.ap;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = (java.lang.String) r0;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = java.net.InetAddress.getByName(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r3 = r1.ak;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r2.<init>(r0, r3);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r1.at = r2;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
    L_0x0036:
        r0 = 1;
        r1.ao = r0;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        goto L_0x0002;
    L_0x003a:
        r0 = move-exception;
        throw r0;
    L_0x003c:
        r6.wait();	 Catch:{ InterruptedException -> 0x0040 }
        goto L_0x0003;
    L_0x0040:
        r0 = move-exception;
        goto L_0x0003;
    L_0x0042:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0042 }
        throw r0;
    L_0x0045:
        if (r5 != r0) goto L_0x0063;
    L_0x0047:
        r2 = new java.lang.Thread;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = r1.ap;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = (java.lang.Runnable) r0;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r2.<init>(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = 1;
        r2.setDaemon(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r2.start();	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = r1.ak;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r2.setPriority(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r1.at = r2;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        goto L_0x0036;
    L_0x005f:
        r0 = move-exception;
        r1.ao = r5;
        goto L_0x0002;
    L_0x0063:
        r2 = 4;
        if (r2 != r0) goto L_0x0036;
    L_0x0066:
        r2 = new java.io.DataInputStream;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = r1.ap;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = (java.net.URL) r0;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r0 = r0.openStream();	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r2.<init>(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        r1.at = r2;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x005f }
        goto L_0x0036;
        */
        throw new UnsupportedOperationException("Method not decompiled: ls.cs():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        r6 = this;
        r5 = 2;
        r4 = 1;
    L_0x0002:
        monitor-enter(r6);	 Catch:{ RuntimeException -> 0x003c }
    L_0x0003:
        r0 = r6.aa;	 Catch:{ all -> 0x005d }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r6);	 Catch:{ all -> 0x005d }
        return;
    L_0x0009:
        r0 = r6.an;	 Catch:{ all -> 0x005d }
        if (r0 == 0) goto L_0x0057;
    L_0x000d:
        r1 = r6.an;	 Catch:{ all -> 0x005d }
        r0 = r6.an;	 Catch:{ all -> 0x005d }
        r0 = r0.aj;	 Catch:{ all -> 0x005d }
        r6.an = r0;	 Catch:{ all -> 0x005d }
        r0 = r6.an;	 Catch:{ all -> 0x005d }
        if (r0 != 0) goto L_0x001c;
    L_0x0019:
        r0 = 0;
        r6.aq = r0;	 Catch:{ all -> 0x005d }
    L_0x001c:
        monitor-exit(r6);	 Catch:{ all -> 0x005d }
        r0 = 520982643; // 0x1f0d9073 float:2.9977397E-20 double:2.57399626E-315;
        r2 = r1.aa;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r0 = r0 * r2;
        if (r0 != r4) goto L_0x0060;
    L_0x0025:
        r2 = new java.net.Socket;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r0 = r1.ap;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r0 = (java.lang.String) r0;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r0 = java.net.InetAddress.getByName(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r3 = r1.ak;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r2.<init>(r0, r3);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r1.at = r2;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
    L_0x0036:
        r0 = 1;
        r1.ao = r0;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        goto L_0x0002;
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "ls.run(";
        r1 = r1.append(r2);
        r2 = 41;
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0 = defpackage.ei.ac(r0, r1);
        throw r0;
    L_0x0057:
        r6.wait();	 Catch:{ InterruptedException -> 0x005b }
        goto L_0x0003;
    L_0x005b:
        r0 = move-exception;
        goto L_0x0003;
    L_0x005d:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x005d }
        throw r0;	 Catch:{ RuntimeException -> 0x003c }
    L_0x0060:
        if (r5 != r0) goto L_0x007f;
    L_0x0062:
        r2 = new java.lang.Thread;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r0 = r1.ap;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r0 = (java.lang.Runnable) r0;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r2.<init>(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r0 = 1;
        r2.setDaemon(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r2.start();	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r0 = r1.ak;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r2.setPriority(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r1.at = r2;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        goto L_0x0036;
    L_0x007a:
        r0 = move-exception;
        r0 = 2;
        r1.ao = r0;	 Catch:{ RuntimeException -> 0x003c }
        goto L_0x0002;
    L_0x007f:
        r2 = 4;
        if (r2 != r0) goto L_0x0036;
    L_0x0082:
        r2 = new java.io.DataInputStream;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r0 = r1.ap;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r0 = (java.net.URL) r0;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r0 = r0.openStream();	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r2.<init>(r0);	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        r1.at = r2;	 Catch:{ ThreadDeath -> 0x003a, Throwable -> 0x007a }
        goto L_0x0036;
        */
        throw new UnsupportedOperationException("Method not decompiled: ls.run():void");
    }

    final ll ac(int i, int i2, int i3, Object obj, int i4) {
        try {
            ll llVar = new ll();
            llVar.aa = -203975493 * i;
            llVar.ak = i2;
            llVar.ap = obj;
            synchronized (this) {
                if (this.aq != null) {
                    this.aq.aj = llVar;
                    this.aq = llVar;
                } else {
                    this.an = llVar;
                    this.aq = llVar;
                }
                notify();
            }
            return llVar;
        } catch (Throwable e) {
            throw ei.ac(e, "ls.ac(" + ')');
        }
    }

    final ll ah(int i, int i2, int i3, Object obj) {
        ll llVar = new ll();
        llVar.aa = -203975493 * i;
        llVar.ak = i2;
        llVar.ap = obj;
        synchronized (this) {
            if (this.aq != null) {
                this.aq.aj = llVar;
                this.aq = llVar;
            } else {
                this.an = llVar;
                this.aq = llVar;
            }
            notify();
        }
        return llVar;
    }

    final ll at(int i, int i2, int i3, Object obj) {
        ll llVar = new ll();
        llVar.aa = -203975493 * i;
        llVar.ak = i2;
        llVar.ap = obj;
        synchronized (this) {
            if (this.aq != null) {
                this.aq.aj = llVar;
                this.aq = llVar;
            } else {
                this.an = llVar;
                this.aq = llVar;
            }
            notify();
        }
        return llVar;
    }

    public final ll ae(String str, int i) {
        return ac(1, i, 0, str, -17470716);
    }

    public final ll ai(String str, int i) {
        return ac(1, i, 0, str, 1525300350);
    }

    public final ll am(String str, int i) {
        return ac(1, i, 0, str, -1179454277);
    }

    public final ll an(String str, int i, int i2) {
        try {
            return ac(1, i, 0, str, -1425448726);
        } catch (Throwable e) {
            throw ei.ac(e, "ls.an(" + ')');
        }
    }

    public final ll aw(String str, int i) {
        return ac(1, i, 0, str, 1486167057);
    }

    public final ll al(Runnable runnable, int i) {
        return ac(2, i, 0, runnable, 994194172);
    }

    public final ll aq(Runnable runnable, int i, byte b) {
        try {
            return ac(2, i, 0, runnable, 574128341);
        } catch (Throwable e) {
            throw ei.ac(e, "ls.aq(" + ')');
        }
    }

    public final ll as(Runnable runnable, int i) {
        return ac(2, i, 0, runnable, -85110525);
    }

    public final ll az(Runnable runnable, int i) {
        return ac(2, i, 0, runnable, 475415284);
    }
}
