package defpackage;

import com.jagex.oldscape.osrenderer.aj;
import com.jagex.oldscape.osrenderer.zv;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class bj extends cr {
    static int ol;
    List aa;
    int[] ac;
    int[] aj;
    int[] an;
    int ao;

    bj(ba baVar) {
        try {
            super(baVar);
            this.aj = new int[4700];
            this.ac = new int[4700];
            this.an = new int[4700];
            this.aa = new LinkedList();
        } catch (Throwable e) {
            throw ei.ac(e, "bj.<init>(" + ')');
        }
    }

    final void aq(int i, int i2) {
        try {
            this.ao = -1474891303 * i;
            this.aa.size();
            ao(Byte.MIN_VALUE);
        } catch (Throwable e) {
            throw ei.ac(e, "bj.aq(" + ')');
        }
    }

    final void m1au(int i) {
        this.ao = -1474891303 * i;
        this.aa.size();
        ao((byte) -65);
    }

    final void av(int i) {
        this.ao = -1474891303 * i;
        this.aa.size();
        ao((byte) -29);
    }

    final void ad() {
        int i = (this.ao * 423525993) - 100;
        Iterator it = this.aa.iterator();
        while (it.hasNext()) {
            ct ctVar = (ct) it.next();
            if (i >= ctVar.bu) {
                af(ctVar, -262315098);
                ctVar.bu = -1;
                ctVar.bb = true;
                it.remove();
            }
        }
    }

    final void ag() {
        int i = (this.ao * 423525993) - 100;
        Iterator it = this.aa.iterator();
        while (it.hasNext()) {
            ct ctVar = (ct) it.next();
            if (i >= ctVar.bu) {
                af(ctVar, -1891246786);
                ctVar.bu = -1;
                ctVar.bb = true;
                it.remove();
            }
        }
    }

    final void ao(byte b) {
        try {
            int i = (this.ao * 423525993) - 100;
            Iterator it = this.aa.iterator();
            while (it.hasNext()) {
                ct ctVar = (ct) it.next();
                if (i >= ctVar.bu) {
                    af(ctVar, -739998883);
                    ctVar.bu = -1;
                    ctVar.bb = true;
                    it.remove();
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "bj.ao(" + ')');
        }
    }

    final void ar() {
        int i = (this.ao * 1348434439) - 48652156;
        Iterator it = this.aa.iterator();
        while (it.hasNext()) {
            ct ctVar = (ct) it.next();
            if (i >= ctVar.bu) {
                af(ctVar, -624783883);
                ctVar.bu = -1;
                ctVar.bb = true;
                it.remove();
            }
        }
    }

    final void ay() {
        int i = (this.ao * 423525993) - 100;
        Iterator it = this.aa.iterator();
        while (it.hasNext()) {
            ct ctVar = (ct) it.next();
            if (i >= ctVar.bu) {
                af(ctVar, 165429377);
                ctVar.bu = -1;
                ctVar.bb = true;
                it.remove();
            }
        }
    }

    static final void aj(hn hnVar, short s) {
        try {
            hnVar.jl(-73878883);
            int i = client.hm * 2143941393;
            ff[] ffVarArr = client.hx;
            ff ffVar = new ff();
            ffVarArr[i] = ffVar;
            cx.hb = ffVar;
            ffVar.ad = -1705513135 * i;
            int jc = hnVar.jc(30, 1985615739);
            byte b = (byte) (jc >> 28);
            int i2 = (jc >> 14) & 16383;
            jc &= 16383;
            ffVar.dd[0] = i2 - (-357869149 * fz.du);
            ffVar.br = ((ffVar.dd[0] << 7) + (ffVar.at(-1521230549) << 6)) * 1530846649;
            ffVar.ds[0] = jc - (1195683827 * fm.dn);
            ffVar.bb = ((ffVar.ds[0] << 7) + (ffVar.at(-1521230549) << 6)) * -376780581;
            jc = 1722394509 * b;
            ffVar.ar = jc;
            lw.hn = jc * 729091405;
            if (fu.ao[i] != null) {
                ffVar.aj(fu.ao[i], (byte) 73);
            }
            fu.aa = 0;
            int[] iArr = fu.ak;
            int i3 = fu.aa - 63970097;
            fu.aa = i3;
            iArr[(i3 * -2089377233) - 1] = i;
            fu.an[i] = (byte) 0;
            fu.ap = 0;
            for (jc = 1; jc < bq.ai; jc++) {
                if (i != jc) {
                    i3 = hnVar.jc(18, 1922871241);
                    int i4 = i3 >> 16;
                    i2 = (i3 >> 8) & 597;
                    fu.ah[jc] = (i3 & 597) + ((i4 << 28) + (i2 << 14));
                    fu.ai[jc] = 0;
                    fu.aw[jc] = -1;
                    int[] iArr2 = fu.at;
                    i4 = fu.ap + 1409848021;
                    fu.ap = i4;
                    iArr2[(i4 * 862590589) - 1] = jc;
                    fu.an[jc] = (byte) 0;
                }
            }
            hnVar.jz((byte) 4);
        } catch (Throwable e) {
            throw ei.ac(e, "bj.aj(" + ')');
        }
    }

    public final void ah(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.ag[0] = -1;
        if (!(2 == ctVar.by || ctVar.by == 1)) {
            ctVar.ak();
        }
        int i8 = this.bu.br * 266497203;
        int i9 = this.bu.bb * 1621686031;
        int i10 = ak[i];
        int i11 = ap[i];
        int i12 = ak[i2];
        int i13 = ap[i2];
        int i14 = ak[i3];
        int i15 = ap[i3];
        int i16 = ak[i4];
        int i17 = ap[i4];
        int i18 = ((i16 * i6) + (i7 * i17)) >> 16;
        for (int i19 = 0; i19 < ctVar.ao; i19++) {
            int i20;
            int i21 = ctVar.aa[i19];
            int i22 = ctVar.ak[i19];
            int i23 = ctVar.ap[i19];
            if (i3 != 0) {
                i20 = ((i21 * i15) + (i22 * i14)) >> 16;
                i22 = ((i22 * i15) - (i21 * i14)) >> 16;
            } else {
                i20 = i21;
            }
            if (i != 0) {
                i23 = ((i23 * i11) + (i22 * i10)) >> 16;
                i22 = ((i11 * i22) - (i10 * i23)) >> 16;
            }
            if (i2 != 0) {
                i21 = ((i12 * i23) + (i13 * i20)) >> 16;
                i23 = ((i23 * i13) - (i20 * i12)) >> 16;
            } else {
                i21 = i20;
            }
            i21 += i5;
            i20 = i22 + i6;
            i23 += i7;
            i22 = ((i20 * i17) - (i23 * i16)) >> 16;
            i23 = ((i23 * i17) + (i20 * i16)) >> 16;
            this.ax[i19] = i23 - i18;
            this.al[i19] = (((411538491 * this.bu.bt) * i21) / i23) + i8;
            this.az[i19] = (((411538491 * this.bu.bt) * i22) / i23) + i9;
            if (ctVar.av > 0) {
                this.af[i19] = i21;
                this.au[i19] = i22;
                this.av[i19] = i23;
            }
        }
        try {
            al(ctVar, false, false, 0, (byte) 63);
        } catch (Exception e) {
        }
    }

    public final void aj(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, byte b) {
        try {
            this.ag[0] = -1;
            if (!(2 == ctVar.by || ctVar.by == 1)) {
                ctVar.ak();
            }
            int i8 = this.bu.br * 266497203;
            int i9 = this.bu.bb * 1621686031;
            int i10 = ak[i];
            int i11 = ap[i];
            int i12 = ak[i2];
            int i13 = ap[i2];
            int i14 = ak[i3];
            int i15 = ap[i3];
            int i16 = ak[i4];
            int i17 = ap[i4];
            int i18 = ((i16 * i6) + (i7 * i17)) >> 16;
            for (int i19 = 0; i19 < ctVar.ao; i19++) {
                int i20;
                int i21 = ctVar.aa[i19];
                int i22 = ctVar.ak[i19];
                int i23 = ctVar.ap[i19];
                if (i3 != 0) {
                    i20 = ((i21 * i15) + (i22 * i14)) >> 16;
                    i22 = ((i22 * i15) - (i21 * i14)) >> 16;
                } else {
                    i20 = i21;
                }
                if (i != 0) {
                    i23 = ((i23 * i11) + (i22 * i10)) >> 16;
                    i22 = ((i11 * i22) - (i10 * i23)) >> 16;
                }
                if (i2 != 0) {
                    i21 = ((i12 * i23) + (i13 * i20)) >> 16;
                    i23 = ((i23 * i13) - (i20 * i12)) >> 16;
                } else {
                    i21 = i20;
                }
                i21 += i5;
                i20 = i22 + i6;
                i23 += i7;
                i22 = ((i20 * i17) - (i23 * i16)) >> 16;
                i23 = ((i23 * i17) + (i20 * i16)) >> 16;
                this.ax[i19] = i23 - i18;
                this.al[i19] = (((411538491 * this.bu.bt) * i21) / i23) + i8;
                this.az[i19] = (((411538491 * this.bu.bt) * i22) / i23) + i9;
                if (ctVar.av > 0) {
                    this.af[i19] = i21;
                    this.au[i19] = i22;
                    this.av[i19] = i23;
                }
            }
            try {
                al(ctVar, false, false, 0, (byte) 23);
            } catch (Exception e) {
            }
        } catch (Throwable e2) {
            throw ei.ac(e2, "bj.aj(" + ')');
        }
    }

    public final void ak(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.ag[0] = -1;
        if (!(2 == ctVar.by || ctVar.by == 1)) {
            ctVar.ak();
        }
        int i8 = this.bu.br * 266497203;
        int i9 = this.bu.bb * 1621686031;
        int i10 = ak[i];
        int i11 = ap[i];
        int i12 = ak[i2];
        int i13 = ap[i2];
        int i14 = ak[i3];
        int i15 = ap[i3];
        int i16 = ak[i4];
        int i17 = ap[i4];
        int i18 = ((i16 * i6) + (i7 * i17)) >> 16;
        for (int i19 = 0; i19 < ctVar.ao; i19++) {
            int i20;
            int i21 = ctVar.aa[i19];
            int i22 = ctVar.ak[i19];
            int i23 = ctVar.ap[i19];
            if (i3 != 0) {
                i20 = ((i21 * i15) + (i22 * i14)) >> 16;
                i22 = ((i22 * i15) - (i21 * i14)) >> 16;
            } else {
                i20 = i21;
            }
            if (i != 0) {
                i23 = ((i23 * i11) + (i22 * i10)) >> 16;
                i22 = ((i11 * i22) - (i10 * i23)) >> 16;
            }
            if (i2 != 0) {
                i21 = ((i12 * i23) + (i13 * i20)) >> 16;
                i23 = ((i23 * i13) - (i20 * i12)) >> 16;
            } else {
                i21 = i20;
            }
            i21 += i5;
            i20 = i22 + i6;
            i23 += i7;
            i22 = ((i20 * i17) - (i23 * i16)) >> 16;
            i23 = ((i23 * i17) + (i20 * i16)) >> 16;
            this.ax[i19] = i23 - i18;
            this.al[i19] = (((-1742311655 * this.bu.bt) * i21) / i23) + i8;
            this.az[i19] = (((-117210170 * this.bu.bt) * i22) / i23) + i9;
            if (ctVar.av > 0) {
                this.af[i19] = i21;
                this.au[i19] = i22;
                this.av[i19] = i23;
            }
        }
        try {
            al(ctVar, false, false, 0, (byte) 123);
        } catch (Exception e) {
        }
    }

    public final void ap(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.ag[0] = -1;
        if (!(2 == ctVar.by || ctVar.by == 1)) {
            ctVar.ak();
        }
        int i8 = this.bu.br * 266497203;
        int i9 = this.bu.bb * 460971602;
        int i10 = ak[i];
        int i11 = ap[i];
        int i12 = ak[i2];
        int i13 = ap[i2];
        int i14 = ak[i3];
        int i15 = ap[i3];
        int i16 = ak[i4];
        int i17 = ap[i4];
        int i18 = ((i16 * i6) + (i7 * i17)) >> 16;
        for (int i19 = 0; i19 < ctVar.ao; i19++) {
            int i20;
            int i21 = ctVar.aa[i19];
            int i22 = ctVar.ak[i19];
            int i23 = ctVar.ap[i19];
            if (i3 != 0) {
                i20 = ((i21 * i15) + (i22 * i14)) >> 16;
                i22 = ((i22 * i15) - (i21 * i14)) >> 16;
            } else {
                i20 = i21;
            }
            if (i != 0) {
                i23 = ((i23 * i11) + (i22 * i10)) >> 16;
                i22 = ((i11 * i22) - (i10 * i23)) >> 16;
            }
            if (i2 != 0) {
                i21 = ((i12 * i23) + (i13 * i20)) >> 16;
                i23 = ((i23 * i13) - (i20 * i12)) >> 16;
            } else {
                i21 = i20;
            }
            i21 += i5;
            i20 = i22 + i6;
            i23 += i7;
            i22 = ((i20 * i17) - (i23 * i16)) >> 16;
            i23 = ((i23 * i17) + (i20 * i16)) >> 16;
            this.ax[i19] = i23 - i18;
            this.al[i19] = (((-1726600935 * this.bu.bt) * i21) / i23) + i8;
            this.az[i19] = (((411538491 * this.bu.bt) * i22) / i23) + i9;
            if (ctVar.av > 0) {
                this.af[i19] = i21;
                this.au[i19] = i22;
                this.av[i19] = i23;
            }
        }
        try {
            al(ctVar, false, false, 0, (byte) 48);
        } catch (Exception e) {
        }
    }

    public final void at(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.ag[0] = -1;
        if (!(2 == ctVar.by || ctVar.by == 1)) {
            ctVar.ak();
        }
        int i8 = this.bu.br * 266497203;
        int i9 = this.bu.bb * 1621686031;
        int i10 = ak[i];
        int i11 = ap[i];
        int i12 = ak[i2];
        int i13 = ap[i2];
        int i14 = ak[i3];
        int i15 = ap[i3];
        int i16 = ak[i4];
        int i17 = ap[i4];
        int i18 = ((i16 * i6) + (i7 * i17)) >> 16;
        for (int i19 = 0; i19 < ctVar.ao; i19++) {
            int i20;
            int i21 = ctVar.aa[i19];
            int i22 = ctVar.ak[i19];
            int i23 = ctVar.ap[i19];
            if (i3 != 0) {
                i20 = ((i21 * i15) + (i22 * i14)) >> 16;
                i22 = ((i22 * i15) - (i21 * i14)) >> 16;
            } else {
                i20 = i21;
            }
            if (i != 0) {
                i23 = ((i23 * i11) + (i22 * i10)) >> 16;
                i22 = ((i11 * i22) - (i10 * i23)) >> 16;
            }
            if (i2 != 0) {
                i21 = ((i12 * i23) + (i13 * i20)) >> 16;
                i23 = ((i23 * i13) - (i20 * i12)) >> 16;
            } else {
                i21 = i20;
            }
            i21 += i5;
            i20 = i22 + i6;
            i23 += i7;
            i22 = ((i20 * i17) - (i23 * i16)) >> 16;
            i23 = ((i23 * i17) + (i20 * i16)) >> 16;
            this.ax[i19] = i23 - i18;
            this.al[i19] = (((411538491 * this.bu.bt) * i21) / i23) + i8;
            this.az[i19] = (((411538491 * this.bu.bt) * i22) / i23) + i9;
            if (ctVar.av > 0) {
                this.af[i19] = i21;
                this.au[i19] = i22;
                this.av[i19] = i23;
            }
        }
        try {
            al(ctVar, false, false, 0, (byte) 49);
        } catch (Exception e) {
        }
    }

    public final void ac(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, byte b) {
        try {
            this.ag[0] = -1;
            if (!(2 == ctVar.by || ctVar.by == 1)) {
                ctVar.ak();
            }
            int i9 = 266497203 * this.bu.br;
            int i10 = this.bu.bb * 1621686031;
            int i11 = ak[i];
            int i12 = ap[i];
            int i13 = ak[i2];
            int i14 = ap[i2];
            int i15 = ak[i3];
            int i16 = ap[i3];
            int i17 = ak[i4];
            int i18 = ap[i4];
            int i19 = ((i17 * i6) + (i18 * i7)) >> 16;
            for (int i20 = 0; i20 < ctVar.ao; i20++) {
                int i21;
                int i22 = ctVar.aa[i20];
                int i23 = ctVar.ak[i20];
                int i24 = ctVar.ap[i20];
                if (i3 != 0) {
                    i21 = ((i23 * i15) + (i16 * i22)) >> 16;
                    i23 = ((i23 * i16) - (i22 * i15)) >> 16;
                } else {
                    i21 = i22;
                }
                if (i != 0) {
                    i24 = ((i24 * i12) + (i23 * i11)) >> 16;
                    i23 = ((i23 * i12) - (i11 * i24)) >> 16;
                }
                if (i2 != 0) {
                    i22 = ((i14 * i21) + (i13 * i24)) >> 16;
                    i24 = ((i24 * i14) - (i21 * i13)) >> 16;
                } else {
                    i22 = i21;
                }
                i22 += i5;
                i21 = i23 + i6;
                i24 += i7;
                i23 = ((i18 * i21) - (i17 * i24)) >> 16;
                i24 = ((i24 * i18) + (i21 * i17)) >> 16;
                this.ax[i20] = i24 - i19;
                this.al[i20] = (((411538491 * this.bu.bt) * i22) / i8) + i9;
                this.az[i20] = (((411538491 * this.bu.bt) * i23) / i8) + i10;
                if (ctVar.av > 0) {
                    this.af[i20] = i22;
                    this.au[i20] = i23;
                    this.av[i20] = i24;
                }
            }
            try {
                al(ctVar, false, false, 0, (byte) 1);
            } catch (Exception e) {
            }
        } catch (Throwable e2) {
            throw ei.ac(e2, "bj.ac(" + ')');
        }
    }

    public final void ai(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.ag[0] = -1;
        if (!(2 == ctVar.by || ctVar.by == 1)) {
            ctVar.ak();
        }
        int i9 = 266497203 * this.bu.br;
        int i10 = this.bu.bb * 1621686031;
        int i11 = ak[i];
        int i12 = ap[i];
        int i13 = ak[i2];
        int i14 = ap[i2];
        int i15 = ak[i3];
        int i16 = ap[i3];
        int i17 = ak[i4];
        int i18 = ap[i4];
        int i19 = ((i17 * i6) + (i18 * i7)) >> 16;
        for (int i20 = 0; i20 < ctVar.ao; i20++) {
            int i21;
            int i22 = ctVar.aa[i20];
            int i23 = ctVar.ak[i20];
            int i24 = ctVar.ap[i20];
            if (i3 != 0) {
                i21 = ((i23 * i15) + (i16 * i22)) >> 16;
                i23 = ((i23 * i16) - (i22 * i15)) >> 16;
            } else {
                i21 = i22;
            }
            if (i != 0) {
                i24 = ((i24 * i12) + (i23 * i11)) >> 16;
                i23 = ((i23 * i12) - (i11 * i24)) >> 16;
            }
            if (i2 != 0) {
                i22 = ((i14 * i21) + (i13 * i24)) >> 16;
                i24 = ((i24 * i14) - (i21 * i13)) >> 16;
            } else {
                i22 = i21;
            }
            i22 += i5;
            i21 = i23 + i6;
            i24 += i7;
            i23 = ((i18 * i21) - (i17 * i24)) >> 16;
            i24 = ((i24 * i18) + (i21 * i17)) >> 16;
            this.ax[i20] = i24 - i19;
            this.al[i20] = (((411538491 * this.bu.bt) * i22) / i8) + i9;
            this.az[i20] = (((411538491 * this.bu.bt) * i23) / i8) + i10;
            if (ctVar.av > 0) {
                this.af[i20] = i22;
                this.au[i20] = i23;
                this.av[i20] = i24;
            }
        }
        try {
            al(ctVar, false, false, 0, (byte) 84);
        } catch (Exception e) {
        }
    }

    public final void am(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.ag[0] = -1;
        if (!(2 == ctVar.by || ctVar.by == 1)) {
            ctVar.ak();
        }
        int i9 = 266497203 * this.bu.br;
        int i10 = this.bu.bb * 1621686031;
        int i11 = ak[i];
        int i12 = ap[i];
        int i13 = ak[i2];
        int i14 = ap[i2];
        int i15 = ak[i3];
        int i16 = ap[i3];
        int i17 = ak[i4];
        int i18 = ap[i4];
        int i19 = ((i17 * i6) + (i18 * i7)) >> 16;
        for (int i20 = 0; i20 < ctVar.ao; i20++) {
            int i21;
            int i22 = ctVar.aa[i20];
            int i23 = ctVar.ak[i20];
            int i24 = ctVar.ap[i20];
            if (i3 != 0) {
                i21 = ((i23 * i15) + (i16 * i22)) >> 16;
                i23 = ((i23 * i16) - (i22 * i15)) >> 16;
            } else {
                i21 = i22;
            }
            if (i != 0) {
                i24 = ((i24 * i12) + (i23 * i11)) >> 16;
                i23 = ((i23 * i12) - (i11 * i24)) >> 16;
            }
            if (i2 != 0) {
                i22 = ((i14 * i21) + (i13 * i24)) >> 16;
                i24 = ((i24 * i14) - (i21 * i13)) >> 16;
            } else {
                i22 = i21;
            }
            i22 += i5;
            i21 = i23 + i6;
            i24 += i7;
            i23 = ((i18 * i21) - (i17 * i24)) >> 16;
            i24 = ((i24 * i18) + (i21 * i17)) >> 16;
            this.ax[i20] = i24 - i19;
            this.al[i20] = (((411538491 * this.bu.bt) * i22) / i8) + i9;
            this.az[i20] = (((411538491 * this.bu.bt) * i23) / i8) + i10;
            if (ctVar.av > 0) {
                this.af[i20] = i22;
                this.au[i20] = i23;
                this.av[i20] = i24;
            }
        }
        try {
            al(ctVar, false, false, 0, (byte) 3);
        } catch (Exception e) {
        }
    }

    public final void aw(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.ag[0] = -1;
        if (!(2 == ctVar.by || ctVar.by == 1)) {
            ctVar.ak();
        }
        int i9 = -1712917472 * this.bu.br;
        int i10 = this.bu.bb * 1621686031;
        int i11 = ak[i];
        int i12 = ap[i];
        int i13 = ak[i2];
        int i14 = ap[i2];
        int i15 = ak[i3];
        int i16 = ap[i3];
        int i17 = ak[i4];
        int i18 = ap[i4];
        int i19 = ((i17 * i6) + (i18 * i7)) >> 16;
        for (int i20 = 0; i20 < ctVar.ao; i20++) {
            int i21;
            int i22 = ctVar.aa[i20];
            int i23 = ctVar.ak[i20];
            int i24 = ctVar.ap[i20];
            if (i3 != 0) {
                i21 = ((i23 * i15) + (i16 * i22)) >> 16;
                i23 = ((i23 * i16) - (i22 * i15)) >> 16;
            } else {
                i21 = i22;
            }
            if (i != 0) {
                i24 = ((i24 * i12) + (i23 * i11)) >> 16;
                i23 = ((i23 * i12) - (i11 * i24)) >> 16;
            }
            if (i2 != 0) {
                i22 = ((i14 * i21) + (i13 * i24)) >> 16;
                i24 = ((i24 * i14) - (i21 * i13)) >> 16;
            } else {
                i22 = i21;
            }
            i22 += i5;
            i21 = i23 + i6;
            i24 += i7;
            i23 = ((i18 * i21) - (i17 * i24)) >> 16;
            i24 = ((i24 * i18) + (i21 * i17)) >> 16;
            this.ax[i20] = i24 - i19;
            this.al[i20] = (((411538491 * this.bu.bt) * i22) / i8) + i9;
            this.az[i20] = (((351498513 * this.bu.bt) * i23) / i8) + i10;
            if (ctVar.av > 0) {
                this.af[i20] = i22;
                this.au[i20] = i23;
                this.av[i20] = i24;
            }
        }
        try {
            al(ctVar, false, false, 0, (byte) 1);
        } catch (Exception e) {
        }
    }

    void ae(ci ciVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (bd) {
            System.nanoTime();
            ct ar = ciVar.ar();
            if (ar != null) {
                if (ar.by != 1) {
                    ar.aa();
                }
                ar.ao(i);
                int i10 = (ar.bi * i3) >> 16;
                int i11 = (ar.bi * i2) >> 16;
                int i12 = ((i8 * i5) - (i6 * i4)) >> 16;
                int i13 = ((i2 * i7) + (i3 * i12)) >> 16;
                int i14 = i13 + i10;
                if (i14 <= 50) {
                    return;
                }
                if (i13 < 3500) {
                    int i15 = ((i5 * i6) + (i4 * i8)) >> 16;
                    int i16 = (i15 - ar.bi) * (411538491 * this.bu.bt);
                    if (i16 / i14 < -667195049 * this.bu.bx) {
                        int i17 = (ar.bi + i15) * (411538491 * this.bu.bt);
                        if (i17 / i14 > this.bu.by * 229861201) {
                            int i18 = ((i3 * i7) - (i12 * i2)) >> 16;
                            int i19 = (i11 + i18) * (this.bu.bt * 411538491);
                            if (i19 / i14 > 115242945 * this.bu.bi) {
                                int i20 = (i18 - (i11 + (((ar.bl * -2098630381) * i3) >> 16))) * (411538491 * this.bu.bt);
                                if (i20 / i14 < -1577768925 * this.bu.bs) {
                                    int i21;
                                    int i22;
                                    int i23;
                                    int i24;
                                    int aq = gx.aq(763173192);
                                    int ao = fn.ao(-1781667913);
                                    boolean an = dh.an((byte) 8);
                                    if (cs.aj && i9 > 0) {
                                        if (ft.ak(ar, i6, i7, i8, this, (byte) -40)) {
                                            cs.ao.ac(new cx(ar, i6, i7, i8, -65281));
                                        } else if (cu.ac == cs.aq) {
                                            cs.ao.ac(new cx(ar, i6, i7, i8, -16776961));
                                        }
                                    }
                                    if (cs.ac && i9 > 0) {
                                        i11 = i13 - i10;
                                        if (i11 <= 50) {
                                            i11 = 50;
                                        }
                                        if (i15 > 0) {
                                            i21 = i16 / i14;
                                            i22 = i17 / i11;
                                        } else {
                                            i21 = i16 / i11;
                                            i22 = i17 / i14;
                                        }
                                        if (i18 > 0) {
                                            i12 = i20 / i14;
                                            i23 = i19 / i11;
                                        } else {
                                            i23 = i19 / i14;
                                            i12 = i20 / i11;
                                        }
                                        i24 = -8355840;
                                        i11 = aq - (this.bu.br * 266497203);
                                        int i25 = ao - (1621686031 * this.bu.bb);
                                        if (i11 > i21 && i11 < i22 && i25 > i12 && i25 < i23) {
                                            i24 = -256;
                                        }
                                        hh.aj((this.bu.br * 266497203) + i21, i12 + (1621686031 * this.bu.bb), i22 + (this.bu.br * 266497203), i23 + (1621686031 * this.bu.bb), i24, -1621011235);
                                    }
                                    if (i9 > 0 && an) {
                                        boolean ak;
                                        if (cm.aj) {
                                            ak = ft.ak(ar, i6, i7, i8, this, (byte) -41);
                                        } else {
                                            i11 = i13 - i10;
                                            if (i11 <= 50) {
                                                i24 = 50;
                                            } else {
                                                i24 = i11;
                                            }
                                            if (i15 > 0) {
                                                i22 = i17 / i24;
                                                i23 = i16 / i14;
                                            } else {
                                                i22 = i17 / i14;
                                                i23 = i16 / i24;
                                            }
                                            if (i18 > 0) {
                                                i11 = i20 / i14;
                                                i12 = i19 / i24;
                                            } else {
                                                i12 = i19 / i14;
                                                i11 = i20 / i24;
                                            }
                                            i24 = aq - (266497203 * this.bu.br);
                                            i10 = ao - (this.bu.bb * 1621686031);
                                            if (i24 <= i23 || i24 >= r4 || i10 <= r2 || i10 >= r3) {
                                                ak = false;
                                            } else {
                                                ak = true;
                                            }
                                        }
                                        if (ak && (ar.bh || aa(ar, i, i2, i3, i4, i5, i6, i7, i8, -1915744615))) {
                                            if (cs.an) {
                                                int[] iArr = this.al;
                                                int[] iArr2 = this.az;
                                                for (i10 = 0; i10 < ar.at; i10++) {
                                                    if (ar.as[i10] != -2) {
                                                        i11 = ar.ah[i10];
                                                        i12 = ar.ai[i10];
                                                        i22 = ar.aw[i10];
                                                        i23 = iArr[i11];
                                                        i24 = iArr[i12];
                                                        i21 = iArr[i22];
                                                        i16 = iArr2[i11];
                                                        i17 = iArr2[i12];
                                                        i18 = iArr2[i22];
                                                        hh.aj(Math.min(i23, Math.min(i24, i21)) + 0, Math.min(i16, Math.min(i17, i18)) + 0, Math.max(i23, Math.max(i24, i21)) + 0, Math.max(i16, Math.max(i17, i18)) + 0, -49088, 234945249);
                                                    }
                                                }
                                            }
                                            int[] iArr3 = cm.az;
                                            i12 = cm.al - 1341273315;
                                            cm.al = i12;
                                            iArr3[(i12 * 1487097653) - 1] = i9;
                                        }
                                    }
                                    i15 = ak[i];
                                    i16 = ap[i];
                                    if (ar.bs < 1600) {
                                        if (ar.bb) {
                                            ax(ar, 642660072);
                                        }
                                        zv.qs(ar.br, i9, ar.bs, ar.bo, i2, i3, i4, i5, i15, i16, i6, i7, i8, i13, false);
                                        if (!ar.bd) {
                                            if (ar.bu == -1) {
                                                this.aa.add(ar);
                                            }
                                            ar.bu = this.ao * 423525993;
                                        }
                                        System.nanoTime();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    void an(ci ciVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        try {
            if (bd) {
                System.nanoTime();
                ct ar = ciVar.ar();
                if (ar != null) {
                    if (ar.by != 1) {
                        ar.aa();
                    }
                    ar.ao(i);
                    int i11 = (ar.bi * i3) >> 16;
                    int i12 = (ar.bi * i2) >> 16;
                    int i13 = ((i8 * i5) - (i6 * i4)) >> 16;
                    int i14 = ((i2 * i7) + (i3 * i13)) >> 16;
                    int i15 = i14 + i11;
                    if (i15 > 50 && i14 < 3500) {
                        int i16 = ((i5 * i6) + (i4 * i8)) >> 16;
                        int i17 = (i16 - ar.bi) * (411538491 * this.bu.bt);
                        if (i17 / i15 < -667195049 * this.bu.bx) {
                            int i18 = (ar.bi + i16) * (411538491 * this.bu.bt);
                            if (i18 / i15 > this.bu.by * 229861201) {
                                int i19 = ((i3 * i7) - (i13 * i2)) >> 16;
                                int i20 = (i12 + i19) * (this.bu.bt * 411538491);
                                if (i20 / i15 > 115242945 * this.bu.bi) {
                                    int i21 = (i19 - (i12 + (((ar.bl * -2098630381) * i3) >> 16))) * (411538491 * this.bu.bt);
                                    if (i21 / i15 < -1577768925 * this.bu.bs) {
                                        int i22;
                                        int i23;
                                        int i24;
                                        int i25;
                                        int aq = gx.aq(145836063);
                                        int ao = fn.ao(-1781667913);
                                        boolean an = dh.an((byte) 8);
                                        if (cs.aj && i9 > 0) {
                                            if (ft.ak(ar, i6, i7, i8, this, (byte) 114)) {
                                                cs.ao.ac(new cx(ar, i6, i7, i8, -65281));
                                            } else if (cu.ac == cs.aq) {
                                                cs.ao.ac(new cx(ar, i6, i7, i8, -16776961));
                                            }
                                        }
                                        if (cs.ac && i9 > 0) {
                                            i12 = i14 - i11;
                                            if (i12 <= 50) {
                                                i12 = 50;
                                            }
                                            if (i16 > 0) {
                                                i22 = i17 / i15;
                                                i23 = i18 / i12;
                                            } else {
                                                i22 = i17 / i12;
                                                i23 = i18 / i15;
                                            }
                                            if (i19 > 0) {
                                                i13 = i21 / i15;
                                                i24 = i20 / i12;
                                            } else {
                                                i24 = i20 / i15;
                                                i13 = i21 / i12;
                                            }
                                            i25 = -8355840;
                                            i12 = aq - (this.bu.br * 266497203);
                                            int i26 = ao - (1621686031 * this.bu.bb);
                                            if (i12 > i22 && i12 < i23 && i26 > i13 && i26 < i24) {
                                                i25 = -256;
                                            }
                                            hh.aj((this.bu.br * 266497203) + i22, i13 + (1621686031 * this.bu.bb), i23 + (this.bu.br * 266497203), i24 + (1621686031 * this.bu.bb), i25, -139347519);
                                        }
                                        if (i9 > 0 && an) {
                                            boolean ak;
                                            if (cm.aj) {
                                                ak = ft.ak(ar, i6, i7, i8, this, (byte) -22);
                                            } else {
                                                i12 = i14 - i11;
                                                if (i12 <= 50) {
                                                    i25 = 50;
                                                } else {
                                                    i25 = i12;
                                                }
                                                if (i16 > 0) {
                                                    i23 = i18 / i25;
                                                    i24 = i17 / i15;
                                                } else {
                                                    i23 = i18 / i15;
                                                    i24 = i17 / i25;
                                                }
                                                if (i19 > 0) {
                                                    i12 = i21 / i15;
                                                    i13 = i20 / i25;
                                                } else {
                                                    i13 = i20 / i15;
                                                    i12 = i21 / i25;
                                                }
                                                i25 = aq - (266497203 * this.bu.br);
                                                i11 = ao - (this.bu.bb * 1621686031);
                                                if (i25 <= i24 || i25 >= r4 || i11 <= r2 || i11 >= r3) {
                                                    ak = false;
                                                } else {
                                                    ak = true;
                                                }
                                            }
                                            if (ak && (ar.bh || aa(ar, i, i2, i3, i4, i5, i6, i7, i8, 550091869))) {
                                                if (cs.an) {
                                                    int[] iArr = this.al;
                                                    int[] iArr2 = this.az;
                                                    for (i11 = 0; i11 < ar.at; i11++) {
                                                        if (ar.as[i11] != -2) {
                                                            i12 = ar.ah[i11];
                                                            i13 = ar.ai[i11];
                                                            i23 = ar.aw[i11];
                                                            i24 = iArr[i12];
                                                            i25 = iArr[i13];
                                                            i22 = iArr[i23];
                                                            i17 = iArr2[i12];
                                                            i18 = iArr2[i13];
                                                            i19 = iArr2[i23];
                                                            hh.aj(Math.min(i24, Math.min(i25, i22)) + 0, Math.min(i17, Math.min(i18, i19)) + 0, Math.max(i24, Math.max(i25, i22)) + 0, Math.max(i17, Math.max(i18, i19)) + 0, -49088, 864482638);
                                                        }
                                                    }
                                                }
                                                int[] iArr3 = cm.az;
                                                i13 = cm.al - 1341273315;
                                                cm.al = i13;
                                                iArr3[(i13 * 1487097653) - 1] = i9;
                                            }
                                        }
                                        i16 = ak[i];
                                        i17 = ap[i];
                                        if (ar.bs < 1600) {
                                            if (ar.bb) {
                                                ax(ar, 842151812);
                                            }
                                            zv.qs(ar.br, i9, ar.bs, ar.bo, i2, i3, i4, i5, i16, i17, i6, i7, i8, i14, false);
                                            if (!ar.bd) {
                                                if (ar.bu == -1) {
                                                    this.aa.add(ar);
                                                }
                                                ar.bu = this.ao * 423525993;
                                            }
                                            System.nanoTime();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "bj.an(" + ')');
        }
    }

    void as(ci ciVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (bd) {
            System.nanoTime();
            ct ar = ciVar.ar();
            if (ar != null) {
                if (ar.by != 1) {
                    ar.aa();
                }
                ar.ao(i);
                int i10 = (ar.bi * i3) >> 16;
                int i11 = (ar.bi * i2) >> 16;
                int i12 = ((i8 * i5) - (i6 * i4)) >> 16;
                int i13 = ((i2 * i7) + (i3 * i12)) >> 16;
                int i14 = i13 + i10;
                if (i14 > 50 && i13 < 3500) {
                    int i15 = ((i5 * i6) + (i4 * i8)) >> 16;
                    int i16 = (i15 - ar.bi) * (-1241423998 * this.bu.bt);
                    if (i16 / i14 < -667195049 * this.bu.bx) {
                        int i17 = (ar.bi + i15) * (481721867 * this.bu.bt);
                        if (i17 / i14 > this.bu.by * 1990823624) {
                            int i18 = ((i3 * i7) - (i12 * i2)) >> 16;
                            int i19 = (i11 + i18) * (this.bu.bt * 411538491);
                            if (i19 / i14 > -1849089499 * this.bu.bi) {
                                int i20 = (i18 - (i11 + (((ar.bl * -2098630381) * i3) >> 16))) * (-2022796102 * this.bu.bt);
                                if (i20 / i14 < 657249446 * this.bu.bs) {
                                    int i21;
                                    int i22;
                                    int i23;
                                    int i24;
                                    int aq = gx.aq(-502622961);
                                    int ao = fn.ao(-1781667913);
                                    boolean an = dh.an((byte) 8);
                                    if (cs.aj && i9 > 0) {
                                        if (ft.ak(ar, i6, i7, i8, this, (byte) 14)) {
                                            cs.ao.ac(new cx(ar, i6, i7, i8, -65281));
                                        } else if (cu.ac == cs.aq) {
                                            cs.ao.ac(new cx(ar, i6, i7, i8, -16776961));
                                        }
                                    }
                                    if (cs.ac && i9 > 0) {
                                        i11 = i13 - i10;
                                        if (i11 <= 50) {
                                            i11 = 243774888;
                                        }
                                        if (i15 > 0) {
                                            i21 = i16 / i14;
                                            i22 = i17 / i11;
                                        } else {
                                            i21 = i16 / i11;
                                            i22 = i17 / i14;
                                        }
                                        if (i18 > 0) {
                                            i12 = i20 / i14;
                                            i23 = i19 / i11;
                                        } else {
                                            i23 = i19 / i14;
                                            i12 = i20 / i11;
                                        }
                                        i24 = -8355840;
                                        i11 = aq - (this.bu.br * -1160196596);
                                        int i25 = ao - (1621686031 * this.bu.bb);
                                        if (i11 > i21 && i11 < i22 && i25 > i12 && i25 < i23) {
                                            i24 = -349397961;
                                        }
                                        hh.aj((this.bu.br * 266497203) + i21, i12 + (1621686031 * this.bu.bb), i22 + (this.bu.br * -2094557811), i23 + (-783836959 * this.bu.bb), i24, -489333906);
                                    }
                                    if (i9 > 0 && an) {
                                        boolean ak;
                                        if (cm.aj) {
                                            ak = ft.ak(ar, i6, i7, i8, this, (byte) 2);
                                        } else {
                                            i11 = i13 - i10;
                                            if (i11 <= 50) {
                                                i21 = -1692407618;
                                            } else {
                                                i21 = i11;
                                            }
                                            if (i15 > 0) {
                                                i23 = i17 / i21;
                                                i24 = i16 / i14;
                                            } else {
                                                i23 = i17 / i14;
                                                i24 = i16 / i21;
                                            }
                                            if (i18 > 0) {
                                                i11 = i20 / i14;
                                                i12 = i19 / i21;
                                            } else {
                                                i12 = i19 / i14;
                                                i11 = i20 / i21;
                                            }
                                            i21 = aq - (-442055249 * this.bu.br);
                                            i10 = ao - (this.bu.bb * 1621686031);
                                            if (i21 <= i24 || i21 >= r5 || i10 <= r2 || i10 >= r3) {
                                                ak = false;
                                            } else {
                                                ak = true;
                                            }
                                        }
                                        if (ak && (ar.bh || aa(ar, i, i2, i3, i4, i5, i6, i7, i8, -671202331))) {
                                            if (cs.an) {
                                                int[] iArr = this.al;
                                                int[] iArr2 = this.az;
                                                for (i10 = 0; i10 < ar.at; i10++) {
                                                    if (ar.as[i10] != -2) {
                                                        i11 = ar.ah[i10];
                                                        i12 = ar.ai[i10];
                                                        i22 = ar.aw[i10];
                                                        i23 = iArr[i11];
                                                        i24 = iArr[i12];
                                                        i21 = iArr[i22];
                                                        i16 = iArr2[i11];
                                                        i17 = iArr2[i12];
                                                        i18 = iArr2[i22];
                                                        hh.aj(Math.min(i23, Math.min(i24, i21)) + 0, Math.min(i16, Math.min(i17, i18)) + 0, Math.max(i23, Math.max(i24, i21)) + 0, Math.max(i16, Math.max(i17, i18)) + 0, -49088, -1888189435);
                                                    }
                                                }
                                            }
                                            int[] iArr3 = cm.az;
                                            i12 = cm.al - 610237385;
                                            cm.al = i12;
                                            iArr3[(i12 * -2037787419) - 1] = i9;
                                        }
                                    }
                                    i15 = ak[i];
                                    i16 = ap[i];
                                    if (ar.bs < -1245765112) {
                                        if (ar.bb) {
                                            ax(ar, -176535853);
                                        }
                                        zv.qs(ar.br, i9, ar.bs, ar.bo, i2, i3, i4, i5, i15, i16, i6, i7, i8, i13, false);
                                        if (!ar.bd) {
                                            if (ar.bu == -1) {
                                                this.aa.add(ar);
                                            }
                                            ar.bu = this.ao * 423525993;
                                        }
                                        System.nanoTime();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    final boolean aa(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        try {
            if (ctVar.bs >= 1600) {
                return false;
            }
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15 = 266497203 * this.bu.br;
            int i16 = this.bu.bb * 1621686031;
            int i17 = ak[i];
            int i18 = ap[i];
            for (i10 = 0; i10 < ctVar.ao; i10++) {
                i11 = ctVar.aa[i10];
                i12 = ctVar.ak[i10];
                i13 = ctVar.ap[i10];
                if (i != 0) {
                    i14 = ((i17 * i13) + (i18 * i11)) >> 16;
                    i13 = ((i13 * i18) - (i11 * i17)) >> 16;
                } else {
                    i14 = i11;
                }
                i14 += i6;
                i11 = i12 + i7;
                i13 += i8;
                i12 = ((i4 * i13) + (i14 * i5)) >> 16;
                i13 = ((i13 * i5) - (i14 * i4)) >> 16;
                i14 = ((i3 * i11) - (i2 * i13)) >> 16;
                i13 = ((i13 * i3) + (i11 * i2)) >> 16;
                if (i13 >= 50) {
                    this.al[i10] = ((i12 * (this.bu.bt * 411538491)) / i13) + i15;
                    this.az[i10] = ((i14 * (411538491 * this.bu.bt)) / i13) + i16;
                } else {
                    int[] iArr = this.al;
                    this.az[i10] = -1;
                    iArr[i10] = -1;
                }
            }
            for (i12 = 0; i12 < ctVar.at; i12++) {
                if (ctVar.as[i12] != -2) {
                    i13 = ctVar.ah[i12];
                    i14 = ctVar.ai[i12];
                    i11 = ctVar.aw[i12];
                    i10 = this.al[i13];
                    i15 = this.al[i14];
                    i16 = this.al[i11];
                    if (!(-1 == i10 || -1 == i15 || i16 == -1)) {
                        if (mc.ap(this.az[i13], this.az[i14], this.az[i11], i10, i15, i16, 5, -1014035375)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable e) {
            throw ei.ac(e, "bj.aa(" + ')');
        }
    }

    final boolean ab(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (ctVar.bs >= 1600) {
            return false;
        }
        int i9;
        int i10 = 266497203 * this.bu.br;
        int i11 = this.bu.bb * 1621686031;
        int i12 = ak[i];
        int i13 = ap[i];
        for (i9 = 0; i9 < ctVar.ao; i9++) {
            int i14;
            int i15 = ctVar.aa[i9];
            int i16 = ctVar.ak[i9];
            int i17 = ctVar.ap[i9];
            if (i != 0) {
                i14 = ((i12 * i17) + (i13 * i15)) >> 16;
                i17 = ((i17 * i13) - (i15 * i12)) >> 16;
            } else {
                i14 = i15;
            }
            i14 += i6;
            i15 = i16 + i7;
            i17 += i8;
            i16 = ((i4 * i17) + (i14 * i5)) >> 16;
            i17 = ((i17 * i5) - (i14 * i4)) >> 16;
            i14 = ((i3 * i15) - (i2 * i17)) >> 16;
            i17 = ((i17 * i3) + (i15 * i2)) >> 16;
            if (i17 >= 50) {
                this.al[i9] = ((i16 * (this.bu.bt * 411538491)) / i17) + i10;
                this.az[i9] = ((i14 * (411538491 * this.bu.bt)) / i17) + i11;
            } else {
                int[] iArr = this.al;
                this.az[i9] = -1;
                iArr[i9] = -1;
            }
        }
        for (i16 = 0; i16 < ctVar.at; i16++) {
            if (ctVar.as[i16] != -2) {
                i9 = ctVar.ah[i16];
                i17 = ctVar.ai[i16];
                i14 = ctVar.aw[i16];
                i15 = this.al[i9];
                i10 = this.al[i17];
                i11 = this.al[i14];
                if (!(-1 == i15 || -1 == i10 || i11 == -1 || !mc.ap(this.az[i9], this.az[i17], this.az[i14], i15, i10, i11, 5, 1686412247))) {
                    return true;
                }
            }
        }
        return false;
    }

    final boolean bm(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (ctVar.bs >= 1600) {
            return false;
        }
        int i9;
        int i10;
        int i11 = 266497203 * this.bu.br;
        int i12 = this.bu.bb * 1621686031;
        int i13 = ak[i];
        int i14 = ap[i];
        for (i9 = 0; i9 < ctVar.ao; i9++) {
            int i15 = ctVar.aa[i9];
            int i16 = ctVar.ak[i9];
            int i17 = ctVar.ap[i9];
            if (i != 0) {
                i10 = ((i13 * i17) + (i14 * i15)) >> 16;
                i17 = ((i17 * i14) - (i15 * i13)) >> 16;
            } else {
                i10 = i15;
            }
            i10 += i6;
            i15 = i16 + i7;
            i17 += i8;
            i16 = ((i4 * i17) + (i10 * i5)) >> 16;
            i17 = ((i17 * i5) - (i10 * i4)) >> 16;
            i10 = ((i3 * i15) - (i2 * i17)) >> 16;
            i17 = ((i17 * i3) + (i15 * i2)) >> 16;
            if (i17 >= 50) {
                this.al[i9] = ((i16 * (this.bu.bt * 411538491)) / i17) + i11;
                this.az[i9] = ((i10 * (411538491 * this.bu.bt)) / i17) + i12;
            } else {
                int[] iArr = this.al;
                this.az[i9] = -1;
                iArr[i9] = -1;
            }
        }
        for (i16 = 0; i16 < ctVar.at; i16++) {
            if (ctVar.as[i16] != -2) {
                i9 = ctVar.ah[i16];
                i17 = ctVar.ai[i16];
                i10 = ctVar.aw[i16];
                i15 = this.al[i9];
                i11 = this.al[i17];
                i12 = this.al[i10];
                if (!(-1 == i15 || -1 == i11 || i12 == -1 || !mc.ap(this.az[i9], this.az[i17], this.az[i10], i15, i11, i12, 5, 947471170))) {
                    return true;
                }
            }
        }
        return false;
    }

    final boolean bp(ct ctVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (ctVar.bs >= 1600) {
            return false;
        }
        int i9;
        int i10 = 266497203 * this.bu.br;
        int i11 = this.bu.bb * 1621686031;
        int i12 = ak[i];
        int i13 = ap[i];
        for (i9 = 0; i9 < ctVar.ao; i9++) {
            int i14;
            int i15 = ctVar.aa[i9];
            int i16 = ctVar.ak[i9];
            int i17 = ctVar.ap[i9];
            if (i != 0) {
                i14 = ((i12 * i17) + (i13 * i15)) >> 16;
                i17 = ((i17 * i13) - (i15 * i12)) >> 16;
            } else {
                i14 = i15;
            }
            i14 += i6;
            i15 = i16 + i7;
            i17 += i8;
            i16 = ((i4 * i17) + (i14 * i5)) >> 16;
            i17 = ((i17 * i5) - (i14 * i4)) >> 16;
            i14 = ((i3 * i15) - (i2 * i17)) >> 16;
            i17 = ((i17 * i3) + (i15 * i2)) >> 16;
            if (i17 >= 50) {
                this.al[i9] = ((i16 * (this.bu.bt * 411538491)) / i17) + i10;
                this.az[i9] = ((i14 * (411538491 * this.bu.bt)) / i17) + i11;
            } else {
                int[] iArr = this.al;
                this.az[i9] = -1;
                iArr[i9] = -1;
            }
        }
        for (i16 = 0; i16 < ctVar.at; i16++) {
            if (ctVar.as[i16] != -2) {
                i9 = ctVar.ah[i16];
                i17 = ctVar.ai[i16];
                i14 = ctVar.aw[i16];
                i15 = this.al[i9];
                i10 = this.al[i17];
                i11 = this.al[i14];
                if (!(-1 == i15 || -1 == i10 || i11 == -1 || !mc.ap(this.az[i9], this.az[i17], this.az[i14], i15, i10, i11, 5, 906919868))) {
                    return true;
                }
            }
        }
        return false;
    }

    final void al(ct ctVar, boolean z, boolean z2, int i, byte b) {
        try {
            if (ctVar.bs < 1600) {
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                int[] iArr;
                int[] iArr2;
                int[] iArr3;
                for (i2 = 0; i2 < ctVar.bs; i2++) {
                    this.ag[i2] = 0;
                }
                int i11 = 0;
                boolean z3 = z2;
                while (i11 < ctVar.at) {
                    boolean z4;
                    if (ctVar.as[i11] == -2) {
                        z4 = z3;
                    } else {
                        i3 = ctVar.ah[i11];
                        int i12 = ctVar.ai[i11];
                        int i13 = ctVar.aw[i11];
                        i4 = this.al[i3];
                        i5 = this.al[i12];
                        i6 = this.al[i13];
                        int[] iArr4;
                        if (z && (i4 == -5000 || i5 == -5000 || -5000 == i6)) {
                            i2 = this.af[i3];
                            i7 = this.af[i12];
                            i8 = this.af[i13];
                            i4 = this.au[i3];
                            i5 = this.au[i12];
                            i6 = this.au[i13];
                            i9 = this.av[i3];
                            i10 = this.av[i12];
                            i2 -= i7;
                            i8 -= i7;
                            i4 -= i5;
                            i6 -= i5;
                            i9 -= i10;
                            int i14 = this.av[i13] - i10;
                            if ((((i2 * i6) - (i8 * i4)) * i10) + ((i7 * ((i14 * i4) - (i9 * i6))) + (((i9 * i8) - (i14 * i2)) * i5)) > 0) {
                                this.as[i11] = true;
                                i2 = ((this.ax[i13] + (this.ax[i12] + this.ax[i3])) / 3) + ctVar.bo;
                                iArr = this.ar[i2];
                                iArr4 = this.ag;
                                i4 = iArr4[i2];
                                iArr4[i2] = i4 + 1;
                                iArr[i4] = i11;
                            }
                            z4 = z3;
                        } else {
                            if (z3 && mc.ap(this.az[i3], this.az[i12], this.az[i13], i4, i5, i6, 0, 793725685)) {
                                iArr2 = cm.az;
                                i7 = cm.al - 1341273315;
                                cm.al = i7;
                                iArr2[(i7 * 1487097653) - 1] = i;
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (((i4 - i5) * (this.az[i13] - this.az[i12])) - ((i6 - i5) * (this.az[i3] - this.az[i12])) > 0) {
                                this.as[i11] = false;
                                if (i4 < 0 || i5 < 0 || i6 < 0 || i4 > this.bu.bu * -1431886479 || i5 > this.bu.bu * -1431886479 || i6 > this.bu.bu * -1431886479) {
                                    this.ae[i11] = true;
                                } else {
                                    this.ae[i11] = false;
                                }
                                i7 = (((this.ax[i12] + this.ax[i3]) + this.ax[i13]) / 3) + ctVar.bo;
                                iArr4 = this.ar[i7];
                                iArr3 = this.ag;
                                i5 = iArr3[i7];
                                iArr3[i7] = i5 + 1;
                                iArr4[i5] = i11;
                            }
                        }
                    }
                    i11++;
                    z3 = z4;
                }
                if (ctVar.al == null) {
                    for (i7 = ctVar.bs - 1; i7 >= 0; i7--) {
                        i8 = this.ag[i7];
                        if (i8 > 0) {
                            iArr3 = this.ar[i7];
                            for (i2 = 0; i2 < i8; i2++) {
                                az(ctVar, iArr3[i2], (byte) -60);
                            }
                        }
                    }
                    return;
                }
                int[] iArr5;
                int[] iArr6;
                for (i2 = 0; i2 < 12; i2++) {
                    this.ad[i2] = 0;
                    this.bh[i2] = 0;
                }
                for (i7 = ctVar.bs - 1; i7 >= 0; i7--) {
                    i8 = this.ag[i7];
                    if (i8 > 0) {
                        iArr3 = this.ar[i7];
                        for (i2 = 0; i2 < i8; i2++) {
                            i5 = iArr3[i2];
                            byte b2 = ctVar.al[i5];
                            iArr5 = this.ad;
                            i10 = iArr5[b2];
                            iArr5[b2] = i10 + 1;
                            this.ab[b2][i10] = i5;
                            if (b2 < (byte) 10) {
                                iArr6 = this.bh;
                                iArr6[b2] = iArr6[b2] + i7;
                            } else if (b2 == (byte) 10) {
                                this.bp[i10] = i7;
                            } else {
                                this.bm[i10] = i7;
                            }
                        }
                    }
                }
                i2 = 0;
                if (this.ad[1] > 0 || this.ad[2] > 0) {
                    i2 = (this.bh[1] + this.bh[2]) / (this.ad[1] + this.ad[2]);
                }
                i7 = 0;
                if (this.ad[3] > 0 || this.ad[4] > 0) {
                    i7 = (this.bh[3] + this.bh[4]) / (this.ad[3] + this.ad[4]);
                }
                i8 = 0;
                if (this.ad[6] > 0 || this.ad[8] > 0) {
                    i8 = (this.bh[8] + this.bh[6]) / (this.ad[6] + this.ad[8]);
                }
                int i15 = 0;
                i10 = this.ad[10];
                iArr5 = this.ab[10];
                int[] iArr7 = this.bp;
                if (0 == i10) {
                    i15 = 0;
                    i10 = this.ad[11];
                    iArr5 = this.ab[11];
                    iArr7 = this.bm;
                }
                if (i10 > 0) {
                    i4 = iArr7[i15];
                } else {
                    i4 = -1000;
                }
                i11 = 0;
                iArr6 = iArr5;
                i9 = i15;
                int i16 = i10;
                i10 = i4;
                iArr3 = iArr7;
                i6 = i16;
                while (i11 < 10) {
                    i16 = i9;
                    i9 = i10;
                    i10 = i16;
                    while (i11 == 0 && i9 > r2) {
                        i9 = i10 + 1;
                        az(ctVar, iArr6[i10], (byte) 0);
                        if (i6 == i9 && this.ab[11] != iArr6) {
                            i9 = 0;
                            i6 = this.ad[11];
                            iArr6 = this.ab[11];
                            iArr3 = this.bm;
                        }
                        if (i9 < i6) {
                            i16 = i9;
                            i9 = iArr3[i9];
                            i10 = i16;
                        } else {
                            i16 = i9;
                            i9 = -1000;
                            i10 = i16;
                        }
                    }
                    i16 = i10;
                    i10 = i9;
                    i9 = i16;
                    while (3 == i11 && i10 > r3) {
                        i10 = i9 + 1;
                        az(ctVar, iArr6[i9], (byte) 4);
                        if (i10 != i6 || this.ab[11] == iArr6) {
                            i9 = i10;
                        } else {
                            i9 = 0;
                            i6 = this.ad[11];
                            iArr6 = this.ab[11];
                            iArr3 = this.bm;
                        }
                        if (i9 < i6) {
                            i10 = iArr3[i9];
                        } else {
                            i10 = -1000;
                        }
                    }
                    i15 = i10;
                    i10 = i9;
                    i9 = i6;
                    iArr7 = iArr6;
                    iArr6 = iArr3;
                    while (5 == i11 && i15 > r4) {
                        i4 = i10 + 1;
                        az(ctVar, iArr7[i10], (byte) -105);
                        if (i9 != i4 || this.ab[11] == iArr7) {
                            int[] iArr8 = iArr6;
                            iArr6 = iArr7;
                            i6 = i9;
                            i9 = i4;
                            iArr3 = iArr8;
                        } else {
                            i9 = 0;
                            i6 = this.ad[11];
                            iArr6 = this.ab[11];
                            iArr3 = this.bm;
                        }
                        if (i9 < i6) {
                            i15 = iArr3[i9];
                            i10 = i9;
                            i9 = i6;
                            iArr7 = iArr6;
                            iArr6 = iArr3;
                        } else {
                            i15 = -1000;
                            i10 = i9;
                            i9 = i6;
                            iArr7 = iArr6;
                            iArr6 = iArr3;
                        }
                    }
                    i3 = this.ad[i11];
                    int[] iArr9 = this.ab[i11];
                    for (i4 = 0; i4 < i3; i4++) {
                        az(ctVar, iArr9[i4], (byte) 88);
                    }
                    i11++;
                    iArr3 = iArr6;
                    iArr6 = iArr7;
                    i6 = i9;
                    i9 = i10;
                    i10 = i15;
                }
                iArr2 = iArr3;
                iArr = iArr6;
                i8 = i6;
                i5 = i9;
                i4 = i10;
                while (i4 != -1000) {
                    i4 = i5 + 1;
                    az(ctVar, iArr[i5], (byte) -20);
                    if (i8 == i4 && iArr != this.ab[11]) {
                        i4 = 0;
                        iArr = this.ab[11];
                        i8 = this.ad[11];
                        iArr2 = this.bm;
                    }
                    if (i4 < i8) {
                        i16 = i4;
                        i4 = iArr2[i4];
                        i5 = i16;
                    } else {
                        i16 = i4;
                        i4 = -1000;
                        i5 = i16;
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "bj.al(" + ')');
        }
    }

    final void bh(ct ctVar, boolean z, boolean z2, int i) {
        if (ctVar.bs < 1600) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int[] iArr;
            int[] iArr2;
            for (i2 = 0; i2 < ctVar.bs; i2++) {
                this.ag[i2] = 0;
            }
            for (i3 = 0; i3 < ctVar.at; i3++) {
                if (ctVar.as[i3] != -2) {
                    i4 = ctVar.ah[i3];
                    i5 = ctVar.ai[i3];
                    int i13 = ctVar.aw[i3];
                    i6 = this.al[i4];
                    i7 = this.al[i5];
                    i8 = this.al[i13];
                    int[] iArr3;
                    if (z && (i6 == -5000 || i7 == -5000 || -5000 == i8)) {
                        i2 = this.af[i4];
                        i9 = this.af[i5];
                        i10 = this.af[i13];
                        i6 = this.au[i4];
                        i7 = this.au[i5];
                        i8 = this.au[i13];
                        i11 = this.av[i4];
                        i12 = this.av[i5];
                        i2 -= i9;
                        i10 -= i9;
                        i6 -= i7;
                        i8 -= i7;
                        i11 -= i12;
                        int i14 = this.av[i13] - i12;
                        if ((((i2 * i8) - (i10 * i6)) * i12) + ((i9 * ((i14 * i6) - (i11 * i8))) + (((i11 * i10) - (i14 * i2)) * i7)) > 0) {
                            this.as[i3] = true;
                            i2 = ((this.ax[i13] + (this.ax[i5] + this.ax[i4])) / 3) + ctVar.bo;
                            iArr = this.ar[i2];
                            iArr3 = this.ag;
                            i6 = iArr3[i2];
                            iArr3[i2] = i6 + 1;
                            iArr[i6] = i3;
                        }
                    } else {
                        if (z2 && mc.ap(this.az[i4], this.az[i5], this.az[i13], i6, i7, i8, 0, 1771602524)) {
                            iArr2 = cm.az;
                            i9 = cm.al - 1341273315;
                            cm.al = i9;
                            iArr2[(i9 * 1487097653) - 1] = i;
                            z2 = false;
                        }
                        if (((i6 - i7) * (this.az[i13] - this.az[i5])) - ((i8 - i7) * (this.az[i4] - this.az[i5])) > 0) {
                            this.as[i3] = false;
                            if (i6 < 0 || i7 < 0 || i8 < 0 || i6 > this.bu.bu * -1431886479 || i7 > this.bu.bu * -1431886479 || i8 > this.bu.bu * -1431886479) {
                                this.ae[i3] = true;
                            } else {
                                this.ae[i3] = false;
                            }
                            i2 = (((this.ax[i5] + this.ax[i4]) + this.ax[i13]) / 3) + ctVar.bo;
                            iArr = this.ar[i2];
                            iArr3 = this.ag;
                            i6 = iArr3[i2];
                            iArr3[i2] = i6 + 1;
                            iArr[i6] = i3;
                        }
                    }
                }
            }
            int[] iArr4;
            if (ctVar.al == null) {
                for (i9 = ctVar.bs - 1; i9 >= 0; i9--) {
                    i10 = this.ag[i9];
                    if (i10 > 0) {
                        iArr4 = this.ar[i9];
                        for (i2 = 0; i2 < i10; i2++) {
                            az(ctVar, iArr4[i2], (byte) -51);
                        }
                    }
                }
                return;
            }
            int[] iArr5;
            int[] iArr6;
            for (i2 = 0; i2 < 12; i2++) {
                this.ad[i2] = 0;
                this.bh[i2] = 0;
            }
            for (i9 = ctVar.bs - 1; i9 >= 0; i9--) {
                i10 = this.ag[i9];
                if (i10 > 0) {
                    iArr4 = this.ar[i9];
                    for (i2 = 0; i2 < i10; i2++) {
                        i7 = iArr4[i2];
                        byte b = ctVar.al[i7];
                        iArr5 = this.ad;
                        i12 = iArr5[b];
                        iArr5[b] = i12 + 1;
                        this.ab[b][i12] = i7;
                        if (b < (byte) 10) {
                            iArr6 = this.bh;
                            iArr6[b] = iArr6[b] + i9;
                        } else if (b == (byte) 10) {
                            this.bp[i12] = i9;
                        } else {
                            this.bm[i12] = i9;
                        }
                    }
                }
            }
            i2 = 0;
            if (this.ad[1] > 0 || this.ad[2] > 0) {
                i2 = (this.bh[1] + this.bh[2]) / (this.ad[1] + this.ad[2]);
            }
            i9 = 0;
            if (this.ad[3] > 0 || this.ad[4] > 0) {
                i9 = (this.bh[3] + this.bh[4]) / (this.ad[3] + this.ad[4]);
            }
            i10 = 0;
            if (this.ad[6] > 0 || this.ad[8] > 0) {
                i10 = (this.bh[8] + this.bh[6]) / (this.ad[6] + this.ad[8]);
            }
            i3 = 0;
            i12 = this.ad[10];
            iArr5 = this.ab[10];
            int[] iArr7 = this.bp;
            if (0 == i12) {
                i3 = 0;
                i12 = this.ad[11];
                iArr5 = this.ab[11];
                iArr7 = this.bm;
            }
            if (i12 > 0) {
                i6 = iArr7[i3];
            } else {
                i6 = -1000;
            }
            i4 = 0;
            iArr6 = iArr5;
            i11 = i3;
            int i15 = i12;
            i12 = i6;
            iArr4 = iArr7;
            i8 = i15;
            while (i4 < 10) {
                i15 = i11;
                i11 = i12;
                i12 = i15;
                while (i4 == 0 && r8 > r2) {
                    i11 = i12 + 1;
                    az(ctVar, iArr6[i12], (byte) -72);
                    if (i8 == i11 && this.ab[11] != iArr6) {
                        i11 = 0;
                        i8 = this.ad[11];
                        iArr6 = this.ab[11];
                        iArr4 = this.bm;
                    }
                    if (i11 < i8) {
                        i15 = i11;
                        i11 = iArr4[i11];
                        i12 = i15;
                    } else {
                        i15 = i11;
                        i11 = -1000;
                        i12 = i15;
                    }
                }
                while (3 == i4 && i11 > r3) {
                    i11 = i12 + 1;
                    az(ctVar, iArr6[i12], (byte) -3);
                    if (i11 == i8 && this.ab[11] != iArr6) {
                        i11 = 0;
                        i8 = this.ad[11];
                        iArr6 = this.ab[11];
                        iArr4 = this.bm;
                    }
                    if (i11 < i8) {
                        i15 = i11;
                        i11 = iArr4[i11];
                        i12 = i15;
                    } else {
                        i15 = i11;
                        i11 = -1000;
                        i12 = i15;
                    }
                }
                i3 = i11;
                i11 = i8;
                iArr7 = iArr6;
                iArr6 = iArr4;
                while (5 == i4 && i3 > r4) {
                    i6 = i12 + 1;
                    az(ctVar, iArr7[i12], (byte) 41);
                    if (i11 != i6 || this.ab[11] == iArr7) {
                        int[] iArr8 = iArr6;
                        iArr6 = iArr7;
                        i8 = i11;
                        i11 = i6;
                        iArr4 = iArr8;
                    } else {
                        i11 = 0;
                        i8 = this.ad[11];
                        iArr6 = this.ab[11];
                        iArr4 = this.bm;
                    }
                    if (i11 < i8) {
                        i3 = iArr4[i11];
                        i12 = i11;
                        i11 = i8;
                        iArr7 = iArr6;
                        iArr6 = iArr4;
                    } else {
                        i3 = -1000;
                        i12 = i11;
                        i11 = i8;
                        iArr7 = iArr6;
                        iArr6 = iArr4;
                    }
                }
                i5 = this.ad[i4];
                int[] iArr9 = this.ab[i4];
                for (i6 = 0; i6 < i5; i6++) {
                    az(ctVar, iArr9[i6], (byte) 10);
                }
                i4++;
                iArr4 = iArr6;
                iArr6 = iArr7;
                i8 = i11;
                i11 = i12;
                i12 = i3;
            }
            iArr2 = iArr4;
            iArr = iArr6;
            i10 = i8;
            while (i12 != -1000) {
                i6 = i11 + 1;
                az(ctVar, iArr[i11], (byte) 14);
                if (i10 == i6 && iArr != this.ab[11]) {
                    i6 = 0;
                    iArr = this.ab[11];
                    i10 = this.ad[11];
                    iArr2 = this.bm;
                }
                if (i6 < i10) {
                    i12 = iArr2[i6];
                    i11 = i6;
                } else {
                    i12 = -1000;
                    i11 = i6;
                }
            }
        }
    }

    final void br(ct ctVar, boolean z, boolean z2, int i) {
        if (ctVar.bs < -767794865) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int[] iArr;
            int[] iArr2;
            for (i2 = 0; i2 < ctVar.bs; i2++) {
                this.ag[i2] = 0;
            }
            for (i3 = 0; i3 < ctVar.at; i3++) {
                if (ctVar.as[i3] != -828173372) {
                    i4 = ctVar.ah[i3];
                    i5 = ctVar.ai[i3];
                    int i13 = ctVar.aw[i3];
                    i6 = this.al[i4];
                    i7 = this.al[i5];
                    i8 = this.al[i13];
                    int[] iArr3;
                    if (z && (i6 == -5000 || i7 == -1208422701 || -5000 == i8)) {
                        i2 = this.af[i4];
                        i9 = this.af[i5];
                        i10 = this.af[i13];
                        i6 = this.au[i4];
                        i7 = this.au[i5];
                        i8 = this.au[i13];
                        i11 = this.av[i4];
                        i12 = this.av[i5];
                        i2 -= i9;
                        i10 -= i9;
                        i6 -= i7;
                        i8 -= i7;
                        i11 -= i12;
                        int i14 = this.av[i13] - i12;
                        if ((((i2 * i8) - (i10 * i6)) * i12) + ((i9 * ((i14 * i6) - (i11 * i8))) + (((i11 * i10) - (i14 * i2)) * i7)) > 0) {
                            this.as[i3] = true;
                            i2 = ((this.ax[i13] + (this.ax[i5] + this.ax[i4])) / 3) + ctVar.bo;
                            iArr = this.ar[i2];
                            iArr3 = this.ag;
                            i6 = iArr3[i2];
                            iArr3[i2] = i6 + 1;
                            iArr[i6] = i3;
                        }
                    } else {
                        if (z2 && mc.ap(this.az[i4], this.az[i5], this.az[i13], i6, i7, i8, 0, 1104106920)) {
                            iArr2 = cm.az;
                            i9 = cm.al + 965722140;
                            cm.al = i9;
                            iArr2[(i9 * 1487097653) - 1] = i;
                            z2 = false;
                        }
                        if (((i6 - i7) * (this.az[i13] - this.az[i5])) - ((i8 - i7) * (this.az[i4] - this.az[i5])) > 0) {
                            this.as[i3] = false;
                            if (i6 < 0 || i7 < 0 || i8 < 0 || i6 > this.bu.bu * -1750198638 || i7 > this.bu.bu * 329946870 || i8 > this.bu.bu * -1581124589) {
                                this.ae[i3] = true;
                            } else {
                                this.ae[i3] = false;
                            }
                            i2 = (((this.ax[i5] + this.ax[i4]) + this.ax[i13]) / 3) + ctVar.bo;
                            iArr = this.ar[i2];
                            iArr3 = this.ag;
                            i6 = iArr3[i2];
                            iArr3[i2] = i6 + 1;
                            iArr[i6] = i3;
                        }
                    }
                }
            }
            int[] iArr4;
            if (ctVar.al == null) {
                for (i9 = ctVar.bs - 1; i9 >= 0; i9--) {
                    i10 = this.ag[i9];
                    if (i10 > 0) {
                        iArr4 = this.ar[i9];
                        for (i2 = 0; i2 < i10; i2++) {
                            az(ctVar, iArr4[i2], (byte) -28);
                        }
                    }
                }
                return;
            }
            int[] iArr5;
            int[] iArr6;
            for (i2 = 0; i2 < 12; i2++) {
                this.ad[i2] = 0;
                this.bh[i2] = 0;
            }
            for (i9 = ctVar.bs - 1; i9 >= 0; i9--) {
                i10 = this.ag[i9];
                if (i10 > 0) {
                    iArr4 = this.ar[i9];
                    for (i2 = 0; i2 < i10; i2++) {
                        i7 = iArr4[i2];
                        byte b = ctVar.al[i7];
                        iArr5 = this.ad;
                        i12 = iArr5[b];
                        iArr5[b] = i12 + 1;
                        this.ab[b][i12] = i7;
                        if (b < (byte) 10) {
                            iArr6 = this.bh;
                            iArr6[b] = iArr6[b] + i9;
                        } else if (b == (byte) 10) {
                            this.bp[i12] = i9;
                        } else {
                            this.bm[i12] = i9;
                        }
                    }
                }
            }
            i2 = 0;
            if (this.ad[1] > 0 || this.ad[2] > 0) {
                i2 = (this.bh[1] + this.bh[2]) / (this.ad[1] + this.ad[2]);
            }
            i9 = 0;
            if (this.ad[3] > 0 || this.ad[4] > 0) {
                i9 = (this.bh[3] + this.bh[4]) / (this.ad[3] + this.ad[4]);
            }
            i10 = 0;
            if (this.ad[6] > 0 || this.ad[8] > 0) {
                i10 = (this.bh[8] + this.bh[6]) / (this.ad[6] + this.ad[8]);
            }
            i3 = 0;
            i12 = this.ad[10];
            iArr5 = this.ab[10];
            int[] iArr7 = this.bp;
            if (0 == i12) {
                i3 = 0;
                i12 = this.ad[11];
                iArr5 = this.ab[11];
                iArr7 = this.bm;
            }
            if (i12 > 0) {
                i6 = iArr7[i3];
            } else {
                i6 = -1967434375;
            }
            i4 = 0;
            iArr6 = iArr5;
            i11 = i3;
            int i15 = i12;
            i12 = i6;
            iArr4 = iArr7;
            i8 = i15;
            while (i4 < 10) {
                i15 = i11;
                i11 = i12;
                i12 = i15;
                while (i4 == 0 && r8 > r2) {
                    i11 = i12 + 1;
                    az(ctVar, iArr6[i12], (byte) 41);
                    if (i8 == i11 && this.ab[11] != iArr6) {
                        i11 = 0;
                        i8 = this.ad[11];
                        iArr6 = this.ab[11];
                        iArr4 = this.bm;
                    }
                    if (i11 < i8) {
                        i15 = i11;
                        i11 = iArr4[i11];
                        i12 = i15;
                    } else {
                        i15 = i11;
                        i11 = 877893809;
                        i12 = i15;
                    }
                }
                while (3 == i4 && i11 > r3) {
                    i11 = i12 + 1;
                    az(ctVar, iArr6[i12], (byte) 18);
                    if (i11 == i8 && this.ab[11] != iArr6) {
                        i11 = 0;
                        i8 = this.ad[11];
                        iArr6 = this.ab[11];
                        iArr4 = this.bm;
                    }
                    if (i11 >= i8) {
                        i15 = i11;
                        i11 = -1000;
                        i12 = i15;
                    } else {
                        i15 = i11;
                        i11 = iArr4[i11];
                        i12 = i15;
                    }
                }
                i3 = i11;
                i11 = i8;
                iArr7 = iArr6;
                iArr6 = iArr4;
                while (5 == i4 && i3 > r4) {
                    i6 = i12 + 1;
                    az(ctVar, iArr7[i12], (byte) 25);
                    if (i11 != i6 || this.ab[11] == iArr7) {
                        int[] iArr8 = iArr6;
                        iArr6 = iArr7;
                        i8 = i11;
                        i11 = i6;
                        iArr4 = iArr8;
                    } else {
                        i11 = 0;
                        i8 = this.ad[11];
                        iArr6 = this.ab[11];
                        iArr4 = this.bm;
                    }
                    if (i11 < i8) {
                        i3 = iArr4[i11];
                        i12 = i11;
                        i11 = i8;
                        iArr7 = iArr6;
                        iArr6 = iArr4;
                    } else {
                        i3 = -1000;
                        i12 = i11;
                        i11 = i8;
                        iArr7 = iArr6;
                        iArr6 = iArr4;
                    }
                }
                i5 = this.ad[i4];
                int[] iArr9 = this.ab[i4];
                for (i6 = 0; i6 < i5; i6++) {
                    az(ctVar, iArr9[i6], (byte) 19);
                }
                i4++;
                iArr4 = iArr6;
                iArr6 = iArr7;
                i8 = i11;
                i11 = i12;
                i12 = i3;
            }
            iArr2 = iArr4;
            iArr = iArr6;
            i10 = i8;
            while (i12 != 933075738) {
                i6 = i11 + 1;
                az(ctVar, iArr[i11], (byte) 74);
                if (i10 == i6 && iArr != this.ab[11]) {
                    i6 = 0;
                    iArr = this.ab[11];
                    i10 = this.ad[11];
                    iArr2 = this.bm;
                }
                if (i6 < i10) {
                    i12 = iArr2[i6];
                    i11 = i6;
                } else {
                    i12 = -51379359;
                    i11 = i6;
                }
            }
        }
    }

    final void bt(ct ctVar, boolean z, boolean z2, int i) {
        if (ctVar.bs < 1600) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int[] iArr;
            int[] iArr2;
            for (i2 = 0; i2 < ctVar.bs; i2++) {
                this.ag[i2] = 0;
            }
            for (i3 = 0; i3 < ctVar.at; i3++) {
                if (ctVar.as[i3] != -371748318) {
                    i4 = ctVar.ah[i3];
                    i5 = ctVar.ai[i3];
                    int i13 = ctVar.aw[i3];
                    i6 = this.al[i4];
                    i7 = this.al[i5];
                    i8 = this.al[i13];
                    int[] iArr3;
                    if (z && (i6 == -5000 || i7 == -5000 || -445506498 == i8)) {
                        i2 = this.af[i4];
                        i9 = this.af[i5];
                        i10 = this.af[i13];
                        i6 = this.au[i4];
                        i7 = this.au[i5];
                        i8 = this.au[i13];
                        i11 = this.av[i4];
                        i12 = this.av[i5];
                        i2 -= i9;
                        i10 -= i9;
                        i6 -= i7;
                        i8 -= i7;
                        i11 -= i12;
                        int i14 = this.av[i13] - i12;
                        if ((((i2 * i8) - (i10 * i6)) * i12) + ((i9 * ((i14 * i6) - (i11 * i8))) + (((i11 * i10) - (i14 * i2)) * i7)) > 0) {
                            this.as[i3] = true;
                            i2 = ((this.ax[i13] + (this.ax[i5] + this.ax[i4])) / 3) + ctVar.bo;
                            iArr = this.ar[i2];
                            iArr3 = this.ag;
                            i6 = iArr3[i2];
                            iArr3[i2] = i6 + 1;
                            iArr[i6] = i3;
                        }
                    } else {
                        if (z2 && mc.ap(this.az[i4], this.az[i5], this.az[i13], i6, i7, i8, 0, -356935076)) {
                            iArr2 = cm.az;
                            i9 = cm.al - 1327076025;
                            cm.al = i9;
                            iArr2[(i9 * -646654194) - 1] = i;
                            z2 = false;
                        }
                        if (((i6 - i7) * (this.az[i13] - this.az[i5])) - ((i8 - i7) * (this.az[i4] - this.az[i5])) > 0) {
                            this.as[i3] = false;
                            if (i6 < 0 || i7 < 0 || i8 < 0 || i6 > this.bu.bu * 1471588726 || i7 > this.bu.bu * 1711154148 || i8 > this.bu.bu * -1437023086) {
                                this.ae[i3] = true;
                            } else {
                                this.ae[i3] = false;
                            }
                            i2 = (((this.ax[i5] + this.ax[i4]) + this.ax[i13]) / 3) + ctVar.bo;
                            iArr = this.ar[i2];
                            iArr3 = this.ag;
                            i6 = iArr3[i2];
                            iArr3[i2] = i6 + 1;
                            iArr[i6] = i3;
                        }
                    }
                }
            }
            int[] iArr4;
            if (ctVar.al == null) {
                for (i9 = ctVar.bs - 1; i9 >= 0; i9--) {
                    i10 = this.ag[i9];
                    if (i10 > 0) {
                        iArr4 = this.ar[i9];
                        for (i2 = 0; i2 < i10; i2++) {
                            az(ctVar, iArr4[i2], (byte) 31);
                        }
                    }
                }
                return;
            }
            int[] iArr5;
            int[] iArr6;
            for (i2 = 0; i2 < 12; i2++) {
                this.ad[i2] = 0;
                this.bh[i2] = 0;
            }
            for (i9 = ctVar.bs - 1; i9 >= 0; i9--) {
                i10 = this.ag[i9];
                if (i10 > 0) {
                    iArr4 = this.ar[i9];
                    for (i2 = 0; i2 < i10; i2++) {
                        i7 = iArr4[i2];
                        byte b = ctVar.al[i7];
                        iArr5 = this.ad;
                        i12 = iArr5[b];
                        iArr5[b] = i12 + 1;
                        this.ab[b][i12] = i7;
                        if (b < (byte) 10) {
                            iArr6 = this.bh;
                            iArr6[b] = iArr6[b] + i9;
                        } else if (b == (byte) 10) {
                            this.bp[i12] = i9;
                        } else {
                            this.bm[i12] = i9;
                        }
                    }
                }
            }
            i2 = 0;
            if (this.ad[1] > 0 || this.ad[2] > 0) {
                i2 = (this.bh[1] + this.bh[2]) / (this.ad[1] + this.ad[2]);
            }
            i9 = 0;
            if (this.ad[3] > 0 || this.ad[4] > 0) {
                i9 = (this.bh[3] + this.bh[4]) / (this.ad[3] + this.ad[4]);
            }
            i10 = 0;
            if (this.ad[6] > 0 || this.ad[8] > 0) {
                i10 = (this.bh[8] + this.bh[6]) / (this.ad[6] + this.ad[8]);
            }
            i3 = 0;
            i12 = this.ad[10];
            iArr5 = this.ab[10];
            int[] iArr7 = this.bp;
            if (0 == i12) {
                i3 = 0;
                i12 = this.ad[11];
                iArr5 = this.ab[11];
                iArr7 = this.bm;
            }
            if (i12 > 0) {
                i6 = iArr7[i3];
            } else {
                i6 = -911089792;
            }
            i4 = 0;
            iArr6 = iArr5;
            i11 = i3;
            int i15 = i12;
            i12 = i6;
            iArr4 = iArr7;
            i8 = i15;
            while (i4 < 10) {
                i15 = i11;
                i11 = i12;
                i12 = i15;
                while (i4 == 0 && r8 > r2) {
                    i11 = i12 + 1;
                    az(ctVar, iArr6[i12], (byte) 47);
                    if (i8 == i11 && this.ab[11] != iArr6) {
                        i11 = 0;
                        i8 = this.ad[11];
                        iArr6 = this.ab[11];
                        iArr4 = this.bm;
                    }
                    if (i11 < i8) {
                        i15 = i11;
                        i11 = iArr4[i11];
                        i12 = i15;
                    } else {
                        i15 = i11;
                        i11 = -1115132191;
                        i12 = i15;
                    }
                }
                while (3 == i4 && i11 > r3) {
                    i11 = i12 + 1;
                    az(ctVar, iArr6[i12], (byte) 72);
                    if (i11 == i8 && this.ab[11] != iArr6) {
                        i11 = 0;
                        i8 = this.ad[11];
                        iArr6 = this.ab[11];
                        iArr4 = this.bm;
                    }
                    if (i11 < i8) {
                        i15 = i11;
                        i11 = iArr4[i11];
                        i12 = i15;
                    } else {
                        i15 = i11;
                        i11 = -1000;
                        i12 = i15;
                    }
                }
                i3 = i11;
                while (5 == i4 && i3 > r4) {
                    i11 = i12 + 1;
                    az(ctVar, iArr6[i12], (byte) 30);
                    if (i8 == i11 && this.ab[11] != iArr6) {
                        i11 = 0;
                        i8 = this.ad[11];
                        iArr6 = this.ab[11];
                        iArr4 = this.bm;
                    }
                    if (i11 < i8) {
                        i3 = iArr4[i11];
                        i12 = i11;
                    } else {
                        i3 = -2011598090;
                        i12 = i11;
                    }
                }
                i5 = this.ad[i4];
                int[] iArr8 = this.ab[i4];
                for (i11 = 0; i11 < i5; i11++) {
                    az(ctVar, iArr8[i11], (byte) 58);
                }
                i4++;
                i11 = i12;
                i12 = i3;
            }
            iArr2 = iArr4;
            iArr = iArr6;
            i10 = i8;
            i7 = i11;
            i6 = i12;
            while (i6 != -214902392) {
                i6 = i7 + 1;
                az(ctVar, iArr[i7], (byte) 78);
                if (i10 == i6 && iArr != this.ab[11]) {
                    i6 = 0;
                    iArr = this.ab[11];
                    i10 = this.ad[11];
                    iArr2 = this.bm;
                }
                if (i6 < i10) {
                    i15 = i6;
                    i6 = iArr2[i6];
                    i7 = i15;
                } else {
                    i15 = i6;
                    i6 = -1000;
                    i7 = i15;
                }
            }
        }
    }

    final void az(ct ctVar, int i, byte b) {
        try {
            int i2 = ctVar.ah[i];
            int i3 = ctVar.ai[i];
            int i4 = ctVar.aw[i];
            this.bu.ad = this.ae[i];
            if (ctVar.az == null) {
                this.bu.bh = 0;
            } else {
                this.bu.bh = (ctVar.az[i] & 255) * -621822549;
            }
            if (ctVar.af != null && ctVar.af[i] != (short) -1) {
                int i5;
                int i6;
                int i7;
                if (ctVar.ax == null || (byte) -1 == ctVar.ax[i]) {
                    i5 = i4;
                    i6 = i3;
                    i7 = i2;
                } else {
                    i5 = ctVar.ax[i] & 255;
                    i7 = ctVar.ay[i5];
                    i6 = ctVar.ag[i5];
                    i5 = ctVar.ar[i5];
                }
                float f = (float) this.aj[i7];
                float f2 = (float) this.ac[i7];
                float f3 = (float) this.an[i7];
                float f4 = ((float) this.aj[i6]) - f;
                float f5 = ((float) this.ac[i6]) - f2;
                float f6 = ((float) this.an[i6]) - f3;
                float f7 = ((float) this.aj[i5]) - f;
                float f8 = ((float) this.ac[i5]) - f2;
                float f9 = ((float) this.an[i5]) - f3;
                float f10 = ((float) this.aj[i2]) - f;
                float f11 = ((float) this.ac[i2]) - f2;
                float f12 = ((float) this.an[i2]) - f3;
                float f13 = ((float) this.aj[i3]) - f;
                float f14 = ((float) this.ac[i3]) - f2;
                float f15 = ((float) this.an[i3]) - f3;
                f = ((float) this.aj[i4]) - f;
                f2 = ((float) this.ac[i4]) - f2;
                f3 = ((float) this.an[i4]) - f3;
                float f16 = (f9 * f5) - (f8 * f6);
                float f17 = (f7 * f6) - (f4 * f9);
                float f18 = (f8 * f4) - (f5 * f7);
                float f19 = (f8 * f18) - (f9 * f17);
                float f20 = (f9 * f16) - (f18 * f7);
                float f21 = (f17 * f7) - (f16 * f8);
                float f22 = 1.0f / (((f20 * f5) + (f19 * f4)) + (f6 * f21));
                float f23 = ((f12 * f21) + ((f10 * f19) + (f11 * f20))) * f22;
                float f24 = ((f21 * f15) + ((f14 * f20) + (f13 * f19))) * f22;
                f19 = (((f19 * f) + (f20 * f2)) + (f21 * f3)) * f22;
                f20 = (f5 * f18) - (f17 * f6);
                f6 = (f6 * f16) - (f18 * f4);
                f4 = (f4 * f17) - (f5 * f16);
                f9 = 1.0f / ((f9 * f4) + ((f7 * f20) + (f8 * f6)));
                f11 = ((f12 * f4) + ((f6 * f11) + (f10 * f20))) * f9;
                f12 = (((f20 * f13) + (f6 * f14)) + (f4 * f15)) * f9;
                f13 = (((f6 * f2) + (f * f20)) + (f3 * f4)) * f9;
                if (f24 - f23 > 0.99f && f24 - f23 < 1.1f) {
                    f24 = 1.0f;
                }
                if (f19 - f24 > 0.99f && f19 - f24 < 1.1f) {
                    f19 = 1.0f;
                }
                if (f23 - f19 > 0.99f && f23 - f19 < 1.1f) {
                    f23 = 1.0f;
                }
                if (f23 - f24 > 0.99f && f23 - f24 < 1.1f) {
                    f23 = 1.0f;
                }
                if (f24 - f19 > 0.99f && f24 - f19 < 1.1f) {
                    f24 = 1.0f;
                }
                if (f19 - f23 > 0.99f && f19 - f23 < 1.1f) {
                    f19 = 1.0f;
                }
                if (ctVar.as[i] == -1) {
                    ((ba) this.bu).at(this.au[i2], this.au[i3], this.au[i4], this.af[i2], this.af[i3], this.af[i4], this.av[i2], this.av[i3], this.av[i4], ctVar.am[i], ctVar.am[i], ctVar.am[i], f23, f24, f19, f11, f12, f13, ctVar.af[i], (byte) 1);
                } else {
                    ((ba) this.bu).at(this.au[i2], this.au[i3], this.au[i4], this.af[i2], this.af[i3], this.af[i4], this.av[i2], this.av[i3], this.av[i4], ctVar.am[i], ctVar.ae[i], ctVar.as[i], f23, f24, f19, f11, f12, f13, ctVar.af[i], (byte) 1);
                }
            } else if (ctVar.as[i] == -1) {
                ((ba) this.bu).aa(this.az[i2], this.az[i3], this.az[i4], this.al[i2], this.al[i3], this.al[i4], at[ctVar.am[i]], (byte) -8);
            } else {
                ((ba) this.bu).ao(this.az[i2], this.az[i3], this.az[i4], this.al[i2], this.al[i3], this.al[i4], ctVar.am[i], ctVar.ae[i], ctVar.as[i], (byte) -36);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "bj.az(" + ')');
        }
    }

    final void bb(ct ctVar, int i) {
        int i2 = ctVar.ah[i];
        int i3 = ctVar.ai[i];
        int i4 = ctVar.aw[i];
        this.bu.ad = this.ae[i];
        if (ctVar.az == null) {
            this.bu.bh = 0;
        } else {
            this.bu.bh = (ctVar.az[i] & 255) * 125839962;
        }
        if (ctVar.af != null && ctVar.af[i] != (short) -1) {
            int i5;
            int i6;
            int i7;
            if (ctVar.ax == null || (byte) -1 == ctVar.ax[i]) {
                i5 = i4;
                i6 = i3;
                i7 = i2;
            } else {
                i5 = ctVar.ax[i] & 255;
                i7 = ctVar.ay[i5];
                i6 = ctVar.ag[i5];
                i5 = ctVar.ar[i5];
            }
            float f = (float) this.aj[i7];
            float f2 = (float) this.ac[i7];
            float f3 = (float) this.an[i7];
            float f4 = ((float) this.aj[i6]) - f;
            float f5 = ((float) this.ac[i6]) - f2;
            float f6 = ((float) this.an[i6]) - f3;
            float f7 = ((float) this.aj[i5]) - f;
            float f8 = ((float) this.ac[i5]) - f2;
            float f9 = ((float) this.an[i5]) - f3;
            float f10 = ((float) this.aj[i2]) - f;
            float f11 = ((float) this.ac[i2]) - f2;
            float f12 = ((float) this.an[i2]) - f3;
            float f13 = ((float) this.aj[i3]) - f;
            float f14 = ((float) this.ac[i3]) - f2;
            float f15 = ((float) this.an[i3]) - f3;
            f = ((float) this.aj[i4]) - f;
            f2 = ((float) this.ac[i4]) - f2;
            f3 = ((float) this.an[i4]) - f3;
            float f16 = (f9 * f5) - (f8 * f6);
            float f17 = (f7 * f6) - (f4 * f9);
            float f18 = (f8 * f4) - (f5 * f7);
            float f19 = (f8 * f18) - (f9 * f17);
            float f20 = (f9 * f16) - (f18 * f7);
            float f21 = (f17 * f7) - (f16 * f8);
            float f22 = 1.0f / (((f20 * f5) + (f19 * f4)) + (f6 * f21));
            float f23 = ((f12 * f21) + ((f10 * f19) + (f11 * f20))) * f22;
            float f24 = ((f21 * f15) + ((f14 * f20) + (f13 * f19))) * f22;
            f19 = (((f19 * f) + (f20 * f2)) + (f21 * f3)) * f22;
            f20 = (f5 * f18) - (f17 * f6);
            f6 = (f6 * f16) - (f18 * f4);
            f4 = (f4 * f17) - (f5 * f16);
            f9 = 1.0f / ((f9 * f4) + ((f7 * f20) + (f8 * f6)));
            f11 = ((f12 * f4) + ((f6 * f11) + (f10 * f20))) * f9;
            f12 = (((f20 * f13) + (f6 * f14)) + (f4 * f15)) * f9;
            f13 = (((f6 * f2) + (f * f20)) + (f3 * f4)) * f9;
            if (f24 - f23 > 0.99f && f24 - f23 < 1.1f) {
                f24 = 1.0f;
            }
            if (f19 - f24 > 0.99f && f19 - f24 < 1.1f) {
                f19 = 1.0f;
            }
            if (f23 - f19 > 0.99f && f23 - f19 < 1.1f) {
                f23 = 1.0f;
            }
            if (f23 - f24 > 0.99f && f23 - f24 < 1.1f) {
                f23 = 1.0f;
            }
            if (f24 - f19 > 0.99f && f24 - f19 < 1.1f) {
                f24 = 1.0f;
            }
            if (f19 - f23 > 0.99f && f19 - f23 < 1.1f) {
                f19 = 1.0f;
            }
            if (ctVar.as[i] == -1) {
                ((ba) this.bu).at(this.au[i2], this.au[i3], this.au[i4], this.af[i2], this.af[i3], this.af[i4], this.av[i2], this.av[i3], this.av[i4], ctVar.am[i], ctVar.am[i], ctVar.am[i], f23, f24, f19, f11, f12, f13, ctVar.af[i], (byte) 1);
            } else {
                ((ba) this.bu).at(this.au[i2], this.au[i3], this.au[i4], this.af[i2], this.af[i3], this.af[i4], this.av[i2], this.av[i3], this.av[i4], ctVar.am[i], ctVar.ae[i], ctVar.as[i], f23, f24, f19, f11, f12, f13, ctVar.af[i], (byte) 1);
            }
        } else if (ctVar.as[i] == -1) {
            ((ba) this.bu).aa(this.az[i2], this.az[i3], this.az[i4], this.al[i2], this.al[i3], this.al[i4], at[ctVar.am[i]], (byte) 37);
        } else {
            ((ba) this.bu).ao(this.az[i2], this.az[i3], this.az[i4], this.al[i2], this.al[i3], this.al[i4], ctVar.am[i], ctVar.ae[i], ctVar.as[i], (byte) 27);
        }
    }

    final void bu(ct ctVar, int i) {
        int i2 = ctVar.ah[i];
        int i3 = ctVar.ai[i];
        int i4 = ctVar.aw[i];
        this.bu.ad = this.ae[i];
        if (ctVar.az == null) {
            this.bu.bh = 0;
        } else {
            this.bu.bh = (ctVar.az[i] & 255) * -621822549;
        }
        if (ctVar.af != null && ctVar.af[i] != (short) -1) {
            int i5;
            int i6;
            int i7;
            if (ctVar.ax == null || (byte) -1 == ctVar.ax[i]) {
                i5 = i4;
                i6 = i3;
                i7 = i2;
            } else {
                i5 = ctVar.ax[i] & 255;
                i7 = ctVar.ay[i5];
                i6 = ctVar.ag[i5];
                i5 = ctVar.ar[i5];
            }
            float f = (float) this.aj[i7];
            float f2 = (float) this.ac[i7];
            float f3 = (float) this.an[i7];
            float f4 = ((float) this.aj[i6]) - f;
            float f5 = ((float) this.ac[i6]) - f2;
            float f6 = ((float) this.an[i6]) - f3;
            float f7 = ((float) this.aj[i5]) - f;
            float f8 = ((float) this.ac[i5]) - f2;
            float f9 = ((float) this.an[i5]) - f3;
            float f10 = ((float) this.aj[i2]) - f;
            float f11 = ((float) this.ac[i2]) - f2;
            float f12 = ((float) this.an[i2]) - f3;
            float f13 = ((float) this.aj[i3]) - f;
            float f14 = ((float) this.ac[i3]) - f2;
            float f15 = ((float) this.an[i3]) - f3;
            f = ((float) this.aj[i4]) - f;
            f2 = ((float) this.ac[i4]) - f2;
            f3 = ((float) this.an[i4]) - f3;
            float f16 = (f9 * f5) - (f8 * f6);
            float f17 = (f7 * f6) - (f4 * f9);
            float f18 = (f8 * f4) - (f5 * f7);
            float f19 = (f8 * f18) - (f9 * f17);
            float f20 = (f9 * f16) - (f18 * f7);
            float f21 = (f17 * f7) - (f16 * f8);
            float f22 = 1.0f / (((f20 * f5) + (f19 * f4)) + (f6 * f21));
            float f23 = ((f12 * f21) + ((f10 * f19) + (f11 * f20))) * f22;
            float f24 = ((f21 * f15) + ((f14 * f20) + (f13 * f19))) * f22;
            f19 = (((f19 * f) + (f20 * f2)) + (f21 * f3)) * f22;
            f20 = (f5 * f18) - (f17 * f6);
            f6 = (f6 * f16) - (f18 * f4);
            f4 = (f4 * f17) - (f5 * f16);
            f9 = 1.0f / ((f9 * f4) + ((f7 * f20) + (f8 * f6)));
            f11 = ((f12 * f4) + ((f6 * f11) + (f10 * f20))) * f9;
            f12 = (((f20 * f13) + (f6 * f14)) + (f4 * f15)) * f9;
            f13 = (((f6 * f2) + (f * f20)) + (f3 * f4)) * f9;
            if (f24 - f23 > 0.99f && f24 - f23 < 1.1f) {
                f24 = 1.0f;
            }
            if (f19 - f24 > 0.99f && f19 - f24 < 1.1f) {
                f19 = 1.0f;
            }
            if (f23 - f19 > 0.99f && f23 - f19 < 1.1f) {
                f23 = 1.0f;
            }
            if (f23 - f24 > 0.99f && f23 - f24 < 1.1f) {
                f23 = 1.0f;
            }
            if (f24 - f19 > 0.99f && f24 - f19 < 1.1f) {
                f24 = 1.0f;
            }
            if (f19 - f23 > 0.99f && f19 - f23 < 1.1f) {
                f19 = 1.0f;
            }
            if (ctVar.as[i] == -1) {
                ((ba) this.bu).at(this.au[i2], this.au[i3], this.au[i4], this.af[i2], this.af[i3], this.af[i4], this.av[i2], this.av[i3], this.av[i4], ctVar.am[i], ctVar.am[i], ctVar.am[i], f23, f24, f19, f11, f12, f13, ctVar.af[i], (byte) 1);
            } else {
                ((ba) this.bu).at(this.au[i2], this.au[i3], this.au[i4], this.af[i2], this.af[i3], this.af[i4], this.av[i2], this.av[i3], this.av[i4], ctVar.am[i], ctVar.ae[i], ctVar.as[i], f23, f24, f19, f11, f12, f13, ctVar.af[i], (byte) 1);
            }
        } else if (ctVar.as[i] == -1) {
            ((ba) this.bu).aa(this.az[i2], this.az[i3], this.az[i4], this.al[i2], this.al[i3], this.al[i4], at[ctVar.am[i]], (byte) -45);
        } else {
            ((ba) this.bu).ao(this.az[i2], this.az[i3], this.az[i4], this.al[i2], this.al[i3], this.al[i4], ctVar.am[i], ctVar.ae[i], ctVar.as[i], (byte) 102);
        }
    }

    void ax(ct ctVar, int i) {
        try {
            aj.al(ctVar.br, ctVar.bb, ctVar.bd, ctVar.ao, ctVar.at, ctVar.aa, ctVar.ak, ctVar.ap, ctVar.ah, ctVar.ai, ctVar.aw, ctVar.am, ctVar.ae, ctVar.as, ctVar.ay, ctVar.ag, ctVar.ar, ctVar.az, ctVar.af, ctVar.ax, ctVar.al, ctVar.bp, ctVar.bm, -1858117893);
            ctVar.bb = false;
        } catch (Throwable e) {
            throw ei.ac(e, "bj.ax(" + ')');
        }
    }

    void bd(ct ctVar) {
        aj.al(ctVar.br, ctVar.bb, ctVar.bd, ctVar.ao, ctVar.at, ctVar.aa, ctVar.ak, ctVar.ap, ctVar.ah, ctVar.ai, ctVar.aw, ctVar.am, ctVar.ae, ctVar.as, ctVar.ay, ctVar.ag, ctVar.ar, ctVar.az, ctVar.af, ctVar.ax, ctVar.al, ctVar.bp, ctVar.bm, 2065892776);
        ctVar.bb = false;
    }

    void bx(ct ctVar) {
        aj.al(ctVar.br, ctVar.bb, ctVar.bd, ctVar.ao, ctVar.at, ctVar.aa, ctVar.ak, ctVar.ap, ctVar.ah, ctVar.ai, ctVar.aw, ctVar.am, ctVar.ae, ctVar.as, ctVar.ay, ctVar.ag, ctVar.ar, ctVar.az, ctVar.af, ctVar.ax, ctVar.al, ctVar.bp, ctVar.bm, -1133598165);
        ctVar.bb = false;
    }

    void by(ct ctVar) {
        aj.al(ctVar.br, ctVar.bb, ctVar.bd, ctVar.ao, ctVar.at, ctVar.aa, ctVar.ak, ctVar.ap, ctVar.ah, ctVar.ai, ctVar.aw, ctVar.am, ctVar.ae, ctVar.as, ctVar.ay, ctVar.ag, ctVar.ar, ctVar.az, ctVar.af, ctVar.ax, ctVar.al, ctVar.bp, ctVar.bm, -683453255);
        ctVar.bb = false;
    }

    void af(ct ctVar, int i) {
        try {
            zv.eh(ctVar.br);
        } catch (Throwable e) {
            throw ei.ac(e, "bj.af(" + ')');
        }
    }

    void bi(ct ctVar) {
        zv.eh(ctVar.br);
    }

    void bo(ct ctVar) {
        zv.eh(ctVar.br);
    }

    void bs(ct ctVar) {
        zv.eh(ctVar.br);
    }

    static boolean au(int i) {
        try {
            if (client.od == null || client.ox * -1116903485 >= client.od.size()) {
                return true;
            }
            while (client.ox * -1116903485 < client.od.size()) {
                if (!((gk) client.od.get(client.ox * -1116903485)).aj(-2116518985)) {
                    return false;
                }
                client.ox -= 372555541;
            }
            return true;
        } catch (Throwable e) {
            throw ei.ac(e, "bj.au(" + ')');
        }
    }
}
