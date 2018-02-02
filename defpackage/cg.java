package defpackage;

public final class cg extends cv {
    static final int at = 4;
    final int ac;
    final int aj;
    final int an;
    final int ao;
    final int aq;

    public static em[] ak(ju juVar, String str, String str2, byte b) {
        try {
            int au = juVar.au(str, -2128103833);
            return ec.an(juVar, au, juVar.av(au, str2, (byte) -42), (byte) -100);
        } catch (Throwable e) {
            throw ei.ac(e, "cg.ak(" + ')');
        }
    }

    cg(int i, int i2, int i3, int i4, int i5) {
        try {
            this.aj = -498546197 * i;
            this.ac = -253575465 * i2;
            this.an = -1603125493 * i3;
            this.aq = -190613941 * i4;
            this.ao = -1508696883 * i5;
        } catch (Throwable e) {
            throw ei.ac(e, "cg.<init>(" + ')');
        }
    }

    final void ac(es esVar, int i) {
        try {
            esVar.fd((esVar.aa * 889727047) + (this.aj * -2103699773), (this.ac * 684397799) + (-1857728003 * esVar.aq), (-669051741 * this.an) - (this.aj * -2103699773), (this.aq * -189324445) - (this.ac * 684397799), -1121832955 * this.ao, (short) -28737);
        } catch (Throwable e) {
            throw ei.ac(e, "cg.ac(" + ')');
        }
    }

    final void ao(es esVar) {
        esVar.fd((esVar.aa * 889727047) + (this.aj * -2103699773), (this.ac * 684397799) + (-1857728003 * esVar.aq), (-669051741 * this.an) - (this.aj * -2103699773), (this.aq * -189324445) - (this.ac * 684397799), -1121832955 * this.ao, (short) -6746);
    }

    final void aq(es esVar) {
        esVar.fd((esVar.aa * 889727047) + (this.aj * -479912639), (this.ac * 684397799) + (-1857728003 * esVar.aq), (-437737410 * this.an) - (-923969605 * this.aj), (this.aq * 2133759551) - (this.ac * 684397799), -1121832955 * this.ao, (short) -30759);
    }

    static final fr fj(int i, int i2, int i3, int i4) {
        try {
            jt frVar = new fr();
            frVar.aj = 751332689 * i2;
            frVar.ac = 199935725 * i3;
            client.ic.ac(frVar, (long) i);
            at.en(i2, (byte) -99);
            ab aj = ac.aj(i, 1591892457);
            cf.ew(aj, (byte) 6);
            if (client.iz != null) {
                cf.ew(client.iz, (byte) -79);
                client.iz = null;
            }
            dj.hs.bv((byte) -23);
            cu.ej(ab.aa[i >> 16], aj, false, (byte) -100);
            lm.ad(i2, (byte) 8);
            if (-1 != client.iy * 622465413) {
                fa.ec(client.iy * 622465413, 1, -451839000);
            }
            return frVar;
        } catch (Throwable e) {
            throw ei.ac(e, "cg.fj(" + ')');
        }
    }
}
