package defpackage;

import com.jagex.oldscape.osrenderer.aj;
import com.jagex.oldscape.osrenderer.zv;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.SynchronousQueue;

public class bn implements Runnable {
    public static bn aj = null;
    Object aa;
    volatile boolean ac;
    int[][] ae;
    SynchronousQueue ah;
    int ai;
    boolean ak;
    int[] al;
    int[] am;
    volatile boolean an;
    public long ao;
    kp aq;
    int[] as;
    LinkedList at;
    int aw;
    kp az;

    public bn() {
        try {
            this.ac = true;
            this.an = true;
            this.aq = new kp(250);
            this.ak = false;
            this.at = new LinkedList();
            this.ah = new SynchronousQueue();
            this.az = new kp(250);
            aj.aj((byte) 8);
            aj(981692627);
        } catch (Throwable e) {
            throw ei.ac(e, "bn.<init>(" + ')');
        }
    }

    final void af() {
        ac(0.8f, (short) -24320);
    }

    final void aj(int i) {
        try {
            ac(0.8f, (short) -21592);
        } catch (Throwable e) {
            throw ei.ac(e, "bn.aj(" + ')');
        }
    }

    final void au() {
        ac(0.8f, (short) -24936);
    }

    final void av() {
        ac(0.8f, (short) -24280);
    }

    static long aj(byte b) {
        try {
            URLConnection openConnection = new URL(dl.fu("services", false, -402958644) + "m=accountappeal/login.ws").openConnection();
            openConnection.setRequestProperty("connection", "close");
            openConnection.setDoInput(true);
            openConnection.setDoOutput(true);
            openConnection.setConnectTimeout(5000);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openConnection.getOutputStream());
            outputStreamWriter.write("data1=req");
            outputStreamWriter.flush();
            InputStream inputStream = openConnection.getInputStream();
            he heVar = new he(new byte[1000]);
            do {
                int read = inputStream.read(heVar.aj, heVar.ac * 489625177, 1000 - (heVar.ac * 489625177));
                if (-1 == read) {
                    heVar.ac = 0;
                    return heVar.ab((byte) 36);
                }
                heVar.ac = (read * -984165911) + heVar.ac;
            } while (heVar.ac * 489625177 < 1000);
            return 0;
        } catch (Exception e) {
            return 0;
        } catch (Throwable e2) {
            throw ei.ac(e2, "bn.aj(" + ')');
        }
    }

    public static ax aj(int i, byte b) {
        try {
            ax axVar = (ax) ax.aq.aj((long) i);
            if (axVar == null) {
                byte[] an = ax.aj.an(12, i, -652320319);
                axVar = new ax();
                if (an != null) {
                    axVar.ac(new he(an), (byte) 85);
                }
                axVar.aq(-1912622330);
                ax.aq.an(axVar, (long) i);
            }
            return axVar;
        } catch (Throwable e) {
            throw ei.ac(e, "bn.aj(" + ')');
        }
    }

    void ac(float f, short s) {
        try {
            md.bb(0.800000011920929d, 0, cj.at, 967549589);
            this.am = Arrays.copyOf(bl.am, bl.am.length);
        } catch (Throwable e) {
            throw ei.ac(e, "bn.ac(" + ')');
        }
    }

    void ag(float f) {
        md.bb(0.800000011920929d, 0, cj.at, 967549589);
        this.am = Arrays.copyOf(bl.am, bl.am.length);
    }

    void ar(float f) {
        md.bb(0.800000011920929d, 0, cj.at, 967549589);
        this.am = Arrays.copyOf(bl.am, bl.am.length);
    }

    void ay(float f) {
        md.bb(0.800000011920929d, 0, cj.at, 967549589);
        this.am = Arrays.copyOf(bl.am, bl.am.length);
    }

    public final void ab() {
        aj.ac(null, -306330779);
        zv.pn();
        this.ak = true;
    }

    public final void ad() {
        aj.ac(null, 1401403697);
        zv.pn();
        this.ak = true;
    }

    public final void an(byte b) {
        try {
            aj.ac(null, 1225385887);
            zv.pn();
            this.ak = true;
        } catch (Throwable e) {
            throw ei.ac(e, "bn.an(" + ')');
        }
    }

    public final void bh() {
        aj.ac(null, 196064023);
        zv.pn();
        this.ak = true;
    }

    public final void bm() {
        aj.ac(null, -449632325);
        zv.pn();
        this.ak = true;
    }

    public final void bp() {
        aj.ac(null, -770437674);
        zv.pn();
        this.ak = true;
    }

    synchronized boolean aq(ca caVar, int i) {
        boolean z;
        try {
            this.ae = caVar.ac(-1531850133);
            if (this.ae == null) {
                z = false;
            } else {
                this.as = new int[this.ae.length];
                this.al = new int[this.ae.length];
                z = true;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "bn.aq(" + ')');
        }
        return z;
    }

    synchronized boolean bb(ca caVar) {
        boolean z;
        this.ae = caVar.ac(-1531850133);
        if (this.ae == null) {
            z = false;
        } else {
            this.as = new int[this.ae.length];
            this.al = new int[this.ae.length];
            z = true;
        }
        return z;
    }

    synchronized boolean br(ca caVar) {
        boolean z;
        this.ae = caVar.ac(-1531850133);
        if (this.ae == null) {
            z = false;
        } else {
            this.as = new int[this.ae.length];
            this.al = new int[this.ae.length];
            z = true;
        }
        return z;
    }

    synchronized boolean bt(ca caVar) {
        boolean z;
        this.ae = caVar.ac(-1531850133);
        if (this.ae == null) {
            z = false;
        } else {
            this.as = new int[this.ae.length];
            this.al = new int[this.ae.length];
            z = true;
        }
        return z;
    }

    synchronized boolean bu(ca caVar) {
        boolean z;
        this.ae = caVar.ac(-1531850133);
        if (this.ae == null) {
            z = false;
        } else {
            this.as = new int[this.ae.length];
            this.al = new int[this.ae.length];
            z = true;
        }
        return z;
    }

    void ao(ca caVar, int i) {
        try {
            if (this.as != null) {
                int ak = caVar.ak(1768419858);
                for (int i2 = 0; i2 < ak; i2++) {
                    cp aj = caVar.aj(i2, -552947870);
                    if (aj != null) {
                        this.as[i2] = aj.am / 2;
                        this.al[i2] = aj.ae / 2;
                    }
                }
                zv.nb(ak, this.as, this.al);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "bn.ao(" + ')');
        }
    }

    void bd(ca caVar) {
        if (this.as != null) {
            int ak = caVar.ak(2029496886);
            for (int i = 0; i < ak; i++) {
                cp aj = caVar.aj(i, -552947870);
                if (aj != null) {
                    this.as[i] = aj.am / 2;
                    this.al[i] = aj.ae / 2;
                }
            }
            zv.nb(ak, this.as, this.al);
        }
    }

    void bx(ca caVar) {
        if (this.as != null) {
            int ak = caVar.ak(-1147237623);
            for (int i = 0; i < ak; i++) {
                cp aj = caVar.aj(i, -552947870);
                if (aj != null) {
                    this.as[i] = aj.am / 2;
                    this.al[i] = aj.ae / 2;
                }
            }
            zv.nb(ak, this.as, this.al);
        }
    }

    void by(ca caVar) {
        if (this.as != null) {
            int ak = caVar.ak(1052952970);
            for (int i = 0; i < ak; i++) {
                cp aj = caVar.aj(i, -552947870);
                if (aj != null) {
                    this.as[i] = aj.am / 2;
                    this.al[i] = aj.ae / 2;
                }
            }
            zv.nb(ak, this.as, this.al);
        }
    }

    public static void aj(ju juVar, ju juVar2, boolean z, int i) {
        try {
            ah.ac = juVar;
            ah.an = juVar2;
            ah.aj = z;
        } catch (Throwable e) {
            throw ei.ac(e, "bn.aj(" + ')');
        }
    }

    public bo aa(int i) {
        try {
            return (bo) this.at.removeFirst();
        } catch (Throwable e) {
            throw ei.ac(e, "bn.aa(" + ')');
        }
    }

    public bo bi() {
        return (bo) this.at.removeFirst();
    }

    public bo bo() {
        return (bo) this.at.removeFirst();
    }

    public bo bq() {
        return (bo) this.at.removeFirst();
    }

    public bo bs() {
        return (bo) this.at.removeFirst();
    }

    public bo bz() {
        return (bo) this.at.removeFirst();
    }

    public final synchronized void ak(int i, int i2, byte b) {
        try {
            this.ai = -1350539409 * i;
            this.aw = 1968601841 * i2;
            ap(i, i2, -1762549285);
        } catch (Throwable e) {
            throw ei.ac(e, "bn.ak(" + ')');
        }
    }

    public final synchronized void ba(int i, int i2) {
        this.ai = 500614214 * i;
        this.aw = 1968601841 * i2;
        ap(i, i2, -1761422851);
    }

    public final synchronized void bj(int i, int i2) {
        this.ai = 896245696 * i;
        this.aw = -115770944 * i2;
        ap(i, i2, -1879606985);
    }

    final synchronized void ap(int i, int i2, int i3) {
        try {
            this.at.clear();
            for (int i4 = 0; i4 < 2; i4++) {
                this.at.add(new bo(i, i2));
            }
        } catch (Throwable e) {
            throw ei.ac(e, "bn.ap(" + ')');
        }
    }

    final synchronized void be(int i, int i2) {
        this.at.clear();
        for (int i3 = 0; i3 < 2; i3++) {
            this.at.add(new bo(i, i2));
        }
    }

    final synchronized void bv(int i, int i2) {
        this.at.clear();
        for (int i3 = 0; i3 < 2; i3++) {
            this.at.add(new bo(i, i2));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.bo at(defpackage.bo r5, int r6) {
        /*
        r4 = this;
    L_0x0000:
        r0 = r4.az;	 Catch:{ InterruptedException -> 0x0038, RuntimeException -> 0x001b }
        r1 = -1817808289; // 0xffffffff93a6725f float:-4.201707E-27 double:NaN;
        r1 = r5.ao(r1);	 Catch:{ InterruptedException -> 0x0038, RuntimeException -> 0x001b }
        r2 = (long) r1;	 Catch:{ InterruptedException -> 0x0038, RuntimeException -> 0x001b }
        r0.aj(r2);	 Catch:{ InterruptedException -> 0x0038, RuntimeException -> 0x001b }
        r0 = r4.ah;	 Catch:{ InterruptedException -> 0x0038, RuntimeException -> 0x001b }
        r0.put(r5);	 Catch:{ InterruptedException -> 0x0038, RuntimeException -> 0x001b }
    L_0x0012:
        r0 = r4.ah;	 Catch:{ InterruptedException -> 0x0036, RuntimeException -> 0x001b }
        r0 = r0.take();	 Catch:{ InterruptedException -> 0x0036, RuntimeException -> 0x001b }
        r0 = (defpackage.bo) r0;	 Catch:{ InterruptedException -> 0x0036, RuntimeException -> 0x001b }
        return r0;
    L_0x001b:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "bn.at(";
        r1 = r1.append(r2);
        r2 = 41;
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0 = defpackage.ei.ac(r0, r1);
        throw r0;
    L_0x0036:
        r0 = move-exception;
        goto L_0x0012;
    L_0x0038:
        r0 = move-exception;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: bn.at(bo, int):bo");
    }

    public final bo bc(bo boVar) {
        while (true) {
            try {
                this.az.aj((long) boVar.ao(-1856446439));
                this.ah.put(boVar);
                break;
            } catch (InterruptedException e) {
            }
        }
        return (bo) this.ah.take();
        while (true) {
            try {
                break;
            } catch (InterruptedException e2) {
            }
        }
        return (bo) this.ah.take();
    }

    public final bo bg(bo boVar) {
        while (true) {
            try {
                this.az.aj((long) boVar.ao(-2109346871));
                this.ah.put(boVar);
                break;
            } catch (InterruptedException e) {
            }
        }
        return (bo) this.ah.take();
        while (true) {
            try {
                break;
            } catch (InterruptedException e2) {
            }
        }
        return (bo) this.ah.take();
    }

    public final bo bn(bo boVar) {
        while (true) {
            try {
                this.az.aj((long) boVar.ao(-1940046343));
                this.ah.put(boVar);
                break;
            } catch (InterruptedException e) {
            }
        }
        return (bo) this.ah.take();
        while (true) {
            try {
                break;
            } catch (InterruptedException e2) {
            }
        }
        return (bo) this.ah.take();
    }

    public final bo bw(bo boVar) {
        while (true) {
            try {
                this.az.aj((long) boVar.ao(-2123783283));
                this.ah.put(boVar);
                break;
            } catch (InterruptedException e) {
            }
        }
        return (bo) this.ah.take();
        while (true) {
            try {
                break;
            } catch (InterruptedException e2) {
            }
        }
        return (bo) this.ah.take();
    }

    final void ah(bo boVar, int i) {
        try {
            if (boVar.aj * -1894589259 == 1914230671 * this.ai && -293390831 * this.aw == boVar.ac * 1647911921 && this.at.size() < 2) {
                this.at.add(boVar);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "bn.ah(" + ')');
        }
    }

    final void bf(bo boVar) {
        if (boVar.aj * -1894589259 == 8180135 * this.ai && 1182409239 * this.aw == boVar.ac * 1647911921 && this.at.size() < 2) {
            this.at.add(boVar);
        }
    }

    final void bk(bo boVar) {
        if (boVar.aj * -1894589259 != 1480898595 * this.ai || -293390831 * this.aw != boVar.ac * 1647911921) {
            return;
        }
        if (this.at.size() < 2) {
            this.at.add(boVar);
        }
    }

    final void bl(bo boVar) {
        if (boVar.aj * 907295298 != 1546231161 * this.ai || -1208317891 * this.aw != boVar.ac * 1647911921) {
            return;
        }
        if (this.at.size() < 2) {
            this.at.add(boVar);
        }
    }

    final synchronized Object ai(byte b) {
        Object obj = null;
        synchronized (this) {
            try {
                if (this.aa != null) {
                    obj = this.aa;
                    this.aa = null;
                }
            } catch (Throwable e) {
                throw ei.ac(e, "bn.ai(" + ')');
            }
        }
        return obj;
    }

    final synchronized Object cb() {
        Object obj = null;
        synchronized (this) {
            if (this.aa != null) {
                obj = this.aa;
                this.aa = null;
            }
        }
        return obj;
    }

    final synchronized Object cl() {
        Object obj = null;
        synchronized (this) {
            if (this.aa != null) {
                obj = this.aa;
                this.aa = null;
            }
        }
        return obj;
    }

    final synchronized Object cy() {
        Object obj = null;
        synchronized (this) {
            if (this.aa != null) {
                obj = this.aa;
                this.aa = null;
            }
        }
        return obj;
    }

    final bo aw(int i) {
        while (true) {
            try {
                return (bo) this.ah.take();
            } catch (InterruptedException e) {
            } catch (Throwable e2) {
                throw ei.ac(e2, "bn.aw(" + ')');
            }
        }
    }

    final bo cc() {
        while (true) {
            try {
                break;
            } catch (InterruptedException e) {
            }
        }
        return (bo) this.ah.take();
    }

    final bo cf() {
        while (true) {
            try {
                break;
            } catch (InterruptedException e) {
            }
        }
        return (bo) this.ah.take();
    }

    final bo co() {
        while (true) {
            try {
                break;
            } catch (InterruptedException e) {
            }
        }
        return (bo) this.ah.take();
    }

    final void am(byte b) {
        while (true) {
            try {
                this.ah.put(this.at.removeFirst());
                return;
            } catch (InterruptedException e) {
            } catch (Throwable e2) {
                throw ei.ac(e2, "bn.am(" + ')');
            }
        }
    }

    final void ca() {
        while (true) {
            try {
                this.ah.put(this.at.removeFirst());
                break;
            } catch (InterruptedException e) {
            }
        }
    }

    final void cp() {
        while (true) {
            try {
                this.ah.put(this.at.removeFirst());
                break;
            } catch (InterruptedException e) {
            }
        }
    }

    final void cr() {
        while (true) {
            try {
                this.ah.put(this.at.removeFirst());
                break;
            } catch (InterruptedException e) {
            }
        }
    }

    final void ct() {
        while (true) {
            try {
                this.ah.put(this.at.removeFirst());
                break;
            } catch (InterruptedException e) {
            }
        }
    }

    final void ae(int i) {
        try {
            bo aw = aw(1808503858);
            if (aw != null) {
                System.nanoTime();
                aw.an(2139260512);
                am((byte) -1);
                aw.aq(this.an, 1935165422);
                ah(aw, 897852738);
                this.aq.aj(aw.ah * -331811563745535343L);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "bn.ae(" + ')');
        }
    }

    final void cm() {
        bo aw = aw(1023632195);
        if (aw != null) {
            System.nanoTime();
            aw.an(2146705962);
            am((byte) -1);
            aw.aq(this.an, -402525106);
            ah(aw, -767411702);
            this.aq.aj(aw.ah * -331811563745535343L);
        }
    }

    final void ce() {
        int[][] iArr = (int[][]) null;
        synchronized (this) {
            int[] iArr2 = this.am;
            this.am = null;
            int[][] iArr3 = this.ae;
            this.ae = (int[][]) null;
        }
        if (iArr2 != null) {
            zv.jn(iArr2);
        }
        if (iArr3 != null) {
            for (int i = 0; i < iArr3.length; i++) {
                if (iArr3[i] != null) {
                    aj.ak(i, iArr3[i], -423748696);
                }
            }
        }
    }

    final void ck() {
        int[][] iArr = (int[][]) null;
        synchronized (this) {
            int[] iArr2 = this.am;
            this.am = null;
            int[][] iArr3 = this.ae;
            this.ae = (int[][]) null;
        }
        if (iArr2 != null) {
            zv.jn(iArr2);
        }
        if (iArr3 != null) {
            for (int i = 0; i < iArr3.length; i++) {
                if (iArr3[i] != null) {
                    aj.ak(i, iArr3[i], -1714703167);
                }
            }
        }
    }

    final void as(byte b) {
        try {
            int[] iArr;
            int[][] iArr2;
            int[][] iArr3 = (int[][]) null;
            synchronized (this) {
                iArr = this.am;
                this.am = null;
                iArr2 = this.ae;
                this.ae = (int[][]) null;
            }
            if (iArr != null) {
                zv.jn(iArr);
            }
            if (iArr2 != null) {
                for (int i = 0; i < iArr2.length; i++) {
                    if (iArr2[i] != null) {
                        aj.ak(i, iArr2[i], -82965168);
                    }
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "bn.as(" + ')');
        }
    }

    final void al(int i) {
        try {
            Object ai = ai((byte) 124);
            if (ai != null) {
                if (this.ak) {
                    aj.aq((byte) 33);
                    this.ak = false;
                } else {
                    aj.ac(ai, -892190664);
                    this.ak = true;
                }
            }
            if (this.ak) {
                as((byte) -108);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "bn.al(" + ')');
        }
    }

    final void ch() {
        Object ai = ai((byte) 125);
        if (ai != null) {
            if (this.ak) {
                aj.aq((byte) -42);
                this.ak = false;
            } else {
                aj.ac(ai, 1017382259);
                this.ak = true;
            }
        }
        if (this.ak) {
            as((byte) 95);
        }
    }

    final void ci() {
        Object ai = ai((byte) 108);
        if (ai != null) {
            if (this.ak) {
                aj.aq((byte) -16);
                this.ak = false;
            } else {
                aj.ac(ai, -1964352158);
                this.ak = true;
            }
        }
        if (this.ak) {
            as((byte) -78);
        }
    }

    static final int ba(int i, int i2, int i3, int i4, byte b) {
        return ((i3 * i) - (i2 * i4)) >> 16;
    }

    public void az(boolean z, int i) {
        try {
            this.an = z;
        } catch (Throwable e) {
            throw ei.ac(e, "bn.az(" + ')');
        }
    }

    public void cq(boolean z) {
        this.an = z;
    }

    public final void ax(int i) {
        try {
            al(1796068675);
            if (this.ak) {
                ae(1965176868);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "bn.ax(" + ')');
        }
    }

    public final void cg() {
        al(1796068675);
        if (this.ak) {
            ae(1799056438);
        }
    }

    public final void cu() {
        al(1796068675);
        if (this.ak) {
            ae(2084667437);
        }
    }

    public final void cv() {
        al(1796068675);
        if (this.ak) {
            ae(1867293427);
        }
    }

    public void cs() {
        while (this.ac) {
            ax(1174554319);
        }
    }

    public void run() {
        while (this.ac) {
            try {
                ax(1512437055);
            } catch (Throwable e) {
                throw ei.ac(e, "bn.run(" + ')');
            }
        }
    }

    static final void ee(ab abVar, int i, int i2, byte b) {
        try {
            if (client.ir == null && !dj.hs.bn(-1420876204) && abVar != null) {
                if (bb.eo(abVar, (byte) 49) != null) {
                    bu.au.af(fz.aa, (byte) -61);
                    client.ir = abVar;
                    client.ip = bb.eo(abVar, (byte) -79);
                    client.ii = -1530119503 * i;
                    client.ij = 1830858093 * i2;
                    ha.jn = 0;
                    client.ju = false;
                }
            }
        } catch (Throwable e) {
            throw ei.ac(e, "bn.ee(" + ')');
        }
    }
}
