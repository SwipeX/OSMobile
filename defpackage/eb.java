package defpackage;

import java.util.Arrays;
import java.util.HashMap;

public abstract class eb {
    int ac;
    final int aj;
    ey[] an;
    HashMap ao;
    HashMap aq;

    abstract ey au(byte b);

    abstract ey[] av(int i, byte b);

    abstract ey cq();

    abstract ey[] cu(int i);

    abstract ey[] cv(int i);

    public static byte aj(char c, int i) {
        if ((c > '\u0000' && c < '') || (c >= ' ' && c <= 'ÿ')) {
            return (byte) c;
        }
        if ('€' == c) {
            return Byte.MIN_VALUE;
        }
        if ('‚' == c) {
            return (byte) -126;
        }
        if ('ƒ' == c) {
            return (byte) -125;
        }
        if ('„' == c) {
            return (byte) -124;
        }
        if (c == '…') {
            return (byte) -123;
        }
        if ('†' == c) {
            return (byte) -122;
        }
        if ('‡' == c) {
            return (byte) -121;
        }
        if (c == 'ˆ') {
            return (byte) -120;
        }
        if (c == '‰') {
            return (byte) -119;
        }
        if ('Š' == c) {
            return (byte) -118;
        }
        if (c == '‹') {
            return (byte) -117;
        }
        if ('Œ' == c) {
            return (byte) -116;
        }
        if ('Ž' == c) {
            return (byte) -114;
        }
        if ('‘' == c) {
            return (byte) -111;
        }
        if (c == '’') {
            return (byte) -110;
        }
        if ('“' == c) {
            return (byte) -109;
        }
        if ('”' == c) {
            return (byte) -108;
        }
        if (c == '•') {
            return (byte) -107;
        }
        if (c == '–') {
            return (byte) -106;
        }
        if (c == '—') {
            return (byte) -105;
        }
        if ('˜' == c) {
            return (byte) -104;
        }
        if (c == '™') {
            return (byte) -103;
        }
        if (c == 'š') {
            return (byte) -102;
        }
        if (c == '›') {
            return (byte) -101;
        }
        if ('œ' == c) {
            return (byte) -100;
        }
        if ('ž' == c) {
            return (byte) -98;
        }
        if ('Ÿ' == c) {
            return (byte) -97;
        }
        return (byte) 63;
    }

    eb(int i) {
        try {
            this.ac = 0;
            this.aj = -2091220403 * i;
            this.an = av(i, (byte) 32);
            this.aq = new HashMap(i / 8);
            this.ao = new HashMap(i / 8);
        } catch (Throwable e) {
            throw ei.ac(e, "eb.<init>(" + ')');
        }
    }

    public static final int aj(ma maVar, int i) {
        if (maVar == null) {
            return 12;
        }
        try {
            switch (maVar.ah * 1759577167) {
                case 2:
                    return 20;
                default:
                    return 12;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "eb.aj(" + ')');
        }
    }

    public void ad() {
        this.ac = 0;
        Arrays.fill(this.an, null);
        this.aq.clear();
        this.ao.clear();
    }

    public void ag() {
        this.ac = 0;
        Arrays.fill(this.an, null);
        this.aq.clear();
        this.ao.clear();
    }

    public void aj(int i) {
        try {
            this.ac = 0;
            Arrays.fill(this.an, null);
            this.aq.clear();
            this.ao.clear();
        } catch (Throwable e) {
            throw ei.ac(e, "eb.aj(" + ')');
        }
    }

    public void ar() {
        this.ac = 0;
        Arrays.fill(this.an, null);
        this.aq.clear();
        this.ao.clear();
    }

    public void ay() {
        this.ac = 0;
        Arrays.fill(this.an, null);
        this.aq.clear();
        this.ao.clear();
    }

    public int ab() {
        return 155134643 * this.ac;
    }

    public int ac(byte b) {
        try {
            return 155134643 * this.ac;
        } catch (Throwable e) {
            throw ei.ac(e, "eb.ac(" + ')');
        }
    }

    public int bh() {
        return -682134480 * this.ac;
    }

    public int bm() {
        return 155134643 * this.ac;
    }

    public int bp() {
        return 155134643 * this.ac;
    }

    public int bt() {
        return 155134643 * this.ac;
    }

    public boolean an(int i) {
        try {
            return 1876854405 * this.aj == this.ac * 155134643;
        } catch (Throwable e) {
            throw ei.ac(e, "eb.an(" + ')');
        }
    }

    public boolean br() {
        return 1876854405 * this.aj == this.ac * 155134643;
    }

    public boolean aq(ez ezVar, short s) {
        try {
            if (ezVar.ac((byte) 61)) {
                return this.aq.containsKey(ezVar) ? true : this.ao.containsKey(ezVar);
            } else {
                return false;
            }
        } catch (Throwable e) {
            throw ei.ac(e, "eb.aq(" + ')');
        }
    }

    public boolean bb(ez ezVar) {
        if (ezVar.ac((byte) 37)) {
            return this.aq.containsKey(ezVar) ? true : this.ao.containsKey(ezVar);
        } else {
            return false;
        }
    }

    ey ao(ez ezVar, byte b) {
        try {
            ey aa = aa(ezVar, -1922523545);
            if (aa == null) {
                aa = ak(ezVar, 863222911);
            }
            return aa;
        } catch (Throwable e) {
            throw ei.ac(e, "eb.ao(" + ')');
        }
    }

    ey bd(ez ezVar) {
        ey aa = aa(ezVar, -2146186865);
        return aa != null ? aa : ak(ezVar, -996574317);
    }

    ey bu(ez ezVar) {
        ey aa = aa(ezVar, -2087926361);
        return aa != null ? aa : ak(ezVar, -885219907);
    }

    ey bx(ez ezVar) {
        ey aa = aa(ezVar, -1777696039);
        return aa != null ? aa : ak(ezVar, -551613422);
    }

    ey by(ez ezVar) {
        ey aa = aa(ezVar, -1911616125);
        return aa != null ? aa : ak(ezVar, 226888023);
    }

    ey aa(ez ezVar, int i) {
        try {
            return !ezVar.ac((byte) 86) ? null : (ey) this.aq.get(ezVar);
        } catch (Throwable e) {
            throw ei.ac(e, "eb.aa(" + ')');
        }
    }

    ey bi(ez ezVar) {
        return !ezVar.ac((byte) 101) ? null : (ey) this.aq.get(ezVar);
    }

    ey bs(ez ezVar) {
        if (ezVar.ac((byte) 112)) {
            return (ey) this.aq.get(ezVar);
        }
        return null;
    }

    ey ak(ez ezVar, int i) {
        try {
            return !ezVar.ac((byte) 46) ? null : (ey) this.ao.get(ezVar);
        } catch (Throwable e) {
            throw ei.ac(e, "eb.ak(" + ')');
        }
    }

    ey bo(ez ezVar) {
        if (ezVar.ac((byte) 93)) {
            return (ey) this.ao.get(ezVar);
        }
        return null;
    }

    ey bz(ez ezVar) {
        return !ezVar.ac((byte) 114) ? null : (ey) this.ao.get(ezVar);
    }

    public final boolean ap(ez ezVar, int i) {
        try {
            ey aa = aa(ezVar, -1906570529);
            if (aa == null) {
                return false;
            }
            at(aa, 1624490097);
            return true;
        } catch (Throwable e) {
            throw ei.ac(e, "eb.ap(" + ')');
        }
    }

    final void at(ey eyVar, int i) {
        try {
            int as = as(eyVar, (byte) -1);
            if (as != -1) {
                af(as, -2119344314);
                al(eyVar, -2116668415);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "eb.at(" + ')');
        }
    }

    final void bj(ey eyVar) {
        int as = as(eyVar, (byte) -1);
        if (as != -1) {
            af(as, -469442222);
            al(eyVar, 428754700);
        }
    }

    final void bq(ey eyVar) {
        int as = as(eyVar, (byte) -1);
        if (as != -1) {
            af(as, -953086594);
            al(eyVar, 241563247);
        }
    }

    ey ah(ez ezVar, int i) {
        try {
            return ai(ezVar, null, (byte) 97);
        } catch (Throwable e) {
            throw ei.ac(e, "eb.ah(" + ')');
        }
    }

    ey ba(ez ezVar) {
        return ai(ezVar, null, (byte) 113);
    }

    ey bv(ez ezVar) {
        return ai(ezVar, null, (byte) 59);
    }

    ey ai(ez ezVar, ez ezVar2, byte b) {
        try {
            if (ao(ezVar, (byte) -59) != null) {
                throw new IllegalStateException();
            }
            ey au = au((byte) 1);
            au.aq(ezVar, ezVar2, (byte) -89);
            az(au, -1433068819);
            ax(au, (byte) -45);
            return au;
        } catch (Throwable e) {
            throw ei.ac(e, "eb.ai(" + ')');
        }
    }

    ey be(ez ezVar, ez ezVar2) {
        if (ao(ezVar, (byte) -64) != null) {
            throw new IllegalStateException();
        }
        ey au = au((byte) 1);
        au.aq(ezVar, ezVar2, (byte) -97);
        az(au, -2068190500);
        ax(au, (byte) -96);
        return au;
    }

    ey bw(ez ezVar, ez ezVar2) {
        if (ao(ezVar, (byte) 2) != null) {
            throw new IllegalStateException();
        }
        ey au = au((byte) 1);
        au.aq(ezVar, ezVar2, (byte) -7);
        az(au, -1951121957);
        ax(au, (byte) -42);
        return au;
    }

    public final ey aw(int i, int i2) {
        if (i >= 0) {
            try {
                if (i < 155134643 * this.ac) {
                    return this.an[i];
                }
            } catch (Throwable e) {
                throw ei.ac(e, "eb.aw(" + ')');
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final ey bg(int i) {
        if (i >= 0 && i < -949452015 * this.ac) {
            return this.an[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final ey bn(int i) {
        if (i >= 0 && i < 155134643 * this.ac) {
            return this.an[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void am(byte b) {
        try {
            Arrays.sort(this.an, 0, 155134643 * this.ac);
        } catch (Throwable e) {
            throw ei.ac(e, "eb.am(" + ')');
        }
    }

    public final void bc() {
        Arrays.sort(this.an, 0, -879304034 * this.ac);
    }

    public final void bf() {
        Arrays.sort(this.an, 0, 972368259 * this.ac);
    }

    public final void bk() {
        Arrays.sort(this.an, 0, 155134643 * this.ac);
    }

    final void ae(ey eyVar, ez ezVar, ez ezVar2, byte b) {
        try {
            al(eyVar, -913846622);
            eyVar.aq(ezVar, ezVar2, (byte) -87);
            ax(eyVar, (byte) -111);
        } catch (Throwable e) {
            throw ei.ac(e, "eb.ae(" + ')');
        }
    }

    final void bl(ey eyVar, ez ezVar, ez ezVar2) {
        al(eyVar, -1261409754);
        eyVar.aq(ezVar, ezVar2, (byte) -115);
        ax(eyVar, (byte) -90);
    }

    final void cb(ey eyVar, ez ezVar, ez ezVar2) {
        al(eyVar, -184345642);
        eyVar.aq(ezVar, ezVar2, (byte) -100);
        ax(eyVar, (byte) 63);
    }

    final int as(ey eyVar, byte b) {
        int i = 0;
        while (i < this.ac * 155134643) {
            try {
                if (eyVar == this.an[i]) {
                    return i;
                }
                i++;
            } catch (Throwable e) {
                throw ei.ac(e, "eb.as(" + ')');
            }
        }
        return -1;
    }

    final int cl(ey eyVar) {
        for (int i = 0; i < this.ac * 155134643; i++) {
            if (eyVar == this.an[i]) {
                return i;
            }
        }
        return -1;
    }

    final int cy(ey eyVar) {
        for (int i = 0; i < this.ac * 155134643; i++) {
            if (eyVar == this.an[i]) {
                return i;
            }
        }
        return -1;
    }

    final void al(ey eyVar, int i) {
        try {
            if (this.aq.remove(eyVar.aj) == null) {
                throw new IllegalStateException();
            } else if (eyVar.ac != null) {
                this.ao.remove(eyVar.ac);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "eb.al(" + ')');
        }
    }

    final void ca(ey eyVar) {
        if (this.aq.remove(eyVar.aj) == null) {
            throw new IllegalStateException();
        } else if (eyVar.ac != null) {
            this.ao.remove(eyVar.ac);
        }
    }

    final void cc(ey eyVar) {
        if (this.aq.remove(eyVar.aj) == null) {
            throw new IllegalStateException();
        } else if (eyVar.ac != null) {
            this.ao.remove(eyVar.ac);
        }
    }

    final void cf(ey eyVar) {
        if (this.aq.remove(eyVar.aj) == null) {
            throw new IllegalStateException();
        } else if (eyVar.ac != null) {
            this.ao.remove(eyVar.ac);
        }
    }

    final void co(ey eyVar) {
        if (this.aq.remove(eyVar.aj) == null) {
            throw new IllegalStateException();
        } else if (eyVar.ac != null) {
            this.ao.remove(eyVar.ac);
        }
    }

    final void az(ey eyVar, int i) {
        try {
            ey[] eyVarArr = this.an;
            int i2 = this.ac - 1783786373;
            this.ac = i2;
            eyVarArr[(i2 * 155134643) - 1] = eyVar;
        } catch (Throwable e) {
            throw ei.ac(e, "eb.az(" + ')');
        }
    }

    final void cp(ey eyVar) {
        ey[] eyVarArr = this.an;
        int i = this.ac - 1783786373;
        this.ac = i;
        eyVarArr[(i * 155134643) - 1] = eyVar;
    }

    final void cr(ey eyVar) {
        ey[] eyVarArr = this.an;
        int i = this.ac - 918700771;
        this.ac = i;
        eyVarArr[(i * -1271428585) - 1] = eyVar;
    }

    final void ax(ey eyVar, byte b) {
        try {
            this.aq.put(eyVar.aj, eyVar);
            if (eyVar.ac != null) {
                this.ao.put(eyVar.ac, eyVar);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "eb.ax(" + ')');
        }
    }

    final void ce(ey eyVar) {
        this.aq.put(eyVar.aj, eyVar);
        if (eyVar.ac != null) {
            this.ao.put(eyVar.ac, eyVar);
        }
    }

    final void ck(ey eyVar) {
        this.aq.put(eyVar.aj, eyVar);
        if (eyVar.ac != null) {
            this.ao.put(eyVar.ac, eyVar);
        }
    }

    final void cm(ey eyVar) {
        this.aq.put(eyVar.aj, eyVar);
        if (eyVar.ac != null) {
            this.ao.put(eyVar.ac, eyVar);
        }
    }

    final void ct(ey eyVar) {
        this.aq.put(eyVar.aj, eyVar);
        if (eyVar.ac != null) {
            this.ao.put(eyVar.ac, eyVar);
        }
    }

    final void af(int i, int i2) {
        try {
            this.ac -= -1783786373;
            if (i < this.ac * 155134643) {
                System.arraycopy(this.an, i + 1, this.an, i, (this.ac * 155134643) - i);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "eb.af(" + ')');
        }
    }

    final void ch(int i) {
        this.ac -= -1783786373;
        if (i < -88859025 * this.ac) {
            System.arraycopy(this.an, i + 1, this.an, i, (155134643 * this.ac) - i);
        }
    }

    final void ci(int i) {
        this.ac -= -1783786373;
        if (i < this.ac * 155134643) {
            System.arraycopy(this.an, i + 1, this.an, i, (this.ac * 155134643) - i);
        }
    }

    public static Class an(String str, int i) throws ClassNotFoundException {
        try {
            if (str.equals("B")) {
                return Byte.TYPE;
            }
            if (str.equals("I")) {
                return Integer.TYPE;
            }
            if (str.equals("S")) {
                return Short.TYPE;
            }
            if (str.equals("J")) {
                return Long.TYPE;
            }
            if (str.equals("Z")) {
                return Boolean.TYPE;
            }
            if (str.equals("F")) {
                return Float.TYPE;
            }
            if (str.equals("D")) {
                return Double.TYPE;
            }
            if (str.equals("C")) {
                return Character.TYPE;
            }
            if (str.equals("void")) {
                return Void.TYPE;
            }
            return Class.forName(str);
        } catch (Throwable e) {
            throw ei.ac(e, "eb.an(" + ')');
        }
    }
}
