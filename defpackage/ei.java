package defpackage;

public class ei {
    static final ei ac = new ei(1);
    static final ei aj = new ei(0);
    static final int am = 2;
    static final int ar = 25;
    public static final int as = 19;
    final int an;

    ei(int i) {
        try {
            this.an = 311800377 * i;
        } catch (Throwable e) {
            throw ei.ac(e, "ei.<init>(" + ')');
        }
    }

    public static li ac(Throwable th, String str) {
        try {
            if (!(th instanceof li)) {
                return new li(th, str);
            }
            li liVar = (li) th;
            liVar.aq += ' ' + str;
            return liVar;
        } catch (Throwable e) {
            throw ei.ac(e, "ei.ac(" + ')');
        }
    }

    public static boolean aw(ju juVar, int i, int i2, int i3) {
        try {
            byte[] an = juVar.an(i, i2, -623555972);
            if (an == null) {
                return false;
            }
            dv.ae(an, 325737890);
            return true;
        } catch (Throwable e) {
            throw ei.ac(e, "ei.aw(" + ')');
        }
    }
}
