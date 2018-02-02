package defpackage;

import java.nio.ByteBuffer;

public class hr extends gy {
    ByteBuffer ac;

    hr() {
        try {
        } catch (Throwable e) {
            throw ei.ac(e, "hr.<init>(" + ')');
        }
    }

    byte[] ae() {
        byte[] bArr = new byte[this.ac.capacity()];
        this.ac.position(0);
        this.ac.get(bArr);
        return bArr;
    }

    byte[] ai() {
        byte[] bArr = new byte[this.ac.capacity()];
        this.ac.position(0);
        this.ac.get(bArr);
        return bArr;
    }

    byte[] am() {
        byte[] bArr = new byte[this.ac.capacity()];
        this.ac.position(0);
        this.ac.get(bArr);
        return bArr;
    }

    byte[] an(byte b) {
        try {
            byte[] bArr = new byte[this.ac.capacity()];
            this.ac.position(0);
            this.ac.get(bArr);
            return bArr;
        } catch (Throwable e) {
            throw ei.ac(e, "hr.an(" + ')');
        }
    }

    byte[] aw() {
        byte[] bArr = new byte[this.ac.capacity()];
        this.ac.position(0);
        this.ac.get(bArr);
        return bArr;
    }

    void ah(byte[] bArr) {
        this.ac = ByteBuffer.allocateDirect(bArr.length);
        this.ac.position(0);
        this.ac.put(bArr);
    }

    void aq(byte[] bArr, byte b) {
        try {
            this.ac = ByteBuffer.allocateDirect(bArr.length);
            this.ac.position(0);
            this.ac.put(bArr);
        } catch (Throwable e) {
            throw ei.ac(e, "hr.aq(" + ')');
        }
    }
}
