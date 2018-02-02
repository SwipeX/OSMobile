package defpackage;

public class di {
    static int ah = 0;
    public static gx jm = null;
    static final int ll = 512;
    final dy aa;
    public final bt ac;
    public final int aj;
    int ak;
    public final bt an;
    final int ao;
    int ap;
    final int aq;

    public static be aj(ju juVar, ju juVar2, int i, boolean z, int i2) {
        Object obj = 1;
        try {
            int[] ae = juVar.ae(i, -1728214465);
            for (int ai : ae) {
                int ai2;
                byte[] ai3 = juVar.ai(i, ai2, -440061148);
                if (ai3 == null) {
                    obj = null;
                } else {
                    ai2 = (ai3[1] & 255) | ((ai3[0] & 255) << 8);
                    if (z) {
                        ai3 = juVar2.ai(0, ai2, 1959858887);
                    } else {
                        ai3 = juVar2.ai(ai2, 0, 1383808488);
                    }
                    if (ai3 == null) {
                        obj = null;
                    }
                }
            }
            if (obj == null) {
                return null;
            }
            try {
                return new be(juVar, juVar2, i, z);
            } catch (Exception e) {
                return null;
            }
        } catch (Throwable e2) {
            throw ei.ac(e2, "di.aj(" + ')');
        }
    }

    di(int i, bt btVar, bt btVar2, dy dyVar) {
        try {
            this.aj = -916530329 * i;
            this.an = btVar;
            this.ac = btVar2;
            this.aa = dyVar;
            em ao = aa.ac[this.aj * 963317847].ao(false, 1394138489);
            if (ao != null) {
                this.aq = 1663396237 * ao.ac;
                this.ao = ao.an * 394525125;
                return;
            }
            this.aq = 0;
            this.ao = 0;
        } catch (Throwable e) {
            throw ei.ac(e, "di.<init>(" + ')');
        }
    }

    boolean aa(int i, int i2) {
        if (ac(i, i2, -1753566799) || an(i, i2, 832108841)) {
            return true;
        }
        return false;
    }

    boolean aj(int i, int i2, int i3) {
        try {
            if (ac(i, i2, -1998911769) || an(i, i2, 1605338817)) {
                return true;
            }
            return false;
        } catch (Throwable e) {
            throw ei.ac(e, "di.aj(" + ')');
        }
    }

    boolean ao(int i, int i2) {
        if (ac(i, i2, -635060761) || an(i, i2, 1231754865)) {
            return true;
        }
        return false;
    }

    boolean aq(int i, int i2) {
        if (ac(i, i2, -1807191664) || an(i, i2, 1457457272)) {
            return true;
        }
        return false;
    }

    boolean ac(int i, int i2, int i3) {
        try {
            aa aaVar = aa.ac[963317847 * this.aj];
            switch (1236484519 * aaVar.af.aq) {
                case 0:
                    if (i < (this.ak * -1110019475) - ((this.aq * -2000355003) / 2)) {
                        return false;
                    }
                    if (i > ((this.aq * -2000355003) / 2) + (this.ak * -1110019475)) {
                        return false;
                    }
                    break;
                case 1:
                    if (i <= (this.ak * -1110019475) - (this.aq * -2000355003)) {
                        return false;
                    }
                    if (i > this.ak * -1110019475) {
                        return false;
                    }
                    break;
                case 2:
                    if (i < this.ak * -1110019475) {
                        return false;
                    }
                    if (i >= (this.ak * -1110019475) + (this.aq * -2000355003)) {
                        return false;
                    }
                    break;
            }
            switch (aaVar.au.aq * -1863425315) {
                case 0:
                    if (i2 < (this.ap * -583669913) - ((this.ao * 1007492365) / 2)) {
                        return false;
                    }
                    if (i2 > ((this.ao * 1007492365) / 2) + (this.ap * -583669913)) {
                        return false;
                    }
                    break;
                case 1:
                    if (i2 <= (this.ap * -583669913) - (this.ao * 1007492365)) {
                        return false;
                    }
                    if (i2 > this.ap * -583669913) {
                        return false;
                    }
                    break;
                case 2:
                    if (i2 < this.ap * -583669913) {
                        return false;
                    }
                    if (i2 >= (this.ao * 1007492365) + (this.ap * -583669913)) {
                        return false;
                    }
                    break;
            }
            return true;
        } catch (Throwable e) {
            throw ei.ac(e, "di.ac(" + ')');
        }
    }

    boolean ak(int i, int i2) {
        aa aaVar = aa.ac[-888816122 * this.aj];
        switch (1236484519 * aaVar.af.aq) {
            case 0:
                if (i < (this.ak * -1110019475) - ((-2000355003 * this.aq) / 2)) {
                    return false;
                }
                if (i > ((this.aq * 893557534) / 2) + (this.ak * -302228180)) {
                    return false;
                }
                break;
            case 1:
                if (i <= (this.ak * -809248959) - (this.aq * 384142584)) {
                    return false;
                }
                if (i > this.ak * -1110019475) {
                    return false;
                }
                break;
            case 2:
                if (i < this.ak * -1110019475) {
                    return false;
                }
                if (i >= (this.ak * -1110019475) + (2100834380 * this.aq)) {
                    return false;
                }
                break;
        }
        switch (aaVar.au.aq * -1863425315) {
            case 0:
                if (i2 < (this.ap * 1251704479) - ((-608570409 * this.ao) / 2)) {
                    return false;
                }
                if (i2 > ((1227021813 * this.ao) / 2) + (this.ap * -583669913)) {
                    return false;
                }
                break;
            case 1:
                if (i2 <= (this.ap * -583669913) - (this.ao * 1007492365)) {
                    return false;
                }
                if (i2 > this.ap * -583669913) {
                    return false;
                }
                break;
            case 2:
                if (i2 < this.ap * -583669913) {
                    return false;
                }
                if (i2 >= (this.ao * 1007492365) + (this.ap * -1037127278)) {
                    return false;
                }
                break;
        }
        return true;
    }

    boolean ap(int i, int i2) {
        aa aaVar = aa.ac[-1205436363 * this.aj];
        switch (1236484519 * aaVar.af.aq) {
            case 0:
                if (i < (this.ak * -1579735123) - ((-15809091 * this.aq) / 2)) {
                    return false;
                }
                if (i > ((this.aq * -2000355003) / 2) + (this.ak * -2011578472)) {
                    return false;
                }
                break;
            case 1:
                if (i <= (this.ak * 1407551484) - (this.aq * 675999050)) {
                    return false;
                }
                if (i > -1806847306 * this.ak) {
                    return false;
                }
                break;
            case 2:
                if (i < this.ak * -1119728795) {
                    return false;
                }
                if (i >= (-1110019475 * this.ak) + (this.aq * -2000355003)) {
                    return false;
                }
                break;
        }
        switch (aaVar.au.aq * -1863425315) {
            case 0:
                if (i2 < (this.ap * -583669913) - ((17171486 * this.ao) / 2)) {
                    return false;
                }
                if (i2 > ((-1134341099 * this.ao) / 2) + (this.ap * -583669913)) {
                    return false;
                }
                break;
            case 1:
                if (i2 <= (this.ap * 977292984) - (this.ao * 1007492365)) {
                    return false;
                }
                if (i2 > this.ap * -583669913) {
                    return false;
                }
                break;
            case 2:
                if (i2 < this.ap * 1519411143) {
                    return false;
                }
                if (i2 >= (186610586 * this.ao) + (this.ap * -583669913)) {
                    return false;
                }
                break;
        }
        return true;
    }

    boolean at(int i, int i2) {
        aa aaVar = aa.ac[1561991646 * this.aj];
        switch (1236484519 * aaVar.af.aq) {
            case 0:
                if (i < (this.ak * -1802296555) - ((-2000355003 * this.aq) / 2)) {
                    return false;
                }
                if (i > ((this.aq * -2053109639) / 2) + (this.ak * 1780336820)) {
                    return false;
                }
                break;
            case 1:
                if (i <= (this.ak * -1324404583) - (this.aq * -549186237)) {
                    return false;
                }
                if (i > 1413091209 * this.ak) {
                    return false;
                }
                break;
            case 2:
                if (i < this.ak * -1110019475) {
                    return false;
                }
                if (i >= (-2030300926 * this.ak) + (-693735170 * this.aq)) {
                    return false;
                }
                break;
        }
        switch (aaVar.au.aq * -769887180) {
            case 0:
                if (i2 < (this.ap * 2600543) - ((-1256672163 * this.ao) / 2)) {
                    return false;
                }
                if (i2 > ((this.ao * 1007492365) / 2) + (this.ap * -583669913)) {
                    return false;
                }
                break;
            case 1:
                if (i2 <= (this.ap * -583669913) - (this.ao * 1007492365)) {
                    return false;
                }
                if (i2 > this.ap * 735984374) {
                    return false;
                }
                break;
            case 2:
                if (i2 < this.ap * 670583817) {
                    return false;
                }
                if (i2 >= (this.ao * 1007492365) + (this.ap * -519898262)) {
                    return false;
                }
                break;
        }
        return true;
    }

    boolean ah(int i, int i2) {
        if (this.aa == null || i < (-1209928674 * this.ak) - ((this.aa.ac * -872313930) / 2)) {
            return false;
        }
        if (i > (this.ak * 303860700) + ((-71814233 * this.aa.ac) / 2)) {
            return false;
        }
        if (i2 < this.ap * -583669913 || i2 > (-1448750101 * this.aa.an) + (this.ap * -583669913)) {
            return false;
        }
        return true;
    }

    boolean ai(int i, int i2) {
        if (this.aa == null || i < (this.ak * -1110019475) - ((this.aa.ac * -71814233) / 2)) {
            return false;
        }
        if (i > (this.ak * -1110019475) + ((this.aa.ac * -71814233) / 2)) {
            return false;
        }
        if (i2 < this.ap * -583669913 || i2 > (-1448750101 * this.aa.an) + (this.ap * -583669913)) {
            return false;
        }
        return true;
    }

    boolean am(int i, int i2) {
        if (this.aa != null && i >= (this.ak * -1110019475) - ((this.aa.ac * -71814233) / 2) && i <= (this.ak * -1110019475) + ((this.aa.ac * -71814233) / 2) && i2 >= this.ap * -583669913 && i2 <= (-1448750101 * this.aa.an) + (this.ap * -583669913)) {
            return true;
        }
        return false;
    }

    boolean an(int i, int i2, int i3) {
        try {
            if (this.aa != null && i >= (this.ak * -1110019475) - ((this.aa.ac * -71814233) / 2) && i <= (this.ak * -1110019475) + ((this.aa.ac * -71814233) / 2) && i2 >= this.ap * -583669913 && i2 <= (-1448750101 * this.aa.an) + (this.ap * -583669913)) {
                return true;
            }
            return false;
        } catch (Throwable e) {
            throw ei.ac(e, "di.an(" + ')');
        }
    }

    boolean aw(int i, int i2) {
        if (this.aa != null && i >= (1567652274 * this.ak) - ((this.aa.ac * -71814233) / 2) && i <= (this.ak * -141323422) + ((this.aa.ac * -71814233) / 2) && i2 >= this.ap * 928215708 && i2 <= (-1448750101 * this.aa.an) + (-583669913 * this.ap)) {
            return true;
        }
        return false;
    }
}
