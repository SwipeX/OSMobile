package defpackage;

public class aw extends je {
    public static aw[] ac;
    public static ju aj;
    static aw an = new aw();
    static int[] bb;
    static lc pf;
    public int aa;
    public int ak;
    public int ao;
    public int ap;
    int aq = 0;

    public static synchronized long aj(byte b) {
        long currentTimeMillis;
        synchronized (aw.class) {
            try {
                currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis < ha.aj * 5727565921817926221L) {
                    ha.ac += ((ha.aj * 5727565921817926221L) - currentTimeMillis) * -4406263104573857541L;
                }
                ha.aj = -3594448448216387963L * currentTimeMillis;
                currentTimeMillis += 6883186051786861107L * ha.ac;
            } catch (Throwable e) {
                throw ei.ac(e, "aw.aj(" + ')');
            }
        }
        return currentTimeMillis;
    }

    public static aw aa(int i) {
        if (i < 0 || i >= ac.length) {
            return an;
        }
        return ac[i];
    }

    public static aw ak(int i) {
        return (i < 0 || i >= ac.length) ? an : ac[i];
    }

    public void ac(int i) {
        try {
            ao(this.aq * 1002611125, (byte) 0);
        } catch (Throwable e) {
            throw ei.ac(e, "aw.ac(" + ')');
        }
    }

    public void ap() {
        ao(this.aq * 1002611125, (byte) 0);
    }

    public void at() {
        ao(this.aq * 1002611125, (byte) 0);
    }

    public void ae(he heVar, int i) {
        while (true) {
            int au = heVar.au(-310118664);
            if (au != 0) {
                aq(heVar, au, i, 1639481011);
            } else {
                return;
            }
        }
    }

    public void ah(he heVar, int i) {
        while (true) {
            int au = heVar.au(-310118664);
            if (au != 0) {
                aq(heVar, au, i, 981893021);
            } else {
                return;
            }
        }
    }

    public void ai(he heVar, int i) {
        while (true) {
            int au = heVar.au(-310118664);
            if (au != 0) {
                aq(heVar, au, i, -1241026128);
            } else {
                return;
            }
        }
    }

    public void am(he heVar, int i) {
        while (true) {
            int au = heVar.au(-310118664);
            if (au != 0) {
                aq(heVar, au, i, -773029507);
            } else {
                return;
            }
        }
    }

    public void an(he heVar, int i, byte b) {
        while (true) {
            try {
                int au = heVar.au(-310118664);
                if (au != 0) {
                    aq(heVar, au, i, 631025771);
                } else {
                    return;
                }
            } catch (Throwable e) {
                throw ei.ac(e, "aw.an(" + ')');
            }
        }
    }

    public void aw(he heVar, int i) {
        while (true) {
            int au = heVar.au(-310118664);
            if (au != 0) {
                aq(heVar, au, i, 672140142);
            } else {
                return;
            }
        }
    }

    void al(he heVar, int i, int i2) {
        if (1 == i) {
            this.aq = heVar.ar(597353088) * -198441827;
        }
    }

    void aq(he heVar, int i, int i2, int i3) {
        if (1 == i) {
            try {
                this.aq = heVar.ar(597353088) * -198441827;
            } catch (Throwable e) {
                throw ei.ac(e, "aw.aq(" + ')');
            }
        }
    }

    void as(he heVar, int i, int i2) {
        if (1 == i) {
            this.aq = heVar.ar(597353088) * -198441827;
        }
    }

    void af(int i) {
        double d;
        double d2;
        double d3 = ((double) ((i >> 16) & 255)) / 256.0d;
        double d4 = ((double) ((i >> 8) & 255)) / 256.0d;
        double d5 = ((double) (i & 255)) / 256.0d;
        if (d4 < d3) {
            d = d4;
        } else {
            d = d3;
        }
        if (d5 < d) {
            d = d5;
        }
        if (d4 > d3) {
            d2 = d4;
        } else {
            d2 = d3;
        }
        if (d5 > d2) {
            d2 = d5;
        }
        double d6 = 0.0d;
        double d7 = (d + d2) / 2.0d;
        if (d2 != d) {
            if (d7 < 0.5d) {
                d6 = (d2 - d) / (d + d2);
            }
            if (d7 >= 0.5d) {
                d6 = (d2 - d) / ((2.0d - d2) - d);
            }
            if (d3 == d2) {
                d5 = (d4 - d5) / (d2 - d);
                d = d6;
            } else if (d4 == d2) {
                d5 = ((d5 - d3) / (d2 - d)) + 2.0d;
                d = d6;
            } else if (d5 == d2) {
                d5 = ((d3 - d4) / (d2 - d)) + 4.0d;
                d = d6;
            }
            d5 /= 6.0d;
            this.aa = ((int) (256.0d * d)) * -1625681191;
            this.ak = ((int) (256.0d * d7)) * 950488957;
            if (this.aa * -1613017751 < 0) {
                this.aa = 0;
            } else if (-1613017751 * this.aa > 255) {
                this.aa = 2063124007;
            }
            if (this.ak * 788980181 < 0) {
                this.ak = 0;
            } else if (788980181 * this.ak > 255) {
                this.ak = 1856515459;
            }
            if (d7 <= 0.5d) {
                this.ap = ((int) ((d * (1.0d - d7)) * 512.0d)) * 1791389181;
            } else {
                this.ap = ((int) ((d * d7) * 512.0d)) * 1791389181;
            }
            if (this.ap * -636037291 < 1) {
                this.ap = 1791389181;
            }
            this.ao = ((int) (((double) (this.ap * -636037291)) * d5)) * -1826879297;
        }
        d = d6;
        d5 = 0.0d;
        d5 /= 6.0d;
        this.aa = ((int) (256.0d * d)) * -1625681191;
        this.ak = ((int) (256.0d * d7)) * 950488957;
        if (this.aa * -1613017751 < 0) {
            this.aa = 0;
        } else if (-1613017751 * this.aa > 255) {
            this.aa = 2063124007;
        }
        if (this.ak * 788980181 < 0) {
            this.ak = 0;
        } else if (788980181 * this.ak > 255) {
            this.ak = 1856515459;
        }
        if (d7 <= 0.5d) {
            this.ap = ((int) ((d * d7) * 512.0d)) * 1791389181;
        } else {
            this.ap = ((int) ((d * (1.0d - d7)) * 512.0d)) * 1791389181;
        }
        if (this.ap * -636037291 < 1) {
            this.ap = 1791389181;
        }
        this.ao = ((int) (((double) (this.ap * -636037291)) * d5)) * -1826879297;
    }

    void ao(int i, byte b) {
        double d;
        double d2;
        double d3 = ((double) ((i >> 16) & 255)) / 256.0d;
        double d4 = ((double) ((i >> 8) & 255)) / 256.0d;
        double d5 = ((double) (i & 255)) / 256.0d;
        if (d4 < d3) {
            d = d4;
        } else {
            d = d3;
        }
        if (d5 < d) {
            d2 = d5;
        } else {
            d2 = d;
        }
        if (d4 > d3) {
            d = d4;
        } else {
            d = d3;
        }
        if (d5 > d) {
            d = d5;
        }
        double d6 = 0.0d;
        double d7 = (d2 + d) / 2.0d;
        if (d != d2) {
            if (d7 < 0.5d) {
                d6 = (d - d2) / (d2 + d);
            }
            if (d7 >= 0.5d) {
                d6 = (d - d2) / ((2.0d - d) - d2);
            }
            if (d3 == d) {
                d5 = (d4 - d5) / (d - d2);
                d = d6;
            } else if (d4 == d) {
                d5 = ((d5 - d3) / (d - d2)) + 2.0d;
                d = d6;
            } else if (d5 == d) {
                d5 = ((d3 - d4) / (d - d2)) + 4.0d;
                d = d6;
            }
            d5 /= 6.0d;
            this.aa = ((int) (256.0d * d)) * -1625681191;
            this.ak = ((int) (256.0d * d7)) * 950488957;
            if (this.aa * -1613017751 < 0) {
                this.aa = 0;
            } else if (-1613017751 * this.aa > 255) {
                this.aa = 2063124007;
            }
            if (this.ak * 788980181 < 0) {
                this.ak = 0;
            } else if (788980181 * this.ak > 255) {
                this.ak = 1856515459;
            }
            if (d7 <= 0.5d) {
                this.ap = ((int) ((d * (1.0d - d7)) * 512.0d)) * 1791389181;
            } else {
                this.ap = ((int) ((d * d7) * 512.0d)) * 1791389181;
            }
            if (this.ap * -636037291 < 1) {
                this.ap = 1791389181;
            }
            this.ao = ((int) (((double) (this.ap * -636037291)) * d5)) * -1826879297;
        }
        d = d6;
        d5 = 0.0d;
        d5 /= 6.0d;
        try {
            this.aa = ((int) (256.0d * d)) * -1625681191;
            this.ak = ((int) (256.0d * d7)) * 950488957;
            if (this.aa * -1613017751 < 0) {
                this.aa = 0;
            } else if (-1613017751 * this.aa > 255) {
                this.aa = 2063124007;
            }
            if (this.ak * 788980181 < 0) {
                this.ak = 0;
            } else if (788980181 * this.ak > 255) {
                this.ak = 1856515459;
            }
            if (d7 <= 0.5d) {
                this.ap = ((int) ((d * d7) * 512.0d)) * 1791389181;
            } else {
                this.ap = ((int) ((d * (1.0d - d7)) * 512.0d)) * 1791389181;
            }
            if (this.ap * -636037291 < 1) {
                this.ap = 1791389181;
            }
            this.ao = ((int) (((double) (this.ap * -636037291)) * d5)) * -1826879297;
        } catch (Throwable e) {
            throw ei.ac(e, "aw.ao(" + ')');
        }
    }

    void au(int i) {
        double d;
        double d2;
        double d3 = ((double) ((i >> 16) & 255)) / 256.0d;
        double d4 = ((double) ((i >> 8) & 255)) / 256.0d;
        double d5 = ((double) (i & 255)) / 256.0d;
        if (d4 < d3) {
            d = d4;
        } else {
            d = d3;
        }
        if (d5 < d) {
            d2 = d5;
        } else {
            d2 = d;
        }
        if (d4 > d3) {
            d = d4;
        } else {
            d = d3;
        }
        if (d5 > d) {
            d = d5;
        }
        double d6 = 0.0d;
        double d7 = (d2 + d) / 2.0d;
        if (d != d2) {
            if (d7 < 0.5d) {
                d6 = (d - d2) / (d2 + d);
            }
            if (d7 >= 0.5d) {
                d6 = (d - d2) / ((2.0d - d) - d2);
            }
            if (d3 == d) {
                d5 = (d4 - d5) / (d - d2);
                d = d6;
            } else if (d4 == d) {
                d5 = ((d5 - d3) / (d - d2)) + 2.0d;
                d = d6;
            } else if (d5 == d) {
                d5 = ((d3 - d4) / (d - d2)) + 4.0d;
                d = d6;
            }
            d5 /= 6.0d;
            this.aa = ((int) (256.0d * d)) * -1625681191;
            this.ak = ((int) (256.0d * d7)) * 950488957;
            if (this.aa * -1613017751 < 0) {
                this.aa = 0;
            } else if (-1613017751 * this.aa > 255) {
                this.aa = 2063124007;
            }
            if (this.ak * 788980181 < 0) {
                this.ak = 0;
            } else if (788980181 * this.ak > 255) {
                this.ak = 1856515459;
            }
            if (d7 <= 0.5d) {
                this.ap = ((int) ((d * (1.0d - d7)) * 512.0d)) * 1791389181;
            } else {
                this.ap = ((int) ((d * d7) * 512.0d)) * 1791389181;
            }
            if (this.ap * -636037291 < 1) {
                this.ap = 1791389181;
            }
            this.ao = ((int) (((double) (this.ap * -636037291)) * d5)) * -1826879297;
        }
        d = d6;
        d5 = 0.0d;
        d5 /= 6.0d;
        this.aa = ((int) (256.0d * d)) * -1625681191;
        this.ak = ((int) (256.0d * d7)) * 950488957;
        if (this.aa * -1613017751 < 0) {
            this.aa = 0;
        } else if (-1613017751 * this.aa > 255) {
            this.aa = 2063124007;
        }
        if (this.ak * 788980181 < 0) {
            this.ak = 0;
        } else if (788980181 * this.ak > 255) {
            this.ak = 1856515459;
        }
        if (d7 <= 0.5d) {
            this.ap = ((int) ((d * d7) * 512.0d)) * 1791389181;
        } else {
            this.ap = ((int) ((d * (1.0d - d7)) * 512.0d)) * 1791389181;
        }
        if (this.ap * -636037291 < 1) {
            this.ap = 1791389181;
        }
        this.ao = ((int) (((double) (this.ap * -636037291)) * d5)) * -1826879297;
    }

    void ax(int i) {
        double d;
        double d2;
        double d3 = ((double) ((i >> 16) & 427928916)) / 256.0d;
        double d4 = ((double) ((i >> 8) & 255)) / 256.0d;
        double d5 = ((double) (i & 255)) / 256.0d;
        if (d4 < d3) {
            d = d4;
        } else {
            d = d3;
        }
        if (d5 < d) {
            d = d5;
        }
        if (d4 > d3) {
            d2 = d4;
        } else {
            d2 = d3;
        }
        if (d5 > d2) {
            d2 = d5;
        }
        double d6 = 0.0d;
        double d7 = (d + d2) / 2.0d;
        if (d2 != d) {
            if (d7 < 0.5d) {
                d6 = (d2 - d) / (d + d2);
            }
            if (d7 >= 0.5d) {
                d6 = (d2 - d) / ((2.0d - d2) - d);
            }
            if (d3 == d2) {
                d5 = (d4 - d5) / (d2 - d);
                d = d6;
            } else if (d4 == d2) {
                d5 = ((d5 - d3) / (d2 - d)) + 2.0d;
                d = d6;
            } else if (d5 == d2) {
                d5 = ((d3 - d4) / (d2 - d)) + 4.0d;
                d = d6;
            }
            d5 /= 6.0d;
            this.aa = ((int) (256.0d * d)) * -1625681191;
            this.ak = ((int) (256.0d * d7)) * 1438700969;
            if (this.aa * -1613017751 < 0) {
                this.aa = 0;
            } else if (-1196034041 * this.aa > 255) {
                this.aa = 572320024;
            }
            if (this.ak * 788980181 < 0) {
                this.ak = 0;
            } else if (1219159804 * this.ak > 255) {
                this.ak = 460732514;
            }
            if (d7 <= 0.5d) {
                this.ap = ((int) ((d * (1.0d - d7)) * 512.0d)) * 539532779;
            } else {
                this.ap = ((int) ((d * d7) * 512.0d)) * 1791389181;
            }
            if (this.ap * -636037291 < 1) {
                this.ap = 1791389181;
            }
            this.ao = ((int) (((double) (this.ap * -636037291)) * d5)) * -1826879297;
        }
        d = d6;
        d5 = 0.0d;
        d5 /= 6.0d;
        this.aa = ((int) (256.0d * d)) * -1625681191;
        this.ak = ((int) (256.0d * d7)) * 1438700969;
        if (this.aa * -1613017751 < 0) {
            this.aa = 0;
        } else if (-1196034041 * this.aa > 255) {
            this.aa = 572320024;
        }
        if (this.ak * 788980181 < 0) {
            this.ak = 0;
        } else if (1219159804 * this.ak > 255) {
            this.ak = 460732514;
        }
        if (d7 <= 0.5d) {
            this.ap = ((int) ((d * d7) * 512.0d)) * 1791389181;
        } else {
            this.ap = ((int) ((d * (1.0d - d7)) * 512.0d)) * 539532779;
        }
        if (this.ap * -636037291 < 1) {
            this.ap = 1791389181;
        }
        this.ao = ((int) (((double) (this.ap * -636037291)) * d5)) * -1826879297;
    }

    void az(int i) {
        double d;
        double d2;
        double d3 = ((double) ((i >> 16) & 255)) / 256.0d;
        double d4 = ((double) ((i >> 8) & 255)) / 256.0d;
        double d5 = ((double) (i & 255)) / 256.0d;
        if (d4 < d3) {
            d = d4;
        } else {
            d = d3;
        }
        if (d5 < d) {
            d = d5;
        }
        if (d4 > d3) {
            d2 = d4;
        } else {
            d2 = d3;
        }
        if (d5 > d2) {
            d2 = d5;
        }
        double d6 = 0.0d;
        double d7 = (d + d2) / 2.0d;
        if (d2 != d) {
            if (d7 < 0.5d) {
                d6 = (d2 - d) / (d + d2);
            }
            if (d7 >= 0.5d) {
                d6 = (d2 - d) / ((2.0d - d2) - d);
            }
            if (d3 == d2) {
                d5 = (d4 - d5) / (d2 - d);
                d = d6;
            } else if (d4 == d2) {
                d5 = ((d5 - d3) / (d2 - d)) + 2.0d;
                d = d6;
            } else if (d5 == d2) {
                d5 = ((d3 - d4) / (d2 - d)) + 4.0d;
                d = d6;
            }
            d5 /= 6.0d;
            this.aa = ((int) (256.0d * d)) * -1625681191;
            this.ak = ((int) (256.0d * d7)) * 950488957;
            if (this.aa * -1613017751 < 0) {
                this.aa = 0;
            } else if (-1613017751 * this.aa > 255) {
                this.aa = 2063124007;
            }
            if (this.ak * 788980181 < 0) {
                this.ak = 0;
            } else if (788980181 * this.ak > 255) {
                this.ak = 1856515459;
            }
            if (d7 <= 0.5d) {
                this.ap = ((int) ((d * (1.0d - d7)) * 512.0d)) * 1791389181;
            } else {
                this.ap = ((int) ((d * d7) * 512.0d)) * 1791389181;
            }
            if (this.ap * -636037291 < 1) {
                this.ap = 1791389181;
            }
            this.ao = ((int) (((double) (this.ap * -636037291)) * d5)) * -1826879297;
        }
        d = d6;
        d5 = 0.0d;
        d5 /= 6.0d;
        this.aa = ((int) (256.0d * d)) * -1625681191;
        this.ak = ((int) (256.0d * d7)) * 950488957;
        if (this.aa * -1613017751 < 0) {
            this.aa = 0;
        } else if (-1613017751 * this.aa > 255) {
            this.aa = 2063124007;
        }
        if (this.ak * 788980181 < 0) {
            this.ak = 0;
        } else if (788980181 * this.ak > 255) {
            this.ak = 1856515459;
        }
        if (d7 <= 0.5d) {
            this.ap = ((int) ((d * d7) * 512.0d)) * 1791389181;
        } else {
            this.ap = ((int) ((d * (1.0d - d7)) * 512.0d)) * 1791389181;
        }
        if (this.ap * -636037291 < 1) {
            this.ap = 1791389181;
        }
        this.ao = ((int) (((double) (this.ap * -636037291)) * d5)) * -1826879297;
    }

    public static em aq(ju juVar, int i, int i2, int i3) {
        try {
            if (!ei.aw(juVar, i, i2, -2006428015)) {
                return null;
            }
            em emVar = new em();
            emVar.aa = 328517235 * fi.ac;
            emVar.ak = 2031617253 * fi.an;
            emVar.aq = fi.aq[0];
            emVar.ao = fi.ao[0];
            emVar.ac = fi.aa[0];
            emVar.an = fi.ak[0];
            int i4 = emVar.an * emVar.ac;
            byte[] bArr = fi.at[0];
            ht.al((byte) -12);
            emVar.aj = new int[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                emVar.aj[i5] = fi.ap[bArr[i5] & 255];
            }
            gn.as((byte) -7);
            return emVar;
        } catch (Throwable e) {
            throw ei.ac(e, "aw.aq(" + ')');
        }
    }

    static final void al(byte b) {
        try {
            ix ixVar = (ix) null;
            cw.ac(30, "", ix.gp, -2118304991);
        } catch (Throwable e) {
            throw ei.ac(e, "aw.al(" + ')');
        }
    }

    static int as(int i, fs fsVar, boolean z, int i2) {
        int[] iArr;
        int i3;
        ab aj;
        int[] iArr2;
        int i4;
        if (2700 == i) {
            try {
                iArr = gr.ak;
                i3 = dy.ap - -401924967;
                dy.ap = i3;
                aj = ac.aj(iArr[i3 * -38307927], 491784621);
                iArr2 = gr.ak;
                i4 = dy.ap - 401924967;
                dy.ap = i4;
                iArr2[(i4 * -38307927) - 1] = aj.fq * 534302651;
                return 1;
            } catch (Throwable e) {
                throw ei.ac(e, "aw.as(" + ')');
            }
        } else if (i == 2701) {
            iArr = gr.ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            aj = ac.aj(iArr[i3 * -38307927], 2112848035);
            if (-1 != aj.fq * 534302651) {
                iArr2 = gr.ak;
                i4 = dy.ap - 401924967;
                dy.ap = i4;
                iArr2[(i4 * -38307927) - 1] = aj.fz * -445824347;
            } else {
                iArr = gr.ak;
                i3 = dy.ap - 401924967;
                dy.ap = i3;
                iArr[(i3 * -38307927) - 1] = 0;
            }
            return 1;
        } else if (2702 == i) {
            iArr = gr.ak;
            i3 = dy.ap - -401924967;
            dy.ap = i3;
            if (((fr) client.ic.aj((long) iArr[i3 * -38307927])) != null) {
                iArr = gr.ak;
                i3 = dy.ap - 401924967;
                dy.ap = i3;
                iArr[(i3 * -38307927) - 1] = 1;
            } else {
                iArr = gr.ak;
                i3 = dy.ap - 401924967;
                dy.ap = i3;
                iArr[(i3 * -38307927) - 1] = 0;
            }
            return 1;
        } else if (i != 2706) {
            return 2;
        } else {
            iArr = gr.ak;
            i3 = dy.ap - 401924967;
            dy.ap = i3;
            iArr[(i3 * -38307927) - 1] = client.iy * 622465413;
            return 1;
        }
    }

    static final void bq(String str, int i) {
        boolean z = true;
        try {
            boolean z2;
            if (str.equalsIgnoreCase("toggleroof")) {
                ae.nv.an = !ae.nv.an;
                et.an(-740654815);
                if (ae.nv.an) {
                    cw.ac(99, "", "Roofs are now all hidden", -1924576292);
                } else {
                    cw.ac(99, "", "Roofs will only be removed selectively", -2041421331);
                }
            }
            if (str.equalsIgnoreCase("displayfps")) {
                client.bm = !client.bm;
            }
            if (str.equalsIgnoreCase("models")) {
                if (cr.bd) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                cr.bd = z2;
            }
            if (str.equalsIgnoreCase("world")) {
                if (client.os) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                client.os = z2;
            }
            if (str.equalsIgnoreCase("ground")) {
                ce.an = !ce.an;
            }
            if (str.equalsIgnoreCase("minimap")) {
                if (client.on) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                client.on = z2;
            }
            if (str.equalsIgnoreCase("clickbox")) {
                String str2;
                if (ct.bw) {
                    z = false;
                }
                ct.bw = z;
                String str3 = "";
                StringBuilder append = new StringBuilder().append("Clickbox Mode: ");
                if (ct.bw) {
                    str2 = "AABB";
                } else {
                    str2 = "Legacy";
                }
                cw.ac(99, str3, append.append(str2).toString(), -1967171489);
            }
            if (240624837 * client.ia >= 2) {
                if (str.equalsIgnoreCase("gpu")) {
                    client.ac.tn((byte) -121);
                }
                if (str.equalsIgnoreCase("aabb")) {
                    if (!cs.aj) {
                        cs.aj = true;
                        cs.aq = cu.ac;
                    } else if (cu.ac == cs.aq) {
                        cs.aj = true;
                        cs.aq = cu.aj;
                    } else {
                        cs.aj = false;
                    }
                }
                if (str.equalsIgnoreCase("fpson")) {
                    client.bm = true;
                }
                if (str.equalsIgnoreCase("fpsoff")) {
                    client.bm = false;
                }
                if (str.equalsIgnoreCase("gc")) {
                    System.gc();
                }
                if (str.equalsIgnoreCase("clientdrop")) {
                    be.bh((byte) 8);
                }
                if (str.equalsIgnoreCase("cs")) {
                    cw.ac(99, "", "" + client.da, -2092732739);
                }
                if (str.equalsIgnoreCase("errortest") && 2 == 1477204923 * client.aa) {
                    throw new RuntimeException();
                }
            }
            mg ac = hd.ac(mr.dt, client.dp.ao, (byte) -58);
            ac.an.an(str.length() + 1, (byte) -19);
            ac.an.ai(str, 1872693545);
            client.dp.an(ac, 239216296);
        } catch (Throwable e) {
            throw ei.ac(e, "aw.bq(" + ')');
        }
    }
}
