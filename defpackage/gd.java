package defpackage;

import java.io.File;

public class gd extends jt {
    static boolean bs = false;
    static final int bu = 34;
    public int aa;
    boolean ac;
    public String ah;
    int ai;
    public Object[] aj;
    ab ak;
    public ab an;
    int ao;
    int ap;
    int aq;
    int at;
    ar aw = ar.ah;

    static void aj(File file, int i) {
        try {
            lu.ac = file;
            if (lu.ac.exists()) {
                lu.aj = true;
                return;
            }
            throw new RuntimeException("");
        } catch (Throwable e) {
            throw ei.ac(e, "gd.aj(" + ')');
        }
    }

    public void aj(Object[] objArr, int i) {
        try {
            this.aj = objArr;
        } catch (Throwable e) {
            throw ei.ac(e, "gd.aj(" + ')');
        }
    }

    public void aa(ar arVar) {
        this.aw = arVar;
    }

    public void ac(ar arVar, int i) {
        try {
            this.aw = arVar;
        } catch (Throwable e) {
            throw ei.ac(e, "gd.ac(" + ')');
        }
    }

    public void ak(ar arVar) {
        this.aw = arVar;
    }

    public void an(ar arVar) {
        this.aw = arVar;
    }

    public void ao(ar arVar) {
        this.aw = arVar;
    }

    public void aq(ar arVar) {
        this.aw = arVar;
    }

    static void an(int i, String str, String str2, String str3, int i2) {
        try {
            gj gjVar = (gj) gt.aj.get(Integer.valueOf(i));
            if (gjVar == null) {
                gjVar = new gj();
                gt.aj.put(Integer.valueOf(i), gjVar);
            }
            jt aj = gjVar.aj(i, str, str2, str3, -2061868339);
            gt.ac.ac(aj, (long) (-894271997 * aj.aj));
            gt.an.ac(aj);
            client.ja = 2087498771 * client.jf;
        } catch (Throwable e) {
            throw ei.ac(e, "gd.an(" + ')');
        }
    }
}
