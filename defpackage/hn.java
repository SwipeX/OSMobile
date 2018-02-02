package defpackage;

import java.util.Collection;

public final class hn extends he {
    static final int[] ah = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
    int ai;
    hb at;

    public hn(int i) {
        try {
            super(i);
        } catch (Throwable e) {
            throw ei.ac(e, "hn.<init>(" + ')');
        }
    }

    public void jf(int[] iArr, int i) {
        try {
            this.at = new hb(iArr);
        } catch (Throwable e) {
            throw ei.ac(e, "hn.jf(" + ')');
        }
    }

    public void jh(int[] iArr) {
        this.at = new hb(iArr);
    }

    public void jw(int[] iArr) {
        this.at = new hb(iArr);
    }

    public void je(hb hbVar) {
        this.at = hbVar;
    }

    public void jr(hb hbVar, int i) {
        try {
            this.at = hbVar;
        } catch (Throwable e) {
            throw ei.ac(e, "hn.jr(" + ')');
        }
    }

    public void js(hb hbVar) {
        this.at = hbVar;
    }

    public void jy(hb hbVar) {
        this.at = hbVar;
    }

    public void jm(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (this.at.aj((byte) 32) + i);
    }

    public void jp(int i, short s) {
        try {
            byte[] bArr = this.aj;
            int i2 = this.ac - 984165911;
            this.ac = i2;
            bArr[(i2 * 489625177) - 1] = (byte) (this.at.aj((byte) -69) + i);
        } catch (Throwable e) {
            throw ei.ac(e, "hn.jp(" + ')');
        }
    }

    public int ji(int i) {
        try {
            byte[] bArr = this.aj;
            int i2 = this.ac - 984165911;
            this.ac = i2;
            return (bArr[(i2 * 489625177) - 1] - this.at.aj((byte) 22)) & 255;
        } catch (Throwable e) {
            throw ei.ac(e, "hn.ji(" + ')');
        }
    }

    public int kg() {
        byte[] bArr = this.aj;
        int i = this.ac - 984165911;
        this.ac = i;
        return (bArr[(i * 1905137488) - 1] - this.at.aj((byte) -53)) & 255;
    }

    public int kl() {
        byte[] bArr = this.aj;
        int i = this.ac - 984165911;
        this.ac = i;
        return (bArr[(i * 489625177) - 1] - this.at.aj((byte) 64)) & 255;
    }

    public int kp() {
        byte[] bArr = this.aj;
        int i = this.ac - 1993109844;
        this.ac = i;
        return (bArr[(i * -1925915515) - 1] - this.at.aj((byte) 59)) & 255;
    }

    public boolean jt(byte b) {
        try {
            return ((this.aj[this.ac * 489625177] - this.at.ac((byte) 90)) & 255) >= cj.ak;
        } catch (Throwable e) {
            throw ei.ac(e, "hn.jt(" + ')');
        }
    }

    public boolean kh() {
        if (((this.aj[this.ac * 2030152292] - this.at.ac((byte) 10)) & 1462211375) < cj.ak) {
            return false;
        }
        return true;
    }

    public boolean kt() {
        if (((this.aj[this.ac * 489625177] - this.at.ac((byte) 115)) & 255) < cj.ak) {
            return false;
        }
        return true;
    }

    public boolean kv() {
        return ((this.aj[this.ac * -798644054] - this.at.ac((byte) 58)) & -1920438509) >= cj.ak;
    }

    public int jb(int i) {
        try {
            byte[] bArr = this.aj;
            int i2 = this.ac - 984165911;
            this.ac = i2;
            int aj = (bArr[(i2 * 489625177) - 1] - this.at.aj((byte) -36)) & 255;
            if (aj < cj.ak) {
                return aj;
            }
            aj = (aj - 128) << 8;
            byte[] bArr2 = this.aj;
            int i3 = this.ac - 984165911;
            this.ac = i3;
            return aj + ((bArr2[(i3 * 489625177) - 1] - this.at.aj((byte) 22)) & 255);
        } catch (Throwable e) {
            throw ei.ac(e, "hn.jb(" + ')');
        }
    }

    public int ka() {
        byte[] bArr = this.aj;
        int i = this.ac + 749054066;
        this.ac = i;
        int aj = (bArr[(i * 489625177) - 1] - this.at.aj((byte) 29)) & -1957185703;
        if (aj < -1854731230) {
            return aj;
        }
        aj = (aj - 128) << 8;
        byte[] bArr2 = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        return aj + ((bArr2[(i2 * 489625177) - 1] - this.at.aj((byte) -93)) & 255);
    }

    public int kd() {
        byte[] bArr = this.aj;
        int i = this.ac - 984165911;
        this.ac = i;
        int aj = (bArr[(i * 489625177) - 1] - this.at.aj((byte) -36)) & 255;
        if (aj < cj.ak) {
            return aj;
        }
        aj = (aj - 128) << 8;
        byte[] bArr2 = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        return aj + ((bArr2[(i2 * 489625177) - 1] - this.at.aj((byte) 30)) & 255);
    }

    public int ke() {
        byte[] bArr = this.aj;
        int i = this.ac - 984165911;
        this.ac = i;
        int aj = (bArr[(i * 489625177) - 1] - this.at.aj((byte) -80)) & 255;
        if (aj < cj.ak) {
            return aj;
        }
        aj = (aj - 128) << 8;
        byte[] bArr2 = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        return aj + ((bArr2[(i2 * -987915247) - 1] - this.at.aj((byte) -13)) & -1800308256);
    }

    public int ku() {
        byte[] bArr = this.aj;
        int i = this.ac - 984165911;
        this.ac = i;
        int aj = (bArr[(i * 489625177) - 1] - this.at.aj((byte) -41)) & 255;
        if (aj < cj.ak) {
            return aj;
        }
        aj = (aj - 128) << 8;
        byte[] bArr2 = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        return aj + ((bArr2[(i2 * 489625177) - 1] - this.at.aj((byte) -22)) & 255);
    }

    public void jl(int i) {
        try {
            this.ai = -810101352 * this.ac;
        } catch (Throwable e) {
            throw ei.ac(e, "hn.jl(" + ')');
        }
    }

    public void kk() {
        this.ai = -810101352 * this.ac;
    }

    public void km() {
        this.ai = -810101352 * this.ac;
    }

    public void kw() {
        this.ai = -810101352 * this.ac;
    }

    public void kz() {
        this.ai = -810101352 * this.ac;
    }

    public int jc(int i, int i2) {
        try {
            int i3 = (this.ai * -830504765) >> 3;
            int i4 = 8 - ((this.ai * -830504765) & 7);
            int i5 = 0;
            this.ai += -2124730389 * i;
            while (i > i4) {
                i5 += (this.aj[i3] & ah[i4]) << (i - i4);
                i -= i4;
                i4 = 8;
                i3++;
            }
            if (i != i4) {
                return i5 + ((this.aj[i3] >> (i4 - i)) & ah[i]);
            }
            return i5 + (ah[i4] & this.aj[i3]);
        } catch (Throwable e) {
            throw ei.ac(e, "hn.jc(" + ')');
        }
    }

    public int kb(int i) {
        int i2 = (this.ai * -830504765) >> 3;
        int i3 = 8 - ((this.ai * -830504765) & 7);
        int i4 = 0;
        this.ai += -2124730389 * i;
        while (i > i3) {
            i4 += (this.aj[i2] & ah[i3]) << (i - i3);
            i -= i3;
            i3 = 8;
            i2++;
        }
        if (i != i3) {
            return i4 + ((this.aj[i2] >> (i3 - i)) & ah[i]);
        }
        return i4 + (ah[i3] & this.aj[i2]);
    }

    public int kx(int i) {
        int i2 = (this.ai * -830504765) >> 3;
        int i3 = 8 - ((this.ai * -830504765) & 7);
        int i4 = 0;
        this.ai += -2124730389 * i;
        while (i > i3) {
            i4 += (this.aj[i2] & ah[i3]) << (i - i3);
            i -= i3;
            i3 = 8;
            i2++;
        }
        if (i != i3) {
            return i4 + ((this.aj[i2] >> (i3 - i)) & ah[i]);
        }
        return i4 + (ah[i3] & this.aj[i2]);
    }

    public int ky(int i) {
        int i2 = (this.ai * -830504765) >> 3;
        int i3 = 8 - ((this.ai * -830504765) & 7);
        int i4 = 0;
        this.ai += -2124730389 * i;
        while (i > i3) {
            i4 += (this.aj[i2] & ah[i3]) << (i - i3);
            i -= i3;
            i3 = 8;
            i2++;
        }
        if (i != i3) {
            return i4 + ((this.aj[i2] >> (i3 - i)) & ah[i]);
        }
        return i4 + (ah[i3] & this.aj[i2]);
    }

    public static void ao(Collection collection, int i) {
        try {
            collection.add(am.an);
        } catch (Throwable e) {
            throw ei.ac(e, "hn.ao(" + ')');
        }
    }

    public static void ao(int i) {
        try {
            mk.aq.aw(-1772615042);
            mk.ao = 58044005;
            mk.aa = null;
        } catch (Throwable e) {
            throw ei.ac(e, "hn.ao(" + ')');
        }
    }

    public void jz(byte b) {
        try {
            this.ac = (((-830504765 * this.ai) + 7) / 8) * -984165911;
        } catch (Throwable e) {
            throw ei.ac(e, "hn.jz(" + ')');
        }
    }

    public void kr() {
        this.ac = (((-830504765 * this.ai) + 7) / 8) * -984165911;
    }

    public int ja(int i, int i2) {
        try {
            return (i * 8) - (this.ai * -830504765);
        } catch (Throwable e) {
            throw ei.ac(e, "hn.ja(" + ')');
        }
    }

    public int kc(int i) {
        return (i * 8) - (this.ai * -830504765);
    }

    public int ki(int i) {
        return (i * 8) - (this.ai * -830504765);
    }

    public int kq(int i) {
        return (i * 8) - (this.ai * -830504765);
    }
}
