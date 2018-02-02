package defpackage;

import java.io.IOException;
import java.net.Socket;

public class ln extends lo {
    lj ac;
    Socket aj;
    lz an;

    ln(Socket socket, int i, int i2) throws IOException {
        try {
            this.aj = socket;
            this.aj.setSoTimeout(30000);
            this.aj.setTcpNoDelay(true);
            this.aj.setReceiveBufferSize(65536);
            this.aj.setSendBufferSize(65536);
            this.ac = new lj(this.aj.getInputStream(), i);
            this.an = new lz(this.aj.getOutputStream(), i2);
        } catch (Throwable e) {
            throw ei.ac(e, "ln.<init>(" + ')');
        }
    }

    public boolean aq(int i, int i2) throws IOException {
        try {
            return this.ac.ac(i, -1663925431);
        } catch (Throwable e) {
            throw ei.ac(e, "ln.aq(" + ')');
        }
    }

    public boolean as(int i) throws IOException {
        return this.ac.ac(i, 867954483);
    }

    public int ae() throws IOException {
        return this.ac.an(-1872020111);
    }

    public int an(byte b) throws IOException {
        try {
            return this.ac.an(-910368925);
        } catch (Throwable e) {
            throw ei.ac(e, "ln.an(" + ')');
        }
    }

    public int ac(short s) throws IOException {
        try {
            return this.ac.aq((byte) -94);
        } catch (Throwable e) {
            throw ei.ac(e, "ln.ac(" + ')');
        }
    }

    public int ai() throws IOException {
        return this.ac.aq((byte) -78);
    }

    public int am() throws IOException {
        return this.ac.aq((byte) -100);
    }

    public int aw() throws IOException {
        return this.ac.aq((byte) -68);
    }

    public int al(byte[] bArr, int i, int i2) throws IOException {
        return this.ac.ao(bArr, i, i2, 331770711);
    }

    public int ao(byte[] bArr, int i, int i2, int i3) throws IOException {
        try {
            return this.ac.ao(bArr, i, i2, -121677350);
        } catch (Throwable e) {
            throw ei.ac(e, "ln.ao(" + ')');
        }
    }

    public int ax(byte[] bArr, int i, int i2) throws IOException {
        return this.ac.ao(bArr, i, i2, -800222083);
    }

    public int az(byte[] bArr, int i, int i2) throws IOException {
        return this.ac.ao(bArr, i, i2, -950485667);
    }

    public void ak(byte[] bArr, int i, int i2, int i3) throws IOException {
        try {
            this.an.an(bArr, i, i2, (byte) -37);
        } catch (Throwable e) {
            throw ei.ac(e, "ln.ak(" + ')');
        }
    }

    public void ay(byte[] bArr, int i, int i2) throws IOException {
        this.an.an(bArr, i, i2, (byte) 19);
    }

    public void ah() {
        this.an.aq((byte) 51);
        try {
            this.aj.close();
        } catch (IOException e) {
        }
        this.ac.aa(-203718343);
    }

    public void aj(short s) {
        try {
            this.an.aq((byte) 82);
            try {
                this.aj.close();
            } catch (IOException e) {
            }
            this.ac.aa(1855248240);
        } catch (Throwable e2) {
            throw ei.ac(e2, "ln.aj(" + ')');
        }
    }

    public void ap() {
        this.an.aq((byte) 32);
        try {
            this.aj.close();
        } catch (IOException e) {
        }
        this.ac.aa(1786460126);
    }

    public void at() {
        this.an.aq((byte) 12);
        try {
            this.aj.close();
        } catch (IOException e) {
        }
        this.ac.aa(483361048);
    }

    protected void aad() {
        aj((short) -11765);
    }

    protected void aaq() {
        aj((short) -23580);
    }

    protected void aax() {
        aj((short) -12576);
    }

    protected void finalize() {
        try {
            aj((short) -23439);
        } catch (Throwable e) {
            throw ei.ac(e, "ln.finalize(" + ')');
        }
    }

    protected void za() {
        aj((short) -29672);
    }

    protected void zy() {
        aj((short) -22716);
    }
}
