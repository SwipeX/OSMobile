package defpackage;

import com.jagex.oldscape.osrenderer.aj;
import com.jagex.oldscape.osrenderer.zv;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

public abstract class ks implements Runnable {
    static ks oh = null;
    static boolean ok = false;
    static long ot = 0;
    static lg ou = null;
    static long[] pk = new long[32];
    protected static int pl = 0;
    static final long pp = (TimeUnit.MILLISECONDS.toNanos(20) * -1730444984817358197L);
    static long[] pt = new long[32];
    static volatile boolean qk = true;
    static kr qo = new kr();
    static int qy = -919229044;
    protected int pb;
    protected float pc;
    int pd;
    int pg;
    int ph;
    int pj;
    protected int pn;
    int pr;
    int pu;
    int pv;
    int py;
    protected ew qc;
    protected fd qg;
    HashMap qj;
    boolean ql;
    URL qq;
    la qr;
    bn qs;
    kc qt;
    volatile boolean qw;

    protected abstract void ae(int i);

    protected abstract void ai(int i);

    protected abstract void am(boolean z, float f, byte b);

    protected abstract void ao(int i);

    protected abstract void ap(int i);

    protected abstract void aw(int i);

    protected abstract void bl(int i, int i2);

    protected abstract void cb(byte b);

    protected abstract void gc();

    protected abstract void gd();

    protected abstract void ge();

    protected abstract void gf();

    protected abstract void gg();

    protected abstract void gj();

    protected abstract void gl();

    protected abstract void gm();

    protected abstract void gn(boolean z, float f);

    protected abstract void gp();

    protected abstract void gq(boolean z, float f);

    protected abstract void gs();

    protected abstract void gt();

    protected abstract void gv();

    protected abstract void gy();

    protected abstract void gz();

    protected abstract void ka();

    protected abstract void kd();

    protected abstract void kt();

    protected abstract void kv(int i);

    protected abstract void tb();

    protected abstract void tv();

    protected abstract void ty();

    static np[] aj(int i) {
        try {
            return new np[]{np.aj, np.ac, np.an};
        } catch (Throwable e) {
            throw ei.ac(e, "ks.aj(" + ')');
        }
    }

    protected ks() {
        try {
            this.pv = 0;
            this.ph = 0;
            this.qw = true;
            this.ql = false;
            this.qg = new fd();
            this.qj = new HashMap();
            kp kpVar = new kp(250);
            dm.aj(new kn(), -2008024004);
        } catch (Throwable e) {
            throw ei.ac(e, "ks.<init>(" + ')');
        }
    }

    public final void tg(lr lrVar, int i) {
        try {
            ao.qh = lrVar;
        } catch (Throwable e) {
            throw ei.ac(e, "ks.tg(" + ')');
        }
    }

    public final void vc(lr lrVar) {
        ao.qh = lrVar;
    }

    public final int to(int i) {
        try {
            float an = ao.qh.an(2146635636);
            if (an < 0.0f) {
                return -1;
            }
            return (int) (an * ((float) (-1479513603 * hu.pe)));
        } catch (Throwable e) {
            throw ei.ac(e, "ks.to(" + ')');
        }
    }

    public final int vd() {
        float an = ao.qh.an(2059035747);
        if (an < 0.0f) {
            return -1;
        }
        return (int) (an * ((float) (-1479513603 * hu.pe)));
    }

    public final int vp() {
        float an = ao.qh.an(2097460748);
        return an < 0.0f ? -1 : (int) (an * ((float) (-1479513603 * hu.pe)));
    }

    public final void tt(int i) {
        try {
            ao.qh.aq(-616767331);
        } catch (Throwable e) {
            throw ei.ac(e, "ks.tt(" + ')');
        }
    }

    public final void vk() {
        ao.qh.aq(582596186);
    }

    public final void vs() {
        ao.qh.aq(-977293955);
    }

    public final void vy() {
        ao.qh.aq(-2066472885);
    }

    public final void th(int i) {
        try {
            ao.qh.ao(702958056);
        } catch (Throwable e) {
            throw ei.ac(e, "ks.th(" + ')');
        }
    }

    public final void vw() {
        ao.qh.ao(702958056);
    }

    static em vb(byte[] bArr) {
        return ao.qh.aa(bArr, (byte) 5);
    }

    static em vq(byte[] bArr) {
        return ao.qh.aa(bArr, (byte) 5);
    }

    protected final void tk(int i, int i2, int i3) {
        try {
            if (!(1080671761 * this.pr == i && this.py * -130263501 == i2)) {
                uj(1085112139);
            }
            this.pr = -766971151 * i;
            this.py = -2097769221 * i2;
        } catch (Throwable e) {
            throw ei.ac(e, "ks.tk(" + ')');
        }
    }

    protected final void vf(int i, int i2) {
        if (!(-882328657 * this.pr == i && this.py * -1603422801 == i2)) {
            uj(355646548);
        }
        this.pr = -766971151 * i;
        this.py = 361492832 * i2;
    }

    protected final void vv(int i, int i2) {
        if (!(1080671761 * this.pr == i && this.py * -130263501 == i2)) {
            uj(-1572280076);
        }
        this.pr = -766971151 * i;
        this.py = -2097769221 * i2;
    }

    protected final void vz(int i, int i2) {
        if (!(-618854386 * this.pr == i && this.py * 759865649 == i2)) {
            uj(1529468090);
        }
        this.pr = -766971151 * i;
        this.py = -2097769221 * i2;
    }

    protected lx tx(int i) {
        try {
            if (this.qt == null) {
                this.qt = new kc();
            }
            return this.qt;
        } catch (Throwable e) {
            throw ei.ac(e, "ks.tx(" + ')');
        }
    }

    protected lx vu() {
        if (this.qt == null) {
            this.qt = new kc();
        }
        return this.qt;
    }

    protected ce ts(int i) {
        try {
            return this.qc.an((byte) 49);
        } catch (Throwable e) {
            throw ei.ac(e, "ks.ts(" + ')');
        }
    }

    protected ce vj() {
        return this.qc.an((byte) 68);
    }

    protected ce vl() {
        return this.qc.an((byte) -1);
    }

    protected ce vo() {
        return this.qc.an((byte) -6);
    }

    protected ce vr() {
        return this.qc.an((byte) 14);
    }

    protected ce vx() {
        return this.qc.an((byte) 10);
    }

    protected void tn(byte b) {
    }

    protected void ve() {
    }

    protected void tc(int i) {
    }

    protected void va() {
    }

    protected void vn() {
    }

    protected void we() {
    }

    protected void wp() {
    }

    protected void ti(String str, byte b) {
    }

    protected void wf(String str) {
    }

    protected void wi(String str) {
    }

    protected final void tl(byte b) {
    }

    protected final void wo() {
    }

    protected final void tp(int i) {
    }

    protected final void wd() {
    }

    final void ta(int i) {
        try {
            mh vi = vi(913636297);
            this.pb = Math.max(vi.aj * 545511355, -1782846775 * this.pd) * 1341405539;
            this.pn = Math.max(vi.ac * -961923125, this.pj * 1707355843) * -1965120061;
            if (this.pb * 901713995 <= 0) {
                this.pb = 1341405539;
            }
            if (this.pn * 992965355 <= 0) {
                this.pn = -1965120061;
            }
            gf.pz = Math.min(this.pb * 901713995, this.pr * 1080671761) * 116843035;
            hu.pe = Math.min(this.pn * 992965355, this.py * -130263501) * 1295366997;
            this.pv = -1839921127 * (((this.pb * 901713995) - (gf.pz * 647702547)) / 2);
            this.ph = 0;
            if (this.qc == null) {
                this.qc = new kf(gf.pz * 647702547, hu.pe * -1479513603);
            } else {
                this.qc.aq(gf.pz * 647702547, hu.pe * -1479513603, -214760192);
            }
            this.qw = true;
            cb((byte) -71);
        } catch (Throwable e) {
            throw ei.ac(e, "ks.ta(" + ')');
        }
    }

    final void wu() {
        mh vi = vi(975873788);
        this.pb = Math.max(vi.aj * 545511355, -1782846775 * this.pd) * 1341405539;
        this.pn = Math.max(vi.ac * -961923125, this.pj * 1707355843) * -1965120061;
        if (this.pb * 901713995 <= 0) {
            this.pb = 1341405539;
        }
        if (this.pn * 992965355 <= 0) {
            this.pn = -1965120061;
        }
        gf.pz = Math.min(this.pb * 901713995, this.pr * 1080671761) * 116843035;
        hu.pe = Math.min(this.pn * 992965355, this.py * -130263501) * 1295366997;
        this.pv = -1839921127 * (((this.pb * 901713995) - (gf.pz * 647702547)) / 2);
        this.ph = 0;
        if (this.qc == null) {
            this.qc = new kf(gf.pz * 647702547, hu.pe * -1479513603);
        } else {
            this.qc.aq(gf.pz * 647702547, hu.pe * -1479513603, -2099751909);
        }
        this.qw = true;
        cb((byte) -50);
    }

    void te(byte b) {
        try {
            int i = this.pv * 1286984745;
            int i2 = -1369089893 * this.ph;
            int i3 = ((901713995 * this.pb) - (647702547 * gf.pz)) - i;
            int i4 = ((992965355 * this.pn) - (hu.pe * -1479513603)) - i2;
            if (i <= 0 && i3 <= 0 && i2 <= 0 && i4 <= 0) {
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ks.te(" + ')');
        }
    }

    void wv() {
        int i = this.pv * 1286984745;
        int i2 = -1369089893 * this.ph;
        int i3 = ((901713995 * this.pb) - (647702547 * gf.pz)) - i;
        int i4 = ((992965355 * this.pn) - (hu.pe * -1479513603)) - i2;
        if (i <= 0 && i3 <= 0 && i2 <= 0 && i4 <= 0) {
        }
    }

    final void tf(int i, int i2, int i3, int i4, int i5, int i6) {
        try {
            String property;
            Thread.currentThread().setName("NXT");
            oh = this;
            gf.pz = 116843035 * i;
            hu.pe = 1295366997 * i2;
            this.pd = 434786169 * i;
            this.pj = 139948523 * i2;
            bb.an = 573369563 * i5;
            if (bn.aj == null) {
                bn.aj = new bn();
            }
            this.qs = bn.aj;
            fx.oo = new ls();
            fx.oo.aq(this, 1, (byte) 0);
            try {
                property = System.getProperty("os.name");
            } catch (Exception e) {
                property = "Unknown";
            }
            av.qv = property.toLowerCase();
        } catch (Throwable e2) {
            try {
                hq.aj(null, e2, (byte) -37);
            } catch (Throwable e22) {
                throw ei.ac(e22, "ks.tf(" + ')');
            }
        }
    }

    protected final void tr(int i, int i2, int i3, short s) {
        try {
            tf(i, i2, 0, 0, i3, 1590800803);
        } catch (Throwable e) {
            throw ei.ac(e, "ks.tr(" + ')');
        }
    }

    protected final void wb(int i, int i2, int i3) {
        tf(i, i2, 0, 0, i3, 1590800803);
    }

    public final void td(int i) {
        try {
            tj(-1240900359);
            long aj = aw.aj((byte) 3) / 1000;
            while (zv.va()) {
                long aj2 = aw.aj((byte) 13) / 1000;
                if (aj == aj2) {
                    aj2 = aj;
                }
                tq((byte) 4);
                aj = aj2;
            }
            tw(1469466053);
        } catch (Throwable e) {
            throw ei.ac(e, "ks.td(" + ')');
        }
    }

    public final void wn() {
        tj(-1240900359);
        long aj = aw.aj((byte) 11) / 1000;
        while (zv.va()) {
            long aj2 = aw.aj((byte) 3) / 1000;
            if (aj != aj2) {
                aj = aj2;
            }
            tq((byte) 4);
        }
        tw(1469466053);
    }

    public final void wx() {
        tj(-1240900359);
        long aj = aw.aj((byte) -17) / 1000;
        while (zv.va()) {
            long aj2 = aw.aj((byte) 23) / 1000;
            if (aj != aj2) {
                aj = aj2;
            }
            tq((byte) 4);
        }
        tw(1469466053);
    }

    public final void wy() {
        tj(-1240900359);
        long aj = aw.aj((byte) 91) / 1000;
        while (zv.va()) {
            long aj2 = aw.aj((byte) 20) / 1000;
            if (aj != aj2) {
                aj = aj2;
            }
            tq((byte) 4);
        }
        tw(1469466053);
    }

    final void tj(int i) {
        try {
            this.qs.an((byte) -30);
            this.pg = aj.ah(1065856506) * 1091084379;
            this.pu = aj.ai(276660241) * -1933632407;
            this.pc = ((float) (2109968339 * this.pg)) / ((float) (-1718078503 * this.pu));
        } catch (Throwable e) {
            throw ei.ac(e, "ks.tj(" + ')');
        }
    }

    final void wa() {
        this.qs.an((byte) -67);
        this.pg = aj.ah(1205599713) * 1091084379;
        this.pu = aj.ai(1723040670) * -1933632407;
        this.pc = ((float) (2109968339 * this.pg)) / ((float) (-1718078503 * this.pu));
    }

    final void tq(byte b) {
        try {
            this.qs.ax(1548386305);
            un((byte) 16);
            uk(-1447508007);
        } catch (Throwable e) {
            throw ei.ac(e, "ks.tq(" + ')');
        }
    }

    final void wg() {
        this.qs.ax(1091881149);
        un((byte) 16);
        uk(-1447508007);
    }

    final void wh() {
        this.qs.ax(827143670);
        un((byte) 16);
        uk(-1447508007);
    }

    final void wl() {
        this.qs.ax(1703420234);
        un((byte) 16);
        uk(-1447508007);
    }

    final void tw(int i) {
        try {
            uh((byte) 116);
        } catch (Throwable e) {
            throw ei.ac(e, "ks.tw(" + ')');
        }
    }

    final void wm() {
        uh((byte) 52);
    }

    public final void um(fq fqVar, int i) {
        try {
            this.qg.aj(fqVar, -392670620);
        } catch (Throwable e) {
            throw ei.ac(e, "ks.um(" + ')');
        }
    }

    public final void wc(fq fqVar) {
        this.qg.aj(fqVar, 480745214);
    }

    public final void wk(fq fqVar) {
        this.qg.aj(fqVar, -378717858);
    }

    public final void ul(boolean z, int i) {
        try {
            this.qs.az(z, 1986754041);
        } catch (Throwable e) {
            throw ei.ac(e, "ks.ul(" + ')');
        }
    }

    public final void wq(boolean z) {
        this.qs.az(z, 1098446921);
    }

    public final void ws(boolean z) {
        this.qs.az(z, 552625569);
    }

    public final void ww(boolean z) {
        this.qs.az(z, 2138091688);
    }

    void un(byte b) {
        try {
            int[] op = zv.op();
            for (int i = 0; i < op.length / 2; i++) {
                int i2 = op[i * 2];
                int i3 = op[(i * 2) + 1];
                long aj = aw.aj((byte) -60);
                switch (i2) {
                    case 0:
                        i2 = ao.qh.ac(i3, (byte) -111);
                        if (i2 < 0) {
                            break;
                        }
                        this.qg.aa(i2, aj);
                        break;
                    case 1:
                        i2 = ao.qh.ac(i3, (byte) -113);
                        if (i2 < 0) {
                            break;
                        }
                        this.qg.ak(i2, aj);
                        break;
                    case 2:
                        i2 = ao.qh.bn(i3, -1570763773);
                        if (i2 < 0) {
                            break;
                        }
                        this.qg.ap((char) i2, aj);
                        break;
                    default:
                        break;
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ks.un(" + ')');
        }
    }

    void wj() {
        int[] op = zv.op();
        for (int i = 0; i < op.length / 2; i++) {
            int i2 = op[i * 2];
            int i3 = op[(i * 2) + 1];
            long aj = aw.aj((byte) -18);
            switch (i2) {
                case 0:
                    i2 = ao.qh.ac(i3, (byte) -15);
                    if (i2 < 0) {
                        break;
                    }
                    this.qg.aa(i2, aj);
                    break;
                case 1:
                    i2 = ao.qh.ac(i3, (byte) -89);
                    if (i2 < 0) {
                        break;
                    }
                    this.qg.ak(i2, aj);
                    break;
                case 2:
                    i2 = ao.qh.bn(i3, -1695944420);
                    if (i2 < 0) {
                        break;
                    }
                    this.qg.ap((char) i2, aj);
                    break;
                default:
                    break;
            }
        }
    }

    void wr() {
        int[] op = zv.op();
        for (int i = 0; i < op.length / 2; i++) {
            int i2 = op[i * 2];
            int i3 = op[(i * 2) + 1];
            long aj = aw.aj((byte) 30);
            switch (i2) {
                case 0:
                    i2 = ao.qh.ac(i3, (byte) -4);
                    if (i2 < 0) {
                        break;
                    }
                    this.qg.aa(i2, aj);
                    break;
                case 1:
                    i2 = ao.qh.ac(i3, (byte) -27);
                    if (i2 < 0) {
                        break;
                    }
                    this.qg.ak(i2, aj);
                    break;
                case 2:
                    i2 = ao.qh.bn(i3, -1674298724);
                    if (i2 < 0) {
                        break;
                    }
                    this.qg.ap((char) i2, aj);
                    break;
                default:
                    break;
            }
        }
    }

    void wt() {
        int[] op = zv.op();
        for (int i = 0; i < op.length / 2; i++) {
            int i2 = op[i * 2];
            int i3 = op[(i * 2) + 1];
            long aj = aw.aj((byte) -69);
            switch (i2) {
                case 0:
                    i2 = ao.qh.ac(i3, (byte) -6);
                    if (i2 < 0) {
                        break;
                    }
                    this.qg.aa(i2, aj);
                    break;
                case 1:
                    i2 = ao.qh.ac(i3, (byte) -97);
                    if (i2 < 0) {
                        break;
                    }
                    this.qg.ak(i2, aj);
                    break;
                case 2:
                    i2 = ao.qh.bn(i3, -1996570597);
                    if (i2 < 0) {
                        break;
                    }
                    this.qg.ap((char) i2, aj);
                    break;
                default:
                    break;
            }
        }
    }

    void wz() {
        int[] op = zv.op();
        for (int i = 0; i < op.length / 2; i++) {
            int i2 = op[i * 2];
            int i3 = op[(i * 2) + 1];
            long aj = aw.aj((byte) 10);
            switch (i2) {
                case 0:
                    i2 = ao.qh.ac(i3, (byte) -36);
                    if (i2 < 0) {
                        break;
                    }
                    this.qg.aa(i2, aj);
                    break;
                case 1:
                    i2 = ao.qh.ac(i3, (byte) -7);
                    if (i2 < 0) {
                        break;
                    }
                    this.qg.ak(i2, aj);
                    break;
                case 2:
                    i2 = ao.qh.bn(i3, -1462894418);
                    if (i2 < 0) {
                        break;
                    }
                    this.qg.ap((char) i2, aj);
                    break;
                default:
                    break;
            }
        }
    }

    void xo() {
        int[] op = zv.op();
        for (int i = 0; i < op.length / 2; i++) {
            int i2 = op[i * 2];
            int i3 = op[(i * 2) + 1];
            long aj = aw.aj((byte) 48);
            switch (i2) {
                case 0:
                    i2 = ao.qh.ac(i3, (byte) -102);
                    if (i2 < 0) {
                        break;
                    }
                    this.qg.aa(i2, aj);
                    break;
                case 1:
                    i2 = ao.qh.ac(i3, (byte) -90);
                    if (i2 < 0) {
                        break;
                    }
                    this.qg.ak(i2, aj);
                    break;
                case 2:
                    i2 = ao.qh.bn(i3, -1495331083);
                    if (i2 < 0) {
                        break;
                    }
                    this.qg.ap((char) i2, aj);
                    break;
                default:
                    break;
            }
        }
    }

    void uk(int i) {
        try {
            int[] xl = zv.xl();
            for (int i2 = 0; i2 < xl.length; i2 += 4) {
                int i3 = xl[i2 + 0];
                int i4 = xl[i2 + 1];
                int i5 = xl[i2 + 2];
                int i6 = xl[i2 + 3];
                long aj = aw.aj((byte) -31);
                int i7 = (i5 * (gf.pz * 647702547)) / (this.pg * 2109968339);
                i6 = ((hu.pe * -1479513603) * i6) / (this.pu * -1718078503);
                switch (i3) {
                    case 0:
                        this.qg.at(i4, 0, i7, i6, aj);
                        break;
                    case 1:
                        this.qg.ah(i4, 0, i7, i6, aj);
                        break;
                    case 2:
                        this.qg.ai(i4, i7, i6, aj);
                        break;
                    case 3:
                        this.qg.ah(i4, 0, i7, i6, aj);
                        break;
                    default:
                        break;
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ks.uk(" + ')');
        }
    }

    void xg() {
        int[] xl = zv.xl();
        for (int i = 0; i < xl.length; i += 4) {
            int i2 = xl[i + 0];
            int i3 = xl[i + 1];
            int i4 = xl[i + 2];
            int i5 = xl[i + 3];
            long aj = aw.aj((byte) 35);
            i4 = (i4 * (gf.pz * -678968251)) / (this.pg * 2109968339);
            i5 = (i5 * (hu.pe * 1971840913)) / (this.pu * -1718078503);
            switch (i2) {
                case 0:
                    this.qg.at(i3, 0, i4, i5, aj);
                    break;
                case 1:
                    this.qg.ah(i3, 0, i4, i5, aj);
                    break;
                case 2:
                    this.qg.ai(i3, i4, i5, aj);
                    break;
                case 3:
                    this.qg.ah(i3, 0, i4, i5, aj);
                    break;
                default:
                    break;
            }
        }
    }

    void xt() {
        int[] xl = zv.xl();
        for (int i = 0; i < xl.length; i += 4) {
            int i2 = xl[i + 0];
            int i3 = xl[i + 1];
            int i4 = xl[i + 2];
            int i5 = xl[i + 3];
            long aj = aw.aj((byte) 11);
            i4 = (i4 * (gf.pz * 647702547)) / (this.pg * 2109968339);
            i5 = (i5 * (hu.pe * 1711134196)) / (this.pu * -1276933416);
            switch (i2) {
                case 0:
                    this.qg.at(i3, 0, i4, i5, aj);
                    break;
                case 1:
                    this.qg.ah(i3, 0, i4, i5, aj);
                    break;
                case 2:
                    this.qg.ai(i3, i4, i5, aj);
                    break;
                case 3:
                    this.qg.ah(i3, 0, i4, i5, aj);
                    break;
                default:
                    break;
            }
        }
    }

    protected boolean ui(int i) {
        return true;
    }

    protected boolean xb() {
        return true;
    }

    protected boolean xk() {
        return true;
    }

    protected boolean xq() {
        return true;
    }

    protected URL uy(int i) {
        try {
            return this.qq;
        } catch (Throwable e) {
            throw ei.ac(e, "ks.uy(" + ')');
        }
    }

    protected URL xc() {
        return this.qq;
    }

    protected URL xd() {
        return this.qq;
    }

    protected URL xf() {
        return this.qq;
    }

    protected URL xs() {
        return this.qq;
    }

    boolean uo(String str, int i) {
        try {
            this.qq = new URL(str);
            return true;
        } catch (MalformedURLException e) {
            try {
                e.printStackTrace();
                return false;
            } catch (Throwable e2) {
                throw ei.ac(e2, "ks.uo(" + ')');
            }
        }
    }

    boolean xa(String str) {
        try {
            this.qq = new URL(str);
            return true;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return false;
        }
    }

    boolean xj(String str) {
        try {
            this.qq = new URL(str);
            return true;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return false;
        }
    }

    boolean xn(String str) {
        try {
            this.qq = new URL(str);
            return true;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return false;
        }
    }

    boolean xu(String str) {
        try {
            this.qq = new URL(str);
            return true;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return false;
        }
    }

    void uc(int i, String str, int i2) {
        try {
            this.qj.put(Integer.toString(i), str);
        } catch (Throwable e) {
            throw ei.ac(e, "ks.uc(" + ')');
        }
    }

    void xr(int i, String str) {
        this.qj.put(Integer.toString(i), str);
    }

    void xy(int i, String str) {
        this.qj.put(Integer.toString(i), str);
    }

    protected String up(String str, int i) {
        try {
            return (String) this.qj.get(str);
        } catch (Throwable e) {
            throw ei.ac(e, "ks.up(" + ')');
        }
    }

    protected String xi(String str) {
        return (String) this.qj.get(str);
    }

    protected String xm(String str) {
        return (String) this.qj.get(str);
    }

    protected String xv(String str) {
        return (String) this.qj.get(str);
    }

    protected String xz(String str) {
        return (String) this.qj.get(str);
    }

    protected int ub(int i) {
        return 0;
    }

    protected int xe() {
        return 0;
    }

    protected int xw() {
        return 0;
    }

    public void uq(la laVar, byte b) {
        try {
            this.qr = laVar;
        } catch (Throwable e) {
            throw ei.ac(e, "ks.uq(" + ')');
        }
    }

    public void xh(la laVar) {
        this.qr = laVar;
    }

    public void xl(la laVar) {
        this.qr = laVar;
    }

    public void xp(la laVar) {
        this.qr = laVar;
    }

    public void xx(la laVar) {
        this.qr = laVar;
    }

    public void cs() {
        int i = 0;
        try {
            if (uw(-2114300204)) {
                try {
                    ap(361399238);
                    ai(2121575368);
                    this.qc = new kf(647702547 * gf.pz, -1479513603 * hu.pe);
                    aw.pf = new lf();
                    long j = 0;
                    while (true) {
                        if (ot * 8867326810166863015L != 0 && aw.aj((byte) 32) >= 8867326810166863015L * ot) {
                            break;
                        }
                        long nanoTime = System.nanoTime();
                        long j2 = nanoTime / (pp * -8593355984368915165L);
                        fe.pq = Math.min((int) (j2 - j), 10) * -1405677871;
                        for (int i2 = 0; i2 < 1094847025 * fe.pq; i2++) {
                            ud((byte) 3);
                        }
                        ur(((float) (nanoTime - ((pp * -8593355984368915165L) * j2))) / ((float) (pp * -8593355984368915165L)), 2116510625);
                        j = j2;
                    }
                    uf(16711935);
                } catch (Exception e) {
                    while (true) {
                        bl(0, -1775627736);
                        da.aj(100);
                        ux(-1550582987);
                        if (this.qc != null) {
                            vg(1120172554);
                        }
                    }
                }
            } else {
                while (i < 50) {
                    bl(0, -1873174492);
                    da.aj(100);
                    ux(-1550582987);
                    if (this.qc != null) {
                        vh(((((50 - i) - 1) * 100) / 1000) + 1, (byte) 32);
                    }
                    i++;
                }
                this.qr = new la(this.qr.aa(1987937764));
                fx.oo.aq(this, 1, (byte) 0);
            }
        } catch (Throwable e2) {
            hq.aj(null, e2, (byte) 9);
            ut(lg.aj, -861641527);
        }
    }

    public void run() {
        int i = 0;
        try {
            if (uw(-2114300204)) {
                try {
                    ap(66953780);
                    ai(-745504585);
                    this.qc = new kf(647702547 * gf.pz, -1479513603 * hu.pe);
                    aw.pf = new lf();
                    long j = 0;
                    while (true) {
                        if (ot * 8867326810166863015L != 0 && aw.aj((byte) -17) >= 8867326810166863015L * ot) {
                            break;
                        }
                        long nanoTime = System.nanoTime();
                        long j2 = nanoTime / (pp * -8593355984368915165L);
                        fe.pq = Math.min((int) (j2 - j), 10) * -1405677871;
                        for (int i2 = 0; i2 < 1094847025 * fe.pq; i2++) {
                            ud((byte) 3);
                        }
                        ur(((float) (nanoTime - ((pp * -8593355984368915165L) * j2))) / ((float) (pp * -8593355984368915165L)), 2116510625);
                        j = j2;
                    }
                    uf(16711935);
                } catch (Exception e) {
                    while (true) {
                        bl(0, -2060377752);
                        da.aj(100);
                        ux(-1550582987);
                        if (this.qc != null) {
                            vg(1120172554);
                        }
                    }
                }
            } else {
                while (i < 50) {
                    bl(0, -1206092183);
                    da.aj(100);
                    ux(-1550582987);
                    if (this.qc != null) {
                        vh(((((50 - i) - 1) * 100) / 1000) + 1, (byte) 47);
                    }
                    i++;
                }
                this.qr = new la(this.qr.aa(2108658322));
                fx.oo.aq(this, 1, (byte) 0);
            }
        } catch (Throwable e2) {
            try {
                hq.aj(null, e2, (byte) -12);
                ut(lg.aj, -861641527);
            } catch (Throwable e22) {
                throw ei.ac(e22, "ks.run(" + ')');
            }
        }
    }

    public static final em aw(int i, int i2, int i3, int i4, int i5, boolean z, byte b) {
        em emVar;
        int i6;
        int i7;
        av ac;
        ct ah;
        em emVar2;
        je emVar3;
        es esVar;
        cq cqVar;
        cr ac2;
        int i8;
        int[] iArr;
        if (i2 == -1) {
            i5 = 0;
        } else if (i5 == 2 && 1 != i2) {
            i5 = 1;
        }
        long j = (((long) i4) << 42) + ((((((long) i2) << 16) + ((long) i)) + (((long) i3) << 38)) + (((long) i5) << 40));
        if (!z) {
            try {
                emVar = (em) av.ae.aj(j);
                if (emVar != null) {
                    return emVar;
                }
            } catch (Throwable e) {
                throw ei.ac(e, "ks.aw(" + ')');
            }
        }
        av ac3 = al.ac(i, (short) 20884);
        if (i2 > 1 && ac3.bc != null) {
            i6 = -1;
            i7 = 0;
            while (i7 < 10) {
                if (i2 >= ac3.bk[i7] && ac3.bk[i7] != 0) {
                    i6 = ac3.bc[i7];
                }
                i7++;
            }
            if (i6 != -1) {
                ac = al.ac(i6, (short) -17937);
                ah = ac.ah(1, (short) 27442);
                if (ah == null) {
                    return null;
                }
                if (-1 != -1811867057 * ac.bl) {
                    emVar = ks.aw(ac.bf * -483035651, 10, 1, 0, 0, true, (byte) 27);
                    if (emVar == null) {
                        return null;
                    }
                } else if (-1159112053 * ac.ct != -1) {
                    emVar = ks.aw(-1697168825 * ac.cp, i2, i3, i4, 0, false, (byte) 19);
                    if (emVar == null) {
                        return null;
                    }
                } else if (-1 == ac.ck * -1223174873) {
                    emVar = ks.aw(ac.cm * 2070465581, i2, 0, 0, 0, false, (byte) -26);
                    if (emVar == null) {
                        return null;
                    }
                } else {
                    emVar2 = null;
                    emVar3 = new em(36, 32);
                    av.al.ad(emVar3.aj, 36, 32, -824224025);
                    esVar = (ev) av.al.aj((byte) -118);
                    cqVar = (cq) av.al.ac((byte) 63);
                    ac2 = av.al.an((byte) 21).ac(-2106590353);
                    cqVar.bi(-1649364754);
                    cqVar.bo(16, 16, (byte) 6);
                    cqVar.by(false, (byte) 61);
                    if (-1223174873 * ac.ck != -1) {
                        esVar.ax(emVar2, 0, 0, 1231133277);
                    }
                    i7 = ac.ar * -997737523;
                    if (!z) {
                        i7 = (int) (((double) i7) * 1.5d);
                    } else if (2 == i3) {
                        i7 = (int) (1.04d * ((double) i7));
                    }
                    i8 = (bl.az[ac.ad * 1986334167] * i7) >> 16;
                    i7 = (i7 * bl.ax[1986334167 * ac.ad]) >> 16;
                    ah.aa();
                    ac2.aj(ah, 0, -995845275 * ac.ab, -320741615 * ac.bp, 1986334167 * ac.ad, -1411518867 * ac.bm, (i8 + ((-2098630381 * ah.bl) / 2)) + (ac.bh * -1347806165), (ac.bh * -1347806165) + i7, (byte) -3);
                    if (-1 != ac.ct * -1159112053) {
                        esVar.ax(emVar2, 0, 0, 1231133277);
                    }
                    if (i3 >= 1) {
                        emVar3.ak(1);
                    }
                    if (i3 >= 2) {
                        emVar3.ak(16777215);
                    }
                    if (i4 != 0) {
                        emVar3.ap(i4);
                    }
                    av.al.ad(emVar3.aj, 36, 32, -1032069286);
                    if (-1811867057 * ac.bl != -1) {
                        esVar.ax(emVar2, 0, 0, 1231133277);
                    }
                    if (i5 == 1 || (i5 == 2 && -559602733 * ac.bt == 1)) {
                        af.as.at(ee.am(i2, 1420354382), 0, 9, 16776960, 1, esVar);
                    }
                    for (i6 = 0; i6 < emVar3.aj.length; i6++) {
                        if (emVar3.aj[i6] == 0) {
                            iArr = emVar3.aj;
                            iArr[i6] = iArr[i6] | -16777216;
                        }
                    }
                    if (!z) {
                        av.ae.an(emVar3, j);
                    }
                    return emVar3;
                }
                emVar2 = emVar;
                emVar3 = new em(36, 32);
                av.al.ad(emVar3.aj, 36, 32, -824224025);
                esVar = (ev) av.al.aj((byte) -118);
                cqVar = (cq) av.al.ac((byte) 63);
                ac2 = av.al.an((byte) 21).ac(-2106590353);
                cqVar.bi(-1649364754);
                cqVar.bo(16, 16, (byte) 6);
                cqVar.by(false, (byte) 61);
                if (-1223174873 * ac.ck != -1) {
                    esVar.ax(emVar2, 0, 0, 1231133277);
                }
                i7 = ac.ar * -997737523;
                if (!z) {
                    i7 = (int) (((double) i7) * 1.5d);
                } else if (2 == i3) {
                    i7 = (int) (1.04d * ((double) i7));
                }
                i8 = (bl.az[ac.ad * 1986334167] * i7) >> 16;
                i7 = (i7 * bl.ax[1986334167 * ac.ad]) >> 16;
                ah.aa();
                ac2.aj(ah, 0, -995845275 * ac.ab, -320741615 * ac.bp, 1986334167 * ac.ad, -1411518867 * ac.bm, (i8 + ((-2098630381 * ah.bl) / 2)) + (ac.bh * -1347806165), (ac.bh * -1347806165) + i7, (byte) -3);
                if (-1 != ac.ct * -1159112053) {
                    esVar.ax(emVar2, 0, 0, 1231133277);
                }
                if (i3 >= 1) {
                    emVar3.ak(1);
                }
                if (i3 >= 2) {
                    emVar3.ak(16777215);
                }
                if (i4 != 0) {
                    emVar3.ap(i4);
                }
                av.al.ad(emVar3.aj, 36, 32, -1032069286);
                if (-1811867057 * ac.bl != -1) {
                    esVar.ax(emVar2, 0, 0, 1231133277);
                }
                af.as.at(ee.am(i2, 1420354382), 0, 9, 16776960, 1, esVar);
                for (i6 = 0; i6 < emVar3.aj.length; i6++) {
                    if (emVar3.aj[i6] == 0) {
                        iArr = emVar3.aj;
                        iArr[i6] = iArr[i6] | -16777216;
                    }
                }
                if (z) {
                    av.ae.an(emVar3, j);
                }
                return emVar3;
            }
        }
        ac = ac3;
        ah = ac.ah(1, (short) 27442);
        if (ah == null) {
            return null;
        }
        if (-1 != -1811867057 * ac.bl) {
            emVar = ks.aw(ac.bf * -483035651, 10, 1, 0, 0, true, (byte) 27);
            if (emVar == null) {
                return null;
            }
        } else if (-1159112053 * ac.ct != -1) {
            emVar = ks.aw(-1697168825 * ac.cp, i2, i3, i4, 0, false, (byte) 19);
            if (emVar == null) {
                return null;
            }
        } else if (-1 == ac.ck * -1223174873) {
            emVar2 = null;
            emVar3 = new em(36, 32);
            av.al.ad(emVar3.aj, 36, 32, -824224025);
            esVar = (ev) av.al.aj((byte) -118);
            cqVar = (cq) av.al.ac((byte) 63);
            ac2 = av.al.an((byte) 21).ac(-2106590353);
            cqVar.bi(-1649364754);
            cqVar.bo(16, 16, (byte) 6);
            cqVar.by(false, (byte) 61);
            if (-1223174873 * ac.ck != -1) {
                esVar.ax(emVar2, 0, 0, 1231133277);
            }
            i7 = ac.ar * -997737523;
            if (!z) {
                i7 = (int) (((double) i7) * 1.5d);
            } else if (2 == i3) {
                i7 = (int) (1.04d * ((double) i7));
            }
            i8 = (bl.az[ac.ad * 1986334167] * i7) >> 16;
            i7 = (i7 * bl.ax[1986334167 * ac.ad]) >> 16;
            ah.aa();
            ac2.aj(ah, 0, -995845275 * ac.ab, -320741615 * ac.bp, 1986334167 * ac.ad, -1411518867 * ac.bm, (i8 + ((-2098630381 * ah.bl) / 2)) + (ac.bh * -1347806165), (ac.bh * -1347806165) + i7, (byte) -3);
            if (-1 != ac.ct * -1159112053) {
                esVar.ax(emVar2, 0, 0, 1231133277);
            }
            if (i3 >= 1) {
                emVar3.ak(1);
            }
            if (i3 >= 2) {
                emVar3.ak(16777215);
            }
            if (i4 != 0) {
                emVar3.ap(i4);
            }
            av.al.ad(emVar3.aj, 36, 32, -1032069286);
            if (-1811867057 * ac.bl != -1) {
                esVar.ax(emVar2, 0, 0, 1231133277);
            }
            af.as.at(ee.am(i2, 1420354382), 0, 9, 16776960, 1, esVar);
            for (i6 = 0; i6 < emVar3.aj.length; i6++) {
                if (emVar3.aj[i6] == 0) {
                    iArr = emVar3.aj;
                    iArr[i6] = iArr[i6] | -16777216;
                }
            }
            if (z) {
                av.ae.an(emVar3, j);
            }
            return emVar3;
        } else {
            emVar = ks.aw(ac.cm * 2070465581, i2, 0, 0, 0, false, (byte) -26);
            if (emVar == null) {
                return null;
            }
        }
        emVar2 = emVar;
        emVar3 = new em(36, 32);
        av.al.ad(emVar3.aj, 36, 32, -824224025);
        esVar = (ev) av.al.aj((byte) -118);
        cqVar = (cq) av.al.ac((byte) 63);
        ac2 = av.al.an((byte) 21).ac(-2106590353);
        cqVar.bi(-1649364754);
        cqVar.bo(16, 16, (byte) 6);
        cqVar.by(false, (byte) 61);
        if (-1223174873 * ac.ck != -1) {
            esVar.ax(emVar2, 0, 0, 1231133277);
        }
        i7 = ac.ar * -997737523;
        if (!z) {
            i7 = (int) (((double) i7) * 1.5d);
        } else if (2 == i3) {
            i7 = (int) (1.04d * ((double) i7));
        }
        i8 = (bl.az[ac.ad * 1986334167] * i7) >> 16;
        i7 = (i7 * bl.ax[1986334167 * ac.ad]) >> 16;
        ah.aa();
        ac2.aj(ah, 0, -995845275 * ac.ab, -320741615 * ac.bp, 1986334167 * ac.ad, -1411518867 * ac.bm, (i8 + ((-2098630381 * ah.bl) / 2)) + (ac.bh * -1347806165), (ac.bh * -1347806165) + i7, (byte) -3);
        if (-1 != ac.ct * -1159112053) {
            esVar.ax(emVar2, 0, 0, 1231133277);
        }
        if (i3 >= 1) {
            emVar3.ak(1);
        }
        if (i3 >= 2) {
            emVar3.ak(16777215);
        }
        if (i4 != 0) {
            emVar3.ap(i4);
        }
        av.al.ad(emVar3.aj, 36, 32, -1032069286);
        if (-1811867057 * ac.bl != -1) {
            esVar.ax(emVar2, 0, 0, 1231133277);
        }
        af.as.at(ee.am(i2, 1420354382), 0, 9, 16776960, 1, esVar);
        for (i6 = 0; i6 < emVar3.aj.length; i6++) {
            if (emVar3.aj[i6] == 0) {
                iArr = emVar3.aj;
                iArr[i6] = iArr[i6] | -16777216;
            }
        }
        if (z) {
            av.ae.an(emVar3, j);
        }
        return emVar3;
    }

    void ud(byte b) {
        try {
            long aj = aw.aj((byte) -5);
            long j = pt[cs.px * 1018343157];
            pt[cs.px * 1018343157] = aj;
            cs.px = (((cs.px * 1018343157) + 1) & 31) * 384044381;
            if (0 == j || aj > j) {
                us(-811364890);
                aw(-698833712);
            } else {
                us(-811364890);
                aw(-698833712);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ks.ud(" + ')');
        }
    }

    void yf() {
        long aj = aw.aj((byte) -83);
        long j = pt[cs.px * 1018343157];
        pt[cs.px * 1018343157] = aj;
        cs.px = (((cs.px * 1018343157) + 1) & -256274463) * 852505817;
        if (0 == j || aj > j) {
            us(-1308202889);
            aw(791485686);
        } else {
            us(-1308202889);
            aw(791485686);
        }
    }

    void ym() {
        long aj = aw.aj((byte) 28);
        long j = pt[cs.px * 1018343157];
        pt[cs.px * 1018343157] = aj;
        cs.px = (((cs.px * 1018343157) + 1) & 31) * 384044381;
        if (0 == j || aj > j) {
            us(357792877);
            aw(-1776270445);
        } else {
            us(357792877);
            aw(-1776270445);
        }
    }

    void yn() {
        long aj = aw.aj((byte) -15);
        long j = pt[cs.px * 1018343157];
        pt[cs.px * 1018343157] = aj;
        cs.px = (((-454238305 * cs.px) + 1) & 31) * 384044381;
        if (0 == j || aj > j) {
            us(88510893);
            aw(-108995743);
        } else {
            us(88510893);
            aw(-108995743);
        }
    }

    void yp() {
        long aj = aw.aj((byte) 53);
        long j = pt[cs.px * 1018343157];
        pt[cs.px * 1018343157] = aj;
        cs.px = (((cs.px * 1018343157) + 1) & 31) * 384044381;
        if (0 == j || aj > j) {
            us(1039435549);
            aw(-1836277596);
        } else {
            us(1039435549);
            aw(-1836277596);
        }
    }

    void yu() {
        long aj = aw.aj((byte) 103);
        long j = pt[1387266350 * cs.px];
        pt[cs.px * 1018343157] = aj;
        cs.px = (((cs.px * 1018343157) + 1) & 31) * 449072565;
        if (0 == j || aj > j) {
            us(939002020);
            aw(544011091);
        } else {
            us(939002020);
            aw(544011091);
        }
    }

    synchronized void us(int i) {
        try {
            ht.qz = qk;
        } catch (Throwable e) {
            throw ei.ac(e, "ks.us(" + ')');
        }
    }

    synchronized void yj() {
        ht.qz = qk;
    }

    synchronized void yv() {
        ht.qz = qk;
    }

    void ur(float f, int i) {
        try {
            int i2;
            long aj = aw.aj((byte) -50);
            long j = pk[ay.pw * 180498661];
            pk[ay.pw * 180498661] = aj;
            ay.pw = (((ay.pw * 180498661) + 1) & 31) * 1196821741;
            if (0 != j && aj > j) {
                i2 = (int) (aj - j);
                pl = (((i2 >> 1) + 32000) / i2) * 1768691963;
            }
            i2 = qy - 740572833;
            qy = i2;
            if ((i2 * -1893148001) - 1 > 50) {
                qy -= 1626064014;
                this.qw = true;
            }
            ux(-1550582987);
            am(this.qw, f, (byte) -41);
            if (this.qw) {
                te((byte) 81);
            }
            this.qw = false;
        } catch (Throwable e) {
            throw ei.ac(e, "ks.ur(" + ')');
        }
    }

    void ya(float f) {
        int i;
        long aj = aw.aj((byte) -2);
        long j = pk[ay.pw * 180498661];
        pk[-595908034 * ay.pw] = aj;
        ay.pw = (((ay.pw * 180498661) + 1) & 31) * 1196821741;
        if (0 != j && aj > j) {
            i = (int) (aj - j);
            pl = ((-474571187 + (i >> 1)) / i) * 231271113;
        }
        i = qy - 740572833;
        qy = i;
        if ((i * -1893148001) - 1 > 665715370) {
            qy -= -848175666;
            this.qw = true;
        }
        ux(-1550582987);
        am(this.qw, f, (byte) -101);
        if (this.qw) {
            te((byte) 123);
        }
        this.qw = false;
    }

    final void ux(int i) {
        try {
            mh vi = vi(856295120);
            if (2109968339 * this.pg != 545511355 * vi.aj || -1718078503 * this.pu != vi.ac * -961923125 || this.ql) {
                ta(1460716471);
                this.ql = false;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ks.ux(" + ')');
        }
    }

    final void yh() {
        mh vi = vi(2127774954);
        if (2109968339 * this.pg != 545511355 * vi.aj || 1917059838 * this.pu != vi.ac * -961923125 || this.ql) {
            ta(1268561907);
            this.ql = false;
        }
    }

    final void yt() {
        mh vi = vi(63301288);
        if (2109968339 * this.pg != 545511355 * vi.aj || -1718078503 * this.pu != vi.ac * -961923125 || this.ql) {
            ta(348442778);
            this.ql = false;
        }
    }

    final void uj(int i) {
        try {
            this.ql = true;
        } catch (Throwable e) {
            throw ei.ac(e, "ks.uj(" + ')');
        }
    }

    final void yo() {
        this.ql = true;
    }

    final void yq() {
        this.ql = true;
    }

    final void yr() {
        this.ql = true;
    }

    final void yy() {
        this.ql = true;
    }

    final void yz() {
        this.ql = true;
    }

    final synchronized void uf(int i) {
        try {
            if (!ok) {
                ok = true;
                try {
                    ae(554859770);
                } catch (Exception e) {
                }
                if (fx.oo != null) {
                    try {
                        fx.oo.aj(-1260716357);
                    } catch (Exception e2) {
                    }
                }
                ao(1212825587);
            }
        } catch (Throwable e3) {
            throw ei.ac(e3, "ks.uf(" + ')');
        }
    }

    final synchronized void yg() {
        if (!ok) {
            ok = true;
            try {
                ae(554859770);
            } catch (Exception e) {
            }
            if (fx.oo != null) {
                try {
                    fx.oo.aj(-1481896991);
                } catch (Exception e2) {
                }
            }
            ao(133568937);
        }
    }

    final synchronized void yk() {
        if (!ok) {
            ok = true;
            try {
                ae(554859770);
            } catch (Exception e) {
            }
            if (fx.oo != null) {
                try {
                    fx.oo.aj(763026090);
                } catch (Exception e2) {
                }
            }
            ao(259059821);
        }
    }

    final synchronized void yx() {
        if (!ok) {
            ok = true;
            try {
                ae(554859770);
            } catch (Exception e) {
            }
            if (fx.oo != null) {
                try {
                    fx.oo.aj(1561234968);
                } catch (Exception e2) {
                }
            }
            ao(964432802);
        }
    }

    protected static final void yi() {
        int i;
        aw.pf.aj((byte) 2);
        for (i = 0; i < 32; i++) {
            pk[i] = 0;
        }
        for (i = 0; i < 32; i++) {
            pt[i] = 0;
        }
        fe.pq = 0;
    }

    protected static final void yl() {
        int i;
        aw.pf.aj((byte) 2);
        for (i = 0; i < 32; i++) {
            pk[i] = 0;
        }
        for (i = 0; i < 32; i++) {
            pt[i] = 0;
        }
        fe.pq = 0;
    }

    protected static final void yw() {
        int i;
        aw.pf.aj((byte) 2);
        for (i = 0; i < 32; i++) {
            pk[i] = 0;
        }
        for (i = 0; i < 32; i++) {
            pt[i] = 0;
        }
        fe.pq = 0;
    }

    final void uh(byte b) {
        try {
            if (oh == this && !ok) {
                ot = aw.aj((byte) 68) * 2779486647431480087L;
                da.aj(5000);
                uf(16711935);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ks.uh(" + ')');
        }
    }

    boolean uw(int i) {
        while (!this.qr.aj(0, 1657155440)) {
            try {
                da.aj(10);
            } catch (Throwable e) {
                throw ei.ac(e, "ks.uw(" + ')');
            }
        }
        for (Entry entry : this.qr.ao(1280290097).ac.entrySet()) {
            uc(Integer.parseInt((String) entry.getKey()), (String) entry.getValue(), -966197177);
        }
        String str = (String) this.qr.ao(1498881381).aj.get("codebase");
        if (str == null) {
            return false;
        }
        return uo(str, 1140326752);
    }

    boolean yb() {
        while (!this.qr.aj(0, 1664754492)) {
            da.aj(10);
        }
        for (Entry entry : this.qr.ao(1451628423).ac.entrySet()) {
            uc(Integer.parseInt((String) entry.getKey()), (String) entry.getValue(), 211931247);
        }
        String str = (String) this.qr.ao(1242467537).aj.get("codebase");
        if (str == null) {
            return false;
        }
        return uo(str, 44575793);
    }

    protected final boolean uz(boolean z, int i) {
        try {
            kd.ps = (em) ao.qh.ak(lt.aj, 1325412486);
            return true;
        } catch (Throwable e) {
            throw ei.ac(e, "ks.uz(" + ')');
        }
    }

    protected final boolean yc(boolean z) {
        kd.ps = (em) ao.qh.ak(lt.aj, 1347934546);
        return true;
    }

    protected final boolean yd(boolean z) {
        kd.ps = (em) ao.qh.ak(lt.aj, 1335074377);
        return true;
    }

    protected final boolean ys(boolean z) {
        kd.ps = (em) ao.qh.ak(lt.aj, 1939318440);
        return true;
    }

    protected final void ue(int i, String str, boolean z, int i2) {
        try {
            if (ah.pi == null) {
                ah.pi = (kh) ao.qh.ak(lt.ac, -1070488345);
            }
            qo.aj(i, str, kd.ps, ah.pi, ao.qh.ai(-1533837135), this.qc, 1813036248);
        } catch (Throwable e) {
            throw ei.ac(e, "ks.ue(" + ')');
        }
    }

    protected final void ye(int i, String str, boolean z) {
        if (ah.pi == null) {
            ah.pi = (kh) ao.qh.ak(lt.ac, 1364617227);
        }
        qo.aj(i, str, kd.ps, ah.pi, ao.qh.ai(-1533837135), this.qc, 1361094406);
    }

    protected final void uu(int i) {
    }

    protected final void zh() {
    }

    protected final void zp() {
    }

    protected final void zq() {
    }

    protected final void zz() {
    }

    protected void ut(lg lgVar, int i) {
        try {
            if (!ug(-324644574)) {
                ou = lgVar;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ks.ut(" + ')');
        }
    }

    protected void zk(lg lgVar) {
        if (!ug(-1939859044)) {
            ou = lgVar;
        }
    }

    protected void uv(int i) {
        try {
            if (ah.pi == null) {
                ah.pi = (kh) ao.qh.ak(lt.ac, 1672140282);
            }
            if (ah.pi != null) {
                qo.ac(ou, ah.pi, this.qc, this.pc, 613810550);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ks.uv(" + ')');
        }
    }

    protected void zm() {
        if (ah.pi == null) {
            ah.pi = (kh) ao.qh.ak(lt.ac, -565675334);
        }
        if (ah.pi != null) {
            qo.ac(ou, ah.pi, this.qc, this.pc, 613810550);
        }
    }

    boolean ug(int i) {
        try {
            return ou != null;
        } catch (Throwable e) {
            throw ei.ac(e, "ks.ug(" + ')');
        }
    }

    boolean zi() {
        return ou != null;
    }

    boolean zs() {
        return ou != null;
    }

    final void vh(int i, byte b) {
        try {
            if (ah.pi == null) {
                ah.pi = (kh) ao.qh.ak(lt.ac, -1655100304);
            }
            if (ah.pi != null) {
                qo.an(i, ah.pi, this.qc, this.pc, (byte) -49);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ks.vh(" + ')');
        }
    }

    final void zl(int i) {
        if (ah.pi == null) {
            ah.pi = (kh) ao.qh.ak(lt.ac, 1214864662);
        }
        if (ah.pi != null) {
            qo.an(i, ah.pi, this.qc, this.pc, (byte) 97);
        }
    }

    final void zt(int i) {
        if (ah.pi == null) {
            ah.pi = (kh) ao.qh.ak(lt.ac, 1986662722);
        }
        if (ah.pi != null) {
            qo.an(i, ah.pi, this.qc, this.pc, (byte) -14);
        }
    }

    final void vg(int i) {
        try {
            if (ah.pi == null) {
                ah.pi = (kh) ao.qh.ak(lt.ac, -1524412007);
            }
            if (ah.pi != null) {
                qo.aq(ah.pi, this.qc, this.pc, -871893567);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ks.vg(" + ')');
        }
    }

    final void zf() {
        if (ah.pi == null) {
            ah.pi = (kh) ao.qh.ak(lt.ac, 1831373360);
        }
        if (ah.pi != null) {
            qo.aq(ah.pi, this.qc, this.pc, -871893567);
        }
    }

    final void zg() {
        if (ah.pi == null) {
            ah.pi = (kh) ao.qh.ak(lt.ac, 567902176);
        }
        if (ah.pi != null) {
            qo.aq(ah.pi, this.qc, this.pc, -871893567);
        }
    }

    final void zn() {
        if (ah.pi == null) {
            ah.pi = (kh) ao.qh.ak(lt.ac, 1484452894);
        }
        if (ah.pi != null) {
            qo.aq(ah.pi, this.qc, this.pc, -871893567);
        }
    }

    final void zw() {
        if (ah.pi == null) {
            ah.pi = (kh) ao.qh.ak(lt.ac, -995017737);
        }
        if (ah.pi != null) {
            qo.aq(ah.pi, this.qc, this.pc, -871893567);
        }
    }

    protected mf vm(byte b) {
        try {
            return ao.qh;
        } catch (Throwable e) {
            throw ei.ac(e, "ks.vm(" + ')');
        }
    }

    protected mf ze() {
        return ao.qh;
    }

    mh vi(int i) {
        try {
            return new mh(2109968339 * this.pg, this.pu * -1718078503);
        } catch (Throwable e) {
            throw ei.ac(e, "ks.vi(" + ')');
        }
    }

    mh zc() {
        return new mh(2109968339 * this.pg, this.pu * -1718078503);
    }

    mh zd() {
        return new mh(990780619 * this.pg, this.pu * -1949467823);
    }

    mh zr() {
        return new mh(-1563813905 * this.pg, this.pu * -1477882710);
    }

    mh zu() {
        return new mh(2109968339 * this.pg, this.pu * -1718078503);
    }

    mh zx() {
        return new mh(2109968339 * this.pg, this.pu * -1718078503);
    }

    protected final boolean vt(byte b) {
        return false;
    }

    protected final boolean zb() {
        return false;
    }

    protected final boolean zj() {
        return false;
    }

    protected final boolean zo() {
        return false;
    }

    protected final boolean zv() {
        return false;
    }
}
