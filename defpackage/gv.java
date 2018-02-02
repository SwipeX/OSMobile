package defpackage;

import java.util.Comparator;

public class gv implements Comparator {
    boolean aj;

    public static void an(ju juVar, int i, int i2, int i3, boolean z, byte b) {
        try {
            mk.ao = 58044005;
            mk.aa = juVar;
            mk.ak = -254573345 * i;
            mk.ap = -479239551 * i2;
            mt.at = -1954082903 * i3;
            ho.ai = z;
            bp.ah = 517528176;
        } catch (Throwable e) {
            throw ei.ac(e, "gv.an(" + ')');
        }
    }

    static final short ak(int i, int i2) {
        try {
            return (short) (((i + 1) % 16) | (((i + 1) / 16) << 8));
        } catch (Throwable e) {
            throw ei.ac(e, "gv.ak(" + ')');
        }
    }

    static final int bv(int i, int i2, int i3, int i4, int i5) {
        return ((i3 * i2) + (i * i4)) >> 16;
    }

    gv() {
        try {
        } catch (Throwable e) {
            throw ei.ac(e, "gv.<init>(" + ')');
        }
    }

    int ac(ml mlVar, ml mlVar2) {
        if (mlVar2.aj * -2098656171 == mlVar.aj * -937098319) {
            return 0;
        }
        if (this.aj) {
            if (216776245 * mlVar.aj == client.an * 54729869) {
                return -1;
            }
            if (mlVar2.aj * 792738623 == client.an * 54729869) {
                return 1;
            }
        }
        if (mlVar.aj * -2098656171 >= mlVar2.aj * -2098656171) {
            return 1;
        }
        return -1;
    }

    int aj(ml mlVar, ml mlVar2, int i) {
        try {
            if (mlVar2.aj * -2098656171 == mlVar.aj * -2098656171) {
                return 0;
            }
            if (this.aj) {
                if (mlVar.aj * -2098656171 == client.an * 54729869) {
                    return -1;
                }
                if (mlVar2.aj * -2098656171 == client.an * 54729869) {
                    return 1;
                }
            }
            if (mlVar.aj * -2098656171 >= mlVar2.aj * -2098656171) {
                return 1;
            }
            return -1;
        } catch (Throwable e) {
            throw ei.ac(e, "gv.aj(" + ')');
        }
    }

    int an(ml mlVar, ml mlVar2) {
        if (mlVar2.aj * -208233460 == mlVar.aj * -1328491655) {
            return 0;
        }
        if (this.aj) {
            if (mlVar.aj * -2098656171 == 2051228198 * client.an) {
                return -1;
            }
            if (mlVar2.aj * -1830899662 == -2066790863 * client.an) {
                return 1;
            }
        }
        if (-457192426 * mlVar.aj >= mlVar2.aj * -2098656171) {
            return 1;
        }
        return -1;
    }

    int aq(ml mlVar, ml mlVar2) {
        if (mlVar2.aj * -2098656171 == mlVar.aj * -2098656171) {
            return 0;
        }
        if (this.aj) {
            if (mlVar.aj * -2098656171 == client.an * 54729869) {
                return -1;
            }
            if (mlVar2.aj * -2098656171 == client.an * 54729869) {
                return 1;
            }
        }
        if (mlVar.aj * -2098656171 >= mlVar2.aj * -2098656171) {
            return 1;
        }
        return -1;
    }

    public int aa(Object obj, Object obj2) {
        return aj((ml) obj, (ml) obj2, -677927332);
    }

    public int ak(Object obj, Object obj2) {
        return aj((ml) obj, (ml) obj2, -677927332);
    }

    public int ao(Object obj, Object obj2) {
        return aj((ml) obj, (ml) obj2, -677927332);
    }

    public int compare(Object obj, Object obj2) {
        try {
            return aj((ml) obj, (ml) obj2, -677927332);
        } catch (Throwable e) {
            throw ei.ac(e, "gv.compare(" + ')');
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
            throw ei.ac(e, "gv.equals(" + ')');
        }
    }
}
