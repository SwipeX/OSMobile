package defpackage;

import java.io.IOException;

public class ez implements Comparable {
    static final int an = 8;
    public static final int cz = 104;
    static final int jr = 32;
    String ac;
    String aj;

    public ez(String str, ma maVar) {
        try {
            String str2;
            this.aj = str;
            if (str == null) {
                str2 = null;
            } else {
                int i = 0;
                int length = str.length();
                while (i < length && bp.an(str.charAt(i), (byte) -8)) {
                    i++;
                }
                int i2 = length;
                while (i2 > i && bp.an(str.charAt(i2 - 1), (byte) -22)) {
                    i2--;
                }
                length = i2 - i;
                if (length < 1 || length > eb.aj(maVar, -605756403)) {
                    str2 = null;
                } else {
                    StringBuilder stringBuilder = new StringBuilder(length);
                    for (length = i; length < i2; length++) {
                        char charAt = str.charAt(length);
                        if (gx.ac(charAt, 2098300791)) {
                            switch (charAt) {
                                case ' ':
                                case '-':
                                case '_':
                                case ' ':
                                    charAt = '_';
                                    break;
                                case '#':
                                case '[':
                                case ']':
                                    break;
                                case 'À':
                                case 'Á':
                                case 'Â':
                                case 'Ã':
                                case 'Ä':
                                case 'à':
                                case 'á':
                                case 'â':
                                case 'ã':
                                case 'ä':
                                    charAt = 'a';
                                    break;
                                case 'Ç':
                                case 'ç':
                                    charAt = 'c';
                                    break;
                                case fr.ak /*200*/:
                                case 'É':
                                case 'Ê':
                                case 'Ë':
                                case 'è':
                                case 'é':
                                case 'ê':
                                case 'ë':
                                    charAt = 'e';
                                    break;
                                case 'Í':
                                case 'Î':
                                case 'Ï':
                                case 'í':
                                case 'î':
                                case 'ï':
                                    charAt = 'i';
                                    break;
                                case 'Ñ':
                                case 'ñ':
                                    charAt = 'n';
                                    break;
                                case 'Ò':
                                case 'Ó':
                                case 'Ô':
                                case 'Õ':
                                case 'Ö':
                                case 'ò':
                                case 'ó':
                                case 'ô':
                                case 'õ':
                                case 'ö':
                                    charAt = 'o';
                                    break;
                                case 'Ù':
                                case 'Ú':
                                case 'Û':
                                case 'Ü':
                                case 'ù':
                                case 'ú':
                                case 'û':
                                case 'ü':
                                    charAt = 'u';
                                    break;
                                case 'ß':
                                    charAt = 'b';
                                    break;
                                case 'ÿ':
                                case 'Ÿ':
                                    charAt = 'y';
                                    break;
                                default:
                                    charAt = Character.toLowerCase(charAt);
                                    break;
                            }
                            if (charAt != '\u0000') {
                                stringBuilder.append(charAt);
                            }
                        }
                    }
                    if (stringBuilder.length() == 0) {
                        str2 = null;
                    } else {
                        str2 = stringBuilder.toString();
                    }
                }
            }
            this.ac = str2;
        } catch (Throwable e) {
            throw ei.ac(e, "ez.<init>(" + ')');
        }
    }

    public static void aj(ju juVar, int i) {
        try {
            an.aj = juVar;
        } catch (Throwable e) {
            throw ei.ac(e, "ez.aj(" + ')');
        }
    }

    static fl ac(ju juVar, int i, int i2, byte b) {
        try {
            if (!ei.aw(juVar, i, i2, -2006428015)) {
                return null;
            }
            fl flVar = new fl();
            ht.al((byte) 65);
            flVar.ak = 328517235 * fi.ac;
            flVar.ap = fi.an * 2031617253;
            flVar.ao = fi.aq[0];
            flVar.aa = fi.ao[0];
            flVar.an = fi.aa[0];
            flVar.aq = fi.ak[0];
            flVar.ac = fi.ap;
            flVar.aj = fi.at[0];
            gn.as((byte) -66);
            return flVar;
        } catch (Throwable e) {
            throw ei.ac(e, "ez.ac(" + ')');
        }
    }

    static final void an(int i, int i2, int i3, int i4, byte b) {
        int i5 = i2;
        while (i5 <= i4 + i2) {
            int i6 = i;
            while (i6 <= i3 + i) {
                if (i6 >= 0 && i6 < cz && i5 >= 0 && i5 < cz) {
                    try {
                        ak.ap[0][i6][i5] = Byte.MAX_VALUE;
                        if (i == i6 && i6 > 0) {
                            fb.aj[0][i6][i5] = fb.aj[0][i6 - 1][i5];
                        }
                        if (i6 == i + i3 && i6 < 103) {
                            fb.aj[0][i6][i5] = fb.aj[0][i6 + 1][i5];
                        }
                        if (i5 == i2 && i5 > 0) {
                            fb.aj[0][i6][i5] = fb.aj[0][i6][i5 - 1];
                        }
                        if (i5 == i4 + i2 && i5 < 103) {
                            fb.aj[0][i6][i5] = fb.aj[0][i6][i5 + 1];
                        }
                    } catch (Throwable e) {
                        throw ei.ac(e, "ez.an(" + ')');
                    }
                }
                i6++;
            }
            i5++;
        }
    }

    public String aj(int i) {
        try {
            return this.aj;
        } catch (Throwable e) {
            throw ei.ac(e, "ez.aj(" + ')');
        }
    }

    public String ao() {
        return this.aj;
    }

    public String aq() {
        return this.aj;
    }

    public boolean aa() {
        return this.ac != null;
    }

    public boolean ac(byte b) {
        try {
            return this.ac != null;
        } catch (Throwable e) {
            throw ei.ac(e, "ez.ac(" + ')');
        }
    }

    public boolean ak() {
        return this.ac != null;
    }

    public boolean db(Object obj) {
        if (!(obj instanceof ez)) {
            return false;
        }
        ez ezVar = (ez) obj;
        if (this.ac == null) {
            if (ezVar.ac == null) {
                return true;
            }
            return false;
        } else if (ezVar.ac == null || hashCode() != ezVar.hashCode()) {
            return false;
        } else {
            return this.ac.equals(ezVar.ac);
        }
    }

    public boolean dh(Object obj) {
        if (!(obj instanceof ez)) {
            return false;
        }
        ez ezVar = (ez) obj;
        if (this.ac == null) {
            if (ezVar.ac == null) {
                return true;
            }
            return false;
        } else if (ezVar.ac == null) {
            return false;
        } else {
            if (hashCode() != ezVar.hashCode()) {
                return false;
            }
            return this.ac.equals(ezVar.ac);
        }
    }

    public boolean dk(Object obj) {
        if (!(obj instanceof ez)) {
            return false;
        }
        ez ezVar = (ez) obj;
        if (this.ac == null) {
            if (ezVar.ac == null) {
                return true;
            }
            return false;
        } else if (ezVar.ac == null || hashCode() != ezVar.hashCode()) {
            return false;
        } else {
            return this.ac.equals(ezVar.ac);
        }
    }

    public boolean dl(Object obj) {
        if (!(obj instanceof ez)) {
            return false;
        }
        ez ezVar = (ez) obj;
        if (this.ac == null) {
            if (ezVar.ac == null) {
                return true;
            }
            return false;
        } else if (ezVar.ac == null) {
            return false;
        } else {
            if (hashCode() == ezVar.hashCode()) {
                return this.ac.equals(ezVar.ac);
            }
            return false;
        }
    }

    public boolean equals(Object obj) {
        try {
            if (!(obj instanceof ez)) {
                return false;
            }
            ez ezVar = (ez) obj;
            if (this.ac == null) {
                if (ezVar.ac == null) {
                    return true;
                }
                return false;
            } else if (ezVar.ac == null || hashCode() != ezVar.hashCode()) {
                return false;
            } else {
                return this.ac.equals(ezVar.ac);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ez.equals(" + ')');
        }
    }

    public int de() {
        return this.ac == null ? 0 : this.ac.hashCode();
    }

    public int dx() {
        return this.ac == null ? 0 : this.ac.hashCode();
    }

    public int hashCode() {
        try {
            return this.ac == null ? 0 : this.ac.hashCode();
        } catch (Throwable e) {
            throw ei.ac(e, "ez.hashCode(" + ')');
        }
    }

    public String dd() {
        return aj(-1696304457);
    }

    public String dp() {
        return aj(-1328573011);
    }

    public String dr() {
        return aj(-742148980);
    }

    public String ds() {
        return aj(-1828630990);
    }

    public String toString() {
        try {
            return aj(-114248185);
        } catch (Throwable e) {
            throw ei.ac(e, "ez.toString(" + ')');
        }
    }

    int an(ez ezVar, int i) {
        try {
            if (this.ac == null) {
                if (ezVar.ac == null) {
                    return 0;
                }
                return 1;
            } else if (ezVar.ac == null) {
                return -1;
            } else {
                return this.ac.compareTo(ezVar.ac);
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ez.an(" + ')');
        }
    }

    int ap(ez ezVar) {
        if (this.ac != null) {
            return ezVar.ac == null ? -1 : this.ac.compareTo(ezVar.ac);
        } else {
            if (ezVar.ac == null) {
                return 0;
            }
            return 1;
        }
    }

    int at(ez ezVar) {
        if (this.ac == null) {
            if (ezVar.ac == null) {
                return 0;
            }
            return 1;
        } else if (ezVar.ac == null) {
            return -1;
        } else {
            return this.ac.compareTo(ezVar.ac);
        }
    }

    public int ah(Object obj) {
        return an((ez) obj, 1664413665);
    }

    public int ai(Object obj) {
        return an((ez) obj, -765352803);
    }

    public int am(Object obj) {
        return an((ez) obj, 359806648);
    }

    public int aw(Object obj) {
        return an((ez) obj, -1417271107);
    }

    public int compareTo(Object obj) {
        try {
            return an((ez) obj, 1215306851);
        } catch (Throwable e) {
            throw ei.ac(e, "ez.compareTo(" + ')');
        }
    }

    static final void cd(boolean z, int i) {
        try {
            ge geVar = client.dp;
            geVar.ai -= 1981846601;
            if (client.dp.ai * 966287879 >= 50 || z) {
                client.dp.ai = 0;
                if (!client.ds && client.dp.ak(-853353376) != null) {
                    client.dp.an(hd.ac(mr.bv, client.dp.ao, (byte) 54), 1470766674);
                    try {
                        client.dp.ac((byte) 100);
                    } catch (IOException e) {
                        client.ds = true;
                    }
                }
            }
        } catch (Throwable e2) {
            throw ei.ac(e2, "ez.cd(" + ')');
        }
    }

    static final void dw(byte b) {
        try {
            fo foVar = (fo) client.hl.ak();
            while (foVar != null) {
                if (1967725667 * foVar.aw > 0) {
                    foVar.aw -= 632964427;
                }
                if (1967725667 * foVar.aw != 0) {
                    if (162037373 * foVar.ai > 0) {
                        foVar.ai -= -329553195;
                    }
                    if (foVar.ai * 162037373 == 0 && foVar.an * -1376857645 >= 1 && foVar.aq * -972120605 >= 1 && foVar.an * -1376857645 <= 102 && foVar.aq * -972120605 <= 102 && (foVar.ap * -694603841 < 0 || fe.ax(foVar.ap * -694603841, 185670759 * foVar.ah, (byte) 4))) {
                        bc.dv(foVar.aj * -1170067687, foVar.ac * 578276603, foVar.an * -1376857645, foVar.aq * -972120605, foVar.ap * -694603841, foVar.at * -71071581, 185670759 * foVar.ah, 2138860080);
                        foVar.ai = 329553195;
                        if (foVar.ao * -866951835 == foVar.ap * -694603841 && -1 == foVar.ao * -866951835) {
                            foVar.kn();
                        } else if (foVar.ao * -866951835 == foVar.ap * -694603841 && foVar.aa * 615204453 == -71071581 * foVar.at && foVar.ah * 185670759 == foVar.ak * -1455354687) {
                            foVar.kn();
                        }
                    }
                } else if (foVar.ao * -866951835 < 0 || fe.ax(foVar.ao * -866951835, foVar.ak * -1455354687, (byte) 4)) {
                    bc.dv(foVar.aj * -1170067687, 578276603 * foVar.ac, foVar.an * -1376857645, foVar.aq * -972120605, foVar.ao * -866951835, foVar.aa * 615204453, foVar.ak * -1455354687, 988014006);
                    foVar.kn();
                }
                foVar = (fo) client.hl.at();
            }
        } catch (Throwable e) {
            throw ei.ac(e, "ez.dw(" + ')');
        }
    }
}
