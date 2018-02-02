package defpackage;

import java.util.Comparator;

/* compiled from: nc */
final class nj implements Comparator {
    static final int bb = 5;
    static final int bq = 0;

    nj() {
    }

    int ac(ml mlVar, ml mlVar2) {
        if (mlVar.ac * 5760870169085771817L < mlVar2.ac * 5760870169085771817L) {
            return -1;
        }
        return mlVar.ac * 5760870169085771817L == mlVar2.ac * 5760870169085771817L ? 0 : 1;
    }

    int aj(ml mlVar, ml mlVar2, int i) {
        try {
            if (mlVar.ac * 5760870169085771817L < mlVar2.ac * 5760870169085771817L) {
                return -1;
            }
            return mlVar.ac * 5760870169085771817L == mlVar2.ac * 5760870169085771817L ? 0 : 1;
        } catch (Throwable e) {
            throw ei.ac(e, "nj.aj(" + ')');
        }
    }

    public int aa(Object obj, Object obj2) {
        return aj((ml) obj, (ml) obj2, -802221912);
    }

    public int ak(Object obj, Object obj2) {
        return aj((ml) obj, (ml) obj2, -2138864776);
    }

    public int ao(Object obj, Object obj2) {
        return aj((ml) obj, (ml) obj2, -1642466933);
    }

    public int compare(Object obj, Object obj2) {
        try {
            return aj((ml) obj, (ml) obj2, -1119452503);
        } catch (Throwable e) {
            throw ei.ac(e, "nj.compare(" + ')');
        }
    }

    public boolean db(Object obj) {
        return super.equals(obj);
    }

    public boolean dh(Object obj) {
        return super.equals(obj);
    }

    public boolean dk(Object obj) {
        return super.equals(obj);
    }

    public boolean dl(Object obj) {
        return super.equals(obj);
    }

    public boolean equals(Object obj) {
        try {
            return super.equals(obj);
        } catch (Throwable e) {
            throw ei.ac(e, "nj.equals(" + ')');
        }
    }
}
