package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class lw extends lo implements Runnable {
    static final int br = 32;
    public static int hn;
    ll aa;
    OutputStream ac;
    boolean ah;
    final int ai;
    InputStream aj;
    byte[] ak;
    Socket an;
    ls ao;
    int ap;
    boolean aq;
    int at;
    final int aw;

    public lw(Socket socket, ls lsVar, int i) throws IOException {
        try {
            this.aq = false;
            this.ap = 0;
            this.at = 0;
            this.ah = false;
            this.ao = lsVar;
            this.an = socket;
            this.ai = 1197236653 * i;
            this.aw = -142521291 * (i - 100);
            this.an.setSoTimeout(30000);
            this.an.setTcpNoDelay(true);
            this.an.setReceiveBufferSize(65536);
            this.an.setSendBufferSize(65536);
            this.aj = this.an.getInputStream();
            this.ac = this.an.getOutputStream();
        } catch (Throwable e) {
            throw ei.ac(e, "lw.<init>(" + ')');
        }
    }

    public void ah() {
        if (!this.aq) {
            synchronized (this) {
                this.aq = true;
                notifyAll();
            }
            if (this.aa != null) {
                while (this.aa.ao == 0) {
                    da.aj(1);
                }
                if (this.aa.ao == 1) {
                    try {
                        ((Thread) this.aa.at).join();
                    } catch (InterruptedException e) {
                    }
                }
            }
            this.aa = null;
        }
    }

    public void aj(short s) {
        try {
            if (!this.aq) {
                synchronized (this) {
                    this.aq = true;
                    notifyAll();
                }
                if (this.aa != null) {
                    while (this.aa.ao == 0) {
                        da.aj(1);
                    }
                    if (this.aa.ao == 1) {
                        try {
                            ((Thread) this.aa.at).join();
                        } catch (InterruptedException e) {
                        }
                    }
                }
                this.aa = null;
            }
        } catch (Throwable e2) {
            throw ei.ac(e2, "lw.aj(" + ')');
        }
    }

    public void ap() {
        if (!this.aq) {
            synchronized (this) {
                this.aq = true;
                notifyAll();
            }
            if (this.aa != null) {
                while (this.aa.ao == 0) {
                    da.aj(1);
                }
                if (this.aa.ao == 1) {
                    try {
                        ((Thread) this.aa.at).join();
                    } catch (InterruptedException e) {
                    }
                }
            }
            this.aa = null;
        }
    }

    public void at() {
        if (!this.aq) {
            synchronized (this) {
                this.aq = true;
                notifyAll();
            }
            if (this.aa != null) {
                while (this.aa.ao == 0) {
                    da.aj(1);
                }
                if (this.aa.ao == 1) {
                    try {
                        ((Thread) this.aa.at).join();
                    } catch (InterruptedException e) {
                    }
                }
            }
            this.aa = null;
        }
    }

    protected void aad() {
        aj((short) -3022);
    }

    protected void aaq() {
        aj((short) -6791);
    }

    protected void aax() {
        aj((short) -6995);
    }

    protected void finalize() {
        try {
            aj((short) -9847);
        } catch (Throwable e) {
            throw ei.ac(e, "lw.finalize(" + ')');
        }
    }

    protected void za() {
        aj((short) -23291);
    }

    protected void zy() {
        aj((short) -23796);
    }

    public int ac(short s) throws IOException {
        try {
            return this.aq ? 0 : this.aj.read();
        } catch (Throwable e) {
            throw ei.ac(e, "lw.ac(" + ')');
        }
    }

    public int ai() throws IOException {
        if (this.aq) {
            return 0;
        }
        return this.aj.read();
    }

    public int am() throws IOException {
        if (this.aq) {
            return 0;
        }
        return this.aj.read();
    }

    public int aw() throws IOException {
        if (this.aq) {
            return 0;
        }
        return this.aj.read();
    }

    public int ae() throws IOException {
        if (this.aq) {
            return 0;
        }
        return this.aj.available();
    }

    public int an(byte b) throws IOException {
        try {
            return this.aq ? 0 : this.aj.available();
        } catch (Throwable e) {
            throw ei.ac(e, "lw.an(" + ')');
        }
    }

    public boolean aq(int i, int i2) throws IOException {
        try {
            if (this.aq) {
                return false;
            }
            if (this.aj.available() >= i) {
                return true;
            }
            return false;
        } catch (Throwable e) {
            throw new IOException("Error reading from clientstream", e);
        } catch (Throwable e2) {
            throw ei.ac(e2, "lw.aq(" + ')');
        }
    }

    public boolean as(int i) throws IOException {
        if (this.aq) {
            return false;
        }
        try {
            if (this.aj.available() >= i) {
                return true;
            }
            return false;
        } catch (Throwable e) {
            throw new IOException("Error reading from clientstream", e);
        }
    }

    public int al(byte[] bArr, int i, int i2) throws IOException {
        if (this.aq) {
            return 0;
        }
        int i3 = i2;
        while (i3 > 0) {
            int read = this.aj.read(bArr, i, i3);
            if (read <= 0) {
                throw new EOFException();
            }
            i += read;
            i3 -= read;
        }
        return i2;
    }

    public int ao(byte[] bArr, int i, int i2, int i3) throws IOException {
        try {
            if (this.aq) {
                return 0;
            }
            int i4 = i2;
            while (i4 > 0) {
                int read = this.aj.read(bArr, i, i4);
                if (read <= 0) {
                    throw new EOFException();
                }
                i += read;
                i4 -= read;
            }
            return i2;
        } catch (Throwable e) {
            throw ei.ac(e, "lw.ao(" + ')');
        }
    }

    public int ax(byte[] bArr, int i, int i2) throws IOException {
        if (this.aq) {
            return 0;
        }
        int i3 = i2;
        while (i3 > 0) {
            int read = this.aj.read(bArr, i, i3);
            if (read <= 0) {
                throw new EOFException();
            }
            i += read;
            i3 -= read;
        }
        return i2;
    }

    public int az(byte[] bArr, int i, int i2) throws IOException {
        if (this.aq) {
            return 0;
        }
        int i3 = i2;
        while (i3 > 0) {
            int read = this.aj.read(bArr, i, i3);
            if (read <= 0) {
                throw new EOFException();
            }
            i += read;
            i3 -= read;
        }
        return i2;
    }

    void aa(byte[] bArr, int i, int i2, int i3) throws IOException {
        try {
            if (!this.aq) {
                if (this.ah) {
                    this.ah = false;
                    throw new IOException();
                }
                if (this.ak == null) {
                    this.ak = new byte[(this.ai * 84781605)];
                }
                synchronized (this) {
                    for (int i4 = 0; i4 < i2; i4++) {
                        this.ak[this.at * -768282225] = bArr[i4 + i];
                        this.at = (((this.at * -768282225) + 1) % (this.ai * 84781605)) * -1488384657;
                        if (this.at * -768282225 == ((this.ap * -1873716677) + (556836381 * this.aw)) % (this.ai * 84781605)) {
                            throw new IOException();
                        }
                    }
                    if (this.aa == null) {
                        this.aa = this.ao.aq(this, 3, (byte) 0);
                    }
                    notifyAll();
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "lw.aa(" + ')');
        }
    }

    void af(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (!this.aq) {
            if (this.ah) {
                this.ah = false;
                throw new IOException();
            }
            if (this.ak == null) {
                this.ak = new byte[(this.ai * 2007513588)];
            }
            synchronized (this) {
                while (i3 < i2) {
                    this.ak[-493619606 * this.at] = bArr[i3 + i];
                    this.at = (((-1604742630 * this.at) + 1) % (this.ai * -420005788)) * -1488384657;
                    if (1442274475 * this.at == ((this.ap * -1873716677) + (556836381 * this.aw)) % (this.ai * 84781605)) {
                        throw new IOException();
                    }
                    i3++;
                }
                if (this.aa == null) {
                    this.aa = this.ao.aq(this, 3, (byte) 0);
                }
                notifyAll();
            }
        }
    }

    void au(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (!this.aq) {
            if (this.ah) {
                this.ah = false;
                throw new IOException();
            }
            if (this.ak == null) {
                this.ak = new byte[(this.ai * 84781605)];
            }
            synchronized (this) {
                while (i3 < i2) {
                    this.ak[this.at * -768282225] = bArr[i3 + i];
                    this.at = (((this.at * -768282225) + 1) % (this.ai * 84781605)) * -1488384657;
                    if (this.at * -768282225 == ((this.ap * -1873716677) + (556836381 * this.aw)) % (this.ai * 84781605)) {
                        throw new IOException();
                    }
                    i3++;
                }
                if (this.aa == null) {
                    this.aa = this.ao.aq(this, 3, (byte) 0);
                }
                notifyAll();
            }
        }
    }

    void av(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (!this.aq) {
            if (this.ah) {
                this.ah = false;
                throw new IOException();
            }
            if (this.ak == null) {
                this.ak = new byte[(this.ai * 84781605)];
            }
            synchronized (this) {
                while (i3 < i2) {
                    this.ak[this.at * -768282225] = bArr[i3 + i];
                    this.at = (((this.at * -768282225) + 1) % (this.ai * 84781605)) * -1488384657;
                    if (this.at * -768282225 == ((this.ap * -1873716677) + (556836381 * this.aw)) % (this.ai * 84781605)) {
                        throw new IOException();
                    }
                    i3++;
                }
                if (this.aa == null) {
                    this.aa = this.ao.aq(this, 3, (byte) 0);
                }
                notifyAll();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void cs() {
        /*
        r7 = this;
        r6 = 0;
        r5 = -768282225; // 0xffffffffd234f18f float:-1.94286698E11 double:NaN;
        r4 = -1873716677; // 0xffffffff90515a3b float:-4.1287493E-29 double:NaN;
    L_0x0007:
        monitor-enter(r7);	 Catch:{ Exception -> 0x0080 }
        r0 = r7.at;	 Catch:{ all -> 0x0092 }
        r0 = r0 * r5;
        r1 = r7.ap;	 Catch:{ all -> 0x0092 }
        r1 = r1 * r4;
        if (r0 != r1) goto L_0x0037;
    L_0x0010:
        r0 = r7.aq;	 Catch:{ all -> 0x0092 }
        if (r0 == 0) goto L_0x0034;
    L_0x0014:
        monitor-exit(r7);	 Catch:{ all -> 0x0092 }
        r0 = r7.aj;	 Catch:{ IOException -> 0x009c }
        if (r0 == 0) goto L_0x001e;
    L_0x0019:
        r0 = r7.aj;	 Catch:{ IOException -> 0x009c }
        r0.close();	 Catch:{ IOException -> 0x009c }
    L_0x001e:
        r0 = r7.ac;	 Catch:{ IOException -> 0x009c }
        if (r0 == 0) goto L_0x0027;
    L_0x0022:
        r0 = r7.ac;	 Catch:{ IOException -> 0x009c }
        r0.close();	 Catch:{ IOException -> 0x009c }
    L_0x0027:
        r0 = r7.an;	 Catch:{ IOException -> 0x009c }
        if (r0 == 0) goto L_0x0030;
    L_0x002b:
        r0 = r7.an;	 Catch:{ IOException -> 0x009c }
        r0.close();	 Catch:{ IOException -> 0x009c }
    L_0x0030:
        r0 = 0;
        r7.ak = r0;	 Catch:{ Exception -> 0x0080 }
    L_0x0033:
        return;
    L_0x0034:
        r7.wait();	 Catch:{ InterruptedException -> 0x009a }
    L_0x0037:
        r0 = -1889350538; // 0xffffffff8f62cc76 float:-1.1182038E-29 double:NaN;
        r1 = r7.ap;	 Catch:{ all -> 0x0092 }
        r1 = r1 * r0;
        r0 = r7.at;	 Catch:{ all -> 0x0092 }
        r0 = r0 * r5;
        r2 = r7.ap;	 Catch:{ all -> 0x0092 }
        r2 = r2 * r4;
        if (r0 < r2) goto L_0x0087;
    L_0x0045:
        r0 = r7.at;	 Catch:{ all -> 0x0092 }
        r0 = r0 * r5;
        r2 = -1098128847; // 0xffffffffbe8be231 float:-0.27321008 double:NaN;
        r3 = r7.ap;	 Catch:{ all -> 0x0092 }
        r2 = r2 * r3;
        r0 = r0 - r2;
    L_0x004f:
        monitor-exit(r7);	 Catch:{ all -> 0x0092 }
        if (r0 <= 0) goto L_0x0007;
    L_0x0052:
        r2 = r7.ac;	 Catch:{ IOException -> 0x0095 }
        r3 = r7.ak;	 Catch:{ IOException -> 0x0095 }
        r2.write(r3, r1, r0);	 Catch:{ IOException -> 0x0095 }
    L_0x0059:
        r1 = 1282889457; // 0x4c7756f1 float:6.4838596E7 double:6.33831608E-315;
        r2 = r7.ap;	 Catch:{ Exception -> 0x0080 }
        r2 = r2 * r4;
        r0 = r0 + r2;
        r2 = r7.ai;	 Catch:{ Exception -> 0x0080 }
        r3 = 1571006029; // 0x5da3a64d float:1.47402467E18 double:7.761801083E-315;
        r2 = r2 * r3;
        r0 = r0 % r2;
        r0 = r0 * r1;
        r7.ap = r0;	 Catch:{ Exception -> 0x0080 }
        r0 = r7.at;	 Catch:{ IOException -> 0x007b }
        r0 = r0 * r5;
        r1 = -882085262; // 0xffffffffcb6c7272 float:-1.5495794E7 double:NaN;
        r2 = r7.ap;	 Catch:{ IOException -> 0x007b }
        r1 = r1 * r2;
        if (r0 != r1) goto L_0x0007;
    L_0x0075:
        r0 = r7.ac;	 Catch:{ IOException -> 0x007b }
        r0.flush();	 Catch:{ IOException -> 0x007b }
        goto L_0x0007;
    L_0x007b:
        r0 = move-exception;
        r0 = 1;
        r7.ah = r0;	 Catch:{ Exception -> 0x0080 }
        goto L_0x0007;
    L_0x0080:
        r0 = move-exception;
        r1 = 84;
        defpackage.hq.aj(r6, r0, r1);
        goto L_0x0033;
    L_0x0087:
        r0 = -1390777533; // 0xffffffffad1a6b43 float:-8.777703E-12 double:NaN;
        r2 = r7.ai;	 Catch:{ all -> 0x0092 }
        r0 = r0 * r2;
        r2 = r7.ap;	 Catch:{ all -> 0x0092 }
        r2 = r2 * r4;
        r0 = r0 - r2;
        goto L_0x004f;
    L_0x0092:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x0092 }
        throw r0;	 Catch:{ Exception -> 0x0080 }
    L_0x0095:
        r1 = move-exception;
        r1 = 1;
        r7.ah = r1;	 Catch:{ Exception -> 0x0080 }
        goto L_0x0059;
    L_0x009a:
        r0 = move-exception;
        goto L_0x0037;
    L_0x009c:
        r0 = move-exception;
        goto L_0x0030;
        */
        throw new UnsupportedOperationException("Method not decompiled: lw.cs():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r7 = this;
        r6 = 84781605; // 0x50daa25 float:6.661039E-36 double:4.18876784E-316;
        r5 = -768282225; // 0xffffffffd234f18f float:-1.94286698E11 double:NaN;
        r4 = -1873716677; // 0xffffffff90515a3b float:-4.1287493E-29 double:NaN;
    L_0x0009:
        monitor-enter(r7);	 Catch:{ Exception -> 0x0077 }
        r0 = r7.at;	 Catch:{ all -> 0x00a2 }
        r0 = r0 * r5;
        r1 = r7.ap;	 Catch:{ all -> 0x00a2 }
        r1 = r1 * r4;
        if (r0 != r1) goto L_0x0039;
    L_0x0012:
        r0 = r7.aq;	 Catch:{ all -> 0x00a2 }
        if (r0 == 0) goto L_0x0036;
    L_0x0016:
        monitor-exit(r7);	 Catch:{ all -> 0x00a2 }
        r0 = r7.aj;	 Catch:{ IOException -> 0x00ac }
        if (r0 == 0) goto L_0x0020;
    L_0x001b:
        r0 = r7.aj;	 Catch:{ IOException -> 0x00ac }
        r0.close();	 Catch:{ IOException -> 0x00ac }
    L_0x0020:
        r0 = r7.ac;	 Catch:{ IOException -> 0x00ac }
        if (r0 == 0) goto L_0x0029;
    L_0x0024:
        r0 = r7.ac;	 Catch:{ IOException -> 0x00ac }
        r0.close();	 Catch:{ IOException -> 0x00ac }
    L_0x0029:
        r0 = r7.an;	 Catch:{ IOException -> 0x00ac }
        if (r0 == 0) goto L_0x0032;
    L_0x002d:
        r0 = r7.an;	 Catch:{ IOException -> 0x00ac }
        r0.close();	 Catch:{ IOException -> 0x00ac }
    L_0x0032:
        r0 = 0;
        r7.ak = r0;	 Catch:{ Exception -> 0x0077 }
    L_0x0035:
        return;
    L_0x0036:
        r7.wait();	 Catch:{ InterruptedException -> 0x00aa }
    L_0x0039:
        r0 = r7.ap;	 Catch:{ all -> 0x00a2 }
        r1 = r4 * r0;
        r0 = r7.at;	 Catch:{ all -> 0x00a2 }
        r0 = r0 * r5;
        r2 = r7.ap;	 Catch:{ all -> 0x00a2 }
        r2 = r2 * r4;
        if (r0 < r2) goto L_0x009a;
    L_0x0045:
        r0 = r7.at;	 Catch:{ all -> 0x00a2 }
        r0 = r0 * r5;
        r2 = r7.ap;	 Catch:{ all -> 0x00a2 }
        r2 = r2 * r4;
        r0 = r0 - r2;
    L_0x004c:
        monitor-exit(r7);	 Catch:{ all -> 0x00a2 }
        if (r0 <= 0) goto L_0x0009;
    L_0x004f:
        r2 = r7.ac;	 Catch:{ IOException -> 0x00a5 }
        r3 = r7.ak;	 Catch:{ IOException -> 0x00a5 }
        r2.write(r3, r1, r0);	 Catch:{ IOException -> 0x00a5 }
    L_0x0056:
        r1 = 669413107; // 0x27e66ef3 float:6.3958115E-15 double:3.30734019E-315;
        r2 = r7.ap;	 Catch:{ Exception -> 0x0077 }
        r2 = r2 * r4;
        r0 = r0 + r2;
        r2 = r7.ai;	 Catch:{ Exception -> 0x0077 }
        r2 = r2 * r6;
        r0 = r0 % r2;
        r0 = r0 * r1;
        r7.ap = r0;	 Catch:{ Exception -> 0x0077 }
        r0 = r7.at;	 Catch:{ IOException -> 0x0072 }
        r0 = r0 * r5;
        r1 = r7.ap;	 Catch:{ IOException -> 0x0072 }
        r1 = r1 * r4;
        if (r0 != r1) goto L_0x0009;
    L_0x006c:
        r0 = r7.ac;	 Catch:{ IOException -> 0x0072 }
        r0.flush();	 Catch:{ IOException -> 0x0072 }
        goto L_0x0009;
    L_0x0072:
        r0 = move-exception;
        r0 = 1;
        r7.ah = r0;	 Catch:{ Exception -> 0x0077 }
        goto L_0x0009;
    L_0x0077:
        r0 = move-exception;
        r1 = 0;
        r2 = 50;
        defpackage.hq.aj(r1, r0, r2);	 Catch:{ RuntimeException -> 0x007f }
        goto L_0x0035;
    L_0x007f:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "lw.run(";
        r1 = r1.append(r2);
        r2 = 41;
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0 = defpackage.ei.ac(r0, r1);
        throw r0;
    L_0x009a:
        r0 = r7.ai;	 Catch:{ all -> 0x00a2 }
        r0 = r0 * r6;
        r2 = r7.ap;	 Catch:{ all -> 0x00a2 }
        r2 = r2 * r4;
        r0 = r0 - r2;
        goto L_0x004c;
    L_0x00a2:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x00a2 }
        throw r0;	 Catch:{ Exception -> 0x0077 }
    L_0x00a5:
        r1 = move-exception;
        r1 = 1;
        r7.ah = r1;	 Catch:{ Exception -> 0x0077 }
        goto L_0x0056;
    L_0x00aa:
        r0 = move-exception;
        goto L_0x0039;
    L_0x00ac:
        r0 = move-exception;
        goto L_0x0032;
        */
        throw new UnsupportedOperationException("Method not decompiled: lw.run():void");
    }

    public void ak(byte[] bArr, int i, int i2, int i3) throws IOException {
        try {
            aa(bArr, i, i2, 394511582);
        } catch (Throwable e) {
            throw ei.ac(e, "lw.ak(" + ')');
        }
    }

    public void ay(byte[] bArr, int i, int i2) throws IOException {
        aa(bArr, i, i2, 2075270217);
    }
}
