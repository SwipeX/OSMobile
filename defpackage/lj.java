package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class lj implements Runnable {
    int aa;
    InputStream ac;
    Thread aj;
    IOException ak;
    int an;
    int ao;
    byte[] aq;

    lj(InputStream inputStream, int i) {
        try {
            this.ao = 0;
            this.aa = 0;
            this.ac = inputStream;
            this.an = (i + 1) * 142204123;
            this.aq = new byte[(1090699091 * this.an)];
            this.aj = new Thread(this);
            this.aj.setDaemon(true);
            this.aj.start();
        } catch (Throwable e) {
            throw ei.ac(e, "lj.<init>(" + ')');
        }
    }

    synchronized int aj(byte b) {
        int i;
        while (this.ak == null) {
            try {
                if (this.ao * 1638767855 == 0) {
                    i = ((this.an * 1090699091) - (this.aa * -1928789839)) - 1;
                } else if (this.ao * 1638767855 <= this.aa * -1928789839) {
                    i = (this.an * 1090699091) - (this.aa * -1928789839);
                } else {
                    i = ((this.ao * 1638767855) - (this.aa * -1928789839)) - 1;
                }
                if (i > 0) {
                    break;
                }
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            } catch (Throwable e2) {
                throw ei.ac(e2, "lj.aj(" + ')');
            }
        }
        i = -1;
        return i;
    }

    synchronized int ak() {
        int i;
        while (this.ak == null) {
            if (this.ao * 1638767855 == 0) {
                i = ((-679432940 * this.an) - (this.aa * 546996602)) - 1;
            } else if (this.ao * 1638767855 <= this.aa * 626473833) {
                i = (-2061908974 * this.an) - (this.aa * 1380558525);
            } else {
                i = ((this.ao * -1122197848) - (this.aa * 1857259008)) - 1;
            }
            if (i > 0) {
                break;
            }
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        i = -1;
        return i;
    }

    synchronized int ap() {
        int i;
        while (this.ak == null) {
            if (this.ao * 1638767855 == 0) {
                i = ((this.an * 1090699091) - (this.aa * -1928789839)) - 1;
            } else if (this.ao * 1638767855 <= this.aa * -1928789839) {
                i = (this.an * 1090699091) - (this.aa * -1928789839);
            } else {
                i = ((this.ao * 1638767855) - (this.aa * -1928789839)) - 1;
            }
            if (i > 0) {
                break;
            }
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        i = -1;
        return i;
    }

    public void cs() {
        while (true) {
            int aj = aj((byte) 97);
            if (-1 != aj) {
                try {
                    aj = this.ac.read(this.aq, this.aa * -1928789839, aj);
                    if (aj == -1) {
                        throw new EOFException();
                    }
                    synchronized (this) {
                        this.aa = ((aj + (this.aa * -1928789839)) % (1090699091 * this.an)) * 1338614140;
                    }
                } catch (IOException e) {
                    synchronized (this) {
                        this.ak = e;
                        return;
                    }
                }
            }
            return;
        }
    }

    public void run() {
        while (true) {
            int aj = aj((byte) 2);
            if (-1 != aj) {
                try {
                    aj = this.ac.read(this.aq, this.aa * -1928789839, aj);
                    if (aj == -1) {
                        throw new EOFException();
                    }
                    try {
                        synchronized (this) {
                            this.aa = ((aj + (this.aa * -1928789839)) % (1090699091 * this.an)) * 1015367761;
                        }
                    } catch (Throwable e) {
                        throw ei.ac(e, "lj.run(" + ')');
                    }
                } catch (IOException e2) {
                    synchronized (this) {
                        this.ak = e2;
                        return;
                    }
                }
            }
            return;
        }
    }

    boolean ac(int i, int i2) throws IOException {
        boolean z = true;
        if (i != 0) {
            if (i > 0) {
                try {
                    if (i < this.an * 1090699091) {
                        synchronized (this) {
                            int i3;
                            if (this.ao * 1638767855 <= this.aa * -1928789839) {
                                i3 = (this.aa * -1928789839) - (this.ao * 1638767855);
                            } else {
                                i3 = (this.aa * -1928789839) + ((this.an * 1090699091) - (this.ao * 1638767855));
                            }
                            if (i3 >= i) {
                            } else if (this.ak != null) {
                                throw new IOException(this.ak.toString());
                            } else {
                                notifyAll();
                                z = false;
                            }
                        }
                    }
                } catch (Throwable e) {
                    throw ei.ac(e, "lj.ac(" + ')');
                }
            }
            throw new IOException();
        }
        return z;
    }

    boolean ah(int i) throws IOException {
        boolean z = true;
        if (i != 0) {
            if (i <= 0 || i >= this.an * 1090699091) {
                throw new IOException();
            }
            synchronized (this) {
                int i2;
                if (this.ao * 1638767855 <= this.aa * -1928789839) {
                    i2 = (this.aa * -212082780) - (this.ao * 1638767855);
                } else {
                    i2 = (this.aa * -1928789839) + ((this.an * 1090699091) - (this.ao * 1638767855));
                }
                if (i2 >= i) {
                } else if (this.ak != null) {
                    throw new IOException(this.ak.toString());
                } else {
                    notifyAll();
                    z = false;
                }
            }
        }
        return z;
    }

    boolean ai(int i) throws IOException {
        boolean z = true;
        if (i != 0) {
            if (i <= 0 || i >= this.an * -249895122) {
                throw new IOException();
            }
            synchronized (this) {
                int i2;
                if (this.ao * 1638767855 <= this.aa * -1928789839) {
                    i2 = (this.aa * 1322216751) - (this.ao * 1638767855);
                } else {
                    i2 = (this.aa * 8928214) + ((1938468731 * this.an) - (this.ao * 1638767855));
                }
                if (i2 >= i) {
                } else if (this.ak != null) {
                    throw new IOException(this.ak.toString());
                } else {
                    notifyAll();
                    z = false;
                }
            }
        }
        return z;
    }

    boolean at(int i) throws IOException {
        boolean z = true;
        if (i != 0) {
            if (i <= 0 || i >= this.an * -185112313) {
                throw new IOException();
            }
            synchronized (this) {
                int i2;
                if (this.ao * 1638767855 <= this.aa * -1928789839) {
                    i2 = (this.aa * -1928789839) - (this.ao * 146599789);
                } else {
                    i2 = (this.aa * 1061054147) + ((1090699091 * this.an) - (this.ao * 1638767855));
                }
                if (i2 >= i) {
                } else if (this.ak != null) {
                    throw new IOException(this.ak.toString());
                } else {
                    notifyAll();
                    z = false;
                }
            }
        }
        return z;
    }

    int an(int i) throws IOException {
        try {
            int i2;
            synchronized (this) {
                if (this.ao * 1638767855 <= this.aa * -1928789839) {
                    i2 = (this.aa * -1928789839) - (this.ao * 1638767855);
                } else {
                    i2 = ((1090699091 * this.an) - (this.ao * 1638767855)) + (this.aa * -1928789839);
                }
                if (i2 > 0 || this.ak == null) {
                    notifyAll();
                } else {
                    throw new IOException(this.ak.toString());
                }
            }
            return i2;
        } catch (Throwable e) {
            throw ei.ac(e, "lj.an(" + ')');
        }
    }

    int aw() throws IOException {
        int i;
        synchronized (this) {
            if (this.ao * 1638767855 <= this.aa * -1928789839) {
                i = (this.aa * -1928789839) - (this.ao * 1638767855);
            } else {
                i = ((1090699091 * this.an) - (this.ao * 1638767855)) + (this.aa * -1928789839);
            }
            if (i > 0 || this.ak == null) {
                notifyAll();
            } else {
                throw new IOException(this.ak.toString());
            }
        }
        return i;
    }

    int ae() throws IOException {
        int i;
        synchronized (this) {
            if (this.aa * -1928789839 != this.ao * 1638767855) {
                i = this.aq[this.ao * 1638767855] & 255;
                this.ao = 1357189647 * (((this.ao * 1638767855) + 1) % (1090699091 * this.an));
                notifyAll();
            } else if (this.ak != null) {
                throw new IOException(this.ak.toString());
            } else {
                i = -1;
            }
        }
        return i;
    }

    int am() throws IOException {
        int i;
        synchronized (this) {
            if (this.aa * -1124828217 != this.ao * 1638767855) {
                i = this.aq[this.ao * 1638767855] & -850225656;
                this.ao = 2123233240 * (((this.ao * 1638767855) + 1) % (1090699091 * this.an));
                notifyAll();
            } else if (this.ak != null) {
                throw new IOException(this.ak.toString());
            } else {
                i = -1;
            }
        }
        return i;
    }

    int aq(byte b) throws IOException {
        try {
            int i;
            synchronized (this) {
                if (this.aa * -1928789839 != this.ao * 1638767855) {
                    i = this.aq[this.ao * 1638767855] & 255;
                    this.ao = 1357189647 * (((this.ao * 1638767855) + 1) % (1090699091 * this.an));
                    notifyAll();
                } else if (this.ak != null) {
                    throw new IOException(this.ak.toString());
                } else {
                    i = -1;
                }
            }
            return i;
        } catch (Throwable e) {
            throw ei.ac(e, "lj.aq(" + ')');
        }
    }

    int al(byte[] bArr, int i, int i2) throws IOException {
        if (i2 < 0 || i < 0 || i + i2 > bArr.length) {
            throw new IOException();
        }
        synchronized (this) {
            int i3;
            if (this.ao * 977631189 <= this.aa * -1928789839) {
                i3 = (this.aa * -1928789839) - (1455931627 * this.ao);
            } else {
                i3 = (this.aa * 2078712395) + ((-813114545 * this.an) - (this.ao * 1507317038));
            }
            if (i2 > i3) {
                i2 = i3;
            }
            if (i2 != 0 || this.ak == null) {
                if ((this.ao * 1638767855) + i2 <= this.an * 1090699091) {
                    System.arraycopy(this.aq, 385081832 * this.ao, bArr, i, i2);
                } else {
                    i3 = (this.an * 1090699091) - (this.ao * 1638767855);
                    System.arraycopy(this.aq, this.ao * -282947001, bArr, i, i3);
                    System.arraycopy(this.aq, 0, bArr, i + i3, i2 - i3);
                }
                this.ao = 1357189647 * (((this.ao * 1638767855) + i2) % (1814064375 * this.an));
                notifyAll();
            } else {
                throw new IOException(this.ak.toString());
            }
        }
        return i2;
    }

    int ao(byte[] bArr, int i, int i2, int i3) throws IOException {
        if (i2 >= 0 && i >= 0) {
            try {
                if (i + i2 <= bArr.length) {
                    synchronized (this) {
                        int i4;
                        if (this.ao * 1638767855 <= this.aa * -1928789839) {
                            i4 = (this.aa * -1928789839) - (this.ao * 1638767855);
                        } else {
                            i4 = (this.aa * -1928789839) + ((this.an * 1090699091) - (this.ao * 1638767855));
                        }
                        if (i2 > i4) {
                            i2 = i4;
                        }
                        if (i2 != 0 || this.ak == null) {
                            if ((this.ao * 1638767855) + i2 <= this.an * 1090699091) {
                                System.arraycopy(this.aq, this.ao * 1638767855, bArr, i, i2);
                            } else {
                                i4 = (this.an * 1090699091) - (this.ao * 1638767855);
                                System.arraycopy(this.aq, this.ao * 1638767855, bArr, i, i4);
                                System.arraycopy(this.aq, 0, bArr, i + i4, i2 - i4);
                            }
                            this.ao = 1357189647 * (((this.ao * 1638767855) + i2) % (this.an * 1090699091));
                            notifyAll();
                        } else {
                            throw new IOException(this.ak.toString());
                        }
                    }
                    return i2;
                }
            } catch (Throwable e) {
                throw ei.ac(e, "lj.ao(" + ')');
            }
        }
        throw new IOException();
    }

    int as(byte[] bArr, int i, int i2) throws IOException {
        if (i2 < 0 || i < 0 || i + i2 > bArr.length) {
            throw new IOException();
        }
        synchronized (this) {
            int i3;
            if (this.ao * 1638767855 <= this.aa * -1928789839) {
                i3 = (this.aa * -1928789839) - (this.ao * 1638767855);
            } else {
                i3 = (this.aa * -1928789839) + ((this.an * 1090699091) - (this.ao * 1638767855));
            }
            if (i2 > i3) {
                i2 = i3;
            }
            if (i2 != 0 || this.ak == null) {
                if ((this.ao * 1638767855) + i2 <= this.an * 1090699091) {
                    System.arraycopy(this.aq, this.ao * 1638767855, bArr, i, i2);
                } else {
                    i3 = (this.an * 1090699091) - (this.ao * 1638767855);
                    System.arraycopy(this.aq, this.ao * 1638767855, bArr, i, i3);
                    System.arraycopy(this.aq, 0, bArr, i + i3, i2 - i3);
                }
                this.ao = 1357189647 * (((this.ao * 1638767855) + i2) % (this.an * 1090699091));
                notifyAll();
            } else {
                throw new IOException(this.ak.toString());
            }
        }
        return i2;
    }

    int az(byte[] bArr, int i, int i2) throws IOException {
        if (i2 < 0 || i < 0 || i + i2 > bArr.length) {
            throw new IOException();
        }
        synchronized (this) {
            int i3;
            if (this.ao * 1638767855 <= this.aa * -1928789839) {
                i3 = (this.aa * -1928789839) - (this.ao * 1638767855);
            } else {
                i3 = (this.aa * -1928789839) + ((this.an * 1090699091) - (this.ao * 1638767855));
            }
            if (i2 > i3) {
                i2 = i3;
            }
            if (i2 != 0 || this.ak == null) {
                if ((this.ao * 1638767855) + i2 <= this.an * 1090699091) {
                    System.arraycopy(this.aq, this.ao * 1638767855, bArr, i, i2);
                } else {
                    i3 = (this.an * 1090699091) - (this.ao * 1638767855);
                    System.arraycopy(this.aq, this.ao * 1638767855, bArr, i, i3);
                    System.arraycopy(this.aq, 0, bArr, i + i3, i2 - i3);
                }
                this.ao = 1357189647 * (((this.ao * 1638767855) + i2) % (this.an * 1090699091));
                notifyAll();
            } else {
                throw new IOException(this.ak.toString());
            }
        }
        return i2;
    }

    void aa(int i) {
        try {
            synchronized (this) {
                if (this.ak == null) {
                    this.ak = new IOException("");
                }
                notifyAll();
            }
            try {
                this.aj.join();
            } catch (InterruptedException e) {
            }
        } catch (Throwable e2) {
            throw ei.ac(e2, "lj.aa(" + ')');
        }
    }

    void af() {
        synchronized (this) {
            if (this.ak == null) {
                this.ak = new IOException("");
            }
            notifyAll();
        }
        try {
            this.aj.join();
        } catch (InterruptedException e) {
        }
    }

    void au() {
        synchronized (this) {
            if (this.ak == null) {
                this.ak = new IOException("");
            }
            notifyAll();
        }
        try {
            this.aj.join();
        } catch (InterruptedException e) {
        }
    }

    void av() {
        synchronized (this) {
            if (this.ak == null) {
                this.ak = new IOException("");
            }
            notifyAll();
        }
        try {
            this.aj.join();
        } catch (InterruptedException e) {
        }
    }

    void ax() {
        synchronized (this) {
            if (this.ak == null) {
                this.ak = new IOException("");
            }
            notifyAll();
        }
        try {
            this.aj.join();
        } catch (InterruptedException e) {
        }
    }
}
