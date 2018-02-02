package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public class kd implements Runnable {
    static int[] am = null;
    static final int dz = 104;
    static em ps;
    volatile boolean ac;
    final Thread aj;
    Queue an;

    public kd() {
        try {
            this.an = new LinkedList();
            this.aj = new Thread(this);
            this.aj.setPriority(1);
            this.aj.start();
        } catch (Throwable e) {
            throw ei.ac(e, "kd.<init>(" + ')');
        }
    }

    public void cs() {
        URLConnection openConnection;
        DataInputStream dataInputStream;
        Object obj;
        Throwable th;
        while (!this.ac) {
            try {
                synchronized (this) {
                    kt ktVar = (kt) this.an.poll();
                    if (ktVar == null) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                        }
                    } else {
                        try {
                            openConnection = ktVar.aj.openConnection();
                            try {
                                openConnection.setConnectTimeout(5000);
                                openConnection.setReadTimeout(5000);
                                openConnection.setUseCaches(false);
                                openConnection.setRequestProperty("Connection", "close");
                                openConnection.setRequestProperty("Accept-Encoding", "identity");
                                int contentLength = openConnection.getContentLength();
                                if (contentLength >= 0) {
                                    byte[] bArr = new byte[contentLength];
                                    dataInputStream = new DataInputStream(openConnection.getInputStream());
                                    try {
                                        dataInputStream.readFully(bArr);
                                        ktVar.aq = bArr;
                                    } catch (IOException e2) {
                                        try {
                                            ktVar.aj(-1923457077);
                                            if (dataInputStream != null) {
                                                dataInputStream.close();
                                            }
                                            ((HttpURLConnection) openConnection).disconnect();
                                        } catch (Throwable th2) {
                                            Throwable th3 = th2;
                                            obj = openConnection;
                                            th = th3;
                                        }
                                    }
                                } else {
                                    dataInputStream = null;
                                }
                                ktVar.aj(-1923457077);
                                if (dataInputStream != null) {
                                    dataInputStream.close();
                                }
                                if (openConnection != null && (openConnection instanceof HttpURLConnection)) {
                                    ((HttpURLConnection) openConnection).disconnect();
                                }
                            } catch (IOException e3) {
                                dataInputStream = null;
                                ktVar.aj(-1923457077);
                                if (dataInputStream != null) {
                                    dataInputStream.close();
                                }
                                if (openConnection != null && (openConnection instanceof HttpURLConnection)) {
                                    ((HttpURLConnection) openConnection).disconnect();
                                }
                            } catch (Throwable th22) {
                                dataInputStream = null;
                                URLConnection uRLConnection = openConnection;
                                th = th22;
                                obj = uRLConnection;
                            }
                        } catch (IOException e4) {
                            openConnection = null;
                            dataInputStream = null;
                            ktVar.aj(-1923457077);
                            if (dataInputStream != null) {
                                dataInputStream.close();
                            }
                            ((HttpURLConnection) openConnection).disconnect();
                        } catch (Throwable th222) {
                            th = th222;
                            dataInputStream = null;
                            String str = null;
                        }
                    }
                }
            } catch (Throwable th2222) {
                hq.aj(null, th2222, (byte) -92);
            }
        }
        return;
        if (dataInputStream != null) {
            dataInputStream.close();
        }
        if (str != null && (str instanceof HttpURLConnection)) {
            ((HttpURLConnection) str).disconnect();
        }
        throw th;
    }

    public void run() {
        URLConnection openConnection;
        DataInputStream dataInputStream;
        URLConnection uRLConnection;
        Throwable th;
        while (!this.ac) {
            try {
                try {
                    synchronized (this) {
                        kt ktVar = (kt) this.an.poll();
                        if (ktVar == null) {
                            try {
                                wait();
                            } catch (InterruptedException e) {
                            }
                        } else {
                            try {
                                openConnection = ktVar.aj.openConnection();
                                try {
                                    openConnection.setConnectTimeout(5000);
                                    openConnection.setReadTimeout(5000);
                                    openConnection.setUseCaches(false);
                                    openConnection.setRequestProperty("Connection", "close");
                                    openConnection.setRequestProperty("Accept-Encoding", "identity");
                                    int contentLength = openConnection.getContentLength();
                                    if (contentLength >= 0) {
                                        byte[] bArr = new byte[contentLength];
                                        dataInputStream = new DataInputStream(openConnection.getInputStream());
                                        try {
                                            dataInputStream.readFully(bArr);
                                            ktVar.aq = bArr;
                                        } catch (IOException e2) {
                                            try {
                                                ktVar.aj(-1923457077);
                                                if (dataInputStream != null) {
                                                    dataInputStream.close();
                                                }
                                                ((HttpURLConnection) openConnection).disconnect();
                                            } catch (Throwable th2) {
                                                Throwable th3 = th2;
                                                uRLConnection = openConnection;
                                                th = th3;
                                            }
                                        }
                                    } else {
                                        dataInputStream = null;
                                    }
                                    ktVar.aj(-1923457077);
                                    if (dataInputStream != null) {
                                        dataInputStream.close();
                                    }
                                    if (openConnection != null && (openConnection instanceof HttpURLConnection)) {
                                        ((HttpURLConnection) openConnection).disconnect();
                                    }
                                } catch (IOException e3) {
                                    dataInputStream = null;
                                    ktVar.aj(-1923457077);
                                    if (dataInputStream != null) {
                                        dataInputStream.close();
                                    }
                                    if (openConnection != null && (openConnection instanceof HttpURLConnection)) {
                                        ((HttpURLConnection) openConnection).disconnect();
                                    }
                                } catch (Throwable th22) {
                                    dataInputStream = null;
                                    URLConnection uRLConnection2 = openConnection;
                                    th = th22;
                                    uRLConnection = uRLConnection2;
                                }
                            } catch (IOException e4) {
                                openConnection = null;
                                dataInputStream = null;
                                ktVar.aj(-1923457077);
                                if (dataInputStream != null) {
                                    dataInputStream.close();
                                }
                                ((HttpURLConnection) openConnection).disconnect();
                            } catch (Throwable th222) {
                                th = th222;
                                dataInputStream = null;
                                uRLConnection = null;
                            }
                        }
                    }
                } catch (Throwable th2222) {
                    hq.aj(null, th2222, (byte) 34);
                }
            } catch (Throwable th22222) {
                throw ei.ac(th22222, "kd.run(" + ')');
            }
        }
        return;
        if (dataInputStream != null) {
            dataInputStream.close();
        }
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
        throw th;
    }

    public kt aa(URL url) {
        return ac(url, null, (byte) -107);
    }

    public kt aj(URL url, int i) {
        try {
            return ac(url, null, (byte) 10);
        } catch (Throwable e) {
            throw ei.ac(e, "kd.aj(" + ')');
        }
    }

    public kt ao(URL url) {
        return ac(url, null, (byte) -46);
    }

    public kt aq(URL url) {
        return ac(url, null, (byte) -93);
    }

    kt ac(URL url, ka kaVar, byte b) {
        try {
            kt ktVar = new kt(url, kaVar);
            synchronized (this) {
                this.an.add(ktVar);
                notify();
            }
            return ktVar;
        } catch (Throwable e) {
            throw ei.ac(e, "kd.ac(" + ')');
        }
    }

    kt ak(URL url, ka kaVar) {
        kt ktVar = new kt(url, kaVar);
        synchronized (this) {
            this.an.add(ktVar);
            notify();
        }
        return ktVar;
    }

    kt ap(URL url, ka kaVar) {
        kt ktVar = new kt(url, kaVar);
        synchronized (this) {
            this.an.add(ktVar);
            notify();
        }
        return ktVar;
    }

    public void ah() {
        this.ac = true;
        try {
            synchronized (this) {
                notify();
            }
            this.aj.join();
        } catch (InterruptedException e) {
        }
    }

    public void ai() {
        this.ac = true;
        try {
            synchronized (this) {
                notify();
            }
            this.aj.join();
        } catch (InterruptedException e) {
        }
    }

    public void an(byte b) {
        try {
            this.ac = true;
            try {
                synchronized (this) {
                    notify();
                }
                this.aj.join();
            } catch (InterruptedException e) {
            }
        } catch (Throwable e2) {
            throw ei.ac(e2, "kd.an(" + ')');
        }
    }

    public void at() {
        this.ac = true;
        try {
            synchronized (this) {
                notify();
            }
            this.aj.join();
        } catch (InterruptedException e) {
        }
    }

    public static boolean ak(char c, byte b) {
        return c >= '0' && c <= '9';
    }
}
