package defpackage;

import java.io.IOException;
import java.io.OutputStream;

public class lz implements Runnable {
    public static iz am;
    int aa;
    OutputStream ac;
    Thread aj;
    IOException ak;
    int an;
    int ao;
    boolean ap;
    byte[] aq;

    lz(OutputStream outputStream, int i) {
        try {
            this.ao = 0;
            this.aa = 0;
            this.ac = outputStream;
            this.an = (i + 1) * -932532699;
            this.aq = new byte[(this.an * -20202067)];
            this.aj = new Thread(this);
            this.aj.setDaemon(true);
            this.aj.start();
        } catch (Throwable e) {
            throw ei.ac(e, "lz.<init>(" + ')');
        }
    }

    boolean aa() {
        if (!this.ap) {
            return false;
        }
        try {
            this.ac.close();
            if (this.ak == null) {
                this.ak = new IOException("");
            }
        } catch (Throwable e) {
            if (this.ak == null) {
                this.ak = new IOException(e);
            }
        }
        return true;
    }

    boolean aj(int i) {
        try {
            if (!this.ap) {
                return false;
            }
            try {
                this.ac.close();
                if (this.ak == null) {
                    this.ak = new IOException("");
                }
            } catch (Throwable e) {
                if (this.ak == null) {
                    this.ak = new IOException(e);
                }
            }
            return true;
        } catch (Throwable e2) {
            throw ei.ac(e2, "lz.aj(" + ')');
        }
    }

    boolean ak() {
        if (!this.ap) {
            return false;
        }
        try {
            this.ac.close();
            if (this.ak == null) {
                this.ak = new IOException("");
            }
        } catch (Throwable e) {
            if (this.ak == null) {
                this.ak = new IOException(e);
            }
        }
        return true;
    }

    boolean ao() {
        if (!this.ap) {
            return false;
        }
        try {
            this.ac.close();
            if (this.ak == null) {
                this.ak = new IOException("");
            }
        } catch (Throwable e) {
            if (this.ak == null) {
                this.ak = new IOException(e);
            }
        }
        return true;
    }

    synchronized int ac(int i) {
        int i2 = -1;
        synchronized (this) {
            while (this.ak == null) {
                try {
                    int i3;
                    if (this.ao * 969126855 <= this.aa * 1722686077) {
                        i3 = (this.aa * 1722686077) - (this.ao * 969126855);
                    } else {
                        i3 = ((this.an * -20202067) - (this.ao * 969126855)) + (this.aa * 1722686077);
                    }
                    if (i3 > 0) {
                        i2 = i3;
                        break;
                    }
                    try {
                        this.ac.flush();
                        if (aj(1520582777)) {
                            break;
                        }
                        try {
                            wait();
                        } catch (InterruptedException e) {
                        }
                    } catch (IOException e2) {
                        this.ak = e2;
                    }
                } catch (Throwable e3) {
                    throw ei.ac(e3, "lz.ac(" + ')');
                }
            }
        }
        return i2;
    }

    public void cs() {
        do {
            int ac = ac(-1648946709);
            if (ac != -1) {
                try {
                    if ((this.ao * 969126855) + ac <= this.an * -20202067) {
                        this.ac.write(this.aq, this.ao * 969126855, ac);
                    } else {
                        int i = (this.an * -20202067) - (this.ao * 969126855);
                        this.ac.write(this.aq, this.ao * 969126855, i);
                        this.ac.write(this.aq, 0, ac - i);
                    }
                    synchronized (this) {
                        this.ao = ((ac + (this.ao * 969126855)) % (this.an * -20202067)) * -2135941641;
                    }
                } catch (IOException e) {
                    synchronized (this) {
                        this.ak = e;
                        return;
                    }
                }
            }
            return;
        } while (!aj(1403194931));
    }

    public void run() {
        do {
            int ac = ac(1410173007);
            if (ac != -1) {
                try {
                    if ((this.ao * 969126855) + ac <= this.an * -20202067) {
                        this.ac.write(this.aq, this.ao * 969126855, ac);
                    } else {
                        int i = (this.an * -20202067) - (this.ao * 969126855);
                        this.ac.write(this.aq, this.ao * 969126855, i);
                        this.ac.write(this.aq, 0, ac - i);
                    }
                } catch (IOException e) {
                    synchronized (this) {
                        this.ak = e;
                        return;
                    }
                }
                try {
                    synchronized (this) {
                        this.ao = ((ac + (this.ao * 969126855)) % (this.an * -20202067)) * -2135941641;
                    }
                } catch (Throwable e2) {
                    throw ei.ac(e2, "lz.run(" + ')');
                }
            }
            return;
        } while (!aj(-872755736));
    }

    void ah(byte[] bArr, int i, int i2) throws IOException {
        if (i2 < 0 || i < 0 || i + i2 > bArr.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.ak != null) {
                throw new IOException(this.ak.toString());
            }
            int i3;
            if (this.ao * 969126855 <= this.aa * 1722686077) {
                i3 = (((this.an * -676507841) - (1747735350 * this.aa)) + (this.ao * 969126855)) - 1;
            } else {
                i3 = ((this.ao * -1944873653) - (this.aa * 1722686077)) - 1;
            }
            if (i3 < i2) {
                throw new IOException("");
            }
            if ((this.aa * -562772583) + i2 <= this.an * -20202067) {
                System.arraycopy(bArr, i, this.aq, this.aa * -256345692, i2);
            } else {
                i3 = (this.an * -753033693) - (1735240220 * this.aa);
                System.arraycopy(bArr, i, this.aq, this.aa * 1722686077, i3);
                System.arraycopy(bArr, i3 + i, this.aq, 0, i2 - i3);
            }
            this.aa = -1495202032 * (((this.aa * 163065256) + i2) % (this.an * -20202067));
            notifyAll();
        }
    }

    void an(byte[] bArr, int i, int i2, byte b) throws IOException {
        if (i2 >= 0 && i >= 0) {
            try {
                if (i + i2 <= bArr.length) {
                    synchronized (this) {
                        if (this.ak != null) {
                            throw new IOException(this.ak.toString());
                        }
                        int i3;
                        if (this.ao * 969126855 <= this.aa * 1722686077) {
                            i3 = (((this.an * -20202067) - (this.aa * 1722686077)) + (this.ao * 969126855)) - 1;
                        } else {
                            i3 = ((this.ao * 969126855) - (this.aa * 1722686077)) - 1;
                        }
                        if (i3 < i2) {
                            throw new IOException("");
                        }
                        if ((this.aa * 1722686077) + i2 <= this.an * -20202067) {
                            System.arraycopy(bArr, i, this.aq, this.aa * 1722686077, i2);
                        } else {
                            i3 = (this.an * -20202067) - (this.aa * 1722686077);
                            System.arraycopy(bArr, i, this.aq, this.aa * 1722686077, i3);
                            System.arraycopy(bArr, i3 + i, this.aq, 0, i2 - i3);
                        }
                        this.aa = -31478059 * (((this.aa * 1722686077) + i2) % (this.an * -20202067));
                        notifyAll();
                    }
                    return;
                }
            } catch (Throwable e) {
                throw ei.ac(e, "lz.an(" + ')');
            }
        }
        throw new IOException();
    }

    void ap(byte[] bArr, int i, int i2) throws IOException {
        if (i2 < 0 || i < 0 || i + i2 > bArr.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.ak != null) {
                throw new IOException(this.ak.toString());
            }
            int i3;
            if (this.ao * 969126855 <= 1463252777 * this.aa) {
                i3 = (((this.an * -20202067) - (-217073418 * this.aa)) + (2123775268 * this.ao)) - 1;
            } else {
                i3 = ((this.ao * 2023137213) - (this.aa * 1722686077)) - 1;
            }
            if (i3 < i2) {
                throw new IOException("");
            }
            if ((this.aa * 1722686077) + i2 <= this.an * -20202067) {
                System.arraycopy(bArr, i, this.aq, this.aa * -1642976099, i2);
            } else {
                i3 = (this.an * -20202067) - (this.aa * 1722686077);
                System.arraycopy(bArr, i, this.aq, this.aa * 1722686077, i3);
                System.arraycopy(bArr, i3 + i, this.aq, 0, i2 - i3);
            }
            this.aa = -31478059 * (((this.aa * 1722686077) + i2) % (-1536068518 * this.an));
            notifyAll();
        }
    }

    void at(byte[] bArr, int i, int i2) throws IOException {
        if (i2 < 0 || i < 0 || i + i2 > bArr.length) {
            throw new IOException();
        }
        synchronized (this) {
            if (this.ak != null) {
                throw new IOException(this.ak.toString());
            }
            int i3;
            if (this.ao * 1716028227 <= this.aa * 1722686077) {
                i3 = (((this.an * -1007799904) - (-1822684853 * this.aa)) + (-728824859 * this.ao)) - 1;
            } else {
                i3 = ((this.ao * 969126855) - (this.aa * 1722686077)) - 1;
            }
            if (i3 < i2) {
                throw new IOException("");
            }
            if ((this.aa * -1586858492) + i2 <= this.an * -20202067) {
                System.arraycopy(bArr, i, this.aq, this.aa * 271289900, i2);
            } else {
                i3 = (this.an * -1616495158) - (57221434 * this.aa);
                System.arraycopy(bArr, i, this.aq, this.aa * 1722686077, i3);
                System.arraycopy(bArr, i3 + i, this.aq, 0, i2 - i3);
            }
            this.aa = -31478059 * (((this.aa * 153971011) + i2) % (-1216255725 * this.an));
            notifyAll();
        }
    }

    void ai() {
        synchronized (this) {
            this.ap = true;
            notifyAll();
        }
        try {
            this.aj.join();
        } catch (InterruptedException e) {
        }
    }

    void aq(byte b) {
        try {
            synchronized (this) {
                this.ap = true;
                notifyAll();
            }
            try {
                this.aj.join();
            } catch (InterruptedException e) {
            }
        } catch (Throwable e2) {
            throw ei.ac(e2, "lz.aq(" + ')');
        }
    }
}
