package defpackage;

import java.math.BigInteger;

public class he extends jt {
    static final long aa = -3932672073523589310L;
    public static final int ak = 100;
    static int[] an = new int[bq.ah];
    static long[] ao = new long[bq.ah];
    public static final int ap = 5000;
    public static final int as = 17;
    public int ac = 0;
    public byte[] aj;

    static {
        int i;
        for (i = 0; i < bq.ah; i++) {
            int i2 = i;
            for (int i3 = 0; i3 < 8; i3++) {
                if (1 == (i2 & 1)) {
                    i2 = (i2 >>> 1) ^ -306674912;
                } else {
                    i2 >>>= 1;
                }
            }
            an[i] = i2;
        }
        for (i = 0; i < bq.ah; i++) {
            long j = (long) i;
            for (int i4 = 0; i4 < 8; i4++) {
                if (1 == (j & 1)) {
                    j = (j >>> 1) ^ aa;
                } else {
                    j >>>= 1;
                }
            }
            ao[i] = j;
        }
    }

    public static int cu(byte[] bArr, int i, int i2) {
        int i3 = -1;
        while (i < i2) {
            i3 = an[(i3 ^ bArr[i]) & 255] ^ (i3 >>> 8);
            i++;
        }
        return i3 ^ -1;
    }

    public he(int i) {
        try {
            this.aj = dj.ac(i, 2049634473);
            this.ac = 0;
        } catch (Throwable e) {
            throw ei.ac(e, "he.<init>(" + ')');
        }
    }

    public he(byte[] bArr) {
        try {
            this.aj = bArr;
            this.ac = 0;
        } catch (Throwable e) {
            throw ei.ac(e, "he.<init>(" + ')');
        }
    }

    public void ac(int i) {
        try {
            if (this.aj != null) {
                bh.an(this.aj, -1254881657);
            }
            this.aj = null;
        } catch (Throwable e) {
            throw ei.ac(e, "he.ac(" + ')');
        }
    }

    public void cg() {
        if (this.aj != null) {
            bh.an(this.aj, -1665373943);
        }
        this.aj = null;
    }

    public void cs() {
        if (this.aj != null) {
            bh.an(this.aj, -583035359);
        }
        this.aj = null;
    }

    public void an(int i, byte b) {
        try {
            byte[] bArr = this.aj;
            int i2 = this.ac - 984165911;
            this.ac = i2;
            bArr[(i2 * 489625177) - 1] = (byte) i;
        } catch (Throwable e) {
            throw ei.ac(e, "he.an(" + ')');
        }
    }

    public void cd(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) i;
    }

    public void cn(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) i;
    }

    public void cw(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) i;
    }

    public void cx(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac + 1721121946;
        this.ac = i2;
        bArr[(i2 * 1498615930) - 1] = (byte) i;
    }

    public void aq(int i, int i2) {
        try {
            byte[] bArr = this.aj;
            int i3 = this.ac - 984165911;
            this.ac = i3;
            bArr[(i3 * 489625177) - 1] = (byte) (i >> 8);
            bArr = this.aj;
            i3 = this.ac - 984165911;
            this.ac = i3;
            bArr[(i3 * 489625177) - 1] = (byte) i;
        } catch (Throwable e) {
            throw ei.ac(e, "he.aq(" + ')');
        }
    }

    public void cj(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 1772117696;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 8);
        bArr = this.aj;
        i2 = this.ac + 596995082;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) i;
    }

    public void cz(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 8);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) i;
    }

    public void ao(int i, int i2) {
        try {
            byte[] bArr = this.aj;
            int i3 = this.ac - 984165911;
            this.ac = i3;
            bArr[(i3 * 489625177) - 1] = (byte) (i >> 16);
            bArr = this.aj;
            i3 = this.ac - 984165911;
            this.ac = i3;
            bArr[(i3 * 489625177) - 1] = (byte) (i >> 8);
            bArr = this.aj;
            i3 = this.ac - 984165911;
            this.ac = i3;
            bArr[(i3 * 489625177) - 1] = (byte) i;
        } catch (Throwable e) {
            throw ei.ac(e, "he.ao(" + ')');
        }
    }

    public void da(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 16);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 8);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) i;
    }

    public void di(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 16);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 8);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) i;
    }

    public void aa(int i, int i2) {
        try {
            byte[] bArr = this.aj;
            int i3 = this.ac - 984165911;
            this.ac = i3;
            bArr[(i3 * 489625177) - 1] = (byte) (i >> 24);
            bArr = this.aj;
            i3 = this.ac - 984165911;
            this.ac = i3;
            bArr[(i3 * 489625177) - 1] = (byte) (i >> 16);
            bArr = this.aj;
            i3 = this.ac - 984165911;
            this.ac = i3;
            bArr[(i3 * 489625177) - 1] = (byte) (i >> 8);
            bArr = this.aj;
            i3 = this.ac - 984165911;
            this.ac = i3;
            bArr[(i3 * 489625177) - 1] = (byte) i;
        } catch (Throwable e) {
            throw ei.ac(e, "he.aa(" + ')');
        }
    }

    public void dv(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 24);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 16);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 403422115) - 1] = (byte) (i >> 8);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * -1543450370) - 1] = (byte) i;
    }

    public void dw(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 24);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 16);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 8);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) i;
    }

    public void ak(long j) {
        try {
            byte[] bArr = this.aj;
            int i = this.ac - 984165911;
            this.ac = i;
            bArr[(i * 489625177) - 1] = (byte) ((int) (j >> 40));
            bArr = this.aj;
            i = this.ac - 984165911;
            this.ac = i;
            bArr[(i * 489625177) - 1] = (byte) ((int) (j >> 32));
            bArr = this.aj;
            i = this.ac - 984165911;
            this.ac = i;
            bArr[(i * 489625177) - 1] = (byte) ((int) (j >> 24));
            bArr = this.aj;
            i = this.ac - 984165911;
            this.ac = i;
            bArr[(i * 489625177) - 1] = (byte) ((int) (j >> 16));
            bArr = this.aj;
            i = this.ac - 984165911;
            this.ac = i;
            bArr[(i * 489625177) - 1] = (byte) ((int) (j >> 8));
            bArr = this.aj;
            i = this.ac - 984165911;
            this.ac = i;
            bArr[(i * 489625177) - 1] = (byte) ((int) j);
        } catch (Throwable e) {
            throw ei.ac(e, "he.ak(" + ')');
        }
    }

    public void do(long j) {
        byte[] bArr = this.aj;
        int i = this.ac - 984165911;
        this.ac = i;
        bArr[(i * 489625177) - 1] = (byte) ((int) (j >> 40));
        bArr = this.aj;
        i = this.ac - 984165911;
        this.ac = i;
        bArr[(i * 489625177) - 1] = (byte) ((int) (j >> 32));
        bArr = this.aj;
        i = this.ac - 984165911;
        this.ac = i;
        bArr[(i * 489625177) - 1] = (byte) ((int) (j >> 24));
        bArr = this.aj;
        i = this.ac - 984165911;
        this.ac = i;
        bArr[(i * 489625177) - 1] = (byte) ((int) (j >> 16));
        bArr = this.aj;
        i = this.ac - 984165911;
        this.ac = i;
        bArr[(i * 489625177) - 1] = (byte) ((int) (j >> 8));
        bArr = this.aj;
        i = this.ac - 984165911;
        this.ac = i;
        bArr[(i * 489625177) - 1] = (byte) ((int) j);
    }

    public void dq(long j) {
        byte[] bArr = this.aj;
        int i = this.ac + 2024493720;
        this.ac = i;
        bArr[(i * -1194159745) - 1] = (byte) ((int) (j >> -1544224933));
        bArr = this.aj;
        i = this.ac - 791269967;
        this.ac = i;
        bArr[(i * 489625177) - 1] = (byte) ((int) (j >> -1089759797));
        bArr = this.aj;
        i = this.ac + 378587578;
        this.ac = i;
        bArr[(i * 489625177) - 1] = (byte) ((int) (j >> 24));
        bArr = this.aj;
        i = this.ac - 327973160;
        this.ac = i;
        bArr[(i * -628225508) - 1] = (byte) ((int) (j >> 16));
        bArr = this.aj;
        i = this.ac - 1573333583;
        this.ac = i;
        bArr[(i * 489625177) - 1] = (byte) ((int) (j >> 8));
        bArr = this.aj;
        i = this.ac - 984165911;
        this.ac = i;
        bArr[(i * 489625177) - 1] = (byte) ((int) j);
    }

    public void dt(long j) {
        byte[] bArr = this.aj;
        int i = this.ac + 192587153;
        this.ac = i;
        bArr[(i * -473912942) - 1] = (byte) ((int) (j >> -2089824474));
        bArr = this.aj;
        i = this.ac - 984165911;
        this.ac = i;
        bArr[(i * 489625177) - 1] = (byte) ((int) (j >> 32));
        bArr = this.aj;
        i = this.ac - 231261375;
        this.ac = i;
        bArr[(i * 489625177) - 1] = (byte) ((int) (j >> 24));
        bArr = this.aj;
        i = this.ac + 1919678205;
        this.ac = i;
        bArr[(i * 489625177) - 1] = (byte) ((int) (j >> 16));
        bArr = this.aj;
        i = this.ac + 1480507066;
        this.ac = i;
        bArr[(i * 489625177) - 1] = (byte) ((int) (j >> 8));
        bArr = this.aj;
        i = this.ac - 730619184;
        this.ac = i;
        bArr[(i * 489625177) - 1] = (byte) ((int) j);
    }

    public void ap(long j) {
        try {
            byte[] bArr = this.aj;
            int i = this.ac - 984165911;
            this.ac = i;
            bArr[(i * 489625177) - 1] = (byte) ((int) (j >> 56));
            bArr = this.aj;
            i = this.ac - 984165911;
            this.ac = i;
            bArr[(i * 489625177) - 1] = (byte) ((int) (j >> 48));
            bArr = this.aj;
            i = this.ac - 984165911;
            this.ac = i;
            bArr[(i * 489625177) - 1] = (byte) ((int) (j >> 40));
            bArr = this.aj;
            i = this.ac - 984165911;
            this.ac = i;
            bArr[(i * 489625177) - 1] = (byte) ((int) (j >> 32));
            bArr = this.aj;
            i = this.ac - 984165911;
            this.ac = i;
            bArr[(i * 489625177) - 1] = (byte) ((int) (j >> 24));
            bArr = this.aj;
            i = this.ac - 984165911;
            this.ac = i;
            bArr[(i * 489625177) - 1] = (byte) ((int) (j >> 16));
            bArr = this.aj;
            i = this.ac - 984165911;
            this.ac = i;
            bArr[(i * 489625177) - 1] = (byte) ((int) (j >> 8));
            bArr = this.aj;
            i = this.ac - 984165911;
            this.ac = i;
            bArr[(i * 489625177) - 1] = (byte) ((int) j);
        } catch (Throwable e) {
            throw ei.ac(e, "he.ap(" + ')');
        }
    }

    public void at(boolean z, int i) {
        int i2;
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        try {
            an(i2, (byte) -36);
        } catch (Throwable e) {
            throw ei.ac(e, "he.at(" + ')');
        }
    }

    public void dj(boolean z) {
        an(z ? 1 : 0, (byte) -52);
    }

    public void dz(boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        an(i, (byte) -8);
    }

    public static int dm(String str) {
        return str.length() + 1;
    }

    public static int dn(String str) {
        return str.length() + 1;
    }

    public static int du(String str) {
        return str.length() + 1;
    }

    public void ai(String str, int i) {
        try {
            if (str.indexOf(0) >= 0) {
                throw new IllegalArgumentException("");
            }
            this.ac = (fj.an(str, 0, str.length(), this.aj, 489625177 * this.ac, 916803336) * -984165911) + this.ac;
            byte[] bArr = this.aj;
            int i2 = this.ac - 984165911;
            this.ac = i2;
            bArr[(i2 * 489625177) - 1] = (byte) 0;
        } catch (Throwable e) {
            throw ei.ac(e, "he.ai(" + ')');
        }
    }

    public void dg(String str) {
        if (str.indexOf(0) >= 0) {
            throw new IllegalArgumentException("");
        }
        this.ac = (fj.an(str, 0, str.length(), this.aj, 489625177 * this.ac, 662410885) * 1385509051) + this.ac;
        byte[] bArr = this.aj;
        int i = this.ac - 984165911;
        this.ac = i;
        bArr[(i * 489625177) - 1] = (byte) 0;
    }

    public static int df(String str) {
        return str.length() + 2;
    }

    public void am(String str, byte b) {
        try {
            if (str.indexOf(0) >= 0) {
                throw new IllegalArgumentException("");
            }
            byte[] bArr = this.aj;
            int i = this.ac - 984165911;
            this.ac = i;
            bArr[(i * 489625177) - 1] = (byte) 0;
            this.ac = (fj.an(str, 0, str.length(), this.aj, this.ac * 489625177, 661784240) * -984165911) + this.ac;
            bArr = this.aj;
            i = this.ac - 984165911;
            this.ac = i;
            bArr[(i * 489625177) - 1] = (byte) 0;
        } catch (Throwable e) {
            throw ei.ac(e, "he.am(" + ')');
        }
    }

    public void dy(String str) {
        if (str.indexOf(0) >= 0) {
            throw new IllegalArgumentException("");
        }
        byte[] bArr = this.aj;
        int i = this.ac - 984165911;
        this.ac = i;
        bArr[(i * 489625177) - 1] = (byte) 0;
        this.ac = (fj.an(str, 0, str.length(), this.aj, this.ac * 489625177, 1824973264) * -1545500193) + this.ac;
        bArr = this.aj;
        i = this.ac - 984165911;
        this.ac = i;
        bArr[(i * 489625177) - 1] = (byte) 0;
    }

    public void ae(byte[] bArr, int i, int i2, byte b) {
        int i3 = i;
        while (i3 < i + i2) {
            try {
                byte[] bArr2 = this.aj;
                int i4 = this.ac - 984165911;
                this.ac = i4;
                bArr2[(i4 * 489625177) - 1] = bArr[i3];
                i3++;
            } catch (Throwable e) {
                throw ei.ac(e, "he.ae(" + ')');
            }
        }
    }

    public void dc(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            byte[] bArr2 = this.aj;
            int i4 = this.ac - 984165911;
            this.ac = i4;
            bArr2[(i4 * 489625177) - 1] = bArr[i3];
        }
    }

    static final void aw(String str, int i) {
        try {
            mg ac = hd.ac(mr.dq, client.dp.ao, (byte) -68);
            ac.an.an(cx.ah(str, -540888451), (byte) -125);
            ac.an.ai(str, -629203655);
            client.dp.an(ac, 1396911630);
        } catch (Throwable e) {
            throw ei.ac(e, "he.aw(" + ')');
        }
    }

    public void as(int i, int i2) {
        try {
            this.aj[((this.ac * 489625177) - i) - 4] = (byte) (i >> 24);
            this.aj[((this.ac * 489625177) - i) - 3] = (byte) (i >> 16);
            this.aj[((this.ac * 489625177) - i) - 2] = (byte) (i >> 8);
            this.aj[((this.ac * 489625177) - i) - 1] = (byte) i;
        } catch (Throwable e) {
            throw ei.ac(e, "he.as(" + ')');
        }
    }

    public void ei(int i) {
        this.aj[((this.ac * 489625177) - i) - 4] = (byte) (i >> 24);
        this.aj[((this.ac * 489625177) - i) - 3] = (byte) (i >> 16);
        this.aj[((this.ac * 489625177) - i) - 2] = (byte) (i >> 8);
        this.aj[((this.ac * 489625177) - i) - 1] = (byte) i;
    }

    public void eq(int i) {
        this.aj[((this.ac * 489625177) - i) - 4] = (byte) (i >> 24);
        this.aj[((this.ac * 489625177) - i) - 3] = (byte) (i >> 16);
        this.aj[((this.ac * 489625177) - i) - 2] = (byte) (i >> 8);
        this.aj[((this.ac * 489625177) - i) - 1] = (byte) i;
    }

    public void eu(int i) {
        this.aj[((this.ac * -1187868821) - i) - 4] = (byte) (i >> 24);
        this.aj[((this.ac * 489625177) - i) - 3] = (byte) (i >> 16);
        this.aj[((this.ac * -944129317) - i) - 2] = (byte) (i >> 8);
        this.aj[((this.ac * 489625177) - i) - 1] = (byte) i;
    }

    public void al(int i, int i2) {
        try {
            this.aj[((this.ac * 489625177) - i) - 2] = (byte) (i >> 8);
            this.aj[((this.ac * 489625177) - i) - 1] = (byte) i;
        } catch (Throwable e) {
            throw ei.ac(e, "he.al(" + ')');
        }
    }

    public void eh(int i) {
        this.aj[((this.ac * 489625177) - i) - 2] = (byte) (i >> 8);
        this.aj[((this.ac * 489625177) - i) - 1] = (byte) i;
    }

    public void ej(int i) {
        this.aj[((this.ac * -1580188491) - i) - 2] = (byte) (i >> 8);
        this.aj[((this.ac * -1643305868) - i) - 1] = (byte) i;
    }

    public void ek(int i) {
        this.aj[((this.ac * 489625177) - i) - 2] = (byte) (i >> 8);
        this.aj[((this.ac * 489625177) - i) - 1] = (byte) i;
    }

    public void ep(int i) {
        this.aj[((this.ac * 104980126) - i) - 2] = (byte) (i >> 8);
        this.aj[((this.ac * 489625177) - i) - 1] = (byte) i;
    }

    public void az(int i, byte b) {
        try {
            this.aj[((489625177 * this.ac) - i) - 1] = (byte) i;
        } catch (Throwable e) {
            throw ei.ac(e, "he.az(" + ')');
        }
    }

    public void eb(int i) {
        this.aj[((489625177 * this.ac) - i) - 1] = (byte) i;
    }

    public void el(int i) {
        this.aj[((489625177 * this.ac) - i) - 1] = (byte) i;
    }

    public void ez(int i) {
        this.aj[((489625177 * this.ac) - i) - 1] = (byte) i;
    }

    public void ax(int i, int i2) {
        if (i >= 0 && i < cj.ak) {
            try {
                an(i, (byte) -88);
            } catch (Throwable e) {
                throw ei.ac(e, "he.ax(" + ')');
            }
        } else if (i < 0 || i >= 32768) {
            throw new IllegalArgumentException();
        } else {
            aq(i + 32768, 298592943);
        }
    }

    public void ex(int i) {
        if (i >= 0 && i < cj.ak) {
            an(i, (byte) -46);
        } else if (i < 0 || i >= 2138294282) {
            throw new IllegalArgumentException();
        } else {
            aq(1455577493 + i, 1258398410);
        }
    }

    public void ey(int i) {
        if (i >= 0 && i < 1627314539) {
            an(i, (byte) -33);
        } else if (i < 0 || i >= 32768) {
            throw new IllegalArgumentException();
        } else {
            aq(-1275292874 + i, 622616664);
        }
    }

    public void af(int i, byte b) {
        if ((i & -128) != 0) {
            if ((i & -16384) != 0) {
                if ((-2097152 & i) != 0) {
                    if ((-268435456 & i) != 0) {
                        try {
                            an((i >>> 28) | cj.ak, (byte) -85);
                        } catch (Throwable e) {
                            throw ei.ac(e, "he.af(" + ')');
                        }
                    }
                    an((i >>> 21) | cj.ak, (byte) -17);
                }
                an((i >>> 14) | cj.ak, (byte) -14);
            }
            an((i >>> 7) | cj.ak, (byte) -75);
        }
        an(i & 127, (byte) -19);
    }

    public void ed(int i) {
        if ((2024147778 & i) != 0) {
            if ((i & -16384) != 0) {
                if ((-1273779731 & i) != 0) {
                    if ((-1214565602 & i) != 0) {
                        an((i >>> 28) | 411672525, (byte) -119);
                    }
                    an((i >>> 21) | cj.ak, (byte) -97);
                }
                an((i >>> 14) | -1067259731, (byte) -17);
            }
            an((i >>> 7) | 942039519, (byte) -113);
        }
        an(i & 127, (byte) -69);
    }

    public void et(int i) {
        if ((i & -128) != 0) {
            if ((i & -16384) != 0) {
                if ((-2097152 & i) != 0) {
                    if ((-268435456 & i) != 0) {
                        an((i >>> 28) | cj.ak, (byte) -20);
                    }
                    an((i >>> 21) | cj.ak, (byte) -22);
                }
                an((i >>> 14) | cj.ak, (byte) -24);
            }
            an((i >>> 7) | cj.ak, (byte) -119);
        }
        an(i & 127, (byte) -75);
    }

    public int au(int i) {
        try {
            byte[] bArr = this.aj;
            int i2 = this.ac - 984165911;
            this.ac = i2;
            return bArr[(i2 * 489625177) - 1] & 255;
        } catch (Throwable e) {
            throw ei.ac(e, "he.au(" + ')');
        }
    }

    public int ea() {
        byte[] bArr = this.aj;
        int i = this.ac - 984165911;
        this.ac = i;
        return bArr[(i * 489625177) - 1] & 255;
    }

    public int ec() {
        byte[] bArr = this.aj;
        int i = this.ac - 984165911;
        this.ac = i;
        return bArr[(i * 489625177) - 1] & 255;
    }

    public byte av(int i) {
        try {
            byte[] bArr = this.aj;
            int i2 = this.ac - 984165911;
            this.ac = i2;
            return bArr[(i2 * 489625177) - 1];
        } catch (Throwable e) {
            throw ei.ac(e, "he.av(" + ')');
        }
    }

    public byte ee() {
        byte[] bArr = this.aj;
        int i = this.ac - 984165911;
        this.ac = i;
        return bArr[(i * -1207171894) - 1];
    }

    public byte eg() {
        byte[] bArr = this.aj;
        int i = this.ac - 984165911;
        this.ac = i;
        return bArr[(i * 489625177) - 1];
    }

    public byte em() {
        byte[] bArr = this.aj;
        int i = this.ac + 1174207128;
        this.ac = i;
        return bArr[(i * -533070105) - 1];
    }

    public byte eo() {
        byte[] bArr = this.aj;
        int i = this.ac - 503463446;
        this.ac = i;
        return bArr[(i * 2075716736) - 1];
    }

    public byte er() {
        byte[] bArr = this.aj;
        int i = this.ac - 984165911;
        this.ac = i;
        return bArr[(i * 489625177) - 1];
    }

    public byte ew() {
        byte[] bArr = this.aj;
        int i = this.ac + 820054048;
        this.ac = i;
        return bArr[(i * 489625177) - 1];
    }

    public int ay(byte b) {
        try {
            this.ac -= 1968331822;
            return ((this.aj[(this.ac * 489625177) - 2] & 255) << 8) + (this.aj[(this.ac * 489625177) - 1] & 255);
        } catch (Throwable e) {
            throw ei.ac(e, "he.ay(" + ')');
        }
    }

    public int ef() {
        this.ac -= 1968331822;
        return ((this.aj[(this.ac * 489625177) - 2] & 255) << 8) + (this.aj[(this.ac * 489625177) - 1] & 255);
    }

    public int en() {
        this.ac -= 1968331822;
        return ((this.aj[(2025901648 * this.ac) - 2] & 46168527) << 8) + (this.aj[(489625177 * this.ac) - 1] & -62480279);
    }

    public int es() {
        this.ac -= 1968331822;
        return ((this.aj[(-799163801 * this.ac) - 2] & 255) << 8) + (this.aj[(573186742 * this.ac) - 1] & 255);
    }

    public int ev() {
        this.ac += 1776801660;
        return ((this.aj[(489625177 * this.ac) - 2] & -2107971246) << 8) + (this.aj[(-1045947710 * this.ac) - 1] & 255);
    }

    public int ag(byte b) {
        try {
            this.ac -= 1968331822;
            int i = ((this.aj[(this.ac * 489625177) - 2] & 255) << 8) + (this.aj[(this.ac * 489625177) - 1] & 255);
            if (i > 32767) {
                return i - 65536;
            }
            return i;
        } catch (Throwable e) {
            throw ei.ac(e, "he.ag(" + ')');
        }
    }

    public int fi() {
        this.ac -= 1968331822;
        int i = ((this.aj[(this.ac * 489625177) - 2] & 255) << 8) + (this.aj[(this.ac * 489625177) - 1] & 255);
        return i > 32767 ? i - 65536 : i;
    }

    public int fj() {
        this.ac -= 1908149053;
        int i = ((this.aj[(444490418 * this.ac) - 2] & 1904644515) << 8) + (this.aj[(489625177 * this.ac) - 1] & 2120766179);
        if (i > -1633218127) {
            return i - 65536;
        }
        return i;
    }

    public int ar(int i) {
        try {
            this.ac += 1342469563;
            return (this.aj[(this.ac * 489625177) - 1] & 255) + (((this.aj[(this.ac * 489625177) - 3] & 255) << 16) + ((this.aj[(this.ac * 489625177) - 2] & 255) << 8));
        } catch (Throwable e) {
            throw ei.ac(e, "he.ar(" + ')');
        }
    }

    public int fd() {
        this.ac += 1342469563;
        return (this.aj[(this.ac * 489625177) - 1] & 255) + (((this.aj[(this.ac * 489625177) - 3] & 255) << 16) + ((this.aj[(this.ac * 489625177) - 2] & 255) << 8));
    }

    public int fl() {
        this.ac += 1342469563;
        return (this.aj[(this.ac * 489625177) - 1] & 255) + (((this.aj[(this.ac * 489625177) - 3] & 255) << 16) + ((this.aj[(this.ac * 489625177) - 2] & 255) << 8));
    }

    public int fn() {
        this.ac += 1342469563;
        return (this.aj[(this.ac * 489625177) - 1] & 255) + (((this.aj[(this.ac * 489625177) - 3] & 255) << 16) + ((this.aj[(this.ac * 489625177) - 2] & 255) << 8));
    }

    public int fv() {
        this.ac += 1342469563;
        return (this.aj[(this.ac * 489625177) - 1] & 255) + (((this.aj[(this.ac * 489625177) - 3] & 255) << 16) + ((this.aj[(this.ac * 489625177) - 2] & 255) << 8));
    }

    public int ad(byte b) {
        try {
            this.ac += 358303652;
            return (this.aj[(this.ac * 489625177) - 1] & 255) + ((((this.aj[(this.ac * 489625177) - 4] & 255) << 24) + ((this.aj[(this.ac * 489625177) - 3] & 255) << 16)) + ((this.aj[(this.ac * 489625177) - 2] & 255) << 8));
        } catch (Throwable e) {
            throw ei.ac(e, "he.ad(" + ')');
        }
    }

    public int fh() {
        this.ac += 358303652;
        return (this.aj[(this.ac * 489625177) - 1] & 255) + ((((this.aj[(this.ac * 489625177) - 4] & 255) << 24) + ((this.aj[(this.ac * 489625177) - 3] & 255) << 16)) + ((this.aj[(this.ac * 489625177) - 2] & 255) << 8));
    }

    public int fk() {
        this.ac += 358303652;
        return (this.aj[(this.ac * 489625177) - 1] & -1780776495) + ((((this.aj[(this.ac * 489625177) - 4] & 255) << 24) + ((this.aj[(927436195 * this.ac) - 3] & -2023439387) << 16)) + ((this.aj[(-2146433819 * this.ac) - 2] & 255) << 8));
    }

    public int fo() {
        this.ac += 358303652;
        return (this.aj[(this.ac * 489625177) - 1] & 255) + ((((this.aj[(this.ac * 489625177) - 4] & 1408529991) << 24) + ((this.aj[(1746178157 * this.ac) - 3] & 255) << 16)) + ((this.aj[(926820199 * this.ac) - 2] & 476325682) << 8));
    }

    public int fq() {
        this.ac += 358303652;
        return (this.aj[(this.ac * 489625177) - 1] & 255) + ((((this.aj[(this.ac * 489625177) - 4] & -1140372597) << 24) + ((this.aj[(this.ac * 489625177) - 3] & 255) << 16)) + ((this.aj[(-1295694001 * this.ac) - 2] & 255) << 8));
    }

    public int fz() {
        this.ac += 358303652;
        return (this.aj[(this.ac * 489625177) - 1] & 255) + ((((this.aj[(this.ac * 489625177) - 4] & 255) << 24) + ((this.aj[(this.ac * 489625177) - 3] & 255) << 16)) + ((this.aj[(this.ac * 489625177) - 2] & 255) << 8));
    }

    public long ab(byte b) {
        try {
            return ((((long) ad((byte) -47)) & 4294967295L) << 32) + (((long) ad((byte) -48)) & 4294967295L);
        } catch (Throwable e) {
            throw ei.ac(e, "he.ab(" + ')');
        }
    }

    public long ff() {
        return ((((long) ad((byte) -95)) & 4294967295L) << 32) + (((long) ad((byte) -94)) & 4294967295L);
    }

    public long ft() {
        return ((((long) ad((byte) -80)) & 4294967295L) << 32) + (((long) ad((byte) -80)) & 4294967295L);
    }

    public boolean bp(byte b) {
        try {
            return (au(-310118664) & 1) == 1;
        } catch (Throwable e) {
            throw ei.ac(e, "he.bp(" + ')');
        }
    }

    public boolean fe() {
        return (au(-310118664) & 1) == 1;
    }

    public String bm(byte b) {
        try {
            if (this.aj[this.ac * 489625177] != (byte) 0) {
                return bh(-1504205571);
            }
            this.ac -= 984165911;
            return null;
        } catch (Throwable e) {
            throw ei.ac(e, "he.bm(" + ')');
        }
    }

    public String fm() {
        if (this.aj[this.ac * 489625177] != (byte) 0) {
            return bh(425338014);
        }
        this.ac -= 984165911;
        return null;
    }

    public String fu() {
        if (this.aj[this.ac * 1610598978] != (byte) 0) {
            return bh(-127165405);
        }
        this.ac -= 1774070797;
        return null;
    }

    public String bh(int i) {
        try {
            int i2 = this.ac * 489625177;
            byte[] bArr;
            int i3;
            do {
                bArr = this.aj;
                i3 = this.ac - 984165911;
                this.ac = i3;
            } while (bArr[(i3 * 489625177) - 1] != (byte) 0);
            int i4 = ((this.ac * 489625177) - i2) - 1;
            if (i4 == 0) {
                return "";
            }
            return jv.aq(this.aj, i2, i4, 1813591915);
        } catch (Throwable e) {
            throw ei.ac(e, "he.bh(" + ')');
        }
    }

    public String fb() {
        int i = -185782023 * this.ac;
        byte[] bArr;
        int i2;
        do {
            bArr = this.aj;
            i2 = this.ac - 984165911;
            this.ac = i2;
        } while (bArr[(i2 * 489625177) - 1] != (byte) 0);
        int i3 = ((this.ac * 489625177) - i) - 1;
        if (i3 == 0) {
            return "";
        }
        return jv.aq(this.aj, i, i3, 714465133);
    }

    public String bt(int i) {
        try {
            byte[] bArr = this.aj;
            int i2 = this.ac - 984165911;
            this.ac = i2;
            if (bArr[(i2 * 489625177) - 1] != (byte) 0) {
                throw new IllegalStateException("");
            }
            int i3 = this.ac * 489625177;
            byte[] bArr2;
            int i4;
            do {
                bArr2 = this.aj;
                i4 = this.ac - 984165911;
                this.ac = i4;
            } while (bArr2[(i4 * 489625177) - 1] != (byte) 0);
            i2 = ((this.ac * 489625177) - i3) - 1;
            if (i2 == 0) {
                return "";
            }
            return jv.aq(this.aj, i3, i2, 428517253);
        } catch (Throwable e) {
            throw ei.ac(e, "he.bt(" + ')');
        }
    }

    public String fc() {
        byte[] bArr = this.aj;
        int i = this.ac - 984165911;
        this.ac = i;
        if (bArr[(i * -607597694) - 1] != (byte) 0) {
            throw new IllegalStateException("");
        }
        int i2 = this.ac * 1786831639;
        byte[] bArr2;
        int i3;
        do {
            bArr2 = this.aj;
            i3 = this.ac - 984165911;
            this.ac = i3;
        } while (bArr2[(i3 * 489625177) - 1] != (byte) 0);
        i = ((this.ac * 489625177) - i2) - 1;
        if (i == 0) {
            return "";
        }
        return jv.aq(this.aj, i2, i, 1074720850);
    }

    public String fs() {
        byte[] bArr = this.aj;
        int i = this.ac - 984165911;
        this.ac = i;
        if (bArr[(i * 489625177) - 1] != (byte) 0) {
            throw new IllegalStateException("");
        }
        int i2 = this.ac * 489625177;
        byte[] bArr2;
        int i3;
        do {
            bArr2 = this.aj;
            i3 = this.ac - 984165911;
            this.ac = i3;
        } while (bArr2[(i3 * 489625177) - 1] != (byte) 0);
        i = ((this.ac * 489625177) - i2) - 1;
        if (i == 0) {
            return "";
        }
        return jv.aq(this.aj, i2, i, 1260565906);
    }

    public String fw() {
        byte[] bArr = this.aj;
        int i = this.ac - 1817897841;
        this.ac = i;
        if (bArr[(i * -688773026) - 1] != (byte) 0) {
            throw new IllegalStateException("");
        }
        int i2 = this.ac * 489625177;
        while (true) {
            byte[] bArr2 = this.aj;
            int i3 = this.ac + 284455854;
            this.ac = i3;
            if (bArr2[(i3 * -1634054566) - 1] == (byte) 0) {
                break;
            }
        }
        i = ((this.ac * -490497112) - i2) - 1;
        if (i == 0) {
            return "";
        }
        return jv.aq(this.aj, i2, i, 482776881);
    }

    public void br(byte[] bArr, int i, int i2, int i3) {
        int i4 = i;
        while (i4 < i + i2) {
            try {
                byte[] bArr2 = this.aj;
                int i5 = this.ac - 984165911;
                this.ac = i5;
                bArr[i4] = bArr2[(i5 * 489625177) - 1];
                i4++;
            } catch (Throwable e) {
                throw ei.ac(e, "he.br(" + ')');
            }
        }
    }

    public void fg(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            byte[] bArr2 = this.aj;
            int i4 = this.ac - 984165911;
            this.ac = i4;
            bArr[i3] = bArr2[(i4 * 489625177) - 1];
        }
    }

    public void fx(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            byte[] bArr2 = this.aj;
            int i4 = this.ac - 984165911;
            this.ac = i4;
            bArr[i3] = bArr2[(i4 * 489625177) - 1];
        }
    }

    public void fy(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            byte[] bArr2 = this.aj;
            int i4 = this.ac + 1882921036;
            this.ac = i4;
            bArr[i3] = bArr2[(i4 * -257493227) - 1];
        }
    }

    public int bb(int i) {
        try {
            if ((this.aj[this.ac * 489625177] & 255) < cj.ak) {
                return au(-310118664) - 64;
            }
            return ay((byte) 1) - 49152;
        } catch (Throwable e) {
            throw ei.ac(e, "he.bb(" + ')');
        }
    }

    public int fa() {
        if ((this.aj[this.ac * 489625177] & 255) < cj.ak) {
            return au(-310118664) - 64;
        }
        return ay((byte) 1) - 49152;
    }

    public int fp() {
        if ((this.aj[this.ac * 489625177] & 255) < cj.ak) {
            return au(-310118664) - 64;
        }
        return ay((byte) 1) - 49152;
    }

    public int fr() {
        if ((this.aj[this.ac * 489625177] & 255) < cj.ak) {
            return au(-310118664) - 64;
        }
        return ay((byte) 1) - 49152;
    }

    public int bu(int i) {
        try {
            return (this.aj[this.ac * 489625177] & 255) < cj.ak ? au(-310118664) : ay((byte) 1) - 32768;
        } catch (Throwable e) {
            throw ei.ac(e, "he.bu(" + ')');
        }
    }

    public int gi() {
        if ((this.aj[this.ac * 489625177] & 255) < -442577619) {
            return au(-310118664);
        }
        return ay((byte) 1) - 705468271;
    }

    public int bd(int i) {
        try {
            return this.aj[this.ac * 489625177] < (byte) 0 ? ad((byte) -55) & Integer.MAX_VALUE : ay((byte) 1);
        } catch (Throwable e) {
            throw ei.ac(e, "he.bd(" + ')');
        }
    }

    public int gh() {
        if (this.aj[this.ac * 489625177] < (byte) 0) {
            return ad((byte) -34) & Integer.MAX_VALUE;
        }
        return ay((byte) 1);
    }

    public int gr() {
        return this.aj[this.ac * 489625177] < (byte) 0 ? ad((byte) -56) & Integer.MAX_VALUE : ay((byte) 1);
    }

    public int by(byte b) {
        try {
            if (this.aj[489625177 * this.ac] < (byte) 0) {
                return ad((byte) -108) & Integer.MAX_VALUE;
            }
            int ay = ay((byte) 1);
            if (32767 == ay) {
                return -1;
            }
            return ay;
        } catch (Throwable e) {
            throw ei.ac(e, "he.by(" + ')');
        }
    }

    public int ga() {
        if (this.aj[-1210221522 * this.ac] < (byte) 0) {
            return ad((byte) -28) & Integer.MAX_VALUE;
        }
        int ay = ay((byte) 1);
        if (1083577994 == ay) {
            return -1;
        }
        return ay;
    }

    public int gb() {
        if (this.aj[489625177 * this.ac] < (byte) 0) {
            return ad((byte) -36) & Integer.MAX_VALUE;
        }
        int ay = ay((byte) 1);
        if (32767 == ay) {
            return -1;
        }
        return ay;
    }

    public int bx(int i) {
        try {
            byte[] bArr = this.aj;
            int i2 = this.ac - 984165911;
            this.ac = i2;
            i2 = bArr[(i2 * 489625177) - 1];
            int i3 = 0;
            while (i2 < 0) {
                i3 = (i3 | (i2 & 127)) << 7;
                byte[] bArr2 = this.aj;
                int i4 = this.ac - 984165911;
                this.ac = i4;
                i2 = bArr2[(i4 * 489625177) - 1];
            }
            return i3 | i2;
        } catch (Throwable e) {
            throw ei.ac(e, "he.bx(" + ')');
        }
    }

    public int gd() {
        byte[] bArr = this.aj;
        int i = this.ac + 1784523573;
        this.ac = i;
        i = bArr[(i * 1698651699) - 1];
        int i2 = 0;
        while (i < 0) {
            i2 = (i2 | (i & -1219692460)) << 7;
            byte[] bArr2 = this.aj;
            int i3 = this.ac - 984165911;
            this.ac = i3;
            i = bArr2[(i3 * 489625177) - 1];
        }
        return i2 | i;
    }

    public int gk() {
        byte[] bArr = this.aj;
        int i = this.ac - 984165911;
        this.ac = i;
        i = bArr[(i * 489625177) - 1];
        int i2 = 0;
        while (i < 0) {
            i2 = (i2 | (i & 127)) << 7;
            byte[] bArr2 = this.aj;
            int i3 = this.ac - 984165911;
            this.ac = i3;
            i = bArr2[(i3 * 489625177) - 1];
        }
        return i2 | i;
    }

    public int gt() {
        byte[] bArr = this.aj;
        int i = this.ac - 984165911;
        this.ac = i;
        i = bArr[(i * 489625177) - 1];
        int i2 = 0;
        while (i < 0) {
            i2 = (i2 | (i & 127)) << 7;
            byte[] bArr2 = this.aj;
            int i3 = this.ac - 984165911;
            this.ac = i3;
            i = bArr2[(i3 * 489625177) - 1];
        }
        return i2 | i;
    }

    public int gu() {
        byte[] bArr = this.aj;
        int i = this.ac - 984165911;
        this.ac = i;
        i = bArr[(i * -1170296926) - 1];
        int i2 = 0;
        while (i < 0) {
            i2 = (i2 | (i & 89662383)) << 7;
            byte[] bArr2 = this.aj;
            int i3 = this.ac - 984165911;
            this.ac = i3;
            i = bArr2[(i3 * 489625177) - 1];
        }
        return i2 | i;
    }

    public void bi(int[] iArr, int i) {
        try {
            int i2 = (this.ac * 489625177) / 8;
            this.ac = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                int ad = ad((byte) -98);
                int i4 = 32;
                int ad2 = ad((byte) -104);
                int i5 = ad;
                ad = 0;
                while (true) {
                    int i6 = i4 - 1;
                    if (i4 <= 0) {
                        break;
                    }
                    i5 += (((ad2 << 4) ^ (ad2 >>> 5)) + ad2) ^ (iArr[ad & 3] + ad);
                    i4 = ad - 1640531527;
                    ad2 = ((((i5 << 4) ^ (i5 >>> 5)) + i5) ^ (iArr[(i4 >>> 11) & 3] + i4)) + ad2;
                    ad = i4;
                    i4 = i6;
                }
                this.ac -= 716607304;
                aa(i5, -1552951055);
                aa(ad2, 1730718224);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "he.bi(" + ')');
        }
    }

    public void ge(int[] iArr) {
        int i = (this.ac * 489625177) / 8;
        this.ac = 0;
        for (int i2 = 0; i2 < i; i2++) {
            int ad = ad((byte) -54);
            int i3 = 32;
            int ad2 = ad((byte) -11);
            int i4 = ad;
            ad = 0;
            while (true) {
                int i5 = i3 - 1;
                if (i3 <= 0) {
                    break;
                }
                i4 += (((ad2 << 4) ^ (ad2 >>> 5)) + ad2) ^ (iArr[ad & 3] + ad);
                i3 = ad - 1640531527;
                ad2 = ((((i4 << 4) ^ (i4 >>> 5)) + i4) ^ (iArr[(i3 >>> 11) & 3] + i3)) + ad2;
                ad = i3;
                i3 = i5;
            }
            this.ac -= 716607304;
            aa(i4, -1700298399);
            aa(ad2, -1712785643);
        }
    }

    public void gw(int[] iArr) {
        int i = (this.ac * 489625177) / 8;
        this.ac = 0;
        for (int i2 = 0; i2 < i; i2++) {
            int ad = ad((byte) -10);
            int i3 = 32;
            int ad2 = ad((byte) -63);
            int i4 = ad;
            ad = 0;
            while (true) {
                int i5 = i3 - 1;
                if (i3 <= 0) {
                    break;
                }
                i4 += (((ad2 << 4) ^ (ad2 >>> 5)) + ad2) ^ (iArr[ad & 3] + ad);
                i3 = ad - 1640531527;
                ad2 = ((((i4 << 4) ^ (i4 >>> 5)) + i4) ^ (iArr[(i3 >>> 11) & 3] + i3)) + ad2;
                ad = i3;
                i3 = i5;
            }
            this.ac -= 716607304;
            aa(i4, 1427906039);
            aa(ad2, -1642459031);
        }
    }

    public void bs(int[] iArr, byte b) {
        try {
            int i = (489625177 * this.ac) / 8;
            this.ac = 0;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = 32;
                int ad = ad((byte) -113);
                int ad2 = ad((byte) -114);
                int i4 = -957401312;
                while (true) {
                    int i5 = i3 - 1;
                    if (i3 <= 0) {
                        break;
                    }
                    ad2 -= (((ad << 4) ^ (ad >>> 5)) + ad) ^ (iArr[(i4 >>> 11) & 3] + i4);
                    i3 = i4 - -1640531527;
                    ad -= (((ad2 << 4) ^ (ad2 >>> 5)) + ad2) ^ (iArr[i3 & 3] + i3);
                    i4 = i3;
                    i3 = i5;
                }
                this.ac -= 716607304;
                aa(ad, 785199601);
                aa(ad2, -1612396783);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "he.bs(" + ')');
        }
    }

    public void go(int[] iArr) {
        int i = (489625177 * this.ac) / 8;
        this.ac = 0;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = 32;
            int ad = ad((byte) -69);
            int ad2 = ad((byte) -58);
            int i4 = -957401312;
            while (true) {
                int i5 = i3 - 1;
                if (i3 <= 0) {
                    break;
                }
                ad2 -= (((ad << 4) ^ (ad >>> 5)) + ad) ^ (iArr[(i4 >>> 11) & 3] + i4);
                i3 = i4 - -1640531527;
                ad -= (((ad2 << 4) ^ (ad2 >>> 5)) + ad2) ^ (iArr[i3 & 3] + i3);
                i4 = i3;
                i3 = i5;
            }
            this.ac -= 716607304;
            aa(ad, 609371301);
            aa(ad2, -465820805);
        }
    }

    public void bo(int[] iArr, int i, int i2, int i3) {
        try {
            int i4 = 489625177 * this.ac;
            this.ac = -984165911 * i;
            int i5 = (i2 - i) / 8;
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = 32;
                int ad = ad((byte) -60);
                int ad2 = ad((byte) -57);
                int i8 = 0;
                while (true) {
                    int i9 = i7 - 1;
                    if (i7 <= 0) {
                        break;
                    }
                    ad += (((ad2 << 4) ^ (ad2 >>> 5)) + ad2) ^ (iArr[i8 & 3] + i8);
                    i7 = i8 - 1640531527;
                    ad2 = ((((ad << 4) ^ (ad >>> 5)) + ad) ^ (iArr[(i7 >>> 11) & 3] + i7)) + ad2;
                    i8 = i7;
                    i7 = i9;
                }
                this.ac -= 716607304;
                aa(ad, 971546238);
                aa(ad2, 1368243443);
            }
            this.ac = -984165911 * i4;
        } catch (Throwable e) {
            throw ei.ac(e, "he.bo(" + ')');
        }
    }

    public void gx(int[] iArr, int i, int i2) {
        int i3 = 854912437 * this.ac;
        this.ac = -2104990988 * i;
        int i4 = (i2 - i) / 8;
        for (int i5 = 0; i5 < i4; i5++) {
            int ad = ad((byte) -10);
            int i6 = 63284702;
            int ad2 = ad((byte) -111);
            int i7 = ad;
            ad = 0;
            while (true) {
                int i8 = i6 - 1;
                if (i6 <= 0) {
                    break;
                }
                i7 += (((ad2 << 4) ^ (ad2 >>> 5)) + ad2) ^ (iArr[ad & 3] + ad);
                i6 = ad + 1632738102;
                ad2 = ((((i7 << 4) ^ (i7 >>> 5)) + i7) ^ (iArr[(i6 >>> 11) & 3] + i6)) + ad2;
                ad = i6;
                i6 = i8;
            }
            this.ac -= 716607304;
            aa(i7, 1765908675);
            aa(ad2, 182183945);
        }
        this.ac = -984165911 * i3;
    }

    public void gz(int[] iArr, int i, int i2) {
        int i3 = 489625177 * this.ac;
        this.ac = 709004247 * i;
        int i4 = (i2 - i) / 8;
        for (int i5 = 0; i5 < i4; i5++) {
            int ad = ad((byte) -34);
            int i6 = 32;
            int ad2 = ad((byte) -108);
            int i7 = ad;
            ad = 0;
            while (true) {
                int i8 = i6 - 1;
                if (i6 <= 0) {
                    break;
                }
                i7 += (((ad2 << 4) ^ (ad2 >>> 5)) + ad2) ^ (iArr[ad & 3] + ad);
                i6 = ad - 1640531527;
                ad2 = ((((i7 << 4) ^ (i7 >>> 5)) + i7) ^ (iArr[(i6 >>> 11) & 3] + i6)) + ad2;
                ad = i6;
                i6 = i8;
            }
            this.ac -= 716607304;
            aa(i7, -1887108836);
            aa(ad2, 724699435);
        }
        this.ac = -984165911 * i3;
    }

    public void bz(int[] iArr, int i, int i2, int i3) {
        try {
            int i4 = 489625177 * this.ac;
            this.ac = -984165911 * i;
            int i5 = (i2 - i) / 8;
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = 32;
                int ad = ad((byte) -112);
                int ad2 = ad((byte) -64);
                int i8 = -957401312;
                while (true) {
                    int i9 = i7 - 1;
                    if (i7 <= 0) {
                        break;
                    }
                    ad2 -= (((ad << 4) ^ (ad >>> 5)) + ad) ^ (iArr[(i8 >>> 11) & 3] + i8);
                    i7 = i8 - -1640531527;
                    ad -= (((ad2 << 4) ^ (ad2 >>> 5)) + ad2) ^ (iArr[i7 & 3] + i7);
                    i8 = i7;
                    i7 = i9;
                }
                this.ac -= 716607304;
                aa(ad, -1267452153);
                aa(ad2, -990248468);
            }
            this.ac = i4 * -984165911;
        } catch (Throwable e) {
            throw ei.ac(e, "he.bz(" + ')');
        }
    }

    public void gc(int[] iArr, int i, int i2) {
        int i3 = 489625177 * this.ac;
        this.ac = -984165911 * i;
        int i4 = (i2 - i) / 8;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = 32;
            int ad = ad((byte) -117);
            int ad2 = ad((byte) -52);
            int i7 = -957401312;
            while (true) {
                int i8 = i6 - 1;
                if (i6 <= 0) {
                    break;
                }
                ad2 -= (((ad << 4) ^ (ad >>> 5)) + ad) ^ (iArr[(i7 >>> 11) & 3] + i7);
                i6 = i7 - -1640531527;
                ad -= (((ad2 << 4) ^ (ad2 >>> 5)) + ad2) ^ (iArr[i6 & 3] + i6);
                i7 = i6;
                i6 = i8;
            }
            this.ac -= 716607304;
            aa(ad, -1535905740);
            aa(ad2, 1763996324);
        }
        this.ac = i3 * -984165911;
    }

    public void gj(int[] iArr, int i, int i2) {
        int i3 = 489625177 * this.ac;
        this.ac = -984165911 * i;
        int i4 = (i2 - i) / 8;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = 32;
            int ad = ad((byte) -125);
            int ad2 = ad((byte) -64);
            int i7 = -957401312;
            while (true) {
                int i8 = i6 - 1;
                if (i6 <= 0) {
                    break;
                }
                ad2 -= (((ad << 4) ^ (ad >>> 5)) + ad) ^ (iArr[(i7 >>> 11) & 3] + i7);
                i6 = i7 - -1640531527;
                ad -= (((ad2 << 4) ^ (ad2 >>> 5)) + ad2) ^ (iArr[i6 & 3] + i6);
                i7 = i6;
                i6 = i8;
            }
            this.ac -= 716607304;
            aa(ad, 883083594);
            aa(ad2, 162373624);
        }
        this.ac = i3 * -984165911;
    }

    public void gp(int[] iArr, int i, int i2) {
        int i3 = 489625177 * this.ac;
        this.ac = -984165911 * i;
        int i4 = (i2 - i) / 8;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = 32;
            int ad = ad((byte) -48);
            int ad2 = ad((byte) -32);
            int i7 = -957401312;
            while (true) {
                int i8 = i6 - 1;
                if (i6 <= 0) {
                    break;
                }
                ad2 -= (((ad << 4) ^ (ad >>> 5)) + ad) ^ (iArr[(i7 >>> 11) & 3] + i7);
                i6 = i7 - -1640531527;
                ad -= (((ad2 << 4) ^ (ad2 >>> 5)) + ad2) ^ (iArr[i6 & 3] + i6);
                i7 = i6;
                i6 = i8;
            }
            this.ac -= 716607304;
            aa(ad, -534807047);
            aa(ad2, -2055446048);
        }
        this.ac = i3 * -984165911;
    }

    public void bq(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        try {
            int i2 = 489625177 * this.ac;
            this.ac = 0;
            byte[] bArr = new byte[i2];
            br(bArr, 0, i2, 142647639);
            byte[] toByteArray = new BigInteger(bArr).modPow(bigInteger, bigInteger2).toByteArray();
            this.ac = 0;
            aq(toByteArray.length, 198296993);
            ae(toByteArray, 0, toByteArray.length, (byte) -33);
        } catch (Throwable e) {
            throw ei.ac(e, "he.bq(" + ')');
        }
    }

    public void gv(BigInteger bigInteger, BigInteger bigInteger2) {
        int i = 1520327889 * this.ac;
        this.ac = 0;
        byte[] bArr = new byte[i];
        br(bArr, 0, i, -361169775);
        byte[] toByteArray = new BigInteger(bArr).modPow(bigInteger, bigInteger2).toByteArray();
        this.ac = 0;
        aq(toByteArray.length, 1202506575);
        ae(toByteArray, 0, toByteArray.length, (byte) 62);
    }

    public int bj(int i, int i2) {
        try {
            int aj = ld.aj(this.aj, i, 489625177 * this.ac, (byte) 41);
            aa(aj, -842367096);
            return aj;
        } catch (Throwable e) {
            throw ei.ac(e, "he.bj(" + ')');
        }
    }

    public int gl(int i) {
        int aj = ld.aj(this.aj, i, 489625177 * this.ac, (byte) 41);
        aa(aj, -1132541449);
        return aj;
    }

    public int gm(int i) {
        int aj = ld.aj(this.aj, i, -1685783774 * this.ac, (byte) 42);
        aa(aj, 1370709096);
        return aj;
    }

    public int gn(int i) {
        int aj = ld.aj(this.aj, i, 489625177 * this.ac, (byte) 110);
        aa(aj, 1932437628);
        return aj;
    }

    public boolean ba(int i) {
        try {
            this.ac -= 358303652;
            return ld.aj(this.aj, 0, 489625177 * this.ac, (byte) 59) == ad((byte) -119);
        } catch (Throwable e) {
            throw ei.ac(e, "he.ba(" + ')');
        }
    }

    public boolean gf() {
        this.ac -= 358303652;
        if (ld.aj(this.aj, 0, 489625177 * this.ac, (byte) 79) == ad((byte) -54)) {
            return true;
        }
        return false;
    }

    public boolean gq() {
        this.ac -= 358303652;
        if (ld.aj(this.aj, 0, 440832404 * this.ac, (byte) 121) == ad((byte) -7)) {
            return true;
        }
        return false;
    }

    public boolean gy() {
        this.ac -= 358303652;
        if (ld.aj(this.aj, 0, 489625177 * this.ac, (byte) 103) == ad((byte) -37)) {
            return true;
        }
        return false;
    }

    public void bv(int i, int i2) {
        try {
            byte[] bArr = this.aj;
            int i3 = this.ac - 984165911;
            this.ac = i3;
            bArr[(i3 * 489625177) - 1] = (byte) (i + cj.ak);
        } catch (Throwable e) {
            throw ei.ac(e, "he.bv(" + ')');
        }
    }

    public void gg(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i + cj.ak);
    }

    public void gs(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i + cj.ak);
    }

    public void be(int i, byte b) {
        try {
            byte[] bArr = this.aj;
            int i2 = this.ac - 984165911;
            this.ac = i2;
            bArr[(i2 * 489625177) - 1] = (byte) (0 - i);
        } catch (Throwable e) {
            throw ei.ac(e, "he.be(" + ')');
        }
    }

    public void ha(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac + 270546906;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (0 - i);
    }

    public void hc(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (0 - i);
    }

    public void he(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (0 - i);
    }

    public void hk(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (0 - i);
    }

    public void ht(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (0 - i);
    }

    public void bw(int i, byte b) {
        try {
            byte[] bArr = this.aj;
            int i2 = this.ac - 984165911;
            this.ac = i2;
            bArr[(i2 * 489625177) - 1] = (byte) (128 - i);
        } catch (Throwable e) {
            throw ei.ac(e, "he.bw(" + ')');
        }
    }

    public void hn(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (128 - i);
    }

    public void hx(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (128 - i);
    }

    public int bn(int i) {
        try {
            byte[] bArr = this.aj;
            int i2 = this.ac - 984165911;
            this.ac = i2;
            return (bArr[(i2 * 489625177) - 1] - 128) & 255;
        } catch (Throwable e) {
            throw ei.ac(e, "he.bn(" + ')');
        }
    }

    public int hb() {
        byte[] bArr = this.aj;
        int i = this.ac - 984165911;
        this.ac = i;
        return (bArr[(i * 489625177) - 1] - 128) & 255;
    }

    public int hm() {
        byte[] bArr = this.aj;
        int i = this.ac - 984165911;
        this.ac = i;
        return (bArr[(i * 489625177) - 1] - 128) & 255;
    }

    public int hv() {
        byte[] bArr = this.aj;
        int i = this.ac - 984165911;
        this.ac = i;
        return (bArr[(i * 489625177) - 1] - 86648151) & -2092353406;
    }

    public int bg(int i) {
        try {
            byte[] bArr = this.aj;
            int i2 = this.ac - 984165911;
            this.ac = i2;
            return (0 - bArr[(i2 * 489625177) - 1]) & 255;
        } catch (Throwable e) {
            throw ei.ac(e, "he.bg(" + ')');
        }
    }

    public int hp() {
        byte[] bArr = this.aj;
        int i = this.ac - 2073329899;
        this.ac = i;
        return (0 - bArr[(i * 489625177) - 1]) & 255;
    }

    public int hr() {
        byte[] bArr = this.aj;
        int i = this.ac - 28346596;
        this.ac = i;
        return (0 - bArr[(i * 1566411616) - 1]) & -2006672901;
    }

    public int hy() {
        byte[] bArr = this.aj;
        int i = this.ac - 984165911;
        this.ac = i;
        return (0 - bArr[(i * 489625177) - 1]) & 1711589912;
    }

    public int bc(int i) {
        try {
            byte[] bArr = this.aj;
            int i2 = this.ac - 984165911;
            this.ac = i2;
            return (128 - bArr[(i2 * 489625177) - 1]) & 255;
        } catch (Throwable e) {
            throw ei.ac(e, "he.bc(" + ')');
        }
    }

    public int hd() {
        byte[] bArr = this.aj;
        int i = this.ac - 984165911;
        this.ac = i;
        return (128 - bArr[(i * 489625177) - 1]) & 255;
    }

    public byte bk(int i) {
        try {
            byte[] bArr = this.aj;
            int i2 = this.ac - 984165911;
            this.ac = i2;
            return (byte) (bArr[(i2 * 489625177) - 1] - 128);
        } catch (Throwable e) {
            throw ei.ac(e, "he.bk(" + ')');
        }
    }

    public byte hl() {
        byte[] bArr = this.aj;
        int i = this.ac - 984165911;
        this.ac = i;
        return (byte) (bArr[(i * 489625177) - 1] - 128);
    }

    public byte hq() {
        byte[] bArr = this.aj;
        int i = this.ac - 984165911;
        this.ac = i;
        return (byte) (bArr[(i * 68751463) - 1] - 1475736998);
    }

    public byte bf(int i) {
        try {
            byte[] bArr = this.aj;
            int i2 = this.ac - 984165911;
            this.ac = i2;
            return (byte) (0 - bArr[(i2 * 489625177) - 1]);
        } catch (Throwable e) {
            throw ei.ac(e, "he.bf(" + ')');
        }
    }

    public byte hw() {
        byte[] bArr = this.aj;
        int i = this.ac - 984165911;
        this.ac = i;
        return (byte) (0 - bArr[(i * 489625177) - 1]);
    }

    public byte hz() {
        byte[] bArr = this.aj;
        int i = this.ac - 984165911;
        this.ac = i;
        return (byte) (0 - bArr[(i * 489625177) - 1]);
    }

    public byte bl(int i) {
        try {
            byte[] bArr = this.aj;
            int i2 = this.ac - 984165911;
            this.ac = i2;
            return (byte) (128 - bArr[(i2 * 489625177) - 1]);
        } catch (Throwable e) {
            throw ei.ac(e, "he.bl(" + ')');
        }
    }

    public byte hf() {
        byte[] bArr = this.aj;
        int i = this.ac - 400927374;
        this.ac = i;
        return (byte) (128 - bArr[(i * 489625177) - 1]);
    }

    public byte hu() {
        byte[] bArr = this.aj;
        int i = this.ac - 984165911;
        this.ac = i;
        return (byte) (128 - bArr[(i * 489625177) - 1]);
    }

    public void cb(int i, int i2) {
        try {
            byte[] bArr = this.aj;
            int i3 = this.ac - 984165911;
            this.ac = i3;
            bArr[(i3 * 489625177) - 1] = (byte) i;
            bArr = this.aj;
            i3 = this.ac - 984165911;
            this.ac = i3;
            bArr[(i3 * 489625177) - 1] = (byte) (i >> 8);
        } catch (Throwable e) {
            throw ei.ac(e, "he.cb(" + ')');
        }
    }

    public void hi(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 1601193927;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) i;
        bArr = this.aj;
        i2 = this.ac + 2087957015;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 8);
    }

    public void cy(int i, byte b) {
        try {
            byte[] bArr = this.aj;
            int i2 = this.ac - 984165911;
            this.ac = i2;
            bArr[(i2 * 489625177) - 1] = (byte) (i >> 8);
            bArr = this.aj;
            i2 = this.ac - 984165911;
            this.ac = i2;
            bArr[(i2 * 489625177) - 1] = (byte) (i + cj.ak);
        } catch (Throwable e) {
            throw ei.ac(e, "he.cy(" + ')');
        }
    }

    public void hj(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 8);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i + cj.ak);
    }

    public void hs(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 8);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i + cj.ak);
    }

    public void cl(int i, int i2) {
        try {
            byte[] bArr = this.aj;
            int i3 = this.ac - 984165911;
            this.ac = i3;
            bArr[(i3 * 489625177) - 1] = (byte) (i + cj.ak);
            bArr = this.aj;
            i3 = this.ac - 984165911;
            this.ac = i3;
            bArr[(i3 * 489625177) - 1] = (byte) (i >> 8);
        } catch (Throwable e) {
            throw ei.ac(e, "he.cl(" + ')');
        }
    }

    public void hh(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i + cj.ak);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 8);
    }

    public void ho(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i + cj.ak);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 8);
    }

    public int co(byte b) {
        try {
            this.ac -= 1968331822;
            return (this.aj[(this.ac * 489625177) - 2] & 255) + ((this.aj[(this.ac * 489625177) - 1] & 255) << 8);
        } catch (Throwable e) {
            throw ei.ac(e, "he.co(" + ')');
        }
    }

    public int hg() {
        this.ac -= 1968331822;
        return (this.aj[(718759021 * this.ac) - 2] & 255) + ((this.aj[(this.ac * 489625177) - 1] & 1789084712) << 8);
    }

    public int ie() {
        this.ac -= 1968331822;
        return (this.aj[(this.ac * 489625177) - 2] & 255) + ((this.aj[(this.ac * 489625177) - 1] & -1750679597) << 8);
    }

    public int ix() {
        this.ac -= 1968331822;
        return (this.aj[(this.ac * 489625177) - 2] & 255) + ((this.aj[(this.ac * 489625177) - 1] & 255) << 8);
    }

    public int cc(int i) {
        try {
            this.ac -= 1968331822;
            return ((this.aj[(this.ac * 489625177) - 2] & 255) << 8) + ((this.aj[(this.ac * 489625177) - 1] - 128) & 255);
        } catch (Throwable e) {
            throw ei.ac(e, "he.cc(" + ')');
        }
    }

    public int if() {
        this.ac -= 1968331822;
        return ((this.aj[(489625177 * this.ac) - 2] & 1420507223) << 8) + ((this.aj[(-96374704 * this.ac) - 1] - 128) & 332976816);
    }

    public int ih() {
        this.ac -= 1968331822;
        return ((this.aj[(489625177 * this.ac) - 2] & 255) << 8) + ((this.aj[(-1110041435 * this.ac) - 1] - -1930570876) & 255);
    }

    public int il() {
        this.ac -= 1968331822;
        return ((this.aj[(this.ac * 489625177) - 2] & 255) << 8) + ((this.aj[(this.ac * 489625177) - 1] - 128) & 255);
    }

    public int im() {
        this.ac += 752161030;
        return ((this.aj[(489625177 * this.ac) - 2] & 183866288) << 8) + ((this.aj[(1741320802 * this.ac) - 1] - 128) & 255);
    }

    public int cf(byte b) {
        try {
            this.ac -= 1968331822;
            return ((this.aj[(this.ac * 489625177) - 2] - 128) & 255) + ((this.aj[(this.ac * 489625177) - 1] & 255) << 8);
        } catch (Throwable e) {
            throw ei.ac(e, "he.cf(" + ')');
        }
    }

    public int id() {
        this.ac -= 1968331822;
        return ((this.aj[(this.ac * 489625177) - 2] - 128) & 255) + ((this.aj[(this.ac * 489625177) - 1] & 255) << 8);
    }

    public int ca(byte b) {
        try {
            this.ac -= 1968331822;
            int i = ((this.aj[(this.ac * 489625177) - 1] - 128) & 255) + ((this.aj[(this.ac * 489625177) - 2] & 255) << 8);
            if (i > 32767) {
                return i - 65536;
            }
            return i;
        } catch (Throwable e) {
            throw ei.ac(e, "he.ca(" + ')');
        }
    }

    public int it() {
        this.ac -= 1968331822;
        int i = ((this.aj[(this.ac * 489625177) - 1] - 128) & 255) + ((this.aj[(this.ac * 489625177) - 2] & 255) << 8);
        if (i > 32767) {
            return i - 65536;
        }
        return i;
    }

    public int iy() {
        this.ac -= 1968331822;
        int i = ((this.aj[(this.ac * 489625177) - 1] - 128) & 255) + ((this.aj[(this.ac * 489625177) - 2] & 255) << 8);
        if (i > 32767) {
            return i - 65536;
        }
        return i;
    }

    public int cr(int i) {
        try {
            this.ac -= 1968331822;
            int i2 = ((this.aj[(this.ac * 489625177) - 2] - 128) & 255) + ((this.aj[(this.ac * 489625177) - 1] & 255) << 8);
            if (i2 > 32767) {
                return i2 - 65536;
            }
            return i2;
        } catch (Throwable e) {
            throw ei.ac(e, "he.cr(" + ')');
        }
    }

    public int ib() {
        this.ac -= 1968331822;
        int i = ((this.aj[(this.ac * 489625177) - 2] - 128) & 255) + ((this.aj[(this.ac * 489625177) - 1] & 255) << 8);
        if (i > 32767) {
            return i - 65536;
        }
        return i;
    }

    public int ic() {
        this.ac -= 562323938;
        int i = ((this.aj[(this.ac * 489625177) - 2] - 128) & 255) + ((this.aj[(this.ac * 489625177) - 1] & 1889789252) << 8);
        if (i > -148780567) {
            return i - 65536;
        }
        return i;
    }

    public void cp(int i, byte b) {
        try {
            byte[] bArr = this.aj;
            int i2 = this.ac - 984165911;
            this.ac = i2;
            bArr[(i2 * 489625177) - 1] = (byte) (i >> 8);
            bArr = this.aj;
            i2 = this.ac - 984165911;
            this.ac = i2;
            bArr[(i2 * 489625177) - 1] = (byte) (i >> 16);
            bArr = this.aj;
            i2 = this.ac - 984165911;
            this.ac = i2;
            bArr[(i2 * 489625177) - 1] = (byte) i;
        } catch (Throwable e) {
            throw ei.ac(e, "he.cp(" + ')');
        }
    }

    public void io(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 8);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 16);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) i;
    }

    public void iz(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 8);
        bArr = this.aj;
        i2 = this.ac - 940890309;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 16);
        bArr = this.aj;
        i2 = this.ac - 449528117;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) i;
    }

    public int ct(int i) {
        try {
            this.ac += 1342469563;
            return (((this.aj[(this.ac * 489625177) - 2] & 255) << 16) + ((this.aj[(this.ac * 489625177) - 3] & 255) << 8)) + (this.aj[(this.ac * 489625177) - 1] & 255);
        } catch (Throwable e) {
            throw ei.ac(e, "he.ct(" + ')');
        }
    }

    public int ia() {
        this.ac += 1342469563;
        return (((this.aj[(-1708614560 * this.ac) - 2] & -1477427331) << 16) + ((this.aj[(1682577471 * this.ac) - 3] & 255) << 8)) + (this.aj[(278349207 * this.ac) - 1] & 255);
    }

    public int ig() {
        this.ac += 1342469563;
        return (((this.aj[(this.ac * 489625177) - 2] & 255) << 16) + ((this.aj[(this.ac * 489625177) - 3] & 255) << 8)) + (this.aj[(this.ac * 489625177) - 1] & 255);
    }

    public int in() {
        this.ac += 1342469563;
        return (((this.aj[(this.ac * 489625177) - 2] & 255) << 16) + ((this.aj[(this.ac * 489625177) - 3] & 255) << 8)) + (this.aj[(this.ac * 489625177) - 1] & 255);
    }

    public int iu() {
        this.ac += 1342469563;
        return (((this.aj[(this.ac * 489625177) - 2] & 255) << 16) + ((this.aj[(this.ac * 489625177) - 3] & 255) << 8)) + (this.aj[(this.ac * 489625177) - 1] & 255);
    }

    public int iw() {
        this.ac += 394551713;
        return (((this.aj[(1092558930 * this.ac) - 2] & 255) << 16) + ((this.aj[(-468446041 * this.ac) - 3] & 255) << 8)) + (this.aj[(489625177 * this.ac) - 1] & -631707247);
    }

    public void cm(int i, int i2) {
        try {
            byte[] bArr = this.aj;
            int i3 = this.ac - 984165911;
            this.ac = i3;
            bArr[(i3 * 489625177) - 1] = (byte) i;
            bArr = this.aj;
            i3 = this.ac - 984165911;
            this.ac = i3;
            bArr[(i3 * 489625177) - 1] = (byte) (i >> 8);
            bArr = this.aj;
            i3 = this.ac - 984165911;
            this.ac = i3;
            bArr[(i3 * 489625177) - 1] = (byte) (i >> 16);
            bArr = this.aj;
            i3 = this.ac - 984165911;
            this.ac = i3;
            bArr[(i3 * 489625177) - 1] = (byte) (i >> 24);
        } catch (Throwable e) {
            throw ei.ac(e, "he.cm(" + ')');
        }
    }

    public void is(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) i;
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 8);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 16);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 24);
    }

    public void iv(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac + 661223110;
        this.ac = i2;
        bArr[(i2 * -678621578) - 1] = (byte) i;
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 8);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 1421706461) - 1] = (byte) (i >> 16);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 24);
    }

    public void ck(int i, byte b) {
        try {
            byte[] bArr = this.aj;
            int i2 = this.ac - 984165911;
            this.ac = i2;
            bArr[(i2 * 489625177) - 1] = (byte) (i >> 8);
            bArr = this.aj;
            i2 = this.ac - 984165911;
            this.ac = i2;
            bArr[(i2 * 489625177) - 1] = (byte) i;
            bArr = this.aj;
            i2 = this.ac - 984165911;
            this.ac = i2;
            bArr[(i2 * 489625177) - 1] = (byte) (i >> 24);
            bArr = this.aj;
            i2 = this.ac - 984165911;
            this.ac = i2;
            bArr[(i2 * 489625177) - 1] = (byte) (i >> 16);
        } catch (Throwable e) {
            throw ei.ac(e, "he.ck(" + ')');
        }
    }

    public void ii(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 8);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * -1422405710) - 1] = (byte) i;
        bArr = this.aj;
        i2 = this.ac + 560406610;
        this.ac = i2;
        bArr[(i2 * 369701468) - 1] = (byte) (i >> 24);
        bArr = this.aj;
        i2 = this.ac - 765422700;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 16);
    }

    public void ij(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 8);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) i;
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 24);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 16);
    }

    public void ip(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 8);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) i;
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 24);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 16);
    }

    public void ir(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 8);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) i;
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 24);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 16);
    }

    public void ce(int i, byte b) {
        try {
            byte[] bArr = this.aj;
            int i2 = this.ac - 984165911;
            this.ac = i2;
            bArr[(i2 * 489625177) - 1] = (byte) (i >> 16);
            bArr = this.aj;
            i2 = this.ac - 984165911;
            this.ac = i2;
            bArr[(i2 * 489625177) - 1] = (byte) (i >> 24);
            bArr = this.aj;
            i2 = this.ac - 984165911;
            this.ac = i2;
            bArr[(i2 * 489625177) - 1] = (byte) i;
            bArr = this.aj;
            i2 = this.ac - 984165911;
            this.ac = i2;
            bArr[(i2 * 489625177) - 1] = (byte) (i >> 8);
        } catch (Throwable e) {
            throw ei.ac(e, "he.ce(" + ')');
        }
    }

    public void ik(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 16);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 24);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) i;
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 8);
    }

    public void iq(int i) {
        byte[] bArr = this.aj;
        int i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 16);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 24);
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) i;
        bArr = this.aj;
        i2 = this.ac - 984165911;
        this.ac = i2;
        bArr[(i2 * 489625177) - 1] = (byte) (i >> 8);
    }

    public int ch(byte b) {
        try {
            this.ac += 358303652;
            return (((this.aj[(this.ac * 489625177) - 3] & 255) << 8) + (((this.aj[(this.ac * 489625177) - 2] & 255) << 16) + ((this.aj[(this.ac * 489625177) - 1] & 255) << 24))) + (this.aj[(this.ac * 489625177) - 4] & 255);
        } catch (Throwable e) {
            throw ei.ac(e, "he.ch(" + ')');
        }
    }

    public int jj() {
        this.ac += 358303652;
        return (((this.aj[(this.ac * 489625177) - 3] & 255) << 8) + (((this.aj[(this.ac * 489625177) - 2] & 255) << 16) + ((this.aj[(this.ac * 489625177) - 1] & 255) << 24))) + (this.aj[(this.ac * 489625177) - 4] & 255);
    }

    public int jq() {
        this.ac += 1925915357;
        return (((this.aj[(this.ac * 489625177) - 3] & 1905837858) << 8) + (((this.aj[(this.ac * 489625177) - 2] & -1351266455) << 16) + ((this.aj[(this.ac * 489625177) - 1] & 383655709) << 24))) + (this.aj[(this.ac * 489625177) - 4] & 255);
    }

    public int ci(int i) {
        try {
            this.ac += 358303652;
            return (this.aj[(this.ac * 489625177) - 3] & 255) + ((((this.aj[(this.ac * 489625177) - 1] & 255) << 16) + ((this.aj[(this.ac * 489625177) - 2] & 255) << 24)) + ((this.aj[(this.ac * 489625177) - 4] & 255) << 8));
        } catch (Throwable e) {
            throw ei.ac(e, "he.ci(" + ')');
        }
    }

    public int jd() {
        this.ac += 358303652;
        return (this.aj[(-2039851634 * this.ac) - 3] & 255) + ((((this.aj[(254893863 * this.ac) - 1] & -2095999529) << 16) + ((this.aj[(this.ac * 479346682) - 2] & 1813248049) << 24)) + ((this.aj[(this.ac * -440974869) - 4] & 1022620383) << 8));
    }

    public int jo() {
        this.ac += 358303652;
        return (this.aj[(1894575499 * this.ac) - 3] & 255) + ((((this.aj[(this.ac * 489625177) - 1] & 255) << 16) + ((this.aj[(this.ac * 489625177) - 2] & 255) << 24)) + ((this.aj[(this.ac * 489625177) - 4] & 255) << 8));
    }

    public int cq(byte b) {
        try {
            this.ac += 358303652;
            return (((this.aj[(this.ac * 489625177) - 1] & 255) << 8) + (((this.aj[(this.ac * 489625177) - 4] & 255) << 16) + ((this.aj[(this.ac * 489625177) - 3] & 255) << 24))) + (this.aj[(this.ac * 489625177) - 2] & 255);
        } catch (Throwable e) {
            throw ei.ac(e, "he.cq(" + ')');
        }
    }

    public int jg() {
        this.ac += 358303652;
        return (((this.aj[(this.ac * 489625177) - 1] & 255) << 8) + (((this.aj[(this.ac * 489625177) - 4] & 255) << 16) + ((this.aj[(this.ac * 489625177) - 3] & 255) << 24))) + (this.aj[(this.ac * 489625177) - 2] & 255);
    }

    public int ju() {
        this.ac += 358303652;
        return (((this.aj[(this.ac * 489625177) - 1] & 255) << 8) + (((this.aj[(this.ac * 489625177) - 4] & 255) << 16) + ((this.aj[(this.ac * 489625177) - 3] & 255) << 24))) + (this.aj[(this.ac * 489625177) - 2] & 255);
    }

    public void cv(byte[] bArr, int i, int i2, int i3) {
        int i4 = (i + i2) - 1;
        while (i4 >= i) {
            try {
                byte[] bArr2 = this.aj;
                int i5 = this.ac - 984165911;
                this.ac = i5;
                bArr[i4] = bArr2[(i5 * 489625177) - 1];
                i4--;
            } catch (Throwable e) {
                throw ei.ac(e, "he.cv(" + ')');
            }
        }
    }

    public void jk(byte[] bArr, int i, int i2) {
        for (int i3 = (i + i2) - 1; i3 >= i; i3--) {
            byte[] bArr2 = this.aj;
            int i4 = this.ac - 984165911;
            this.ac = i4;
            bArr[i3] = bArr2[(i4 * 489625177) - 1];
        }
    }

    public void jn(byte[] bArr, int i, int i2) {
        for (int i3 = (i + i2) - 1; i3 >= i; i3--) {
            byte[] bArr2 = this.aj;
            int i4 = this.ac - 984165911;
            this.ac = i4;
            bArr[i3] = bArr2[(i4 * 489625177) - 1];
        }
    }

    public void jv(byte[] bArr, int i, int i2) {
        for (int i3 = (i + i2) - 1; i3 >= i; i3--) {
            byte[] bArr2 = this.aj;
            int i4 = this.ac - 984165911;
            this.ac = i4;
            bArr[i3] = bArr2[(i4 * 489625177) - 1];
        }
    }

    public void jx(byte[] bArr, int i, int i2) {
        for (int i3 = (i + i2) - 1; i3 >= i; i3--) {
            byte[] bArr2 = this.aj;
            int i4 = this.ac - 984165911;
            this.ac = i4;
            bArr[i3] = bArr2[(i4 * 489625177) - 1];
        }
    }
}
